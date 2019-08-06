package com.test.nestrecyscroll.model;

import android.support.annotation.NonNull;

import com.test.nestrecyscroll.HttpResponseListener;

import io.reactivex.Observable;

/**
 * Created by Pan on 2019/8/6.
 * Desc:
 */
public class BaseModel {

    /**
     * 发送网络请求
     *
     * @param observable
     * @param callback
     * @param <T>
     */
    protected <T> void sendRequest(@NonNull Observable<T> observable, HttpResponseListener<T> callback) {

    }
}
