package com.joint.jointCloud.utlis;


import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

/**
 * Created by luojianping on 2018/10/17
 * Describe 作者很懒什么都没有写
 * Package name com.sunflower.gongchengbao.esayplayer.rx
 */
public class CommonObserva<T> implements ObservableOnSubscribe<T> {

    private ObservableEmitter<T> mEmitter;

    @Override
    public void subscribe(ObservableEmitter<T> emitter) throws Exception {
        mEmitter = emitter;
    }

    public void setInfo(T arr) {
        if (mEmitter != null)
            mEmitter.onNext(arr);
    }

    public void setOnComplete() {
        if (mEmitter != null)
        mEmitter.onComplete();
    }
}
