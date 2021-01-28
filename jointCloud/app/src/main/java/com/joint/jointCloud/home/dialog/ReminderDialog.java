package com.joint.jointCloud.home.dialog;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.joint.jointCloud.R;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.lilingke.commonlibrary.utils.DialogUtil;

/**
 * @author James
 * @date 2018/6/8
 * @describe:
 */

public class ReminderDialog extends Dialog {

    @BindView(R.id.tv_value)
    TextView tvValue;
    @BindView(R.id.tv_left)
    TextView tvLeft;
    @BindView(R.id.tv_right)
    TextView tvRight;
    @BindView(R.id.tv_title)
    TextView tvTitle;
    private Context mContext;
    private OnSureListener mListener;


    public void show(OnSureListener listener) {
        super.show();
        this.mListener = listener;
    }

    public ReminderDialog(Context context) {
        super(context, R.style.CommonDialogStyle);
        this.mContext = context;
        setContentView(R.layout.dialog_reminder);
        ButterKnife.bind(this);
        setCanceledOnTouchOutside(false);
        DialogUtil.adjustDialogLayout(this, true, true);
    }

    public ReminderDialog setTitleValue(int rid) {
        return setTitleValue(mContext.getResources().getString(rid));
    }

    public ReminderDialog setTitleValue(String title) {
        tvTitle.setText(title);
        return this;
    }

    public ReminderDialog setTvVlaue(int rid) {
        return setTvVlaue(mContext.getResources().getString(rid));
    }

    public ReminderDialog setTvVlaue(String title) {
        tvValue.setText(title);
        return this;
    }

    @OnClick({R.id.tv_left, R.id.tv_right})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_left:
                dismiss();
                break;
            case R.id.tv_right:
                if (mListener != null)
                    mListener.onSure();
                break;
        }
    }

    public interface OnSureListener {
        public void onSure();
    }
}
