package com.tigwal.ui.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016J\u0012\u0010\u001e\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0012\u0010!\u001a\u00020\u001c2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0014J\b\u0010$\u001a\u00020\u001cH\u0016J\b\u0010%\u001a\u00020\u001cH\u0002J\b\u0010&\u001a\u00020\u001cH\u0002R\"\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0014\u001a\u00020\u00158VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/tigwal/ui/activity/ViewAllCategoryActivity;", "Lcom/tigwal/base/BaseActivity;", "Lorg/kodein/di/KodeinAware;", "Landroid/view/View$OnClickListener;", "()V", "arrayListCategory", "Ljava/util/ArrayList;", "Lcom/tigwal/data/model/getcategory/DataItem;", "getArrayListCategory", "()Ljava/util/ArrayList;", "setArrayListCategory", "(Ljava/util/ArrayList;)V", "binding", "Lcom/tigwal/databinding/ActivityViewAllCategoryBinding;", "factory", "Lcom/tigwal/ui/factory/ViewAllCategoryFactory;", "getFactory", "()Lcom/tigwal/ui/factory/ViewAllCategoryFactory;", "factory$delegate", "Lkotlin/Lazy;", "kodein", "Lorg/kodein/di/Kodein;", "getKodein", "()Lorg/kodein/di/Kodein;", "kodein$delegate", "viewModel", "Lcom/tigwal/ui/view_model/viewallcategory/ViewAllCategoryViewModel;", "clickListener", "", "getIntentData", "onClick", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setFontTypeface", "setupObservers", "setupViewModel", "app_release"})
public final class ViewAllCategoryActivity extends com.tigwal.base.BaseActivity implements org.kodein.di.KodeinAware, android.view.View.OnClickListener {
    private com.tigwal.databinding.ActivityViewAllCategoryBinding binding;
    private com.tigwal.ui.view_model.viewallcategory.ViewAllCategoryViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy kodein$delegate = null;
    private final kotlin.Lazy factory$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.tigwal.data.model.getcategory.DataItem> arrayListCategory;
    private java.util.HashMap _$_findViewCache;
    
    public ViewAllCategoryActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.kodein.di.Kodein getKodein() {
        return null;
    }
    
    private final com.tigwal.ui.factory.ViewAllCategoryFactory getFactory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.tigwal.data.model.getcategory.DataItem> getArrayListCategory() {
        return null;
    }
    
    public final void setArrayListCategory(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.tigwal.data.model.getcategory.DataItem> p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
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
    
    @org.jetbrains.annotations.NotNull()
    public org.kodein.di.KodeinContext<?> getKodeinContext() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public org.kodein.di.KodeinTrigger getKodeinTrigger() {
        return null;
    }
}