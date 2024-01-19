package com.tigwal.ui.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u00ba\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010W\u001a\u00020X2\b\u0010Y\u001a\u0004\u0018\u00010ZH\u0016J\u0010\u0010[\u001a\u00020X2\u0006\u0010Y\u001a\u00020ZH\u0016J\u0012\u0010\\\u001a\u00020X2\b\u0010]\u001a\u0004\u0018\u000105H\u0016J\u0010\u0010^\u001a\u00020X2\u0006\u0010_\u001a\u00020`H\u0016J\u0010\u0010a\u001a\u00020X2\u0006\u0010_\u001a\u00020`H\u0016J\u0010\u0010b\u001a\u00020X2\u0006\u0010c\u001a\u00020dH\u0016J\b\u0010e\u001a\u00020XH\u0016J\b\u0010f\u001a\u00020XH\u0003J\u0006\u0010g\u001a\u00020XJ\u0006\u0010h\u001a\u00020XJ\b\u0010i\u001a\u00020XH\u0007J\b\u0010j\u001a\u00020XH\u0002J\b\u0010k\u001a\u0004\u0018\u00010lJ\b\u0010m\u001a\u0004\u0018\u00010nJ\b\u0010o\u001a\u00020XH\u0016J\b\u0010p\u001a\u00020XH\u0016J\b\u0010q\u001a\u00020XH\u0016J\b\u0010r\u001a\u00020XH\u0016J\u0012\u0010s\u001a\u00020X2\b\u0010t\u001a\u0004\u0018\u00010uH\u0017J\u0012\u0010v\u001a\u00020X2\b\u0010w\u001a\u0004\u0018\u00010xH\u0014J\u0012\u0010y\u001a\u00020X2\b\u0010_\u001a\u0004\u0018\u00010`H\u0016J\u0010\u0010z\u001a\u00020X2\u0006\u0010_\u001a\u00020`H\u0016J\u0010\u0010{\u001a\u00020X2\u0006\u0010|\u001a\u00020}H\u0016J\u0013\u0010~\u001a\u00020X2\t\u0010\u007f\u001a\u0005\u0018\u00010\u0080\u0001H\u0016J\t\u0010\u0081\u0001\u001a\u00020XH\u0016J\t\u0010\u0082\u0001\u001a\u00020XH\u0016J\t\u0010\u0083\u0001\u001a\u00020XH\u0016J\t\u0010\u0084\u0001\u001a\u00020XH\u0016J\t\u0010\u0085\u0001\u001a\u00020XH\u0016J\t\u0010\u0086\u0001\u001a\u00020XH\u0002J\t\u0010\u0087\u0001\u001a\u00020XH\u0002J\t\u0010\u0088\u0001\u001a\u00020XH\u0007J\t\u0010\u0089\u0001\u001a\u00020XH\u0002J\u0012\u0010\u008a\u0001\u001a\u00020X2\u0007\u0010\u008b\u0001\u001a\u00020)H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015R\u001a\u0010\u001f\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\t\"\u0004\b!\u0010\u000bR\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b&\u0010\'\u001a\u0004\b$\u0010%R\u001a\u0010(\u001a\u00020)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010*\"\u0004\b+\u0010,R\u001b\u0010-\u001a\u00020.8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b1\u0010\'\u001a\u0004\b/\u00100R\u000e\u00102\u001a\u000203X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u00104\u001a\u000205X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001a\u0010:\u001a\u000205X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u00107\"\u0004\b<\u00109R\u001a\u0010=\u001a\u000205X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u00107\"\u0004\b?\u00109R\u001a\u0010@\u001a\u000205X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u00107\"\u0004\bB\u00109R\u001a\u0010C\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\t\"\u0004\bE\u0010\u000bR\u001a\u0010F\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\t\"\u0004\bH\u0010\u000bR\u001a\u0010I\u001a\u00020JX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u001a\u0010O\u001a\u00020JX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bP\u0010L\"\u0004\bQ\u0010NR\u001a\u0010R\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010\t\"\u0004\bT\u0010\u000bR\u000e\u0010U\u001a\u00020VX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u008c\u0001"}, d2 = {"Lcom/tigwal/ui/activity/PaymentOptionActivity;", "Lcom/tigwal/base/BaseActivity;", "Lorg/kodein/di/KodeinAware;", "Landroid/view/View$OnClickListener;", "Lcompany/tap/gosellapi/open/delegate/SessionDelegate;", "()V", "admin_commision_total_amt", "", "getAdmin_commision_total_amt", "()D", "setAdmin_commision_total_amt", "(D)V", "admin_commision_total_amt_desti", "getAdmin_commision_total_amt_desti", "setAdmin_commision_total_amt_desti", "arrayListProduct", "Ljava/util/ArrayList;", "Lcom/tigwal/data/model/listCart/CartListItem;", "getArrayListProduct", "()Ljava/util/ArrayList;", "setArrayListProduct", "(Ljava/util/ArrayList;)V", "arrayListProductFinal", "getArrayListProductFinal", "setArrayListProductFinal", "binding", "Lcom/tigwal/databinding/ActivityPaymentOptionBinding;", "createOrderDataTemp", "Lcom/tigwal/data/model/tap_payment/CartSubmitData;", "getCreateOrderDataTemp", "setCreateOrderDataTemp", "destination_same_qty_", "getDestination_same_qty_", "setDestination_same_qty_", "factory", "Lcom/tigwal/ui/factory/PaymentOptionFactory;", "getFactory", "()Lcom/tigwal/ui/factory/PaymentOptionFactory;", "factory$delegate", "Lkotlin/Lazy;", "isClick", "", "()Z", "setClick", "(Z)V", "kodein", "Lorg/kodein/di/Kodein;", "getKodein", "()Lorg/kodein/di/Kodein;", "kodein$delegate", "sdkSession", "Lcompany/tap/gosellapi/open/controllers/SDKSession;", "strBookingDate", "", "getStrBookingDate", "()Ljava/lang/String;", "setStrBookingDate", "(Ljava/lang/String;)V", "strChargesId", "getStrChargesId", "setStrChargesId", "strPaymentId", "getStrPaymentId", "setStrPaymentId", "strPaymentType", "getStrPaymentType", "setStrPaymentType", "totalCalculatedPrice", "getTotalCalculatedPrice", "setTotalCalculatedPrice", "totalDiscount", "getTotalDiscount", "setTotalDiscount", "totalPrice", "", "getTotalPrice", "()I", "setTotalPrice", "(I)V", "totalQuntity", "getTotalQuntity", "setTotalQuntity", "totalServiceTax", "getTotalServiceTax", "setTotalServiceTax", "viewModel", "Lcom/tigwal/ui/view_model/payment_option/PaymentOptionViewModel;", "authorizationFailed", "", "authorize", "Lcompany/tap/gosellapi/internal/api/models/Authorize;", "authorizationSucceed", "backendUnknownError", "message", "cardSaved", "charge", "Lcompany/tap/gosellapi/internal/api/models/Charge;", "cardSavingFailed", "cardTokenizedSuccessfully", "token", "Lcompany/tap/gosellapi/internal/api/models/Token;", "clickListener", "configureApp", "configureSDKMode", "configureSDKSession", "configureSDKThemeObject", "getCartData", "getCustomer", "Lcompany/tap/gosellapi/open/models/Customer;", "getDestination", "Lcompany/tap/gosellapi/open/models/Destinations;", "getIntentData", "invalidCardDetails", "invalidCustomerID", "invalidTransactionMode", "onClick", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "paymentFailed", "paymentSucceed", "savedCardsList", "cardsList", "Lcompany/tap/gosellapi/open/models/CardsList;", "sdkError", "goSellError", "Lcompany/tap/gosellapi/internal/api/callbacks/GoSellError;", "sessionCancelled", "sessionFailedToStart", "sessionHasStarted", "sessionIsStarting", "setFontTypeface", "setupObservers", "setupViewModel", "startSDK", "startSDKWithUI", "userEnabledSaveCardOption", "saveCardEnabled", "app_debug"})
public final class PaymentOptionActivity extends com.tigwal.base.BaseActivity implements org.kodein.di.KodeinAware, android.view.View.OnClickListener, company.tap.gosellapi.open.delegate.SessionDelegate {
    private com.tigwal.databinding.ActivityPaymentOptionBinding binding;
    private com.tigwal.ui.view_model.payment_option.PaymentOptionViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy kodein$delegate = null;
    private final kotlin.Lazy factory$delegate = null;
    private int totalPrice = 0;
    private int totalQuntity = 0;
    private double admin_commision_total_amt = 0.0;
    private double totalDiscount = 0.0;
    private double totalServiceTax = 0.0;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String strChargesId = "";
    private double totalCalculatedPrice = 0.0;
    private double admin_commision_total_amt_desti = 0.0;
    private double destination_same_qty_ = 0.0;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String strPaymentId = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String strPaymentType = "2";
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.tigwal.data.model.listCart.CartListItem> arrayListProduct;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.tigwal.data.model.tap_payment.CartSubmitData> createOrderDataTemp;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.tigwal.data.model.listCart.CartListItem> arrayListProductFinal;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String strBookingDate = "";
    private company.tap.gosellapi.open.controllers.SDKSession sdkSession;
    private boolean isClick = false;
    private java.util.HashMap _$_findViewCache;
    
