package com.tigwal.ui.fragment;

import java.lang.System;

@android.annotation.SuppressLint(value = {"UseRequireInsteadOfGet"})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 22\u00020\u00012\u00020\u00022\u00020\u0003:\u00012B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001fH\u0016J\b\u0010!\u001a\u00020\u001fH\u0002J\u0012\u0010\"\u001a\u00020\u001f2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J&\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0017J\b\u0010,\u001a\u00020\u001fH\u0002J\b\u0010-\u001a\u00020\u001fH\u0002J\b\u0010.\u001a\u00020\u001fH\u0016J\b\u0010/\u001a\u00020\u001fH\u0016J\b\u00100\u001a\u00020\u001fH\u0002J\b\u00101\u001a\u00020\u001fH\u0002R\"\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0017\u001a\u00020\u00188VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00063"}, d2 = {"Lcom/tigwal/ui/fragment/OnGoingOrderFragment;", "Lcom/tigwal/base/BaseFragment;", "Lorg/kodein/di/KodeinAware;", "Landroid/view/View$OnClickListener;", "()V", "arrayListOngoing", "Ljava/util/ArrayList;", "Lcom/tigwal/data/model/listOrder/OrdersItem;", "getArrayListOngoing", "()Ljava/util/ArrayList;", "setArrayListOngoing", "(Ljava/util/ArrayList;)V", "arrayListPast", "getArrayListPast", "setArrayListPast", "binding", "Lcom/tigwal/databinding/FragmentOnGoingOrderBinding;", "factory", "Lcom/tigwal/ui/factory/OnGoingFactory;", "getFactory", "()Lcom/tigwal/ui/factory/OnGoingFactory;", "factory$delegate", "Lkotlin/Lazy;", "kodein", "Lorg/kodein/di/Kodein;", "getKodein", "()Lorg/kodein/di/Kodein;", "kodein$delegate", "onGoingViewModel", "Lcom/tigwal/ui/view_model/ongoingorder/OnGoingOrderViewModel;", "clickListener", "", "getIntentData", "listOrderApi", "onClick", "v", "Landroid/view/View;", "onCreateFragmentView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onGoingOrder", "onPastOrder", "onResume", "setFontTypeface", "setupObservers", "setupViewModel", "Companion", "app_release"})
public final class OnGoingOrderFragment extends com.tigwal.base.BaseFragment implements org.kodein.di.KodeinAware, android.view.View.OnClickListener {
    private final kotlin.Lazy factory$delegate = null;
    private com.tigwal.ui.view_model.ongoingorder.OnGoingOrderViewModel onGoingViewModel;
    private com.tigwal.databinding.FragmentOnGoingOrderBinding binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy kodein$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.tigwal.data.model.listOrder.OrdersItem> arrayListOngoing;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.tigwal.data.model.listOrder.OrdersItem> arrayListPast;
    @org.jetbrains.annotations.NotNull()
    public static final com.tigwal.ui.fragment.OnGoingOrderFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public OnGoingOrderFragment() {
        super();
    }
    
    private final com.tigwal.ui.factory.OnGoingFactory getFactory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.kodein.di.Kodein getKodein() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.tigwal.data.model.listOrder.OrdersItem> getArrayListOngoing() {
        return null;
    }
    
    public final void setArrayListOngoing(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.tigwal.data.model.listOrder.OrdersItem> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.tigwal.data.model.listOrder.OrdersItem> getArrayListPast() {
        return null;
    }
    
    public final void setArrayListPast(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.tigwal.data.model.listOrder.OrdersItem> p0) {
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
    
    private final void listOrderApi() {
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
    
    private final void onGoingOrder() {
    }
    
    private final void onPastOrder() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.kodein.di.KodeinContext<?> getKodeinContext() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public org.kodein.di.KodeinTrigger getKodeinTrigger() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tigwal/ui/fragment/OnGoingOrderFragment$Companion;", "", "()V", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}