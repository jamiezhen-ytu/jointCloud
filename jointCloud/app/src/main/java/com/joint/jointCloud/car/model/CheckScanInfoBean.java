package com.joint.jointCloud.car.model;

import java.util.List;

/**
 * @author :created by lilingke
 * @date :2020/11/18
 * @describe :
 */
public class CheckScanInfoBean {

    /**
     * Message : check token success
     * FObject : [{"FAssetTypeID":1709,"FGUID":"8ccab170-50e3-4156-86c6-362981062264","FBle":1,"FIsSubAsset":0,"FUnlockPsd":"888888","FAssetID":"790006000002"}]
     * Result : 200
     */
    public String Message;
    public List<FObjectEntity> FObject;
    public int Result;

    public class FObjectEntity {
        /**
         * FAssetTypeID : 1709
         * FGUID : 8ccab170-50e3-4156-86c6-362981062264
         * FBle : 1
         * FIsSubAsset : 0
         * FUnlockPsd : 888888
         * FAssetID : 790006000002
         */
        public int FAssetTypeID;
        public String FGUID;
        public int FBle;
        public int Cfy;
        public int FIsSubAsset;
        public String FUnlockPsd;
        public String FAssetID;
    }
}
