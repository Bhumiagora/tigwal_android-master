package com.tigwal.ui.view_model.order_summary;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J/\u0010\u0007\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00122\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00120#H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0\'H\u0002J\u001e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\t2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001d0\'H\u0002J!\u0010)\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u0012H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010+J\u0016\u0010,\u001a\u00020-2\u0006\u0010!\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u0012J$\u0010.\u001a\u00020-2\u0006\u0010!\u001a\u00020\u00122\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00120#R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\t0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006/"}, d2 = {"Lcom/tigwal/ui/view_model/order_summary/OrderSummaryViewModel;", "Landroidx/lifecycle/ViewModel;", "application", "Landroid/app/Application;", "appRepository", "Lcom/tigwal/data/repository/AppRepository;", "(Landroid/app/Application;Lcom/tigwal/data/repository/AppRepository;)V", "addRatingApiCall", "Landroidx/lifecycle/MutableLiveData;", "Lcom/tigwal/data/api/Resource;", "Lcom/tigwal/data/model/rating/RatingResponse;", "addRatingApiCallResponse", "Landroidx/lifecycle/LiveData;", "getAddRatingApiCallResponse", "()Landroidx/lifecycle/LiveData;", "getApplication", "()Landroid/app/Application;", "errorString", "", "getErrorString", "()Landroidx/lifecycle/MutableLiveData;", "setErrorString", "(Landroidx/lifecycle/MutableLiveData;)V", "noInternetConnection", "getNoInternetConnection", "()Ljava/lang/String;", "setNoInternetConnection", "(Ljava/lang/String;)V", "orderDetailCall", "Lcom/tigwal/data/model/order_detail/OrderDetailResponse;", "orderDetailCallResponse", "getOrderDetailCallResponse", "", "authToken", "params", "Ljava/util/HashMap;", "(Ljava/lang/String;Ljava/util/HashMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleRatingCallResponse", "response", "Lretrofit2/Response;", "handleResponse", "orderDetaiApiCall", "orderId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "orderDetailApi", "Lkotlinx/coroutines/Job;", "ratingApiCall", "app_release"})
public final class OrderSummaryViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final android.app.Application application = null;
    private com.tigwal.data.repository.AppRepository appRepository;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> errorString;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String noInternetConnection = "";
    private final androidx.lifecycle.MutableLiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.order_detail.OrderDetailResponse>> orderDetailCall = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.order_detail.OrderDetailResponse>> orderDetailCallResponse = null;
    private final androidx.lifecycle.MutableLiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.rating.RatingResponse>> addRatingApiCall = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.rating.RatingResponse>> addRatingApiCallResponse = null;
    
    public OrderSummaryViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    com.tigwal.data.repository.AppRepository appRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Application getApplication() {
        return null;
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
    public final androidx.lifecycle.LiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.order_detail.OrderDetailResponse>> getOrderDetailCallResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job orderDetailApi(@org.jetbrains.annotations.NotNull()
    java.lang.String authToken, @org.jetbrains.annotations.NotNull()
    java.lang.String orderId) {
        return null;
    }
    
    private final java.lang.Object orderDetaiApiCall(java.lang.String authToken, java.lang.String orderId, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final com.tigwal.data.api.Resource<com.tigwal.data.model.order_detail.OrderDetailResponse> handleResponse(retrofit2.Response<com.tigwal.data.model.order_detail.OrderDetailResponse> response) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.rating.RatingResponse>> getAddRatingApiCallResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job ratingApiCall(@org.jetbrains.annotations.NotNull()
    java.lang.String authToken, @org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> params) {
        return null;
    }
    
    private final java.lang.Object addRatingApiCall(java.lang.String authToken, java.util.HashMap<java.lang.String, java.lang.String> params, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final com.tigwal.data.api.Resource<com.tigwal.data.model.rating.RatingResponse> handleRatingCallResponse(retrofit2.Response<com.tigwal.data.model.rating.RatingResponse> response) {
        return null;
    }
}