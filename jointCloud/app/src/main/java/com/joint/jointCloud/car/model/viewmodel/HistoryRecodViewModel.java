package com.joint.jointCloud.car.model.viewmodel;

import androidx.lifecycle.ViewModel;

import com.joint.jointCloud.car.model.viewmodel.singlelivedata.CarDetailLiveData;
import com.joint.jointCloud.car.model.viewmodel.singlelivedata.ChooseActionLiveData;
import com.joint.jointCloud.car.model.viewmodel.singlelivedata.HistoryLiveData;
import com.joint.jointCloud.car.model.viewmodel.singlelivedata.SingleCheckLiveData;

public class HistoryRecodViewModel extends ViewModel {
    public final SingleCheckLiveData mSingleCheckLiveData = SingleCheckLiveData.get();
    public final HistoryLiveData mHistorytData = HistoryLiveData.get();
    public final ChooseActionLiveData mChooseActionLiveData = ChooseActionLiveData.get();
    public final CarDetailLiveData mLiveData = CarDetailLiveData.get();
}