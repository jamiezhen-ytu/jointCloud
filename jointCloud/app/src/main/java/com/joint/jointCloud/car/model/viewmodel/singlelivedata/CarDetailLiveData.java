package com.joint.jointCloud.car.model.viewmodel.singlelivedata;

import androidx.annotation.MainThread;
import androidx.lifecycle.MutableLiveData;

import com.joint.jointCloud.home.model.CarDetailBean;

import java.util.List;

public class CarDetailLiveData<T> extends MutableLiveData<List<T>> {
    private CarDetailLiveData() {
    }

    private static CarDetailLiveData sIntenst;

    @MainThread
    public static CarDetailLiveData get() {
        if (sIntenst == null) sIntenst = new CarDetailLiveData();
        return sIntenst;
    }
}
