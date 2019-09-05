package com.hassan.android.daggersample.di;

import com.hassan.android.daggersample.di.auth.AuthViewModelsModule;
import com.hassan.android.daggersample.ui.auth.AuthActivity;
import com.hassan.android.daggersample.ui.auth.AuthViewModel;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @ContributesAndroidInjector(
            modules = {AuthViewModelsModule.class}
    )
    abstract AuthActivity contributeAuthActivity();

}
