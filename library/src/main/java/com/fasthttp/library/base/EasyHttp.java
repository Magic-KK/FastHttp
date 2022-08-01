package com.fasthttp.library.base;

import okhttp3.OkHttpClient;

public class EasyHttp {
    public static final long DEFAULT_MILLISECONDS = 10_000L;
    private OkHttpClient mOkHttpClient;
    private volatile static EasyHttp mInstance;

    public EasyHttp(OkHttpClient okHttpClient) {
        if (okHttpClient == null) {
            mOkHttpClient = new OkHttpClient();
        } else {
            mOkHttpClient = okHttpClient;
        }
    }

    public static EasyHttp initClient(OkHttpClient okHttpClient) {
        if (mInstance == null) {
            synchronized (EasyHttp.class) {
                if (mInstance == null) {
                    mInstance = new EasyHttp(okHttpClient);
                }
            }
        }
        return mInstance;
    }
}
