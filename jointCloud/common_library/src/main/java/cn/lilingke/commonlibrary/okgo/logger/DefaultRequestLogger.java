package cn.lilingke.commonlibrary.okgo.logger;

import com.licheedev.myutils.LogPlus;
import com.lzy.okgo.model.HttpHeaders;
import com.lzy.okgo.model.HttpParams;

import cn.lilingke.commonlibrary.okgo.utils.UnicodeUtil;

/**
 * Created by John on 2018/2/1.
 */

public class DefaultRequestLogger implements RequestLogger {

    private final boolean mLogRequest;

    public DefaultRequestLogger(boolean logRequest) {
        mLogRequest = logRequest;
    }
    
    @Override
    public void logRequest(String url, HttpHeaders headers, HttpParams params, String response,
        Throwable tr) {

        if (!mLogRequest) {
            return;
        }

        StringBuilder sb = new StringBuilder();
        sb.append("\n【HTTP】url==>")
            .append(url)
            .append("\n【HTTP】request==>")
            .append(String.valueOf(params));

        if (tr != null) {
            sb.append("\n【HTTP】throwable==>").append(tr);
        }

        if (response != null) {
            sb.append("\n【HTTP】response==>").append(UnicodeUtil.decode(response));
        }

        //LogPlus.i(TAG, sb.toString(), tr);
        LogPlus.i(TAG, sb.toString());
    }
}
