package com.joint.jointCloud.home.activity;

import android.os.Bundle;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.joint.jointCloud.R;
import com.joint.jointCloud.home.adapter.TemperatureSensorAdapter;
import com.joint.jointCloud.home.model.TemperatureSensorBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;
import cn.lilingke.commonlibrary.ui.activity.BaseCommonActivity;
import cn.lilingke.commonlibrary.ui.widget.TitleBar;
import cn.lilingke.commonlibrary.utils.rv_tool.SpacesItemDecoration;

/**
 * @author : li
 * @date :2020/11/2
 * @describe : 温度传感器配置
 */
public class TemperatureSensorActivity extends BaseCommonActivity {


    @BindView(R.id.titlebar)
    TitleBar titlebar;
    @BindView(R.id.tv_value)
    TextView tvValue;
    @BindView(R.id.rv_list)
    RecyclerView rvList;

    private TemperatureSensorAdapter mAdapter;

    @Override
    protected int getLayoutID() {
        return R.layout.activity_temperature_sensor;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        titlebar.leftExit(this);
        titlebar.titleText.setText(getString(R.string.temperature_sensor_configuration));
        initRecycle();
    }

    private void initRecycle() {
        mAdapter = new TemperatureSensorAdapter();
        rvList.setLayoutManager(new GridLayoutManager(this, 2));
        rvList.addItemDecoration(SpacesItemDecoration.newInstance(27, 39, 2));
        rvList.setNestedScrollingEnabled(false);
        rvList.setAdapter(mAdapter);

        List<TemperatureSensorBean> data = new ArrayList<>();
        data.add(new TemperatureSensorBean("123456456789", "2020-09-02 14:25:26", "26", "15", "82"));
        data.add(new TemperatureSensorBean("123456456789", "2020-09-02 14:25:26", "26", "15", "82"));
        data.add(new TemperatureSensorBean("", "", "", "", ""));
        data.add(new TemperatureSensorBean("", "", "", "", ""));
        mAdapter.setNewData(data);
    }

    @OnClick({R.id.layout_serarch, R.id.tv_syn, R.id.tv_save})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.layout_serarch:
                break;
            case R.id.tv_syn:
                break;
            case R.id.tv_save:
                break;
        }
    }
}
