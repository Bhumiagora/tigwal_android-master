package com.tigwal.ui.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 22\u00020\u00012\u00020\u00022\u00020\u0003:\u000223B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020$H\u0016J\u0006\u0010&\u001a\u00020$J\u0012\u0010\'\u001a\u00020$2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u0012\u0010*\u001a\u00020$2\b\u0010+\u001a\u0004\u0018\u00010,H\u0014J\b\u0010-\u001a\u00020$H\u0014J\b\u0010.\u001a\u00020$H\u0014J\b\u0010/\u001a\u00020$H\u0016J\b\u00100\u001a\u00020$H\u0002J\b\u00101\u001a\u00020$H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0019\u001a\u00020\u001a8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018R\u000e\u0010!\u001a\u00020\"X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00064"}, d2 = {"Lcom/tigwal/ui/activity/SupportChatActivity;", "Lcom/tigwal/base/BaseActivity;", "Lorg/kodein/di/KodeinAware;", "Landroid/view/View$OnClickListener;", "()V", "binding", "Lcom/tigwal/databinding/ActivitySupportChatBinding;", "data", "Ljava/util/ArrayList;", "", "getData", "()Ljava/util/ArrayList;", "setData", "(Ljava/util/ArrayList;)V", "factory", "Lcom/tigwal/ui/factory/SupportChatFactory;", "getFactory", "()Lcom/tigwal/ui/factory/SupportChatFactory;", "factory$delegate", "Lkotlin/Lazy;", "imageVendor", "getImageVendor", "()Ljava/lang/String;", "setImageVendor", "(Ljava/lang/String;)V", "kodein", "Lorg/kodein/di/Kodein;", "getKodein", "()Lorg/kodein/di/Kodein;", "kodein$delegate", "vendorID", "getVendorID", "setVendorID", "viewModel", "Lcom/tigwal/ui/view_model/support_chat/SupportChatViewModel;", "clickListener", "", "getIntentData", "listChat", "onClick", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResume", "setFontTypeface", "setupObservers", "setupViewModel", "Companion", "CustomBroadcastReceiver", "app_debug"})
public final class SupportChatActivity extends com.tigwal.base.BaseActivity implements org.kodein.di.KodeinAware, android.view.View.OnClickListener {
    private com.tigwal.databinding.ActivitySupportChatBinding binding;
    private com.tigwal.ui.view_model.support_chat.SupportChatViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy kodein$delegate = null;
    private final kotlin.Lazy factory$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String vendorID = "";
    @org.jetbrains.annotations.Nullable()
    private java.lang.String imageVendor = "";
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.String> data;
    @org.jetbrains.annotations.NotNull()
    public static final com.tigwal.ui.activity.SupportChatActivity.Companion Companion = null;
    private static boolean isLoading = false;
    private static boolean isBroadCast = false;
    private java.util.HashMap _$_findViewCache;
    
    public SupportChatActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.kodein.di.Kodein getKodein() {
        return null;
    }
    
    private final com.tigwal.ui.factory.SupportChatFactory getFactory() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getVendorID() {
        return null;
    }
    
    public final void setVendorID(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getImageVendor() {
        return null;
    }
    
    public final void setImageVendor(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    public final void listChat() {
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
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    private final void setupViewModel() {
    }
    
    private final void setupObservers() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.kodein.di.KodeinContext<?> getKodeinContext() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public org.kodein.di.KodeinTrigger getKodeinTrigger() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016\u00a8\u0006\t"}, d2 = {"Lcom/tigwal/ui/activity/SupportChatActivity$CustomBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_debug"})
    public static final class CustomBroadcastReceiver extends android.content.BroadcastReceiver {
        
        public CustomBroadcastReceiver() {
            super();
        }
        
        @java.lang.Override()
        public void onReceive(@org.jetbrains.annotations.Nullable()
        android.content.Context context, @org.jetbrains.annotations.Nullable()
        android.content.Intent intent) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0005\"\u0004\b\t\u0010\u0007\u00a8\u0006\n"}, d2 = {"Lcom/tigwal/ui/activity/SupportChatActivity$Companion;", "", "()V", "isBroadCast", "", "()Z", "setBroadCast", "(Z)V", "isLoading", "setLoading", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final boolean isLoading() {
            return false;
        }
        
        public final void setLoading(boolean p0) {
        }
        
        public final boolean isBroadCast() {
            return false;
        }
        
        public final void setBroadCast(boolean p0) {
        }
    }
}