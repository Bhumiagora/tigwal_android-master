package com.tigwal.ui.view_model.product_detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J>\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\u00182&\u0010)\u001a\"\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00180*j\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0018`+JI\u0010,\u001a\u00020-2\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\u00182&\u0010)\u001a\"\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00180*j\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0018`+H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.J\u0016\u0010/\u001a\u00020%2\u0006\u0010(\u001a\u00020\u00182\u0006\u00100\u001a\u000201J!\u00102\u001a\u00020-2\u0006\u0010(\u001a\u00020\u00182\u0006\u00100\u001a\u000201H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00103J&\u00104\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010&\u001a\u00020\'2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\n06H\u0002J\u001e\u00107\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\t2\f\u00105\u001a\b\u0012\u0004\u0012\u00020!06H\u0002J\u001e\u00108\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\t2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u001406H\u0002J\u0016\u00109\u001a\u00020%2\u0006\u0010(\u001a\u00020\u00182\u0006\u0010:\u001a\u00020\u0018J!\u0010;\u001a\u00020-2\u0006\u0010(\u001a\u00020\u00182\u0006\u0010<\u001a\u00020\u0018H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010=R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\t0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u001a\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u001a\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\t0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006>"}, d2 = {"Lcom/tigwal/ui/view_model/product_detail/ProductDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "application", "Landroid/app/Application;", "appRepository", "Lcom/tigwal/data/repository/AppRepository;", "(Landroid/app/Application;Lcom/tigwal/data/repository/AppRepository;)V", "addToCarCall", "Landroidx/lifecycle/MutableLiveData;", "Lcom/tigwal/data/api/Resource;", "Lcom/tigwal/data/model/addtocart/AddToCartResponse;", "addToCartCallResponse", "Landroidx/lifecycle/LiveData;", "getAddToCartCallResponse", "()Landroidx/lifecycle/LiveData;", "getApplication", "()Landroid/app/Application;", "setApplication", "(Landroid/app/Application;)V", "getTimeSlotCallResponse", "Lcom/tigwal/data/model/getTimeSlot/GetTimeSlotResposne;", "getGetTimeSlotCallResponse", "getTimeSlotsCall", "mobile", "", "getMobile", "()Ljava/lang/String;", "setMobile", "(Ljava/lang/String;)V", "noInternetConnection", "getNoInternetConnection", "setNoInternetConnection", "productDetailCall", "Lcom/tigwal/data/model/product_detail/ProductDetailResponse;", "productDetailCallResponse", "getProductDetailCallResponse", "addToCartApi", "Lkotlinx/coroutines/Job;", "activity", "Landroid/app/Activity;", "authToken", "params1", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "addToCartApiCall", "", "(Landroid/app/Activity;Ljava/lang/String;Ljava/util/HashMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTimeSlotApi", "params", "Lokhttp3/RequestBody;", "getTimeSlotApiCall", "(Ljava/lang/String;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleAddToCartResponse", "response", "Lretrofit2/Response;", "handleResponse", "handleTimeSlotResponse", "productDetailApi", "strSlug", "productDetailApiCall", "locationId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ProductDetailViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private android.app.Application application;
    private com.tigwal.data.repository.AppRepository appRepository;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String mobile = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String noInternetConnection = "";
    private final androidx.lifecycle.MutableLiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.product_detail.ProductDetailResponse>> productDetailCall = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.product_detail.ProductDetailResponse>> productDetailCallResponse = null;
    private final androidx.lifecycle.MutableLiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.addtocart.AddToCartResponse>> addToCarCall = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.addtocart.AddToCartResponse>> addToCartCallResponse = null;
    private final androidx.lifecycle.MutableLiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.getTimeSlot.GetTimeSlotResposne>> getTimeSlotsCall = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.getTimeSlot.GetTimeSlotResposne>> getTimeSlotCallResponse = null;
    
    public ProductDetailViewModel(@org.jetbrains.annotations.NotNull()
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
    public final androidx.lifecycle.LiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.product_detail.ProductDetailResponse>> getProductDetailCallResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job productDetailApi(@org.jetbrains.annotations.NotNull()
    java.lang.String authToken, @org.jetbrains.annotations.NotNull()
    java.lang.String strSlug) {
        return null;
    }
    
    private final java.lang.Object productDetailApiCall(java.lang.String authToken, java.lang.String locationId, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final com.tigwal.data.api.Resource<com.tigwal.data.model.product_detail.ProductDetailResponse> handleResponse(retrofit2.Response<com.tigwal.data.model.product_detail.ProductDetailResponse> response) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.addtocart.AddToCartResponse>> getAddToCartCallResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job addToCartApi(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.lang.String authToken, @org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> params1) {
        return null;
    }
    
    private final java.lang.Object addToCartApiCall(android.app.Activity activity, java.lang.String authToken, java.util.HashMap<java.lang.String, java.lang.String> params1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final com.tigwal.data.api.Resource<com.tigwal.data.model.addtocart.AddToCartResponse> handleAddToCartResponse(android.app.Activity activity, retrofit2.Response<com.tigwal.data.model.addtocart.AddToCartResponse> response) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.getTimeSlot.GetTimeSlotResposne>> getGetTimeSlotCallResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getTimeSlotApi(@org.jetbrains.annotations.NotNull()
    java.lang.String authToken, @org.jetbrains.annotations.NotNull()
    okhttp3.RequestBody params) {
        return null;
    }
    
    private final java.lang.Object getTimeSlotApiCall(java.lang.String authToken, okhttp3.RequestBody params, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final com.tigwal.data.api.Resource<com.tigwal.data.model.getTimeSlot.GetTimeSlotResposne> handleTimeSlotResponse(retrofit2.Response<com.tigwal.data.model.getTimeSlot.GetTimeSlotResposne> response) {
        return null;
    }
}