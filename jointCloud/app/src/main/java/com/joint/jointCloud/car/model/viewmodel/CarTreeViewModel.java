package com.joint.jointCloud.car.model.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.joint.jointCloud.MyApplication;
import com.joint.jointCloud.car.model.viewmodel.singlelivedata.CarTreeLiveData;
import com.joint.jointCloud.car.model.viewmodel.singlelivedata.ChooseActionLiveData;
import com.joint.jointCloud.car.model.viewmodel.singlelivedata.SingleCheckLiveData;
import com.joint.jointCloud.home.HomeApi;
import com.joint.jointCloud.home.model.CarBean;
import com.joint.jointCloud.home.model.CarNodeBean;

import java.util.List;

import cn.lilingke.commonlibrary.okgo.callback.Bean01Callback;
import cn.lilingke.commonlibrary.utils.ToastUtil;

public class CarTreeViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    public final MutableLiveData carTreeLiveData = CarTreeLiveData.get();
    public final SingleCheckLiveData mSingleCheckLiveData = SingleCheckLiveData.get();
    public final ChooseActionLiveData mChooseActionLiveData = ChooseActionLiveData.get();
}