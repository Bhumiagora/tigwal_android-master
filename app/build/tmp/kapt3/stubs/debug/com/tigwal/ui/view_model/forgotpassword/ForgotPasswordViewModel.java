package com.tigwal.ui.view_model.forgotpassword;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J.\u0010\u001c\u001a\u00020\u001d2&\u0010\u001e\u001a\"\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u001fj\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0014` J9\u0010!\u001a\u00020\"2&\u0010\u001e\u001a\"\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u001fj\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0014` H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000e0&H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\'"}, d2 = {"Lcom/tigwal/ui/view_model/forgotpassword/ForgotPasswordViewModel;", "Landroidx/lifecycle/ViewModel;", "application", "Landroid/app/Application;", "appRepository", "Lcom/tigwal/data/repository/AppRepository;", "(Landroid/app/Application;Lcom/tigwal/data/repository/AppRepository;)V", "getApplication", "()Landroid/app/Application;", "setApplication", "(Landroid/app/Application;)V", "forgetPasswordApiCall", "Landroidx/lifecycle/MutableLiveData;", "Lcom/tigwal/data/api/Resource;", "Lcom/tigwal/data/model/forgotpassword/ForgotPasswordResponse;", "forgetPasswordApiResponse", "Landroidx/lifecycle/LiveData;", "getForgetPasswordApiResponse", "()Landroidx/lifecycle/LiveData;", "mobile", "", "getMobile", "()Ljava/lang/String;", "setMobile", "(Ljava/lang/String;)V", "noInternetConnection", "getNoInternetConnection", "setNoInternetConnection", "forgotPasswordApi", "Lkotlinx/coroutines/Job;", "params", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "forgotPasswordApiCall", "", "(Ljava/util/HashMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleResponse", "response", "Lretrofit2/Response;", "app_debug"})
public final class ForgotPasswordViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private android.app.Application application;
    private com.tigwal.data.repository.AppRepository appRepository;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String mobile = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String noInternetConnection = "";
    private final androidx.lifecycle.MutableLiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.forgotpassword.ForgotPasswordResponse>> forgetPasswordApiCall = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.forgotpassword.ForgotPasswordResponse>> forgetPasswordApiResponse = null;
    
    public ForgotPasswordViewModel(@org.jetbrains.annotations.NotNull()
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMobile() {
        return null;
    }
    
    public final void setMobile(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNoInternetConnection() {
        return null;
    }
    
    public final void setNoInternetConnection(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.forgotpassword.ForgotPasswordResponse>> getForgetPasswordApiResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job forgotPasswordApi(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> params) {
        return null;
    }
    
    private final java.lang.Object forgotPasswordApiCall(java.util.HashMap<java.lang.String, java.lang.String> params, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final com.tigwal.data.api.Resource<com.tigwal.data.model.forgotpassword.ForgotPasswordResponse> handleResponse(retrofit2.Response<com.tigwal.data.model.forgotpassword.ForgotPasswordResponse> response) {
        return null;
    }
}