package com.joint.jointCloud.main;

import com.joint.jointCloud.base.http.BaseBean;
import com.joint.jointCloud.base.http.Urls;
import com.joint.jointCloud.base.utils.LocalFile;
import com.joint.jointCloud.main.model.CommonParameterBean;
import com.joint.jointCloud.main.model.LoginBean;
import com.lzy.okgo.model.HttpParams;

import cn.lilingke.commonlibrary.okgo.OkGoWrapper;
import cn.lilingke.commonlibrary.okgo.callback.Bean01Callback;

/**
 * 通用API
 */
public class MainApi {

    private final OkGoWrapper mOkGoWrapper;

    private MainApi() {
        mOkGoWrapper = OkGoWrapper.instance();
    }

    private static class InstanceHolder {
        private static final MainApi sInstance = new MainApi();
    }

    public static MainApi get() {
        return InstanceHolder.sInstance;
    }

    /**
     * 登录接口
     *
     * @param name
     * @param pw
     * @param callback
     */
    public void login(String name, String pw, Bean01Callback<LoginBean> callback) {
        HttpParams params = new HttpParams();
        params.put("FUserName", name);
        params.put("FPassword", pw);
        mOkGoWrapper.post(Urls.URL_LOGIN, params, LoginBean.class, callback);
    }

    /**
     * 获取共用参数
     * @param callback
     */
    public void getCommonParameter(Bean01Callback<CommonParameterBean> callback) {
        HttpParams params = new HttpParams();
        params.put("FAction", Urls.ACIOTN_QUERYADMINASSETTYPE);
        params.put("FTokenID", LocalFile.getToken());
        mOkGoWrapper.post(LocalFile.getBaseUrl()+Urls.CAR_CLOUD_APP, params, CommonParameterBean.class, callback);
    }


}
