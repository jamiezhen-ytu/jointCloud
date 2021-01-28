package com.joint.jointCloud.home.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.joint.jointCloud.R;

import java.util.concurrent.TimeUnit;

import cn.lilingke.commonlibrary.utils.DialogUtil;
import cn.lilingke.commonlibrary.utils.glide.GlideUtil;
import io.reactivex.Flowable;

/**
 * @author :created by lilingke
 * @date :2020/11/2
 * @describe :
 */

public class LockActionDialog extends Dialog {
    private Context mContext;
    private OnActionListener mListener;
    private TextView tvValue;
    private ImageView imgClose;
    private ImageView imgBg;

    public LockActionDialog(Context context) {
        super(context, R.style.CommonDialogStyle);
        this.mContext = context;
        setContentView(R.layout.dialog_lock_action);

        tvValue = findViewById(R.id.tv_value);
        imgClose = findViewById(R.id.img_close);
        imgBg = findViewById(R.id.img_bg);
        setCanceledOnTouchOutside(false);
        DialogUtil.adjustDialogLayout(this, true, true);
        initEvent();
    }


    public void initEvent() {
        imgClose.setOnClickListener(v -> dismiss());
    }

    @Override
    public void show() {
        super.show();

    }


    public void dismissDely() {
        Flowable.timer(800, TimeUnit.MILLISECONDS).subscribe(aLong -> {
            dismiss();
        });
    }

    public void setStatueBg(int rid) {
        imgBg.setImageResource(rid);
    }


    public void setTexValue(int rid) {
        setTexValue(mContext.getResources().getString(rid));
    }

    public void setTexValue(String value) {
        tvValue.setText(value);
    }


    public void setOnActionListener(OnActionListener listener) {
        this.mListener = listener;
    }

    public interface OnActionListener {
        public void onAction(int action);
    }

}
