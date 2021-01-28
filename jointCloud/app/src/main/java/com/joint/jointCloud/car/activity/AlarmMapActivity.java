package com.joint.jointCloud.car.activity;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.baidu.mapapi.map.MapView;
import com.joint.jointCloud.R;

import butterknife.BindView;
import cn.lilingke.commonlibrary.ui.activity.BaseCommonActivity;
import cn.lilingke.commonlibrary.ui.widget.TitleBar;
/**
 * @author : li
 * @date :2020/11/2
 * @describe : 地图警示
 */
public class AlarmMapActivity extends BaseCommonActivity {


    @BindView(R.id.titlebar)
    TitleBar titlebar;
    @BindView(R.id.bmapView)
    MapView bmapView;
    @BindView(R.id.layout_parent)
    LinearLayout layoutParent;

    @Override
    protected int getLayoutID() {
        return R.layout.activity_alarm_map;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        titlebar.leftExit(this);
    }

    @Override
    public void onResume() {
        super.onResume();
        //在activity执行onResume时执行mMapView. onResume ()，实现地图生命周期管理
        bmapView.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        //在activity执行onPause时执行mMapView. onPause ()，实现地图生命周期管理
        bmapView.onPause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        //在activity执行onDestroy时执行mMapView.onDestroy()，实现地图生命周期管理
        bmapView.onDestroy();
    }


}
