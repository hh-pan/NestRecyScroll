package com.test.nestrecyscroll.net;

import android.content.Context;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Pan on 2018/3/23.
 * Desc:
 */

public class RetrofitManager {

    private static final String TAG = "RetrofitManager";

    private static RetrofitManager instance;
    public static String BASE_URL = "http://wxreservation.neobeauty.cn";
    private final OkHttpClient.Builder mOkHttpClient;
    private final Retrofit mRetrofit;
    public static Context mContext;

    public static RetrofitManager getInstance(Context context) {
        mContext = context;
        if (instance == null) {
            synchronized (RetrofitManager.class) {
                if (instance == null) {
                    instance = new RetrofitManager();
                }
            }
        }
        return instance;
    }

    private RetrofitManager() {
        /**
         * 初始化okhttp
         */
        mOkHttpClient = new OkHttpClient.Builder()
                .connectTimeout(30, TimeUnit.SECONDS).
                        readTimeout(30, TimeUnit.SECONDS).
                        writeTimeout(30, TimeUnit.SECONDS);
        /**
         * 初始化Retrofit
         */
        mRetrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL + "/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(mOkHttpClient.build())
                .build();
    }

    public <T> T createReq(Class<T> reqServer) {
        return mRetrofit.create(reqServer);
    }

}
