package com.joint.jointCloud.car.model;

import java.util.List;

/**
 * @author :created by lilingke
 * @date :2020/11/26
 * @describe :
 */
public class DevicesBean {
    public String Message;
    public List<DeviceData> FObject;
    public int Result;

    public static class DeviceData {
        public String FGUID;//设备唯一标识
        public String FAssetID;//设备ID
        public String FAssetTypeName;//设备类型名称
        public String FVehicleName;//绑定的车牌号
    }
}
