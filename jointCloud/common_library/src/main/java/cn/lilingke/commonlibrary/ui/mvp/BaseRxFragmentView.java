package cn.lilingke.commonlibrary.ui.mvp;

import android.app.Activity;

import com.trello.rxlifecycle4.LifecycleProvider;
import com.trello.rxlifecycle4.android.FragmentEvent;

/**
 * Created by John on 2017/8/28.
 */

public interface BaseRxFragmentView extends LifecycleProvider<FragmentEvent> {

    Activity getActivity();

    void showToast(int resid);

    void showToast(String text);

    void showOneToast(int resid);

    void showOneToast(String text);

    void showWaitingDialog(String text, boolean cancelable);

    void showWaitingDialog(int stringRes, boolean cancelable);

    void dismissWaitingDialog();
}
