package com.joint.jointCloud.car.model.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.joint.jointCloud.MyApplication;
import com.joint.jointCloud.base.utils.LocalFile;
import com.joint.jointCloud.car.model.viewmodel.singlelivedata.CarTreeLiveData;
import com.joint.jointCloud.car.model.viewmodel.singlelivedata.ChooseActionLiveData;
import com.joint.jointCloud.car.model.viewmodel.singlelivedata.HistoryLiveData;
import com.joint.jointCloud.car.model.viewmodel.singlelivedata.SingleCheckLiveData;
import com.joint.jointCloud.home.HomeApi;
import com.joint.jointCloud.home.model.CarBean;
import com.joint.jointCloud.home.model.CarDetailBean;
import com.joint.jointCloud.home.model.CarNodeBean;
import com.joint.jointCloud.home.model.HistoryData;
import com.joint.jointCloud.room.AppDataBase;

import java.util.ArrayList;
import java.util.List;

import cn.lilingke.commonlibrary.okgo.callback.Bean01Callback;
import cn.lilingke.commonlibrary.utils.GsonUtils;
import cn.lilingke.commonlibrary.utils.LogPlus;
import cn.lilingke.commonlibrary.utils.ToastUtil;

public class HistoryViewModel extends ViewModel {
    public final MutableLiveData<List<HistoryData>> historyLiveData = HistoryLiveData.get();

    public void initData() {
        List<HistoryData> datas = new ArrayList<>();
        String value = LocalFile.getHistory();
        if (!value.isEmpty()) {
            List<String> tempe = GsonUtils.fromJsonList(value);
            for (String s : tempe) {
                CarDetailBean bean = AppDataBase.getInstance().queryCarDetailBeanByGuid(s);
                if (bean != null) {
                    datas.add(new HistoryData(bean));
                }
            }
        }
        historyLiveData.setValue(datas);
    }
}
