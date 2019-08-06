package com.test.nestrecyscroll.presenter;

import android.support.annotation.NonNull;

import com.test.nestrecyscroll.view.IBaseXView;

import java.lang.ref.WeakReference;

/**
 * Created by Pan on 2019/8/6.
 * Desc:
 */
public class BaseXPresenter<V extends IBaseXView> implements IBaseXPresenter {

    // 防止 Activity 不走 onDestory() 方法，所以采用弱引用来防止内存泄漏
    private WeakReference<V> mViewRef;

    public BaseXPresenter(@NonNull V view) {
        attachView(view);
    }

    private void attachView(V view) {
        mViewRef = new WeakReference<V>(view);
    }

    @Override
    public boolean isViewAttach() {
        return mViewRef != null && mViewRef.get() != null;
    }

    public V getView() {
        return mViewRef.get();
    }

    @Override
    public void detachView() {

        if (mViewRef != null) {
            mViewRef.clear();
            mViewRef = null;
        }
    }
}
