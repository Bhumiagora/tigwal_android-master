package com.tigwal.ui.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u00103\u001a\u000204H\u0016J\u0006\u00105\u001a\u000204J\b\u00106\u001a\u000204H\u0016J\u0012\u00107\u001a\u0002042\b\u00108\u001a\u0004\u0018\u000109H\u0016J\u0012\u0010:\u001a\u0002042\b\u0010;\u001a\u0004\u0018\u00010<H\u0014J\u0018\u0010=\u001a\u0002042\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020AH\u0016J\u0018\u0010B\u001a\u0002042\u0006\u0010>\u001a\u00020?2\u0006\u0010C\u001a\u00020DH\u0016J\u0010\u0010E\u001a\u0002042\u0006\u0010F\u001a\u00020\tH\u0002J\b\u0010G\u001a\u000204H\u0016J\b\u0010H\u001a\u000204H\u0002J\u0010\u0010I\u001a\u0002042\u0006\u0010J\u001a\u00020KH\u0002J\u0006\u0010L\u001a\u000204J\u0018\u0010M\u001a\u0002042\u0006\u0010N\u001a\u00020\t2\u0006\u0010O\u001a\u00020\tH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR\u001b\u0010\u0017\u001a\u00020\u00188VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u000b\"\u0004\b!\u0010\rR\u001c\u0010\"\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u000b\"\u0004\b$\u0010\rR\u001c\u0010%\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u000b\"\u0004\b\'\u0010\rR\u001c\u0010(\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u000b\"\u0004\b*\u0010\rR\u001c\u0010+\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u000b\"\u0004\b-\u0010\rR\u001c\u0010.\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u000b\"\u0004\b0\u0010\rR\u000e\u00101\u001a\u000202X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006P"}, d2 = {"Lcom/tigwal/ui/activity/VerifyOtpActivity;", "Lcom/tigwal/base/BaseActivity;", "Lorg/kodein/di/KodeinAware;", "Landroid/view/View$OnClickListener;", "Lokhttp3/Callback;", "()V", "binding", "Lcom/tigwal/databinding/ActivityVerifyOtpBinding;", "emailID", "", "getEmailID", "()Ljava/lang/String;", "setEmailID", "(Ljava/lang/String;)V", "factory", "Lcom/tigwal/ui/factory/VerifyOtpViewFactory;", "getFactory", "()Lcom/tigwal/ui/factory/VerifyOtpViewFactory;", "factory$delegate", "Lkotlin/Lazy;", "flag", "getFlag", "setFlag", "kodein", "Lorg/kodein/di/Kodein;", "getKodein", "()Lorg/kodein/di/Kodein;", "kodein$delegate", "mAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "mVerificationId", "otp", "getOtp", "setOtp", "strCountryCode", "getStrCountryCode", "setStrCountryCode", "strCountryShortName", "getStrCountryShortName", "setStrCountryShortName", "strMobileMo", "getStrMobileMo", "setStrMobileMo", "strName", "getStrName", "setStrName", "strPassword", "getStrPassword", "setStrPassword", "viewModel", "Lcom/tigwal/ui/view_model/otp/VerifyOtpViewModel;", "clickListener", "", "forgotPasswordResendOTP", "getIntentData", "onClick", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onFailure", "call", "Lokhttp3/Call;", "e", "Ljava/io/IOException;", "onResponse", "response", "Lokhttp3/Response;", "resendVerificationCode", "phoneNumber", "setFontTypeface", "setupObservers", "signInWithPhoneAuthCredential", "credential", "Lcom/google/firebase/auth/PhoneAuthCredential;", "signupApiCall", "verifyPhoneNumberWithCode", "verificationId", "code", "app_release"})
public final class VerifyOtpActivity extends com.tigwal.base.BaseActivity implements org.kodein.di.KodeinAware, android.view.View.OnClickListener, okhttp3.Callback {
    private com.tigwal.databinding.ActivityVerifyOtpBinding binding;
    private com.tigwal.ui.view_model.otp.VerifyOtpViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy kodein$delegate = null;
    private final kotlin.Lazy factory$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String flag = "";
    @org.jetbrains.annotations.Nullable()
    private java.lang.String otp = "";
    @org.jetbrains.annotations.Nullable()
    private java.lang.String emailID = "";
    @org.jetbrains.annotations.Nullable()
    private java.lang.String strCountryCode = "";
    @org.jetbrains.annotations.Nullable()
    private java.lang.String strMobileMo = "";
    @org.jetbrains.annotations.Nullable()
    private java.lang.String strCountryShortName = "";
    @org.jetbrains.annotations.Nullable()
    private java.lang.String strPassword = "";
    @org.jetbrains.annotations.Nullable()
    private java.lang.String strName = "";
    private com.google.firebase.auth.FirebaseAuth mAuth;
    private java.lang.String mVerificationId = "";
    private java.util.HashMap _$_findViewCache;
    
    public VerifyOtpActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.kodein.di.Kodein getKodein() {
        return null;
    }
    
    private final com.tigwal.ui.factory.VerifyOtpViewFactory getFactory() {
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
    public final java.lang.String getOtp() {
        return null;
    }
    
    public final void setOtp(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEmailID() {
        return null;
    }
    
    public final void setEmailID(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrCountryCode() {
        return null;
    }
    
    public final void setStrCountryCode(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrMobileMo() {
        return null;
    }
    
    public final void setStrMobileMo(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrCountryShortName() {
        return null;
    }
    
    public final void setStrCountryShortName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrPassword() {
        return null;
    }
    
    public final void setStrPassword(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrName() {
        return null;
    }
    
    public final void setStrName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
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
    
    private final void setupObservers() {
    }
    
    public final void forgotPasswordResendOTP() {
    }
    
    public final void signupApiCall() {
    }
    
    private final void verifyPhoneNumberWithCode(java.lang.String verificationId, java.lang.String code) {
    }
    
    private final void signInWithPhoneAuthCredential(com.google.firebase.auth.PhoneAuthCredential credential) {
    }
    
    private final void resendVerificationCode(java.lang.String phoneNumber) {
    }
    
    @java.lang.Override()
    public void onFailure(@org.jetbrains.annotations.NotNull()
    okhttp3.Call call, @org.jetbrains.annotations.NotNull()
    java.io.IOException e) {
    }
    
    @java.lang.Override()
    public void onResponse(@org.jetbrains.annotations.NotNull()
    okhttp3.Call call, @org.jetbrains.annotations.NotNull()
    okhttp3.Response response) {
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