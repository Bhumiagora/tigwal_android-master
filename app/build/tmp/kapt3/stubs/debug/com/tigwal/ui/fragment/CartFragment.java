package com.tigwal.ui.fragment;

import java.lang.System;

@android.annotation.SuppressLint(value = {"UseRequireInsteadOfGet"})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 A2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001AB\u0005\u00a2\u0006\u0002\u0010\u0004J\"\u0010(\u001a\u00020)2\u0010\u0010*\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010+2\u0006\u0010,\u001a\u00020-H\u0002J\b\u0010.\u001a\u00020)H\u0016J\u0018\u0010/\u001a\u00020)2\u0006\u00100\u001a\u0002012\u0006\u0010*\u001a\u00020\rH\u0002J\u0018\u00102\u001a\u00020)2\u0006\u00100\u001a\u0002012\u0006\u0010*\u001a\u00020\rH\u0002J\b\u00103\u001a\u00020)H\u0016J\u0012\u00104\u001a\u00020)2\b\u00105\u001a\u0004\u0018\u000106H\u0016J&\u00107\u001a\u0004\u0018\u0001062\u0006\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010;2\b\u0010<\u001a\u0004\u0018\u00010=H\u0017J\b\u0010>\u001a\u00020)H\u0016J\b\u0010?\u001a\u00020)H\u0002J\b\u0010@\u001a\u00020)H\u0002R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001e\"\u0004\b\u001f\u0010 R\u001b\u0010!\u001a\u00020\"8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b#\u0010$R\u000e\u0010&\u001a\u00020\'X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006B"}, d2 = {"Lcom/tigwal/ui/fragment/CartFragment;", "Lcom/tigwal/base/BaseFragment;", "Lorg/kodein/di/KodeinAware;", "Landroid/view/View$OnClickListener;", "()V", "adapter", "Lcom/tigwal/ui/adapter/CartListAdapter;", "getAdapter", "()Lcom/tigwal/ui/adapter/CartListAdapter;", "setAdapter", "(Lcom/tigwal/ui/adapter/CartListAdapter;)V", "arrayListProduct", "Ljava/util/ArrayList;", "Lcom/tigwal/data/model/listCart/CartListItem;", "getArrayListProduct", "()Ljava/util/ArrayList;", "setArrayListProduct", "(Ljava/util/ArrayList;)V", "binding", "Lcom/tigwal/databinding/FragmentCartBinding;", "cartViewModel", "Lcom/tigwal/ui/view_model/cart/CartViewModel;", "factory", "Lcom/tigwal/ui/factory/CartViewFactory;", "getFactory", "()Lcom/tigwal/ui/factory/CartViewFactory;", "factory$delegate", "Lkotlin/Lazy;", "isLoading", "", "()Z", "setLoading", "(Z)V", "kodein", "Lorg/kodein/di/Kodein;", "getKodein", "()Lorg/kodein/di/Kodein;", "kodein$delegate", "sdkSession", "Lcompany/tap/gosellapi/open/controllers/SDKSession;", "cartList", "", "data", "", "admin_commision", "", "clickListener", "dialogeAddNote", "position", "", "dialogeCartRemove", "getIntentData", "onClick", "v", "Landroid/view/View;", "onCreateFragmentView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "setFontTypeface", "setupObservers", "setupViewModel", "Companion", "app_debug"})
public final class CartFragment extends com.tigwal.base.BaseFragment implements org.kodein.di.KodeinAware, android.view.View.OnClickListener {
    private final kotlin.Lazy factory$delegate = null;
    private com.tigwal.ui.view_model.cart.CartViewModel cartViewModel;
    private com.tigwal.databinding.FragmentCartBinding binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy kodein$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.tigwal.data.model.listCart.CartListItem> arrayListProduct;
    public com.tigwal.ui.adapter.CartListAdapter adapter;
    private boolean isLoading = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.tigwal.ui.fragment.CartFragment.Companion Companion = null;
    private company.tap.gosellapi.open.controllers.SDKSession sdkSession;
    private java.util.HashMap _$_findViewCache;
    
    public CartFragment() {
        super();
    }
    
    private final com.tigwal.ui.factory.CartViewFactory getFactory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.kodein.di.Kodein getKodein() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.tigwal.data.model.listCart.CartListItem> getArrayListProduct() {
        return null;
    }
    
    public final void setArrayListProduct(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.tigwal.data.model.listCart.CartListItem> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tigwal.ui.adapter.CartListAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull()
    com.tigwal.ui.adapter.CartListAdapter p0) {
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    public final void setLoading(boolean p0) {
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
    
    private final void cartList(java.util.List<com.tigwal.data.model.listCart.CartListItem> data, java.lang.String admin_commision) {
    }
    
    private final void dialogeAddNote(int position, com.tigwal.data.model.listCart.CartListItem data) {
    }
    
    private final void dialogeCartRemove(int position, com.tigwal.data.model.listCart.CartListItem data) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.kodein.di.KodeinContext<?> getKodeinContext() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public org.kodein.di.KodeinTrigger getKodeinTrigger() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tigwal/ui/fragment/CartFragment$Companion;", "", "()V", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}