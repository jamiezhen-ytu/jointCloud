package com.joint.jointCloud.car.model;


import com.joint.jointCloud.car.model.inf.CarItem;
import com.joint.jointCloud.home.model.CarNodeBean;

import java.util.List;

public class CarListBean{
    public int Result;
    public String Message;
    public List<CarListData> FObject;

    @Override
    public String toString() {
        return "CarListBean{" +
                "Result=" + Result +
                ", Message='" + Message + '\'' +
                ", FObject=" + FObject +
                '}';
    }
}
