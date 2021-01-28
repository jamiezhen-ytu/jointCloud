package com.joint.jointCloud.home.model;

/**
 * @author :created by lilingke
 * @date :2020/12/1
 * @describe :
 */
public class HistoryData {
    public boolean isChoose;
    public CarDetailBean carInfo;

    public HistoryData(CarDetailBean carInfo) {
        this.carInfo = carInfo;
    }
}
