package com.joint.jointCloud.main.model;

import java.util.List;


/**
 * @author :created by lilingke
 * @date :2020/11/10
 * @describe :
 */
public class CommonParameterBean {

    /**
     * Message : check token success
     * FObject : [{"FAssetTypeID":100,"FShow":1,"FLoar":0,"FBle":0,"FMqtt":0,"FAssetTypeName":"JTR100","FOfflineIns":0,"FClassify":5,"FOfflineTime":60000,"FStatus":1},{"FAssetTypeID":400,"FShow":1,"FLoar":0,"FBle":0,"FMqtt":0,"FAssetTypeName":"GP4000","FOfflineIns":0,"FClassify":2,"FOfflineTime":600,"FStatus":1},{"FAssetTypeID":500,"FShow":0,"FLoar":0,"FBle":0,"FMqtt":0,"FAssetTypeName":"G500","FOfflineIns":0,"FClassify":6,"FOfflineTime":600,"FStatus":1},{"FAssetTypeID":600,"FShow":1,"FLoar":0,"FBle":0,"FMqtt":0,"FAssetTypeName":"GP6000","FOfflineIns":0,"FClassify":2,"FOfflineTime":600,"FStatus":1},{"FAssetTypeID":601,"FShow":1,"FLoar":0,"FBle":0,"FMqtt":0,"FAssetTypeName":"GP6000F","FOfflineIns":0,"FClassify":2,"FOfflineTime":600,"FStatus":1},{"FAssetTypeID":700,"FShow":1,"FLoar":0,"FBle":0,"FMqtt":0,"FAssetTypeName":"JT700DT","FOfflineIns":0,"FClassify":6,"FOfflineTime":600,"FStatus":1},{"FAssetTypeID":701,"FShow":1,"FLoar":0,"FBle":0,"FMqtt":0,"FAssetTypeName":"CU701","FOfflineIns":0,"FClassify":1,"FOfflineTime":12000,"FStatus":1},{"FAssetTypeID":702,"FShow":1,"FLoar":0,"FBle":1,"FMqtt":0,"FAssetTypeName":"JT702","FOfflineIns":0,"FClassify":1,"FOfflineTime":600,"FStatus":1},{"FAssetTypeID":703,"FShow":1,"FLoar":0,"FBle":0,"FMqtt":0,"FAssetTypeName":"JT703","FOfflineIns":0,"FClassify":5,"FOfflineTime":600,"FStatus":1},{"FAssetTypeID":704,"FShow":1,"FLoar":0,"FBle":0,"FMqtt":0,"FAssetTypeName":"JT704","FOfflineIns":1,"FClassify":4,"FOfflineTime":172800,"FStatus":1},{"FAssetTypeID":705,"FShow":1,"FLoar":0,"FBle":1,"FMqtt":0,"FAssetTypeName":"JT705","FOfflineIns":0,"FClassify":1,"FOfflineTime":600,"FStatus":1},{"FAssetTypeID":706,"FShow":1,"FLoar":0,"FBle":0,"FMqtt":0,"FAssetTypeName":"JT706","FOfflineIns":1,"FClassify":4,"FOfflineTime":172800,"FStatus":1},{"FAssetTypeID":707,"FShow":1,"FLoar":0,"FBle":0,"FMqtt":0,"FAssetTypeName":"JT707","FOfflineIns":1,"FClassify":8,"FOfflineTime":86400,"FStatus":1},{"FAssetTypeID":709,"FShow":1,"FLoar":1,"FBle":1,"FMqtt":0,"FAssetTypeName":"JT709","FOfflineIns":0,"FClassify":7,"FOfflineTime":86400,"FStatus":1},{"FAssetTypeID":802,"FShow":1,"FLoar":1,"FBle":1,"FMqtt":0,"FAssetTypeName":"JT802","FOfflineIns":0,"FClassify":7,"FOfflineTime":86400,"FStatus":1},{"FAssetTypeID":808,"FShow":1,"FLoar":0,"FBle":0,"FMqtt":0,"FAssetTypeName":"部标机","FOfflineIns":0,"FClassify":3,"FOfflineTime":600,"FStatus":1},{"FAssetTypeID":1001,"FShow":0,"FLoar":0,"FBle":0,"FMqtt":0,"FAssetTypeName":"追货宝","FOfflineIns":0,"FClassify":6,"FOfflineTime":86400,"FStatus":1},{"FAssetTypeID":1002,"FShow":1,"FLoar":0,"FBle":1,"FMqtt":0,"FAssetTypeName":"RTCC电子锁","FOfflineIns":0,"FClassify":7,"FOfflineTime":86400,"FStatus":1},{"FAssetTypeID":1010,"FShow":1,"FLoar":0,"FBle":0,"FMqtt":0,"FAssetTypeName":"CT10","FOfflineIns":0,"FClassify":4,"FOfflineTime":8640,"FStatus":1},{"FAssetTypeID":1011,"FShow":1,"FLoar":0,"FBle":0,"FMqtt":1,"FAssetTypeName":"CT10-MQTT","FOfflineIns":0,"FClassify":4,"FOfflineTime":86400,"FStatus":1},{"FAssetTypeID":1701,"FShow":1,"FLoar":0,"FBle":0,"FMqtt":0,"FAssetTypeName":"JT701-TRA","FOfflineIns":0,"FClassify":1,"FOfflineTime":1800,"FStatus":1},{"FAssetTypeID":1705,"FShow":1,"FLoar":0,"FBle":1,"FMqtt":0,"FAssetTypeName":"JT705A","FOfflineIns":0,"FClassify":1,"FOfflineTime":600,"FStatus":1},{"FAssetTypeID":1709,"FShow":1,"FLoar":0,"FBle":1,"FMqtt":0,"FAssetTypeName":"JT709A","FOfflineIns":0,"FClassify":1,"FOfflineTime":600,"FStatus":1},{"FAssetTypeID":2701,"FShow":1,"FLoar":0,"FBle":0,"FMqtt":1,"FAssetTypeName":"JT701D(MQTT)","FOfflineIns":0,"FClassify":1,"FOfflineTime":2400,"FStatus":1},{"FAssetTypeID":3701,"FShow":1,"FLoar":0,"FBle":0,"FMqtt":0,"FAssetTypeName":"JT701D","FOfflineIns":0,"FClassify":1,"FOfflineTime":600,"FStatus":1}]
     * Result : 200
     */
    public int Result;
    public String Message;
    public List<ParameterData> FObject;

}
