package com.tigwal.ui.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\"H\u0002J\b\u0010$\u001a\u00020\"H\u0016J\u000e\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020\'J\b\u0010(\u001a\u00020\"H\u0002J\u0012\u0010)\u001a\u00020\"2\b\u0010*\u001a\u0004\u0018\u00010+H\u0014J\b\u0010,\u001a\u00020\"H\u0016J\b\u0010-\u001a\u00020\"H\u0002J\b\u0010.\u001a\u00020\"H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001f\u001a\u00020 X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lcom/tigwal/ui/activity/SplashActivity;", "Lcom/tigwal/base/BaseActivity;", "Lorg/kodein/di/KodeinAware;", "()V", "binding", "Lcom/tigwal/databinding/ActivitySplashBinding;", "deviceUDID", "", "getDeviceUDID", "()Ljava/lang/String;", "setDeviceUDID", "(Ljava/lang/String;)V", "errorString", "Landroidx/lifecycle/MutableLiveData;", "getErrorString", "()Landroidx/lifecycle/MutableLiveData;", "setErrorString", "(Landroidx/lifecycle/MutableLiveData;)V", "factory", "Lcom/tigwal/ui/factory/SplashFactory;", "getFactory", "()Lcom/tigwal/ui/factory/SplashFactory;", "factory$delegate", "Lkotlin/Lazy;", "handler", "Landroid/os/Handler;", "kodein", "Lorg/kodein/di/Kodein;", "getKodein", "()Lorg/kodein/di/Kodein;", "kodein$delegate", "splashviewmodel", "Lcom/tigwal/ui/view_model/splash/SplashViewModel;", "clickListener", "", "deviceToken", "getIntentData", "hashkey", "activity", "Landroid/app/Activity;", "init", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setFontTypeface", "setupObservers", "setupViewModel", "app_release"})
public final class SplashActivity extends com.tigwal.base.BaseActivity implements org.kodein.di.KodeinAware {
    private com.tigwal.databinding.ActivitySplashBinding binding;
    private com.tigwal.ui.view_model.splash.SplashViewModel splashviewmodel;
    private final kotlin.Lazy factory$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy kodein$delegate = null;
    private android.os.Handler handler;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> errorString;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String deviceUDID = "";
    private java.util.HashMap _$_findViewCache;
    
    public SplashActivity() {
        super();
    }
    
    private final com.tigwal.ui.factory.SplashFactory getFactory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.kodein.di.Kodein getKodein() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getErrorString() {
        return null;
    }
    
    public final void setErrorString(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDeviceUDID() {
        return null;
    }
    
    public final void setDeviceUDID(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupViewModel() {
    }
    
    private final void setupObservers() {
    }
    
    private final void init() {
    }
    
    private final void deviceToken() {
    }
    
    @java.lang.Override()
    public void getIntentData() {
    }
    
    @java.lang.Override()
    public void clickListener() {
    }
    
    @java.lang.Override()
    public void setFontTypeface() {
    }
    
    public final void hashkey(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.kodein.di.KodeinContext<?> getKodeinContext() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public org.kodein.di.KodeinTrigger getKodeinTrigger() {
        return null;
    }
}