package com.tigwal.ui.activity;

import java.lang.System;

@kotlin.Suppress(names = {"INACCESSIBLE_TYPE"})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u00b2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 v2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001vB\u0005\u00a2\u0006\u0002\u0010\u0005J\u0016\u0010I\u001a\u00020\u00192\u0006\u0010J\u001a\u00020\r2\u0006\u0010K\u001a\u00020\rJ\u0016\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020\r2\u0006\u0010O\u001a\u00020\rJ\b\u0010P\u001a\u00020MH\u0017J\b\u0010Q\u001a\u00020MH\u0016J\b\u0010R\u001a\u00020MH\u0002J\u0016\u0010S\u001a\u00020M2\f\u0010T\u001a\b\u0012\u0004\u0012\u00020V0UH\u0002J\b\u0010W\u001a\u00020MH\u0002J\u0006\u0010X\u001a\u00020MJ\u0006\u0010Y\u001a\u00020MJ\"\u0010Z\u001a\u00020M2\u0006\u0010[\u001a\u00020\u00072\u0006\u0010\\\u001a\u00020\u00072\b\u0010]\u001a\u0004\u0018\u00010^H\u0014J\u0012\u0010_\u001a\u00020M2\b\u0010`\u001a\u0004\u0018\u00010aH\u0016J\u0012\u0010b\u001a\u00020M2\b\u0010c\u001a\u0004\u0018\u00010dH\u0015J\u0018\u0010e\u001a\u00020M2\u0006\u0010f\u001a\u00020g2\u0006\u0010h\u001a\u00020iH\u0016J\u0018\u0010j\u001a\u00020M2\u0006\u0010f\u001a\u00020g2\u0006\u0010k\u001a\u00020lH\u0016J\b\u0010m\u001a\u00020MH\u0014J\b\u0010n\u001a\u00020MH\u0002J\u0006\u0010o\u001a\u00020MJ\b\u0010p\u001a\u00020MH\u0016J\b\u0010q\u001a\u00020MH\u0002J\b\u0010r\u001a\u00020MH\u0002J\u0006\u0010s\u001a\u00020MJ\u0010\u0010t\u001a\u00020M2\u0006\u0010u\u001a\u00020\rH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0018\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u0019X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u001e\u0010 \u001a\u0004\u0018\u00010\u0019X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b \u0010\u001a\"\u0004\b!\u0010\u001cR\u001e\u0010\"\u001a\u0004\u0018\u00010\u0019X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\"\u0010\u001a\"\u0004\b#\u0010\u001cR\u001b\u0010$\u001a\u00020%8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b(\u0010\u0017\u001a\u0004\b&\u0010\'R\u001c\u0010)\u001a\u0004\u0018\u00010*X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u0010/\u001a\u0004\u0018\u000100X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0010\u00105\u001a\u0004\u0018\u000106X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u00107\u001a\u000208X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0010\u0010=\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010>\u001a\u0004\u0018\u00010\u0019X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b?\u0010\u001a\"\u0004\b@\u0010\u001cR\u001e\u0010A\u001a\u0004\u0018\u00010\u0019X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\bB\u0010\u001a\"\u0004\bC\u0010\u001cR\u001e\u0010D\u001a\u0004\u0018\u00010\u0019X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\bE\u0010\u001a\"\u0004\bF\u0010\u001cR\u000e\u0010G\u001a\u00020HX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006w"}, d2 = {"Lcom/tigwal/ui/activity/LoginActivity;", "Lcom/tigwal/base/BaseActivity;", "Lorg/kodein/di/KodeinAware;", "Landroid/view/View$OnClickListener;", "Lokhttp3/Callback;", "()V", "GOOGLE_SIGNIN", "", "binding", "Lcom/tigwal/databinding/ActivityLoginBinding;", "callbackManager", "Lcom/facebook/CallbackManager;", "deviceUDID", "", "getDeviceUDID", "()Ljava/lang/String;", "setDeviceUDID", "(Ljava/lang/String;)V", "factory", "Lcom/tigwal/ui/factory/LoginViewFactory;", "getFactory", "()Lcom/tigwal/ui/factory/LoginViewFactory;", "factory$delegate", "Lkotlin/Lazy;", "isValidMini8Length", "", "()Ljava/lang/Boolean;", "setValidMini8Length", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "isValidOneNumber", "setValidOneNumber", "isValidOneSpecial", "setValidOneSpecial", "isValidOneUpperAndLower", "setValidOneUpperAndLower", "kodein", "Lorg/kodein/di/Kodein;", "getKodein", "()Lorg/kodein/di/Kodein;", "kodein$delegate", "loginPreferences", "Landroid/content/SharedPreferences;", "getLoginPreferences", "()Landroid/content/SharedPreferences;", "setLoginPreferences", "(Landroid/content/SharedPreferences;)V", "loginPrefsEditor", "Landroid/content/SharedPreferences$Editor;", "getLoginPrefsEditor", "()Landroid/content/SharedPreferences$Editor;", "setLoginPrefsEditor", "(Landroid/content/SharedPreferences$Editor;)V", "mAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "mGoogleSignInClient", "Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;", "getMGoogleSignInClient", "()Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;", "setMGoogleSignInClient", "(Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;)V", "mVerificationId", "saveLogin", "getSaveLogin", "setSaveLogin", "validOneLowercase", "getValidOneLowercase", "setValidOneLowercase", "validOneUppercase", "getValidOneUppercase", "setValidOneUppercase", "viewmodellogin", "Lcom/tigwal/ui/view_model/login/LoginViewModel;", "checkPatternValidOnString", "text", "pattern", "checkSocialLoginCall", "", "socialToken", "socialLoginType", "clickListener", "getIntentData", "googleSignIn", "handleSignInResult", "completedTask", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;", "loginApiCall", "loginFacebook", "logoutFBGoogle", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onClick", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onFailure", "call", "Lokhttp3/Call;", "e", "Ljava/io/IOException;", "onResponse", "response", "Lokhttp3/Response;", "onResume", "passwordValidation", "rememberMeLogin", "setFontTypeface", "setupObservers", "setupViewModel", "socialSignUpStep2", "startPhoneNumberVerification", "phoneNumber", "Companion", "app_debug"})
public final class LoginActivity extends com.tigwal.base.BaseActivity implements org.kodein.di.KodeinAware, android.view.View.OnClickListener, okhttp3.Callback {
    private com.tigwal.ui.view_model.login.LoginViewModel viewmodellogin;
    private final kotlin.Lazy factory$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy kodein$delegate = null;
    private com.tigwal.databinding.ActivityLoginBinding binding;
    private com.facebook.CallbackManager callbackManager;
    public com.google.android.gms.auth.api.signin.GoogleSignInClient mGoogleSignInClient;
    private final int GOOGLE_SIGNIN = 9001;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean isValidMini8Length = false;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean isValidOneUpperAndLower = false;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean isValidOneNumber = false;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean isValidOneSpecial = false;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean validOneUppercase = false;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean validOneLowercase = false;
    @org.jetbrains.annotations.Nullable()
    private android.content.SharedPreferences loginPreferences;
    @org.jetbrains.annotations.Nullable()
    private android.content.SharedPreferences.Editor loginPrefsEditor;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean saveLogin = false;
    private com.google.firebase.auth.FirebaseAuth mAuth;
    private java.lang.String mVerificationId = "";
    @org.jetbrains.annotations.Nullable()
    private java.lang.String deviceUDID = "";
    @org.jetbrains.annotations.NotNull()
    public static final com.tigwal.ui.activity.LoginActivity.Companion Companion = null;
    private static final int PERMISSION_REQUEST_CODE = 5;
    public static final int PICK_IMAGE_REQUEST_CODE = 1000;
    private java.util.HashMap _$_findViewCache;
    
