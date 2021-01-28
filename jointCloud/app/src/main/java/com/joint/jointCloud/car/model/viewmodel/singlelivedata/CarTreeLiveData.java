package com.joint.jointCloud.car.model.viewmodel.singlelivedata;

import androidx.annotation.MainThread;
import androidx.lifecycle.MutableLiveData;

import com.joint.jointCloud.home.model.CarNodeBean;

import java.util.List;

public class CarTreeLiveData extends MutableLiveData<List<CarNodeBean>> {
    private CarTreeLiveData() {
    }

    private static CarTreeLiveData sIntenst;

    @MainThread
    public static CarTreeLiveData get() {
        if (sIntenst == null) sIntenst = new CarTreeLiveData();
        return sIntenst;
    }
}
