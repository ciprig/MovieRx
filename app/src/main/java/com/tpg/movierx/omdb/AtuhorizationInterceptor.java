package com.tpg.movierx.omdb;

import java.io.IOException;

import javax.inject.Inject;
import javax.inject.Singleton;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

@Singleton
public class AtuhorizationInterceptor implements Interceptor {

    @Inject
    public AtuhorizationInterceptor() {
    }

    @Override
    public Response intercept(Chain chain) throws IOException {

        Request request = chain.request();

        HttpUrl url = request.url().newBuilder().addQueryParameter("apikey", "ad2c79ae").build();

        return chain.proceed(request.newBuilder().url(url).build());

    }
}
