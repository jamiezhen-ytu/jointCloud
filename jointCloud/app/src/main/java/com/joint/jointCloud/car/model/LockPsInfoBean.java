package com.joint.jointCloud.car.model;

import java.util.List;

/**
 * @author :created by lilingke
 * @date :2020/11/18
 * @describe :
 */
public class LockPsInfoBean {

    /**
     * Message : check token success
     * FObject : [{"FAssetTypeID":1709,"FFenceOpen":0,"FDynPsd":0,"FMqtt":0,"FBle":1,"FAgreementType":707,"FStaticPsd":"888888","FClassify":1,"FAssetID":"790006000002","FDynamicPsd":"922790"}]
     * Result : 200
     */
    public String Message;
    public List<FObjectEntity> FObject;
    public int Result;


    public class FObjectEntity {
        /**
         * FAssetTypeID : 1709
         * FFenceOpen : 0
         * FDynPsd : 0
         * FMqtt : 0
         * FBle : 1
         * FAgreementType : 707
         * FStaticPsd : 888888
         * FClassify : 1
         * FAssetID : 790006000002
         * FDynamicPsd : 922790
         */
        public int FAssetTypeID;
        public int FFenceOpen;
        public int FDynPsd;
        public int FMqtt;
        public int FBle;
        public int FAgreementType;
        public String FStaticPsd;
        public int FClassify;
        public String FAssetID;
        public String FDynamicPsd;
    }
}
