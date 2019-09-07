package com.hassan.android.daggersample.ui.main.profile;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.hassan.android.daggersample.SessionManager;
import com.hassan.android.daggersample.models.User;
import com.hassan.android.daggersample.ui.auth.AuthResource;

import javax.inject.Inject;

public class ProfileViewModel extends ViewModel {

    private static final String TAG = "ProfileViewModel";

    private final SessionManager sessionManager;
    
    @Inject
    public ProfileViewModel(SessionManager sessionManager){
        this.sessionManager = sessionManager;
        Log.d(TAG, "ProfileViewModel: working");
    }

    public LiveData<AuthResource<User>> getAuthticateUser() {
        return sessionManager.getAuthUser();
    }

}
