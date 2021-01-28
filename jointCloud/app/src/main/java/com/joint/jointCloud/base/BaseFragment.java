package com.joint.jointCloud.base;

import android.app.Activity;
import android.content.Intent;

import cn.lilingke.commonlibrary.ui.fragment.BaseCommonFragment;

/**
 * @author lilingke
 * @date 2020/4/7
 * @describe
 */
public abstract class BaseFragment extends BaseCommonFragment {
    /*I need to reset*/
    protected void startActivity(Class<? extends Activity> activityClass) {
        Intent intent = new Intent(mActivity, activityClass);
        startActivity(intent);
    }
}