    public PaymentOptionActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.kodein.di.Kodein getKodein() {
        return null;
    }
    
    private final com.tigwal.ui.factory.PaymentOptionFactory getFactory() {
        return null;
    }
    
    public final int getTotalPrice() {
        return 0;
    }
    
    public final void setTotalPrice(int p0) {
    }
    
    public final int getTotalQuntity() {
        return 0;
    }
    
    public final void setTotalQuntity(int p0) {
    }
    
    public final double getAdmin_commision_total_amt() {
        return 0.0;
    }
    
    public final void setAdmin_commision_total_amt(double p0) {
    }
    
    public final double getTotalDiscount() {
        return 0.0;
    }
    
    public final void setTotalDiscount(double p0) {
    }
    
    public final double getTotalServiceTax() {
        return 0.0;
    }
    
    public final void setTotalServiceTax(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrChargesId() {
        return null;
    }
    
    public final void setStrChargesId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final double getTotalCalculatedPrice() {
        return 0.0;
    }
    
    public final void setTotalCalculatedPrice(double p0) {
    }
    
    public final double getAdmin_commision_total_amt_desti() {
        return 0.0;
    }
    
    public final void setAdmin_commision_total_amt_desti(double p0) {
    }
    
    public final double getDestination_same_qty_() {
        return 0.0;
    }
    
    public final void setDestination_same_qty_(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrPaymentId() {
        return null;
    }
    
    public final void setStrPaymentId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrPaymentType() {
        return null;
    }
    
    public final void setStrPaymentType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.tigwal.data.model.listCart.CartListItem> getArrayListProduct() {
        return null;
    }
    
    public final void setArrayListProduct(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.tigwal.data.model.listCart.CartListItem> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.tigwal.data.model.tap_payment.CartSubmitData> getCreateOrderDataTemp() {
        return null;
    }
    
    public final void setCreateOrderDataTemp(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.tigwal.data.model.tap_payment.CartSubmitData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.tigwal.data.model.listCart.CartListItem> getArrayListProductFinal() {
        return null;
    }
    
    public final void setArrayListProductFinal(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.tigwal.data.model.listCart.CartListItem> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrBookingDate() {
        return null;
    }
    
    public final void setStrBookingDate(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getCartData() {
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
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    public final boolean isClick() {
        return false;
    }
    
    public final void setClick(boolean p0) {
    }
    
    private final void setupViewModel() {
    }
    
    private final void setupObservers() {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    public final void startSDK() {
    }
    
    @androidx.annotation.RequiresApi(api = android.os.Build.VERSION_CODES.LOLLIPOP)
    private final void configureApp() {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    public final void configureSDKThemeObject() {
    }
    
    public final void configureSDKSession() {
    }
    
    private final void startSDKWithUI() {
    }
    
    @java.lang.Override()
    public void paymentSucceed(@org.jetbrains.annotations.NotNull()
    company.tap.gosellapi.internal.api.models.Charge charge) {
    }
    
    @java.lang.Override()
    public void paymentFailed(@org.jetbrains.annotations.Nullable()
    company.tap.gosellapi.internal.api.models.Charge charge) {
    }
    
    @java.lang.Override()
    public void authorizationSucceed(@org.jetbrains.annotations.NotNull()
    company.tap.gosellapi.internal.api.models.Authorize authorize) {
    }
    
    @java.lang.Override()
    public void authorizationFailed(@org.jetbrains.annotations.Nullable()
    company.tap.gosellapi.internal.api.models.Authorize authorize) {
    }
    
    @java.lang.Override()
    public void cardSaved(@org.jetbrains.annotations.NotNull()
    company.tap.gosellapi.internal.api.models.Charge charge) {
    }
    
    @java.lang.Override()
    public void cardSavingFailed(@org.jetbrains.annotations.NotNull()
    company.tap.gosellapi.internal.api.models.Charge charge) {
    }
    
    @java.lang.Override()
    public void cardTokenizedSuccessfully(@org.jetbrains.annotations.NotNull()
    company.tap.gosellapi.internal.api.models.Token token) {
    }
    
    @java.lang.Override()
    public void savedCardsList(@org.jetbrains.annotations.NotNull()
    company.tap.gosellapi.open.models.CardsList cardsList) {
    }
    
    @java.lang.Override()
    public void sdkError(@org.jetbrains.annotations.Nullable()
    company.tap.gosellapi.internal.api.callbacks.GoSellError goSellError) {
    }
    
    @java.lang.Override()
    public void sessionIsStarting() {
    }
    
    @java.lang.Override()
    public void sessionHasStarted() {
    }
    
    @java.lang.Override()
    public void sessionCancelled() {
    }
    
    @java.lang.Override()
    public void sessionFailedToStart() {
    }
    
    @java.lang.Override()
    public void invalidCardDetails() {
    }
    
    @java.lang.Override()
    public void backendUnknownError(@org.jetbrains.annotations.Nullable()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void invalidTransactionMode() {
    }
    
    @java.lang.Override()
    public void invalidCustomerID() {
    }
    
    @java.lang.Override()
    public void userEnabledSaveCardOption(boolean saveCardEnabled) {
    }
    
    public final void configureSDKMode() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final company.tap.gosellapi.open.models.Customer getCustomer() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final company.tap.gosellapi.open.models.Destinations getDestination() {
        return null;
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