package com.test.nestrecyscroll;

import com.test.nestrecyscroll.presenter.IBasePresenter;
import com.test.nestrecyscroll.view.IBaseView;

/**
 * Created by Pan on 2019/8/6.
 * Desc:
 */
public class LoginContacts {

    /**
     * view 层接口
     */
    public interface LoginUi extends IBaseView {
        /**
         * 登录成功
         */
        void loginSuccess();

        /**
         * 登录失败
         */
        void loginFail();
    }

    /**
     * presenter 层接口
     */
    public interface LoginPresnter extends IBasePresenter {

        void login(String name, String pwd);
    }

    /**
     * model 层接口
     */
    public interface LoginMdl {

        void login(String name, String pwd, HttpResponseListener callback);
    }
}
