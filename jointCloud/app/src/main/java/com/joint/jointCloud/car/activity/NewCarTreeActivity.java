package com.joint.jointCloud.car.activity;

import android.annotation.SuppressLint;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.joint.jointCloud.MyApplication;
import com.joint.jointCloud.R;
import com.joint.jointCloud.car.adapter.NodeTreeAdapter;
import com.joint.jointCloud.home.HomeApi;
import com.joint.jointCloud.home.model.CarBean;
import com.joint.jointCloud.home.model.CarDetailBean;
import com.joint.jointCloud.home.model.CarNodeBean;
import com.joint.jointCloud.room.AppDataBase;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;
import cn.lilingke.commonlibrary.okgo.callback.Bean01Callback;
import cn.lilingke.commonlibrary.ui.activity.BaseCommonActivity;
import cn.lilingke.commonlibrary.utils.LogPlus;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

/**
 * @author :created by lilingke
 * @date :2020/11/20
 * @describe :
 */
public class NewCarTreeActivity extends BaseCommonActivity {
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.et_value)
    EditText etValue;
    @BindView(R.id.search_list)
    RecyclerView searchList;
    @BindView(R.id.rv_tree)
    ListView rvTree;

    private NodeTreeAdapter mAapter;
    private LinkedList<CarNodeBean> mLinkedList = new LinkedList<>();

    @Override
    protected int getLayoutID() {
        return R.layout.activity_new_car_tree;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initRecycle();
        queryAdminVehicleTree();
    }

    @OnClick({R.id.img_back, R.id.tv_sure})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.img_back:
                finish();
                break;
            case R.id.tv_sure:
                break;
        }
    }

    private void initRecycle() {
        mAapter = new NodeTreeAdapter(this,rvTree,mLinkedList);
        rvTree.setAdapter(mAapter);
        rvTree.setDivider(new ColorDrawable(getResources().getColor(R.color.color_e3e3e3)));
        rvTree.setDividerHeight(1);
    }

    /**
     * 获取车辆树
     */
    public void queryAdminVehicleTree() {
        HomeApi.get().queryAdminVehicleTree(new Bean01Callback<CarBean>() {
            @SuppressLint("CheckResult")
            @Override
            public void onSuccess(CarBean carBean) {
                mLinkedList.addAll(carBean.FObject);
                mAapter.expandOrCollapse(0);
                mAapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(String message, Throwable tr) {

            }
        });
    }
}
