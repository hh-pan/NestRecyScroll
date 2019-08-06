package com.test.nestrecyscroll.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.test.nestrecyscroll.presenter.IBaseXPresenter;
import com.test.nestrecyscroll.view.IBaseView;

/**
 * Created by Pan on 2018/3/20.
 * Desc:
 */

public abstract class BaseActivity<P extends IBaseXPresenter> extends BaseXActivity<P> implements IBaseView {

    public Context mContext;

    public P mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;

        setContentView(initLayoutId());

        init();
        initData();
        initView();
        initListener();
    }

    public void init() {

    }

    public void initData() {

    }

    public void initView() {

    }

    public void initListener() {

    }

    public abstract int initLayoutId();

    /**
     * 创建presenter
     */
    public abstract P onBindPresenter();

    public P getPresenter() {
        if (mPresenter == null) {
            mPresenter = onBindPresenter();
        }
        return mPresenter;
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showToast() {

    }

    @Override
    public Activity getSelfActivity() {
        return this;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        hideLoading();

        if (mPresenter != null) {
            mPresenter.detachView();
        }
    }
}
