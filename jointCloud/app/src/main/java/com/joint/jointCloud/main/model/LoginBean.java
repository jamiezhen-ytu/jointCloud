package com.joint.jointCloud.main.model;

import java.util.List;

/**
 * @author :created by lilingke
 * @date :2020/11/5
 * @describe :
 */
public class LoginBean {

    /**
     * Message : success
     * FObject : [{"FUserGUID":"2fc8eb58-c4d9-48f6-92ef-fd88ccc7409b","FTokenID":"3acef045-d302-4032-b40a-d9ee6c1519cd","FBSAddress":"http://120.76.144.12:8081/","FAPPAddress":"http://120.76.144.12:8081/","FUserName":"test","FExpireTime":"2020-06-29T16:00:00","FSqlConnectString":"Data Source=39.108.194.238;Initial Catalog=IOT_China_CarCloud;User ID=gps;PassWord=gps@pswd&123;Max Pool Size=75000;Connect Timeout=5000"}]
     * Result : 200
     */
    public String Message;
    public List<LoginData> FObject;
    public int Result;

    public void setMessage(String Message) {
        this.Message = Message;
    }

    public void setFObject(List<LoginData> FObject) {
        this.FObject = FObject;
    }

    public void setResult(int Result) {
        this.Result = Result;
    }

    public String getMessage() {
        return Message;
    }

    public List<LoginData> getFObject() {
        return FObject;
    }

    public int getResult() {
        return Result;
    }

    public class LoginData {
        /**
         * FUserGUID : 2fc8eb58-c4d9-48f6-92ef-fd88ccc7409b
         * FTokenID : 3acef045-d302-4032-b40a-d9ee6c1519cd
         * FBSAddress : http://120.76.144.12:8081/
         * FAPPAddress : http://120.76.144.12:8081/
         * FUserName : test
         * FExpireTime : 2020-06-29T16:00:00
         * FSqlConnectString : Data Source=39.108.194.238;Initial Catalog=IOT_China_CarCloud;User ID=gps;PassWord=gps@pswd&123;Max Pool Size=75000;Connect Timeout=5000
         */
        public String FUserGUID;     //用户唯一标识
        public String FTokenID;      //身份验证的唯一标识（后面接口每次需要传入此参数）
        public String FBSAddress;    //Web跳转界面
        public String FAPPAddress;   //APP登录后请求的接口地址
        public String FUserName;     //用户名
        public String FExpireTime;   //账户过期时间
        public String FSqlConnectString;


        public void setFUserGUID(String FUserGUID) {
            this.FUserGUID = FUserGUID;
        }

        public void setFTokenID(String FTokenID) {
            this.FTokenID = FTokenID;
        }

        public void setFBSAddress(String FBSAddress) {
            this.FBSAddress = FBSAddress;
        }

        public void setFAPPAddress(String FAPPAddress) {
            this.FAPPAddress = FAPPAddress;
        }

        public void setFUserName(String FUserName) {
            this.FUserName = FUserName;
        }

        public void setFExpireTime(String FExpireTime) {
            this.FExpireTime = FExpireTime;
        }

        public void setFSqlConnectString(String FSqlConnectString) {
            this.FSqlConnectString = FSqlConnectString;
        }

        public String getFUserGUID() {
            return FUserGUID;
        }

        public String getFTokenID() {
            return FTokenID;
        }

        public String getFBSAddress() {
            return FBSAddress;
        }

        public String getFAPPAddress() {
            return FAPPAddress;
        }

        public String getFUserName() {
            return FUserName;
        }

        public String getFExpireTime() {
            return FExpireTime;
        }

        public String getFSqlConnectString() {
            return FSqlConnectString;
        }
    }
}
