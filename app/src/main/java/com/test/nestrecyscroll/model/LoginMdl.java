package com.test.nestrecyscroll.model;

import com.test.nestrecyscroll.HttpResponseListener;
import com.test.nestrecyscroll.LoginContacts;

/**
 * Created by Pan on 2019/8/6.
 * Desc:
 */
public class LoginMdl extends BaseModel implements LoginContacts.LoginMdl {
    @Override
    public void login(String name, String pwd, HttpResponseListener callback) {
        // 发送网络请求
        sendRequest(null, callback);
    }
}
