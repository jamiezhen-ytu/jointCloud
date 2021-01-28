package cn.lilingke.commonlibrary.example;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import cn.dlc.commonlibrary.R;
import cn.lilingke.commonlibrary.ui.activity.BaseCommonActivity;
import cn.lilingke.commonlibrary.ui.adapter.ExampleAdapter;
import cn.lilingke.commonlibrary.ui.adapter.HeaderViewAdapter;
import cn.lilingke.commonlibrary.ui.widget.HeaderRecyclerView;

/**
 * @author lilingke
 * @date 2020/3/13
 * @describe
 */
public class HeadRecycleviewExample extends BaseCommonActivity {

    private RecyclerView mRvList;
    private HeaderRecyclerView mHeadRvList;

    @Override
    protected int getLayoutID() {
        return R.layout.activity_head_recycleview_example;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mRvList = findViewById(R.id.rv_list);
        mHeadRvList = findViewById(R.id.head_list);

    }

    private void showLinearList() {
        ExampleAdapter adapter = new ExampleAdapter();
        HeaderViewAdapter headerViewAdapter = new HeaderViewAdapter(adapter);
        mRvList.setLayoutManager(new LinearLayoutManager(this));
        View hv1 = LayoutInflater.from(this).inflate(R.layout.layout_head, mRvList, false);
        headerViewAdapter.addHeaderView(hv1);
        mRvList.setAdapter(headerViewAdapter);
    }


    private void showHeaderRecyclerView() {
        ExampleAdapter adapter = new ExampleAdapter();
        mHeadRvList.setLayoutManager(new GridLayoutManager(this, 2));
        mHeadRvList.setAdapter(adapter);
        View hv1 = LayoutInflater.from(this).inflate(R.layout.layout_head, mHeadRvList, false);
        mHeadRvList.addHeaderView(hv1);
    }
}
