package com.joint.jointCloud.home.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.joint.jointCloud.R;

import butterknife.BindView;
import butterknife.OnClick;
import cn.lilingke.commonlibrary.ui.activity.BaseCommonActivity;
import cn.lilingke.commonlibrary.ui.widget.TitleBar;

/**
 * @author : li
 * @date :2020/11/2
 * @describe : OTA版本信息
 */
public class OtaVersionInfoActivity extends BaseCommonActivity {


    @BindView(R.id.titlebar)
    TitleBar titlebar;
    @BindView(R.id.tv_name)
    TextView tvName;
    @BindView(R.id.tv_type)
    TextView tvType;
    @BindView(R.id.tv_version)
    TextView tvVersion;
    @BindView(R.id.tv_des)
    TextView tvDes;
    @BindView(R.id.tv_update)
    TextView tvUpdate;

    @Override
    protected int getLayoutID() {
        return R.layout.activity_ota_version_info;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        titlebar.leftExit(this);
        titlebar.titleText.setText(getString(R.string.ota_version_information));

        tvType.setText("JT701");
        tvName.setText("JT701_20200913.bin");
        tvDes.setText("已是最新版本，无需升级");

    }


    @OnClick(R.id.tv_update)
    public void onViewClicked() {

    }
}
