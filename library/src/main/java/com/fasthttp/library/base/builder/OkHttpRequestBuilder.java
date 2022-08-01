package com.fasthttp.library.base.builder;

import com.fasthttp.library.base.request.RequestCall;

public abstract class OkHttpRequestBuilder<T extends OkHttpRequestBuilder> {

    public abstract RequestCall build();

}
