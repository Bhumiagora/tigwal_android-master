package com.tigwal.ui.view_model.profile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u0014J\u0019\u0010(\u001a\u00020)2\u0006\u0010\'\u001a\u00020\u0014H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*J\u000e\u0010+\u001a\u00020&2\u0006\u0010,\u001a\u00020\u0014J\u0019\u0010-\u001a\u00020)2\u0006\u0010,\u001a\u00020\u0014H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*J\u001e\u0010.\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\r2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001f00H\u0002J\u001e\u00101\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000e00H\u0002J\u001e\u00102\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\r2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001f00H\u0002J@\u00103\u001a\u00020&2\u0006\u0010,\u001a\u00020\u00142&\u00104\u001a\"\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010605j\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u000106`72\b\u00108\u001a\u0004\u0018\u00010\u0014JK\u00109\u001a\u00020)2\u0006\u0010,\u001a\u00020\u00142&\u00104\u001a\"\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010605j\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u000106`72\b\u0010:\u001a\u0004\u0018\u00010;H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010<R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\r0\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0010R\u001a\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\r0\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006="}, d2 = {"Lcom/tigwal/ui/view_model/profile/ProfileViewModel;", "Landroidx/lifecycle/ViewModel;", "application", "Landroid/app/Application;", "appRepository", "Lcom/tigwal/data/repository/AppRepository;", "(Landroid/app/Application;Lcom/tigwal/data/repository/AppRepository;)V", "getApplication", "()Landroid/app/Application;", "setApplication", "(Landroid/app/Application;)V", "deleteUserApiCallResponse", "Landroidx/lifecycle/LiveData;", "Lcom/tigwal/data/api/Resource;", "Lcom/tigwal/data/model/DeleteUserResponse;", "getDeleteUserApiCallResponse", "()Landroidx/lifecycle/LiveData;", "deleteUserCall", "Landroidx/lifecycle/MutableLiveData;", "errorString", "", "getErrorString", "()Landroidx/lifecycle/MutableLiveData;", "setErrorString", "(Landroidx/lifecycle/MutableLiveData;)V", "noInternetConnection", "getNoInternetConnection", "()Ljava/lang/String;", "setNoInternetConnection", "(Ljava/lang/String;)V", "profileApiCall", "Lcom/tigwal/data/model/login/LoginResponse;", "profileApiResponse", "getProfileApiResponse", "updateProfileApiCall", "updateProfileApiResponse", "getUpdateProfileApiResponse", "deleteUserApi", "Lkotlinx/coroutines/Job;", "authToken", "deleteUserApiCall", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProfileAPi", "strToken", "getProfileAPiCall", "handleProfileResponse", "response", "Lretrofit2/Response;", "handleResponse", "handleUpdateProfileResponse", "updateProfileAPi", "params", "Ljava/util/HashMap;", "Lokhttp3/RequestBody;", "Lkotlin/collections/HashMap;", "picturePath", "updateProfileAPiCall", "parts", "Lokhttp3/MultipartBody$Part;", "(Ljava/lang/String;Ljava/util/HashMap;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public final class ProfileViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private android.app.Application application;
    private com.tigwal.data.repository.AppRepository appRepository;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> errorString;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String noInternetConnection = "";
    private final androidx.lifecycle.MutableLiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.login.LoginResponse>> profileApiCall = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.login.LoginResponse>> profileApiResponse = null;
    private final androidx.lifecycle.MutableLiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.login.LoginResponse>> updateProfileApiCall = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.login.LoginResponse>> updateProfileApiResponse = null;
    private final androidx.lifecycle.MutableLiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.DeleteUserResponse>> deleteUserCall = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.DeleteUserResponse>> deleteUserApiCallResponse = null;
    
    public ProfileViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    com.tigwal.data.repository.AppRepository appRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Application getApplication() {
        return null;
    }
    
    public final void setApplication(@org.jetbrains.annotations.NotNull()
    android.app.Application p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getErrorString() {
        return null;
    }
    
    public final void setErrorString(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNoInternetConnection() {
        return null;
    }
    
    public final void setNoInternetConnection(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.login.LoginResponse>> getProfileApiResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getProfileAPi(@org.jetbrains.annotations.NotNull()
    java.lang.String strToken) {
        return null;
    }
    
    private final java.lang.Object getProfileAPiCall(java.lang.String strToken, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final com.tigwal.data.api.Resource<com.tigwal.data.model.login.LoginResponse> handleProfileResponse(retrofit2.Response<com.tigwal.data.model.login.LoginResponse> response) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.login.LoginResponse>> getUpdateProfileApiResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job updateProfileAPi(@org.jetbrains.annotations.NotNull()
    java.lang.String strToken, @org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, okhttp3.RequestBody> params, @org.jetbrains.annotations.Nullable()
    java.lang.String picturePath) {
        return null;
    }
    
    private final java.lang.Object updateProfileAPiCall(java.lang.String strToken, java.util.HashMap<java.lang.String, okhttp3.RequestBody> params, okhttp3.MultipartBody.Part parts, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final com.tigwal.data.api.Resource<com.tigwal.data.model.login.LoginResponse> handleUpdateProfileResponse(retrofit2.Response<com.tigwal.data.model.login.LoginResponse> response) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.DeleteUserResponse>> getDeleteUserApiCallResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteUserApi(@org.jetbrains.annotations.NotNull()
    java.lang.String authToken) {
        return null;
    }
    
    private final java.lang.Object deleteUserApiCall(java.lang.String authToken, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final com.tigwal.data.api.Resource<com.tigwal.data.model.DeleteUserResponse> handleResponse(retrofit2.Response<com.tigwal.data.model.DeleteUserResponse> response) {
        return null;
    }
}