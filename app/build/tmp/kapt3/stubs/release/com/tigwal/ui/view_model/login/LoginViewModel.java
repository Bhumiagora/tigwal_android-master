package com.tigwal.ui.view_model.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u00100\u001a\u0002012\u0014\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001c03J\'\u0010\u0007\u001a\u0002042\u0014\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001c03H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00105J\'\u00106\u001a\u0002042\u0014\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001c03H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00105J\u001c\u0010\u0013\u001a\u0002012\u0014\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001c03J$\u00107\u001a\u0002012\u0014\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001c032\u0006\u00108\u001a\u000209J/\u0010:\u001a\u0002042\u0014\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001c032\u0006\u00108\u001a\u000209H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010;J\u001e\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\t2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00140>H\u0002J\u001e\u0010?\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\n0>H\u0002J\u001e\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\t2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00180>H\u0002J&\u0010A\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\t2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00180>2\u0006\u00108\u001a\u000209H\u0002J\u001e\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\t2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00180>H\u0002J\u001e\u0010C\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010\t2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020*0>H\u0002J\u001c\u0010D\u001a\u0002012\u0014\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001c03J\'\u0010!\u001a\u0002042\u0014\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001c03H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00105J\u001c\u0010E\u001a\u0002012\u0014\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001c03J\'\u0010F\u001a\u0002042\u0014\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001c03H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00105J\u001c\u0010G\u001a\u0002012\u0014\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001c03J\'\u0010H\u001a\u0002042\u0014\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001c03H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00105R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\t0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000eR\u001a\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\t0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000eR \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\t0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u000eR\u001a\u0010$\u001a\u00020\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001a\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\t0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u000eR\u001a\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\t0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006I"}, d2 = {"Lcom/tigwal/ui/view_model/login/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "application", "Landroid/app/Application;", "appRepository", "Lcom/tigwal/data/repository/AppRepository;", "(Landroid/app/Application;Lcom/tigwal/data/repository/AppRepository;)V", "appInstallationApiCall", "Landroidx/lifecycle/MutableLiveData;", "Lcom/tigwal/data/api/Resource;", "Lcom/tigwal/data/model/splash/AppInstallationResponse;", "appInstallationApiResponse", "Landroidx/lifecycle/LiveData;", "getAppInstallationApiResponse", "()Landroidx/lifecycle/LiveData;", "getApplication", "()Landroid/app/Application;", "setApplication", "(Landroid/app/Application;)V", "checkEmailMobileExitsApiCall", "Lcom/tigwal/data/model/check_email_mobile_exist/CheckEmailMobileExitsResponse;", "checkEmailMobileExitsCallResponse", "getCheckEmailMobileExitsCallResponse", "checkSocialLoginCall", "Lcom/tigwal/data/model/login/LoginResponse;", "checkSocialLoginResponse", "getCheckSocialLoginResponse", "errorString", "", "getErrorString", "()Landroidx/lifecycle/MutableLiveData;", "setErrorString", "(Landroidx/lifecycle/MutableLiveData;)V", "loginApiCall", "loginApiResponse", "getLoginApiResponse", "noInternetConnection", "getNoInternetConnection", "()Ljava/lang/String;", "setNoInternetConnection", "(Ljava/lang/String;)V", "sendotpApiCall", "Lcom/tigwal/data/model/otp/SendOtpResponse;", "sendotpApiResponse", "getSendotpApiResponse", "socialSignUpCall", "socialSignUpResponse", "getSocialSignUpResponse", "appInstallationApi", "Lkotlinx/coroutines/Job;", "params", "Ljava/util/HashMap;", "", "(Ljava/util/HashMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkEmailMobileApiCall", "check_social_id_exists", "activity", "Landroid/app/Activity;", "check_social_id_existsApiCall", "(Ljava/util/HashMap;Landroid/app/Activity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleEmailMobileCallResponse", "response", "Lretrofit2/Response;", "handleResponse", "handleSocialSignupResponse", "handlechecksocialoginResponse", "handleloginResponse", "handlesendotpResponse", "loginApi", "sendOtpApi", "sendOtpApiCall", "socialSignUpApi", "socialSignUpApiCall", "app_release"})
public final class LoginViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private android.app.Application application;
    private com.tigwal.data.repository.AppRepository appRepository;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String noInternetConnection = "";
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> errorString;
    private final androidx.lifecycle.MutableLiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.login.LoginResponse>> checkSocialLoginCall = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.login.LoginResponse>> checkSocialLoginResponse = null;
    private final androidx.lifecycle.MutableLiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.otp.SendOtpResponse>> sendotpApiCall = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.otp.SendOtpResponse>> sendotpApiResponse = null;
    private final androidx.lifecycle.MutableLiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.login.LoginResponse>> loginApiCall = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.login.LoginResponse>> loginApiResponse = null;
    private final androidx.lifecycle.MutableLiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.login.LoginResponse>> socialSignUpCall = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.login.LoginResponse>> socialSignUpResponse = null;
    private final androidx.lifecycle.MutableLiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.check_email_mobile_exist.CheckEmailMobileExitsResponse>> checkEmailMobileExitsApiCall = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.check_email_mobile_exist.CheckEmailMobileExitsResponse>> checkEmailMobileExitsCallResponse = null;
    private final androidx.lifecycle.MutableLiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.splash.AppInstallationResponse>> appInstallationApiCall = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.splash.AppInstallationResponse>> appInstallationApiResponse = null;
    
    public LoginViewModel(@org.jetbrains.annotations.NotNull()
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
    public final java.lang.String getNoInternetConnection() {
        return null;
    }
    
    public final void setNoInternetConnection(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getErrorString() {
        return null;
    }
    
    public final void setErrorString(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.login.LoginResponse>> getCheckSocialLoginResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.otp.SendOtpResponse>> getSendotpApiResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job sendOtpApi(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> params) {
        return null;
    }
    
    private final java.lang.Object sendOtpApiCall(java.util.HashMap<java.lang.String, java.lang.String> params, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final com.tigwal.data.api.Resource<com.tigwal.data.model.otp.SendOtpResponse> handlesendotpResponse(retrofit2.Response<com.tigwal.data.model.otp.SendOtpResponse> response) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.login.LoginResponse>> getLoginApiResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job loginApi(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> params) {
        return null;
    }
    
    private final java.lang.Object loginApiCall(java.util.HashMap<java.lang.String, java.lang.String> params, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final com.tigwal.data.api.Resource<com.tigwal.data.model.login.LoginResponse> handleloginResponse(retrofit2.Response<com.tigwal.data.model.login.LoginResponse> response) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job check_social_id_exists(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> params, @org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
        return null;
    }
    
    private final java.lang.Object check_social_id_existsApiCall(java.util.HashMap<java.lang.String, java.lang.String> params, android.app.Activity activity, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final com.tigwal.data.api.Resource<com.tigwal.data.model.login.LoginResponse> handlechecksocialoginResponse(retrofit2.Response<com.tigwal.data.model.login.LoginResponse> response, android.app.Activity activity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.login.LoginResponse>> getSocialSignUpResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job socialSignUpApi(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> params) {
        return null;
    }
    
    private final java.lang.Object socialSignUpApiCall(java.util.HashMap<java.lang.String, java.lang.String> params, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final com.tigwal.data.api.Resource<com.tigwal.data.model.login.LoginResponse> handleSocialSignupResponse(retrofit2.Response<com.tigwal.data.model.login.LoginResponse> response) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.check_email_mobile_exist.CheckEmailMobileExitsResponse>> getCheckEmailMobileExitsCallResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job checkEmailMobileExitsApiCall(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> params) {
        return null;
    }
    
    private final java.lang.Object checkEmailMobileApiCall(java.util.HashMap<java.lang.String, java.lang.String> params, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final com.tigwal.data.api.Resource<com.tigwal.data.model.check_email_mobile_exist.CheckEmailMobileExitsResponse> handleEmailMobileCallResponse(retrofit2.Response<com.tigwal.data.model.check_email_mobile_exist.CheckEmailMobileExitsResponse> response) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.splash.AppInstallationResponse>> getAppInstallationApiResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job appInstallationApi(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> params) {
        return null;
    }
    
    private final java.lang.Object appInstallationApiCall(java.util.HashMap<java.lang.String, java.lang.String> params, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final com.tigwal.data.api.Resource<com.tigwal.data.model.splash.AppInstallationResponse> handleResponse(retrofit2.Response<com.tigwal.data.model.splash.AppInstallationResponse> response) {
        return null;
    }
}