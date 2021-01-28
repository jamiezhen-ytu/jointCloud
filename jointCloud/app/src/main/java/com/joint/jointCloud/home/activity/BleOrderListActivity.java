package com.joint.jointCloud.home.activity;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.joint.jointCloud.R;
import com.joint.jointCloud.home.adapter.CommonAdapter;
import com.joint.jointCloud.home.dialog.LockActionDialog;
import com.joint.jointCloud.home.model.CommonBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import cn.lilingke.commonlibrary.ui.activity.BaseCommonActivity;
import cn.lilingke.commonlibrary.ui.adapter.BaseRecyclerAdapter;
import cn.lilingke.commonlibrary.ui.widget.TitleBar;

/**
 * @author : li
 * @date :2020/11/2
 * @describe : 蓝牙运维
 */
public class BleOrderListActivity extends BaseCommonActivity {
    @BindView(R.id.titlebar)
    TitleBar titlebar;
    @BindView(R.id.et_value)
    EditText etValue;
    @BindView(R.id.layout_serarch)
    LinearLayout layoutSerarch;
    @BindView(R.id.rv_list)
    RecyclerView rvList;

    private CommonAdapter mAdapter;
    private LockActionDialog mLockDialog;

    @Override
    protected int getLayoutID() {
        return R.layout.activity_ble_order_list;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        titlebar.leftExit(this);
        titlebar.titleText.setText(getString(R.string.bluetooth_operation_and_maintenance));
        mLockDialog = new LockActionDialog(this);
        initRecycle();
    }

    private void initRecycle() {
        mAdapter = new CommonAdapter();
        rvList.setLayoutManager(new LinearLayoutManager(this));
        rvList.setAdapter(mAdapter);

        mAdapter.setOnItemClickListener((parent, holder, position) -> {
            startActivity(SendBleOrderActivity.class);
        });

        List<CommonBean> data = new ArrayList<>();
        data.add(new CommonBean());
        data.add(new CommonBean());
        data.add(new CommonBean());
        data.add(new CommonBean());
        data.add(new CommonBean());
        data.add(new CommonBean());
        data.add(new CommonBean());
        mAdapter.setNewData(data);
    }


}
