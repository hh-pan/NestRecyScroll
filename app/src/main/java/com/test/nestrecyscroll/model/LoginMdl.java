package com.test.nestrecyscroll.model;

import com.test.nestrecyscroll.HttpResponseListener;
import com.test.nestrecyscroll.LoginContacts;
import com.test.nestrecyscroll.bean.LoginBean;

/**
 * Created by Pan on 2019/8/6.
 * Desc:登录业务具体操作类
 */
public class LoginMdl extends BaseModel implements LoginContacts.LoginMdl {

    @Override
    public void login(String name, String pwd, HttpResponseListener<LoginBean> callback) {
        //模拟登录成功
        if (name.isEmpty()) {
            callback.onFailure(100, "请输入账号");
        } else if (pwd.isEmpty()) {
            callback.onFailure(100, "请输入密码");
        } else if (name.equals(pwd)) {
            callback.onSuccess(200, new LoginBean(200, "成功"));
        } else {
            callback.onFailure(100, "登录失败");
        }
    }
}
