package com.hassan.android.daggersample.di.auth;


import com.hassan.android.daggersample.models.User;
import com.hassan.android.daggersample.network.auth.AuthApi;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public class AuthModule {

    @AuthScope
    @Provides
    static AuthApi provideAuthApi(Retrofit retrofit) {
        return retrofit.create(AuthApi.class);
    }
}
