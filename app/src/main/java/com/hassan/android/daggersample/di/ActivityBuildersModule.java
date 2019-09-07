package com.hassan.android.daggersample.di;

import com.hassan.android.daggersample.di.auth.AuthModule;
import com.hassan.android.daggersample.di.auth.AuthViewModelsModule;
import com.hassan.android.daggersample.di.main.MainFragmentBuildersModule;
import com.hassan.android.daggersample.di.main.MainModule;
import com.hassan.android.daggersample.di.main.MainViewModelsModule;
import com.hassan.android.daggersample.ui.auth.AuthActivity;
import com.hassan.android.daggersample.ui.auth.AuthViewModel;
import com.hassan.android.daggersample.ui.main.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @ContributesAndroidInjector(
            modules = {AuthViewModelsModule.class, AuthModule.class}
    )
    abstract AuthActivity contributeAuthActivity();

    @ContributesAndroidInjector(
            modules = {MainFragmentBuildersModule.class, MainViewModelsModule.class, MainModule.class}
    )
    abstract MainActivity contributeMainActivity();

}
