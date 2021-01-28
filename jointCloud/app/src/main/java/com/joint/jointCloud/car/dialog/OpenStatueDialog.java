package com.joint.jointCloud.car.dialog;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.joint.jointCloud.R;

import java.util.concurrent.TimeUnit;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.lilingke.commonlibrary.utils.DialogUtil;
import cn.lilingke.commonlibrary.utils.glide.GlideUtil;
import io.reactivex.Flowable;
import io.reactivex.functions.Consumer;

/**
 * @author James
 * @date 2018/6/8
 * @describe:
 */

public class OpenStatueDialog extends Dialog {
    @BindView(R.id.img_show)
    ImageView imgShow;
    private Context mContext;


    public OpenStatueDialog(Context context) {
        super(context, R.style.CommonDialogStyle);
        this.mContext = context;
        setContentView(R.layout.dialog_open_statue);
        ButterKnife.bind(this);
        setCanceledOnTouchOutside(false);
        DialogUtil.adjustDialogLayout(this, true, true);
    }


    @Override
    public void show() {
        super.show();
        GlideUtil.loadGif(mContext, R.drawable.ic_opening, imgShow);
    }

    @Override
    public void dismiss() {
        super.dismiss();

    }

    @SuppressLint("CheckResult")
    public void setOpenStatue(int statue) {
        if (statue == 1) {
            imgShow.setImageResource(R.drawable.ic_open_succes);
        } else {
            imgShow.setImageResource(R.drawable.ic_open_fail);
        }

        Flowable.timer(1000, TimeUnit.MILLISECONDS).subscribe(aLong -> {
            dismiss();
        });
    }
}
