package com.joint.jointCloud.car.dialog;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

import com.joint.jointCloud.R;

import java.util.concurrent.TimeUnit;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.lilingke.commonlibrary.utils.DialogUtil;
import cn.lilingke.commonlibrary.utils.glide.GlideUtil;
import io.reactivex.Flowable;

/**
 * @author James
 * @date 2018/6/8
 * @describe:
 */

public class CommonStatueDialog extends Dialog {
    @BindView(R.id.img_show)
    ImageView imgShow;
    @BindView(R.id.tv_value)
    TextView tvValue;
    private Context mContext;


    public CommonStatueDialog(Context context) {
        super(context, R.style.CommonDialogStyle);
        this.mContext = context;
        setContentView(R.layout.dialog_common_statue);
        ButterKnife.bind(this);
        setCanceledOnTouchOutside(false);
        DialogUtil.adjustDialogLayout(this, true, true);
    }

    @SuppressLint("CheckResult")
    public void setOpenStatue(String value, int rid) {
        show();
        tvValue.setText(value);
        imgShow.setImageResource(rid);
        Flowable.timer(1200, TimeUnit.MILLISECONDS).subscribe(aLong -> {
            dismiss();
        });
    }
}
