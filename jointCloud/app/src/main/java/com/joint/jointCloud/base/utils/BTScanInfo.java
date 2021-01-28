package com.joint.jointCloud.base.utils;

import android.util.Log;

import com.clj.fastble.data.BleDevice;

/**
 * @author :created by lilingke
 * @date :2020/11/17
 * @describe :
 */
public  class BTScanInfo {
    //数据库
    public BleDevice dev;
    public byte[] advt;
    public double rssi = -10000.0;
    public static final int
            BT_ADVT_FIELD_SHORT_SVC_UUID_MORE = 0x02,
            BT_ADVT_FIELD_SHORT_SVC_UUID_COMP = 0x03,
            BT_ADVT_FIELD_MANU_INFO = 0xFF,
            BT_ADVT_FIEFD_NAME_INFO = 0x09,
            BT_ADVT_FIEFD_SUPPROTS_INFO = 0xFF;

    public int svcMoreOffset = -1, svcMoreLen = -1,
            svcOffset = -1, svcLen = -1, isSupprots = 14,
            manuOffset = -1, manuLen = -1,
            nameOffset = -1, nameLen = -1,
            lightOffset = -1, lightLen = -1;


    public BTScanInfo(BleDevice dev_, byte[] advt_, double rssi_) {
//        Log.i(dev_.getAddress(), "BtScanInfo==" + dev_.getAddress());
        dev = dev_;
        advt = advt_;
        rssi = rssi_;
        ParseAdvt();
    }

    public void ParseAdvt() {
        if (advt == null)
            return;
        for (int offset = 0; offset < advt.length; ) {
            int fieldLen = (advt[offset] & 0xFF);
            if (fieldLen < 1) {
                offset += fieldLen + 1;
                // Log.v(TAG, "Find a invalid scan advert field length: " + fieldLen );
                continue;
            }
            // a valid field.
            if (offset + fieldLen <= advt.length) {
                int fieldType = advt[offset + 1] & 0xFF;
                if (fieldType == BT_ADVT_FIELD_SHORT_SVC_UUID_MORE) {
                    svcMoreOffset = offset;
                    svcMoreLen = fieldLen;
                } else if (fieldType == BT_ADVT_FIELD_SHORT_SVC_UUID_COMP) {
                    svcOffset = offset;
                    svcLen = fieldLen;
                } else if (fieldType == BT_ADVT_FIELD_MANU_INFO & fieldLen == BT_ADVT_FIEFD_NAME_INFO) {
                    manuOffset = offset;
                    manuLen = fieldLen;
                } else if (fieldType == BT_ADVT_FIEFD_NAME_INFO) {
                    //获取到名字信息
                    nameOffset = offset;
                    nameLen = fieldLen;
                }
            }
            offset += fieldLen + 1;
        }
    }
}

