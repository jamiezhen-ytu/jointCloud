package com.joint.jointCloud.main.model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


/**
 * @author :created by lilingke
 * @date :2020/11/10
 * @describe :
 */
@Entity(tableName = "ParameterData")
public class ParameterData {
    /**
     * FAssetTypeID : 100
     * FShow : 1
     * FLoar : 0
     * FBle : 0
     * FMqtt : 0
     * FAssetTypeName : JTR100
     * FOfflineIns : 0
     * FClassify : 5
     * FOfflineTime : 60000
     * FStatus : 1
     */
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "FAssetTypeID")
    public String FAssetTypeID = "boom";
    @ColumnInfo(name = "FShow")
    public int FShow;
    @ColumnInfo(name = "FLoar")
    public int FLoar;
    @ColumnInfo(name = "FBle")
    public int FBle;
    @ColumnInfo(name = "FMqtt")
    public int FMqtt;
    @ColumnInfo(name = "FAssetTypeName")
    public String FAssetTypeName;
    @ColumnInfo(name = "FOfflineIns")
    public int FOfflineIns;
    @ColumnInfo(name = "FClassify")
    public int FClassify;
    @ColumnInfo(name = "FOfflineTime")
    public int FOfflineTime;
    @ColumnInfo(name = "FStatus")
    public int FStatus;

    public void setFAssetTypeID(String FAssetTypeID) {
        this.FAssetTypeID = FAssetTypeID;
    }

    public void setFShow(int FShow) {
        this.FShow = FShow;
    }

    public void setFLoar(int FLoar) {
        this.FLoar = FLoar;
    }

    public void setFBle(int FBle) {
        this.FBle = FBle;
    }

    public void setFMqtt(int FMqtt) {
        this.FMqtt = FMqtt;
    }

    public void setFAssetTypeName(String FAssetTypeName) {
        this.FAssetTypeName = FAssetTypeName;
    }

    public void setFOfflineIns(int FOfflineIns) {
        this.FOfflineIns = FOfflineIns;
    }

    public void setFClassify(int FClassify) {
        this.FClassify = FClassify;
    }

    public void setFOfflineTime(int FOfflineTime) {
        this.FOfflineTime = FOfflineTime;
    }

    public void setFStatus(int FStatus) {
        this.FStatus = FStatus;
    }

    public String getFAssetTypeID() {
        return FAssetTypeID;
    }

    public int getFShow() {
        return FShow;
    }

    public int getFLoar() {
        return FLoar;
    }

    public int getFBle() {
        return FBle;
    }

    public int getFMqtt() {
        return FMqtt;
    }

    public String getFAssetTypeName() {
        return FAssetTypeName;
    }

    public int getFOfflineIns() {
        return FOfflineIns;
    }

    public int getFClassify() {
        return FClassify;
    }

    public int getFOfflineTime() {
        return FOfflineTime;
    }

    public int getFStatus() {
        return FStatus;
    }

    @Override
    public String toString() {
        return "ParameterData{" +
                "FAssetTypeID='" + FAssetTypeID + '\'' +
                ", FShow=" + FShow +
                ", FLoar=" + FLoar +
                ", FBle=" + FBle +
                ", FMqtt=" + FMqtt +
                ", FAssetTypeName='" + FAssetTypeName + '\'' +
                ", FOfflineIns=" + FOfflineIns +
                ", FClassify=" + FClassify +
                ", FOfflineTime=" + FOfflineTime +
                ", FStatus=" + FStatus +
                '}';
    }
}