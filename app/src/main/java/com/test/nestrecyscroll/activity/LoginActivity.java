package com.test.nestrecyscroll.activity;

import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.test.nestrecyscroll.LoginContacts;
import com.test.nestrecyscroll.R;
import com.test.nestrecyscroll.presenter.LoginPresenter;

import butterknife.BindView;

/**
 * Created by Pan on 2019/8/6.
 * Desc:
 */
public class LoginActivity extends BaseActivity<LoginContacts.LoginPresnter> implements LoginContacts.LoginUi {

    @BindView(R.id.edit_account)
    EditText edtName;
    @BindView(R.id.edit_pwd)
    EditText edtPwd;

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
                getPresenter().login(edtName.getText().toString().trim(), edtPwd.getText().toString().trim());
            }
        });
    }

    @Override
    public LoginContacts.LoginPresnter onBindPresenter() {
        return new LoginPresenter(this);
    }

    @Override
    public void loginSuccess(String msg) {
        Toast.makeText(mContext, msg, Toast.LENGTH_SHORT).show();
        finish();
    }

    @Override
    public void loginFail(String message) {
        Toast.makeText(mContext, message, Toast.LENGTH_SHORT).show();
    }
}
