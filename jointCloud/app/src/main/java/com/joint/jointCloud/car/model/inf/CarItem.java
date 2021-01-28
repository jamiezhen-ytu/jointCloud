package com.joint.jointCloud.car.model.inf;

import java.io.Serializable;

public interface CarItem extends Serializable {
    public int getCarType();

    public String getCarName();

    public String getCarNum();

    public String getTime();

    public String getAdress();

    public String getCompany();

}
