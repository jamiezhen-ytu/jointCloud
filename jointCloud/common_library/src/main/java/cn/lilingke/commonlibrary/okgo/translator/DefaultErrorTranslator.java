package cn.lilingke.commonlibrary.okgo.translator;

import com.google.gson.JsonParseException;
import com.lzy.okgo.exception.HttpException;

import cn.lilingke.commonlibrary.okgo.exception.ApiException;

/**
 * Created by John on 2018/2/2.
 */

public class DefaultErrorTranslator implements ErrorTranslator {

    @Override
    public String translate(Throwable throwable) {

        if (throwable instanceof HttpException) {
            return "服务器异常";
        } else if (throwable instanceof JsonParseException) {
            // json解析错误，一般就是接口改了
            return "网络接口异常";
        } else if (throwable instanceof ApiException) {
            return throwable.getMessage();
        } else {
            return throwable.getMessage();
        }
    }
}
