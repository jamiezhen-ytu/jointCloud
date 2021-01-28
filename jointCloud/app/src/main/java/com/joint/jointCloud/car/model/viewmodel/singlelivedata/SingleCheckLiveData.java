package com.joint.jointCloud.car.model.viewmodel.singlelivedata;

import androidx.annotation.MainThread;
import androidx.lifecycle.MutableLiveData;

import com.joint.jointCloud.home.model.CarNodeBean;

import java.util.List;

public class SingleCheckLiveData extends MutableLiveData<Boolean> {
    private SingleCheckLiveData() {
    }

    private static SingleCheckLiveData sIntenst;

    @MainThread
    public static SingleCheckLiveData get() {
        if (sIntenst == null) sIntenst = new SingleCheckLiveData();
        return sIntenst;
    }
}
