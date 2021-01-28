package com.joint.jointCloud.home.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.joint.jointCloud.R;
import com.joint.jointCloud.car.activity.AlarmReportActivity;

import butterknife.BindView;
import butterknife.OnClick;
import cn.lilingke.commonlibrary.ui.activity.BaseCommonActivity;
import cn.lilingke.commonlibrary.ui.widget.TitleBar;

import static cn.lilingke.commonlibrary.utils.ResUtil.getString;

/**
 * @author : li
 * @date :2020/11/2
 * @describe : 蓝牙运维
 */
public class BleOperationActivity extends BaseCommonActivity {

    @BindView(R.id.titlebar)
    TitleBar titlebar;
    @BindView(R.id.et_value)
    EditText etValue;
    @BindView(R.id.layout_serarch)
    LinearLayout layoutSerarch;
    @BindView(R.id.scan_ly)
    FrameLayout scanLy;
    private int statue = 0;

    @Override
    protected int getLayoutID() {
        return R.layout.activity_ble_operation;
    }

    public static Intent newIntent(Activity formActivity, int statue) {
        Intent intent = new Intent(formActivity, BleOperationActivity.class);
        intent.putExtra("statue", statue);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        titlebar.leftExit(this);

        statue = getIntent().getIntExtra("statue", 0);
        initView();
    }

    private void initView() {
        if (statue == 0) {
            titlebar.titleText.setText(getString(R.string.bluetooth_operation_and_maintenance));
        } else if (statue == 1) {
            titlebar.titleText.setText(getString(R.string.ota_document_maintenance));
        }
    }



    @OnClick(R.id.scan_ly)
    public void onViewClicked() {
        if (statue == 0) {
            startActivity(BleOrderListActivity.class);
        } else if (statue == 1) {
            startActivity(OtaVersionInfoActivity.class);
        }
    }
}
