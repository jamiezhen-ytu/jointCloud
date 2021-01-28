package com.joint.jointCloud.car.blemvp;

import android.app.Activity;

import androidx.fragment.app.FragmentActivity;

import cn.lilingke.commonlibrary.ui.activity.BaseCommonActivity;

/**
 * @author James
 * @date 2018/6/11
 * @describe:
 */

public interface BaseActivityView {
    FragmentActivity getBaseActivity();

    void showToastVlaue(String value);

    void showToastVlaue(int resid);
}
