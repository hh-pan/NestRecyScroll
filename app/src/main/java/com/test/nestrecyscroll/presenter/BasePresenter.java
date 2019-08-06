package com.test.nestrecyscroll.presenter;

import android.support.annotation.NonNull;

import com.test.nestrecyscroll.HttpResponseListener;
import com.test.nestrecyscroll.view.IBaseView;

/**
 * Created by Pan on 2019/8/6.
 * Desc:
 */
public class BasePresenter<V extends IBaseView,T> extends BaseXPresenter<V> implements IBasePresenter, HttpResponseListener<T> {
    public BasePresenter(@NonNull V view) {
        super(view);
    }

    @Override
    public void cancel() {

    }

    @Override
    public void cancelAll() {

    }

    @Override
    public void onSuccess(Object tag, T t) {

    }

    @Override
    public void onFailure(Object tag, String failure) {

    }
}
