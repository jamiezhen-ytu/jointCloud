package com.joint.jointCloud.car.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


import com.joint.jointCloud.R;

import cn.lilingke.commonlibrary.utils.DialogUtil;
import cn.lilingke.commonlibrary.utils.glide.GlideUtil;

/**
 * @author James
 * @date 2018/6/8
 * @describe:
 */

public class PlayVoiceDialog extends Dialog {
    private Context mContext;
    private OnActionListener mListener;
    private TextView tvTime;
    private TextView tvLeng;
    private ImageView imgClose;
    private ImageView imgVoice;
    private ImageView imgPlay;
    private ImageView imgPre;
    private ImageView imgNext;

    private CountDownTimer timer;

    public PlayVoiceDialog(Context context) {
        super(context, R.style.CommonDialogStyle);
        this.mContext = context;
        setContentView(R.layout.dialog_play_voice);

        tvTime = findViewById(R.id.tv_time);
        tvLeng = findViewById(R.id.tv_time);
        imgClose = findViewById(R.id.img_close);
        imgVoice = findViewById(R.id.img_voice);
        imgPlay = findViewById(R.id.img_play);
        imgPre = findViewById(R.id.img_pre);
        imgNext = findViewById(R.id.img_next);
        GlideUtil.loadGif(mContext, R.drawable.ic_voice, imgVoice);
        setCanceledOnTouchOutside(false);
        initEvent();
        DialogUtil.adjustDialogLayout(this, true, true);
    }


    public void initEvent() {
        imgClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });

        imgPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        imgPre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        imgNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    public void show() {
        super.show();

    }

    @Override
    public void dismiss() {
        super.dismiss();

    }


    public void setTexValue(int rid) {
        setTexValue(mContext.getResources().getString(rid));

    }

    public void setTexValue(String value) {


    }


    public void setOnActionListener(OnActionListener listener) {
        this.mListener = listener;
    }

    public interface OnActionListener {
        public void onAction(int action);
    }

}
