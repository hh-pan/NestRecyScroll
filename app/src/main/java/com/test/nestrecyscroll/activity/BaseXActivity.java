package com.test.nestrecyscroll.activity;

import android.support.v7.app.AppCompatActivity;

import com.test.nestrecyscroll.presenter.IBaseXPresenter;
import com.test.nestrecyscroll.view.IBaseXView;

/**
 * Created by Pan on 2019/8/6.
 * Desc:
 */
public abstract class BaseXActivity<P extends IBaseXPresenter> extends AppCompatActivity implements IBaseXView {

    private P mPresenter;

    /**
     * 创建 Presenter
     */
    public abstract P onBindPresenter();

    /**
     * 获取 Presenter 对象，在需要获取时才创建`Presenter`，起到懒加载作用
     */
    public P getPresenter() {
        if (mPresenter == null) {
            mPresenter = onBindPresenter();
        }
        return mPresenter;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //在生命周期结束时，将 presenter 与 view 之间的联系断开，防止出现内存泄露
        if (mPresenter != null) {
            mPresenter.detachView();
        }
    }
}
