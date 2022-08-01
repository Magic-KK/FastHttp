package com.fasthttp.library.base;

import retrofit2.Retrofit;

public class FastHttp {


    public static void get(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .build();

    }


}
