package com.joint.jointCloud.home.model;

import java.util.List;

/**
 * @author :created by lilingke
 * @date :2020/11/6
 * @describe :
 */
public class CarBean {
    public int Result;
    public String Message;
    public List<CarNodeBean> FObject;
    public boolean isOpen ,isSelect;
    @Override
    public String toString() {
        return "CarBean{" +
                "Result=" + Result +
                ", Message='" + Message + '\'' +
                ", FObject=" + FObject +
                '}';
    }
}
