package com.joint.jointCloud.car.model.viewmodel.singlelivedata;

import androidx.annotation.MainThread;
import androidx.lifecycle.MutableLiveData;

public class ChooseActionLiveData extends MutableLiveData<Integer> {
    private ChooseActionLiveData() {
    }

    private static ChooseActionLiveData sIntenst;

    @MainThread
    public static ChooseActionLiveData get() {
        if (sIntenst == null) sIntenst = new ChooseActionLiveData();
        return sIntenst;
    }
}
