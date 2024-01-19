package com.tigwal.ui.fragment;

import java.lang.System;

@android.annotation.SuppressLint(value = {"UseRequireInsteadOfGet"})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u00a0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\r\b\u0007\u0018\u0000 _2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002^_B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u00106\u001a\u000207H\u0002J\b\u00108\u001a\u000209H\u0016J\b\u0010:\u001a\u000209H\u0002J\u0010\u0010;\u001a\u00020\u00062\b\u0010<\u001a\u0004\u0018\u00010+J\b\u0010=\u001a\u000209H\u0016J\b\u0010>\u001a\u000209H\u0003J\b\u0010?\u001a\u000207H\u0002J\"\u0010@\u001a\u0002092\u0006\u0010A\u001a\u00020\u00062\u0006\u0010B\u001a\u00020\u00062\b\u0010C\u001a\u0004\u0018\u00010DH\u0016J\u0012\u0010E\u001a\u0002092\b\u0010F\u001a\u0004\u0018\u00010GH\u0016J&\u0010H\u001a\u0004\u0018\u00010G2\u0006\u0010I\u001a\u00020J2\b\u0010K\u001a\u0004\u0018\u00010L2\b\u0010M\u001a\u0004\u0018\u00010NH\u0017J-\u0010O\u001a\u0002092\u0006\u0010A\u001a\u00020\u00062\u000e\u0010P\u001a\n\u0012\u0006\b\u0001\u0012\u00020+0Q2\u0006\u0010R\u001a\u00020SH\u0017\u00a2\u0006\u0002\u0010TJ\b\u0010U\u001a\u000209H\u0016J\b\u0010V\u001a\u000209H\u0002J\b\u0010W\u001a\u000209H\u0003J\b\u0010X\u001a\u000209H\u0002J\u0016\u0010Y\u001a\u0002092\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH\u0002J\b\u0010Z\u001a\u000209H\u0016J\b\u0010[\u001a\u000209H\u0002J\b\u0010\\\u001a\u000209H\u0002J\b\u0010]\u001a\u000209H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010!\u001a\u00020\"8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b#\u0010$R\u0010\u0010&\u001a\u0004\u0018\u00010\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010*\u001a\u00020+X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u00100\u001a\u00020+X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010-\"\u0004\b2\u0010/R\u001a\u00103\u001a\u00020+X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010-\"\u0004\b5\u0010/\u00a8\u0006`"}, d2 = {"Lcom/tigwal/ui/fragment/DashboardFragment;", "Lcom/tigwal/base/BaseFragment;", "Lorg/kodein/di/KodeinAware;", "Landroid/view/View$OnClickListener;", "()V", "PLACE_PICKER_REQUEST_CODE", "", "arrayListCategory", "Ljava/util/ArrayList;", "Lcom/tigwal/data/model/getcategory/DataItem;", "getArrayListCategory", "()Ljava/util/ArrayList;", "setArrayListCategory", "(Ljava/util/ArrayList;)V", "bannerlist", "Lcom/tigwal/data/model/banners/BannerDataItem;", "getBannerlist", "setBannerlist", "binding", "Lcom/tigwal/databinding/FragmentDashboardBinding;", "currentPage", "getCurrentPage", "()I", "setCurrentPage", "(I)V", "dashboardViewModel", "Lcom/tigwal/ui/view_model/home/DashboardViewModel;", "factory", "Ljavax/xml/datatype/DatatypeFactory;", "getFactory", "()Ljavax/xml/datatype/DatatypeFactory;", "factory$delegate", "Lkotlin/Lazy;", "kodein", "Lorg/kodein/di/Kodein;", "getKodein", "()Lorg/kodein/di/Kodein;", "kodein$delegate", "mFusedLocationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "mLocationCallback", "Lcom/google/android/gms/location/LocationCallback;", "strAddress", "", "getStrAddress", "()Ljava/lang/String;", "setStrAddress", "(Ljava/lang/String;)V", "str_latitude", "getStr_latitude", "setStr_latitude", "str_longitude", "getStr_longitude", "setStr_longitude", "checkPermissions", "", "clickListener", "", "dialogLocation", "getImage", "imageName", "getIntentData", "getLastLocation", "isLocationEnabled", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onClick", "v", "Landroid/view/View;", "onCreateFragmentView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "placePicker", "requestNewLocationData", "requestPermissions", "setBannerAdaapter", "setFontTypeface", "setStaticBanner", "setupObservers", "setupViewModel", "BannerAdapter", "Companion", "app_release"})
public final class DashboardFragment extends com.tigwal.base.BaseFragment implements org.kodein.di.KodeinAware, android.view.View.OnClickListener {
    private final kotlin.Lazy factory$delegate = null;
    private com.tigwal.ui.view_model.home.DashboardViewModel dashboardViewModel;
    private com.tigwal.databinding.FragmentDashboardBinding binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy kodein$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.tigwal.data.model.getcategory.DataItem> arrayListCategory;
    private com.google.android.gms.location.FusedLocationProviderClient mFusedLocationClient;
    private final int PLACE_PICKER_REQUEST_CODE = 159;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String str_latitude = "0.0";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String str_longitude = "0.0";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String strAddress = "";
    private int currentPage = 0;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.tigwal.data.model.banners.BannerDataItem> bannerlist;
    @org.jetbrains.annotations.NotNull()
    public static final com.tigwal.ui.fragment.DashboardFragment.Companion Companion = null;
    private final com.google.android.gms.location.LocationCallback mLocationCallback = null;
    private java.util.HashMap _$_findViewCache;
    
    public DashboardFragment() {
        super();
    }
    
    private final javax.xml.datatype.DatatypeFactory getFactory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.kodein.di.Kodein getKodein() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.tigwal.data.model.getcategory.DataItem> getArrayListCategory() {
        return null;
    }
    
    public final void setArrayListCategory(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.tigwal.data.model.getcategory.DataItem> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStr_latitude() {
        return null;
    }
    
    public final void setStr_latitude(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStr_longitude() {
        return null;
    }
    
    public final void setStr_longitude(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrAddress() {
        return null;
    }
    
    public final void setStrAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getCurrentPage() {
        return 0;
    }
    
    public final void setCurrentPage(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.tigwal.data.model.banners.BannerDataItem> getBannerlist() {
        return null;
    }
    
    public final void setBannerlist(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.tigwal.data.model.banners.BannerDataItem> p0) {
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
    
    @org.jetbrains.annotations.Nullable()
    @android.annotation.SuppressLint(value = {"Range"})
    @java.lang.Override()
    public android.view.View onCreateFragmentView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    private final void placePicker() {
    }
    
    private final void setupViewModel() {
    }
    
    public final int getImage(@org.jetbrains.annotations.Nullable()
    java.lang.String imageName) {
        return 0;
    }
    
    private final void setupObservers() {
    }
    
    private final void setStaticBanner() {
    }
    
    private final void setBannerAdaapter(java.util.ArrayList<com.tigwal.data.model.banners.BannerDataItem> bannerlist) {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void getLastLocation() {
    }
    
    private final boolean checkPermissions() {
        return false;
    }
    
    private final void requestPermissions() {
    }
    
    private final boolean isLocationEnabled() {
        return false;
    }
    
    @android.annotation.SuppressLint(value = {"MissingSuperCall"})
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void requestNewLocationData() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    private final void dialogLocation() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.kodein.di.KodeinContext<?> getKodeinContext() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public org.kodein.di.KodeinTrigger getKodeinTrigger() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016J\u0018\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/tigwal/ui/fragment/DashboardFragment$BannerAdapter;", "Landroidx/viewpager/widget/PagerAdapter;", "context", "Landroid/content/Context;", "urlList", "Ljava/util/ArrayList;", "Lcom/tigwal/data/model/banners/BannerDataItem;", "(Lcom/tigwal/ui/fragment/DashboardFragment;Landroid/content/Context;Ljava/util/ArrayList;)V", "destroyItem", "", "container", "Landroid/view/ViewGroup;", "position", "", "object", "", "getCount", "instantiateItem", "isViewFromObject", "", "view", "Landroid/view/View;", "o", "app_release"})
    public final class BannerAdapter extends androidx.viewpager.widget.PagerAdapter {
        private final android.content.Context context = null;
        private final java.util.ArrayList<com.tigwal.data.model.banners.BannerDataItem> urlList = null;
        
        public BannerAdapter(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.tigwal.data.model.banners.BannerDataItem> urlList) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.Object instantiateItem(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup container, int position) {
            return null;
        }
        
        @java.lang.Override()
        public int getCount() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean isViewFromObject(@org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.NotNull()
        java.lang.Object o) {
            return false;
        }
        
        @java.lang.Override()
        public void destroyItem(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup container, int position, @org.jetbrains.annotations.NotNull()
        java.lang.Object object) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tigwal/ui/fragment/DashboardFragment$Companion;", "", "()V", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}