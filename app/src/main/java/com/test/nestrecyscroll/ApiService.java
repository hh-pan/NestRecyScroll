package com.test.nestrecyscroll;

import com.test.nestrecyscroll.bean.LoginBean;

import io.reactivex.Observable;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by Pan on 2019/8/6.
 * Desc:
 */
public interface ApiService {

    /**
     * 账号密码登录
     *
     * @param phone
     * @param authCode
     * @return
     */
    @POST("user/customerLoginBypassword.wx")
    Observable<LoginBean> accountLogin(@Query("phone") String phone,
                                       @Query("password") String authCode);
}
