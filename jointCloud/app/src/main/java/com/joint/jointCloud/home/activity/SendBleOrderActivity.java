package com.joint.jointCloud.home.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.joint.jointCloud.R;
import com.joint.jointCloud.home.dialog.LockActionDialog;

import butterknife.BindView;
import butterknife.OnClick;
import cn.lilingke.commonlibrary.ui.activity.BaseCommonActivity;
import cn.lilingke.commonlibrary.ui.widget.TitleBar;

/**
 * @author : li
 * @date :2020/11/2
 * @describe : 蓝牙运维
 */
public class SendBleOrderActivity extends BaseCommonActivity {


    @BindView(R.id.titlebar)
    TitleBar titlebar;
    @BindView(R.id.et_value)
    EditText etValue;
    @BindView(R.id.layout_serarch)
    LinearLayout layoutSerarch;
    @BindView(R.id.tv_name)
    TextView tvName;
    @BindView(R.id.tv_send)
    TextView tvSend;
    @BindView(R.id.tv_type)
    TextView tvType;
    @BindView(R.id.type_ly)
    LinearLayout typeLy;
    @BindView(R.id.tv_content)
    TextView tvContent;
    @BindView(R.id.content_ly)
    LinearLayout contentLy;
    @BindView(R.id.tv_reback)
    TextView tvReback;
    @BindView(R.id.reback_ly)
    LinearLayout rebackLy;
    @BindView(R.id.tv_statue)
    TextView tvStatue;
    @BindView(R.id.statue_ly)
    LinearLayout statueLy;

    @Override
    protected int getLayoutID() {
        return R.layout.activity_send_ble_order;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        titlebar.leftExit(this);
        titlebar.titleText.setText(getString(R.string.bluetooth_operation_and_maintenance));

    }


    @OnClick(R.id.tv_send)
    public void onViewClicked() {
        typeLy.setVisibility(View.VISIBLE);
        contentLy.setVisibility(View.VISIBLE);
        rebackLy.setVisibility(View.VISIBLE);
        statueLy.setVisibility(View.VISIBLE);

        tvType.setText("BASE1");
        tvContent.setText("(79100500005,1,001,BASE,1)");
        tvReback.setText("(79100500005,1,001,BASE,1)");
        tvStatue.setText("成功");
    }
}
