package com.joint.jointCloud.car.model.viewmodel.singlelivedata;

import androidx.annotation.MainThread;
import androidx.lifecycle.MutableLiveData;

import com.joint.jointCloud.home.model.CarNodeBean;
import com.joint.jointCloud.home.model.HistoryData;

import java.util.List;

public class HistoryLiveData extends MutableLiveData<List<HistoryData>> {
    private HistoryLiveData() {
    }

    private static HistoryLiveData sIntenst;

    @MainThread
    public static HistoryLiveData get() {
        if (sIntenst == null) sIntenst = new HistoryLiveData();
        return sIntenst;
    }
}
