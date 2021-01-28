package com.joint.jointCloud.car;
import com.lzy.okgo.model.HttpParams;
import com.joint.jointCloud.base.http.BaseBean;
import com.joint.jointCloud.base.http.Urls;

import cn.lilingke.commonlibrary.okgo.OkGoWrapper;
import cn.lilingke.commonlibrary.okgo.callback.Bean01Callback;

/**
 * 通用API
 */
public class CommonApi {

    private final OkGoWrapper mOkGoWrapper;

    private CommonApi() {
        mOkGoWrapper = OkGoWrapper.instance();
    }

    private static class InstanceHolder {
        private static final CommonApi sInstance = new CommonApi();
    }

    public static CommonApi get() {
        return InstanceHolder.sInstance;
    }

    public void ApiTest(Bean01Callback<BaseBean> callback) {
        HttpParams params = new HttpParams();
        params.put("api_name", "userProtocol");
        mOkGoWrapper.post("Urls.BASE_URL", params, BaseBean.class, callback);
    }
}
