package com.tigwal.ui.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\bH\u0002J\u0012\u0010/\u001a\u00020-2\b\u00100\u001a\u0004\u0018\u00010\bH\u0002J\b\u00101\u001a\u00020-H\u0016J\b\u00102\u001a\u00020-H\u0016J\u0012\u00103\u001a\u00020-2\b\u00104\u001a\u0004\u0018\u000105H\u0016J\u0012\u00106\u001a\u00020-2\b\u00107\u001a\u0004\u0018\u000108H\u0014J\b\u00109\u001a\u00020-H\u0002J\u0006\u0010:\u001a\u00020-J\b\u0010;\u001a\u00020-H\u0016J\b\u0010<\u001a\u00020-H\u0002J\b\u0010=\u001a\u00020-H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\fR\u001b\u0010\u0016\u001a\u00020\u00178VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010#\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010$\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\n\"\u0004\b&\u0010\fR\u001e\u0010\'\u001a\u0004\u0018\u00010\u001eX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010#\u001a\u0004\b(\u0010 \"\u0004\b)\u0010\"R\u000e\u0010*\u001a\u00020+X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006>"}, d2 = {"Lcom/tigwal/ui/activity/CancelOrderActivity;", "Lcom/tigwal/base/BaseActivity;", "Lorg/kodein/di/KodeinAware;", "Landroid/view/View$OnClickListener;", "()V", "binding", "Lcom/tigwal/databinding/ActivityCancelOrderBinding;", "createdDate", "", "getCreatedDate", "()Ljava/lang/String;", "setCreatedDate", "(Ljava/lang/String;)V", "factory", "Lcom/tigwal/ui/factory/CancelOrderFactory;", "getFactory", "()Lcom/tigwal/ui/factory/CancelOrderFactory;", "factory$delegate", "Lkotlin/Lazy;", "flag", "getFlag", "setFlag", "kodein", "Lorg/kodein/di/Kodein;", "getKodein", "()Lorg/kodein/di/Kodein;", "kodein$delegate", "orderData", "Lcom/tigwal/data/model/order_detail/Data;", "refundOrderIndex", "", "getRefundOrderIndex", "()Ljava/lang/Integer;", "setRefundOrderIndex", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "refund_percentage", "getRefund_percentage", "setRefund_percentage", "strTotalAmountCancellatoin", "getStrTotalAmountCancellatoin", "setStrTotalAmountCancellatoin", "viewModel", "Lcom/tigwal/ui/view_model/cancel_order/CancelOrderViewModel;", "cancelOrderApi", "", "refund_id", "cancelOrderDialoge", "strMessage", "clickListener", "getIntentData", "onClick", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "orderDetailData", "refundApiCalling", "setFontTypeface", "setupObservers", "setupViewModel", "app_release"})
public final class CancelOrderActivity extends com.tigwal.base.BaseActivity implements org.kodein.di.KodeinAware, android.view.View.OnClickListener {
    private com.tigwal.databinding.ActivityCancelOrderBinding binding;
    private com.tigwal.ui.view_model.cancel_order.CancelOrderViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy kodein$delegate = null;
    private final kotlin.Lazy factory$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String flag = "";
    @org.jetbrains.annotations.Nullable()
    private java.lang.String createdDate = "";
    @org.jetbrains.annotations.Nullable()
    private java.lang.String refund_percentage = "0";
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer refundOrderIndex = 0;
    private com.tigwal.data.model.order_detail.Data orderData;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer strTotalAmountCancellatoin = 0;
    private java.util.HashMap _$_findViewCache;
    
    public CancelOrderActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.kodein.di.Kodein getKodein() {
        return null;
    }
    
    private final com.tigwal.ui.factory.CancelOrderFactory getFactory() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFlag() {
        return null;
    }
    
    public final void setFlag(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCreatedDate() {
        return null;
    }
    
    public final void setCreatedDate(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRefund_percentage() {
        return null;
    }
    
    public final void setRefund_percentage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRefundOrderIndex() {
        return null;
    }
    
    public final void setRefundOrderIndex(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getStrTotalAmountCancellatoin() {
        return null;
    }
    
    public final void setStrTotalAmountCancellatoin(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void orderDetailData() {
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
    
    private final void cancelOrderApi(java.lang.String refund_id) {
    }
    
    private final void setupViewModel() {
    }
    
    private final void setupObservers() {
    }
    
    private final void cancelOrderDialoge(java.lang.String strMessage) {
    }
    
    public final void refundApiCalling() {
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