    public LoginActivity() {
        super();
    }
    
    private final com.tigwal.ui.factory.LoginViewFactory getFactory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.kodein.di.Kodein getKodein() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.auth.api.signin.GoogleSignInClient getMGoogleSignInClient() {
        return null;
    }
    
    public final void setMGoogleSignInClient(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.auth.api.signin.GoogleSignInClient p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isValidMini8Length() {
        return null;
    }
    
    public final void setValidMini8Length(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isValidOneUpperAndLower() {
        return null;
    }
    
    public final void setValidOneUpperAndLower(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isValidOneNumber() {
        return null;
    }
    
    public final void setValidOneNumber(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isValidOneSpecial() {
        return null;
    }
    
    public final void setValidOneSpecial(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getValidOneUppercase() {
        return null;
    }
    
    public final void setValidOneUppercase(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getValidOneLowercase() {
        return null;
    }
    
    public final void setValidOneLowercase(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.SharedPreferences getLoginPreferences() {
        return null;
    }
    
    public final void setLoginPreferences(@org.jetbrains.annotations.Nullable()
    android.content.SharedPreferences p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.SharedPreferences.Editor getLoginPrefsEditor() {
        return null;
    }
    
    public final void setLoginPrefsEditor(@org.jetbrains.annotations.Nullable()
    android.content.SharedPreferences.Editor p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getSaveLogin() {
        return null;
    }
    
    public final void setSaveLogin(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDeviceUDID() {
        return null;
    }
    
    public final void setDeviceUDID(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @android.annotation.SuppressLint(value = {"Range"})
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void passwordValidation() {
    }
    
    @java.lang.Override()
    public void getIntentData() {
    }
    
    @android.annotation.SuppressLint(value = {"Range"})
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
    
    public final boolean checkPatternValidOnString(@org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    java.lang.String pattern) {
        return false;
    }
    
    public final void rememberMeLogin() {
    }
    
    private final void googleSignIn() {
    }
    
    private final void loginApiCall() {
    }
    
    private final void setupViewModel() {
    }
    
    private final void setupObservers() {
    }
    
    public final void loginFacebook() {
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
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void handleSignInResult(com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.signin.GoogleSignInAccount> completedTask) {
    }
    
    public final void logoutFBGoogle() {
    }
    
    public final void checkSocialLoginCall(@org.jetbrains.annotations.NotNull()
    java.lang.String socialToken, @org.jetbrains.annotations.NotNull()
    java.lang.String socialLoginType) {
    }
    
    public final void socialSignUpStep2() {
    }
    
    private final void startPhoneNumberVerification(java.lang.String phoneNumber) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.kodein.di.KodeinContext<?> getKodeinContext() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public org.kodein.di.KodeinTrigger getKodeinTrigger() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/tigwal/ui/activity/LoginActivity$Companion;", "", "()V", "PERMISSION_REQUEST_CODE", "", "PICK_IMAGE_REQUEST_CODE", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}