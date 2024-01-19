package com.tigwal.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\nH&J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\u0006\u0010\r\u001a\u00020\nJ\b\u0010\u000e\u001a\u00020\nH\u0016J\u001c\u0010\u000f\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\nH\u0014J\u001a\u0010\u0015\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\b\u0010\u001a\u001a\u00020\nH&J\b\u0010\u001b\u001a\u00020\nH\u0016J\u0010\u0010\u001c\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ\u000e\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020!R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/tigwal/base/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "activity", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "customProgressDialog", "Lcom/tigwal/ui/dialog/CustomProgressDialog;", "clickListener", "", "getIntentData", "hideKeyboard", "hideProgressDialog", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "persistentState", "Landroid/os/PersistableBundle;", "onResume", "pushFragment", "fragment", "Landroidx/fragment/app/Fragment;", "title", "", "setFontTypeface", "setLangauge", "setLoginUserData", "data", "Lcom/tigwal/data/model/login/LoginResponse$Data;", "showProgressDialog", "ctx", "Landroid/content/Context;", "app_release"})
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.tigwal.ui.dialog.CustomProgressDialog customProgressDialog;
    private java.util.HashMap _$_findViewCache;
    
    public BaseActivity() {
        super();
    }
    
    public final void showProgressDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx) {
    }
    
    public final void setLoginUserData(@org.jetbrains.annotations.Nullable()
    com.tigwal.data.model.login.LoginResponse.Data data) {
    }
    
    public final void hideProgressDialog() {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState, @org.jetbrains.annotations.Nullable()
    android.os.PersistableBundle persistentState) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    public void hideKeyboard(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Activity getActivity() {
        return null;
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public final void pushFragment(@org.jetbrains.annotations.Nullable()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.Nullable()
    java.lang.String title) {
    }
    
    public abstract void getIntentData();
    
    public abstract void clickListener();
    
    public abstract void setFontTypeface();
    
    public void setLangauge() {
    }
}