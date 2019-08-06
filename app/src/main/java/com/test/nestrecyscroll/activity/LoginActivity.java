package com.test.nestrecyscroll.activity;

import android.view.View;
import android.widget.Toast;

import com.test.nestrecyscroll.LoginContacts;
import com.test.nestrecyscroll.R;
import com.test.nestrecyscroll.presenter.LoginPresenter;

/**
 * Created by Pan on 2019/8/6.
 * Desc:
 */
public class LoginActivity extends BaseActivity<LoginContacts.LoginPresnter> implements LoginContacts.LoginUi {
    @Override
    public int initLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    public void initListener() {
        super.initListener();

        findViewById(R.id.login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getPresenter().login("17512033060", "123456");
            }
        });
    }

    @Override
    public LoginContacts.LoginPresnter onBindPresenter() {
        return new LoginPresenter(this);
    }

    @Override
    public void loginSuccess() {
        Toast.makeText(mContext, "登录成功", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginFail() {
        Toast.makeText(mContext, "登录失败", Toast.LENGTH_SHORT).show();
    }
}
