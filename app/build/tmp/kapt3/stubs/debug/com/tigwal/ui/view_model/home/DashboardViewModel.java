package com.tigwal.ui.view_model.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010*\u001a\u00020+2\u0014\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00180-J\'\u0010\u0007\u001a\u00020.2\u0014\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00180-H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010/J\u000e\u00100\u001a\u00020+2\u0006\u00101\u001a\u00020\u0018J\u0019\u00102\u001a\u00020.2\u0006\u00101\u001a\u00020\u0018H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00103J\u000e\u00104\u001a\u00020+2\u0006\u00101\u001a\u00020\u0018J\u0019\u00105\u001a\u00020.2\u0006\u00101\u001a\u00020\u0018H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00103J\u001e\u00106\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\n08H\u0002J\u001e\u00109\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\t2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u001408H\u0002J\u001e\u0010:\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\t2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u001e08H\u0002J\u001e\u0010;\u001a\n\u0012\u0004\u0012\u00020\'\u0018\u00010\t2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\'08H\u0002J\u000e\u0010<\u001a\u00020+2\u0006\u00101\u001a\u00020\u0018J\u0019\u0010=\u001a\u00020.2\u0006\u00101\u001a\u00020\u0018H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00103R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\t0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000eR \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\t0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u000eR\u001a\u0010!\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\'0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\'0\t0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006>"}, d2 = {"Lcom/tigwal/ui/view_model/home/DashboardViewModel;", "Landroidx/lifecycle/ViewModel;", "application", "Landroid/app/Application;", "appRepository", "Lcom/tigwal/data/repository/AppRepository;", "(Landroid/app/Application;Lcom/tigwal/data/repository/AppRepository;)V", "appInstallationApiCall", "Landroidx/lifecycle/MutableLiveData;", "Lcom/tigwal/data/api/Resource;", "Lcom/tigwal/data/model/splash/AppInstallationResponse;", "appInstallationApiResponse", "Landroidx/lifecycle/LiveData;", "getAppInstallationApiResponse", "()Landroidx/lifecycle/LiveData;", "getApplication", "()Landroid/app/Application;", "setApplication", "(Landroid/app/Application;)V", "bannerApiCall", "Lcom/tigwal/data/model/banners/BannersResponse;", "bannerApiResponse", "getBannerApiResponse", "errorString", "", "getErrorString", "()Landroidx/lifecycle/MutableLiveData;", "setErrorString", "(Landroidx/lifecycle/MutableLiveData;)V", "getCategoryApiCall", "Lcom/tigwal/data/model/getcategory/CategoryResponse;", "getCategoryApiResponse", "getGetCategoryApiResponse", "noInternetConnection", "getNoInternetConnection", "()Ljava/lang/String;", "setNoInternetConnection", "(Ljava/lang/String;)V", "recommendationApiCall", "Lcom/tigwal/data/model/recommendation/RecommendationResponse;", "recommendationApiResponse", "getRecommendationApiResponse", "appInstallationApi", "Lkotlinx/coroutines/Job;", "params", "Ljava/util/HashMap;", "", "(Ljava/util/HashMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bannerApi", "authToken", "bannerApiCalling", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCategoryApi", "getCategoryApiCalling", "handleResponse", "response", "Lretrofit2/Response;", "handlecheckenableBannerResponse", "handlecheckenableNotificationApiCallResponse", "handlecheckenableRecommendResponse", "recommendationApi", "recommendationApiCalling", "app_debug"})
public final class DashboardViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private android.app.Application application;
    private com.tigwal.data.repository.AppRepository appRepository;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> errorString;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String noInternetConnection = "";
    private final androidx.lifecycle.MutableLiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.getcategory.CategoryResponse>> getCategoryApiCall = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.getcategory.CategoryResponse>> getCategoryApiResponse = null;
    private final androidx.lifecycle.MutableLiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.banners.BannersResponse>> bannerApiCall = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.banners.BannersResponse>> bannerApiResponse = null;
    private final androidx.lifecycle.MutableLiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.recommendation.RecommendationResponse>> recommendationApiCall = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.recommendation.RecommendationResponse>> recommendationApiResponse = null;
    private final androidx.lifecycle.MutableLiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.splash.AppInstallationResponse>> appInstallationApiCall = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.splash.AppInstallationResponse>> appInstallationApiResponse = null;
    
    public DashboardViewModel(@org.jetbrains.annotations.NotNull()
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
    public final androidx.lifecycle.LiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.getcategory.CategoryResponse>> getGetCategoryApiResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getCategoryApi(@org.jetbrains.annotations.NotNull()
    java.lang.String authToken) {
        return null;
    }
    
    private final java.lang.Object getCategoryApiCalling(java.lang.String authToken, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final com.tigwal.data.api.Resource<com.tigwal.data.model.getcategory.CategoryResponse> handlecheckenableNotificationApiCallResponse(retrofit2.Response<com.tigwal.data.model.getcategory.CategoryResponse> response) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.banners.BannersResponse>> getBannerApiResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job bannerApi(@org.jetbrains.annotations.NotNull()
    java.lang.String authToken) {
        return null;
    }
    
    private final java.lang.Object bannerApiCalling(java.lang.String authToken, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final com.tigwal.data.api.Resource<com.tigwal.data.model.banners.BannersResponse> handlecheckenableBannerResponse(retrofit2.Response<com.tigwal.data.model.banners.BannersResponse> response) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.recommendation.RecommendationResponse>> getRecommendationApiResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job recommendationApi(@org.jetbrains.annotations.NotNull()
    java.lang.String authToken) {
        return null;
    }
    
    private final java.lang.Object recommendationApiCalling(java.lang.String authToken, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final com.tigwal.data.api.Resource<com.tigwal.data.model.recommendation.RecommendationResponse> handlecheckenableRecommendResponse(retrofit2.Response<com.tigwal.data.model.recommendation.RecommendationResponse> response) {
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