package com.tigwal.ui.view_model.notification;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J$\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u000b2\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0$J/\u0010%\u001a\u00020&2\u0006\u0010\"\u001a\u00020\u000b2\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0$H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J\u001e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00170*H\u0002J\u001e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00162\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001d0*H\u0002J\u000e\u0010,\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u000bJ\u0019\u0010-\u001a\u00020&2\u0006\u0010\"\u001a\u00020\u000bH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00160\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00160\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006/"}, d2 = {"Lcom/tigwal/ui/view_model/notification/NotificationViewModel;", "Landroidx/lifecycle/ViewModel;", "application", "Landroid/app/Application;", "appRepository", "Lcom/tigwal/data/repository/AppRepository;", "(Landroid/app/Application;Lcom/tigwal/data/repository/AppRepository;)V", "getApplication", "()Landroid/app/Application;", "errorString", "Landroidx/lifecycle/MutableLiveData;", "", "getErrorString", "()Landroidx/lifecycle/MutableLiveData;", "setErrorString", "(Landroidx/lifecycle/MutableLiveData;)V", "noInternetConnection", "getNoInternetConnection", "()Ljava/lang/String;", "setNoInternetConnection", "(Ljava/lang/String;)V", "notificationCall", "Lcom/tigwal/data/api/Resource;", "Lcom/tigwal/data/model/notification_list/NotificationListResponse;", "notificationCallResponse", "Landroidx/lifecycle/LiveData;", "getNotificationCallResponse", "()Landroidx/lifecycle/LiveData;", "updateNotificationCall", "Lcom/tigwal/data/model/notification_enable/NotificationUpdateResponse;", "updateNotificationResponse", "getUpdateNotificationResponse", "enableNotificationApi", "Lkotlinx/coroutines/Job;", "authToken", "params", "Ljava/util/HashMap;", "enableNotificationApiCall", "", "(Ljava/lang/String;Ljava/util/HashMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleResponse", "response", "Lretrofit2/Response;", "handlecheckenableNotificationApiCallResponse", "notificationApi", "notificationApiCall", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public final class NotificationViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final android.app.Application application = null;
    private com.tigwal.data.repository.AppRepository appRepository;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> errorString;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String noInternetConnection = "";
    private final androidx.lifecycle.MutableLiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.notification_enable.NotificationUpdateResponse>> updateNotificationCall = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.notification_enable.NotificationUpdateResponse>> updateNotificationResponse = null;
    private final androidx.lifecycle.MutableLiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.notification_list.NotificationListResponse>> notificationCall = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.notification_list.NotificationListResponse>> notificationCallResponse = null;
    
    public NotificationViewModel(@org.jetbrains.annotations.NotNull()
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
    public final androidx.lifecycle.LiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.notification_enable.NotificationUpdateResponse>> getUpdateNotificationResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job enableNotificationApi(@org.jetbrains.annotations.NotNull()
    java.lang.String authToken, @org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> params) {
        return null;
    }
    
    private final java.lang.Object enableNotificationApiCall(java.lang.String authToken, java.util.HashMap<java.lang.String, java.lang.String> params, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final com.tigwal.data.api.Resource<com.tigwal.data.model.notification_enable.NotificationUpdateResponse> handlecheckenableNotificationApiCallResponse(retrofit2.Response<com.tigwal.data.model.notification_enable.NotificationUpdateResponse> response) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.tigwal.data.api.Resource<com.tigwal.data.model.notification_list.NotificationListResponse>> getNotificationCallResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job notificationApi(@org.jetbrains.annotations.NotNull()
    java.lang.String authToken) {
        return null;
    }
    
    private final java.lang.Object notificationApiCall(java.lang.String authToken, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final com.tigwal.data.api.Resource<com.tigwal.data.model.notification_list.NotificationListResponse> handleResponse(retrofit2.Response<com.tigwal.data.model.notification_list.NotificationListResponse> response) {
        return null;
    }
}