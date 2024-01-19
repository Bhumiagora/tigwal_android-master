package com.tigwal.ui.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020!H\u0016J\u0012\u0010#\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010%H\u0017J\u0012\u0010&\u001a\u00020!2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0014J$\u0010)\u001a\u00020!2\u001a\u0010*\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010,0+j\n\u0012\u0006\u0012\u0004\u0018\u00010,`-H\u0002J\b\u0010.\u001a\u00020!H\u0016J\b\u0010/\u001a\u00020!H\u0002J\b\u00100\u001a\u00020!H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2 = {"Lcom/tigwal/ui/activity/SearchProductListActivity;", "Lcom/tigwal/base/BaseActivity;", "Lorg/kodein/di/KodeinAware;", "Landroid/view/View$OnClickListener;", "()V", "binding", "Lcom/tigwal/databinding/ActivitySearchproductListBinding;", "factory", "Lcom/tigwal/ui/factory/SearchProductListFactory;", "getFactory", "()Lcom/tigwal/ui/factory/SearchProductListFactory;", "factory$delegate", "Lkotlin/Lazy;", "kodein", "Lorg/kodein/di/Kodein;", "getKodein", "()Lorg/kodein/di/Kodein;", "kodein$delegate", "strLatitude", "", "getStrLatitude", "()Ljava/lang/String;", "setStrLatitude", "(Ljava/lang/String;)V", "strLongitude", "getStrLongitude", "setStrLongitude", "strSearch", "getStrSearch", "setStrSearch", "viewModel", "Lcom/tigwal/ui/view_model/search_productlist/SearchProductListViewModel;", "clickListener", "", "getIntentData", "onClick", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "productList", "data", "Ljava/util/ArrayList;", "Lcom/tigwal/data/model/search/DataItem;", "Lkotlin/collections/ArrayList;", "setFontTypeface", "setupObservers", "setupViewModel", "app_debug"})
public final class SearchProductListActivity extends com.tigwal.base.BaseActivity implements org.kodein.di.KodeinAware, android.view.View.OnClickListener {
    private com.tigwal.databinding.ActivitySearchproductListBinding binding;
    private com.tigwal.ui.view_model.search_productlist.SearchProductListViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy kodein$delegate = null;
    private final kotlin.Lazy factory$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String strLatitude = "0.0";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String strLongitude = "0.0";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String strSearch = "";
    private java.util.HashMap _$_findViewCache;
    
    public SearchProductListActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.kodein.di.Kodein getKodein() {
        return null;
    }
    
    private final com.tigwal.ui.factory.SearchProductListFactory getFactory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrLatitude() {
        return null;
    }
    
    public final void setStrLatitude(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrLongitude() {
        return null;
    }
    
    public final void setStrLongitude(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrSearch() {
        return null;
    }
    
    public final void setStrSearch(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void productList(java.util.ArrayList<com.tigwal.data.model.search.DataItem> data) {
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
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.R)
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    private final void setupViewModel() {
    }
    
    private final void setupObservers() {
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