package com.test.nestrecyscroll;

import com.test.nestrecyscroll.bean.LoginBean;
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
         * @param msg
         */
        void loginSuccess(String msg);

        /**
         * 登录失败
         * @param message
         */
        void loginFail(String message);
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

        void login(String name, String pwd, HttpResponseListener<LoginBean> callback);
    }
}
