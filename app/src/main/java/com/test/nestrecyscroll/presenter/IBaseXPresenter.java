package com.test.nestrecyscroll.presenter;

/**
 * Created by Pan on 2019/8/6.
 * Desc:
 */
public interface IBaseXPresenter {

    /**
     * 判断presenter是否与view建立联系，防止出现内存泄露状态
     */
    boolean isViewAttach();

    /**
     * 断开presenter与view的联系
     */
    void detachView();
}
