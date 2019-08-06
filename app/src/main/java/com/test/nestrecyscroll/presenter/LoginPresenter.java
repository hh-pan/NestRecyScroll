package com.test.nestrecyscroll.presenter;

import android.support.annotation.NonNull;

import com.test.nestrecyscroll.HttpResponseListener;
import com.test.nestrecyscroll.bean.LoginBean;
import com.test.nestrecyscroll.LoginContacts;
import com.test.nestrecyscroll.model.LoginMdl;

/**
 * Created by Pan on 2019/8/6.
 * Desc:
 */
public class LoginPresenter extends BasePresenter<LoginContacts.LoginUi, LoginBean> implements LoginContacts.LoginPresnter, HttpResponseListener<LoginBean> {

    private LoginContacts.LoginMdl mLoginMdl;

    public LoginPresenter(@NonNull LoginContacts.LoginUi view) {
        super(view);

        mLoginMdl = new LoginMdl();
    }

    @Override
    public void login(String name, String pwd) {

        mLoginMdl.login(name, pwd, this);
    }

    @Override
    public void onSuccess(Object tag, LoginBean o) {
        // 先判断是否已经与 View 建立联系
        if (isViewAttach()) {
            // 登录成功调用
            getView().loginSuccess();
        }
    }

    @Override
    public void onFailure(Object tag, String failure) {
        if (isViewAttach()) {
            // 登录失败调用
            getView().loginFail();
        }
    }
}
