package com.tigwal.utils;

import java.lang.System;

@android.annotation.SuppressLint(value = {"CommitPrefEdits"})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000f\b\u0007\u0018\u0000 f2\u00020\u0001:\u0001fB\u0019\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010N\u001a\u00020OJ9\u0010P\u001a\b\u0012\u0004\u0012\u0002HR0Q\"\u0004\b\u0000\u0010R2\b\u0010S\u001a\u0004\u0018\u00010\b2\u0016\u0010T\u001a\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u0002HR\u0018\u00010Q\u0018\u00010U\u00a2\u0006\u0002\u0010VJ,\u0010W\u001a\b\u0012\u0004\u0012\u0002HR0X\"\u0004\b\u0000\u0010R2\b\u0010S\u001a\u0004\u0018\u00010\b2\u000e\u0010T\u001a\n\u0012\u0004\u0012\u0002HR\u0018\u00010UJ+\u0010Y\u001a\u0002HR\"\u0004\b\u0000\u0010R2\b\u0010S\u001a\u0004\u0018\u00010\b2\u000e\u0010T\u001a\n\u0012\u0004\u0012\u0002HR\u0018\u00010U\u00a2\u0006\u0002\u0010ZJ\u001c\u0010[\u001a\u0004\u0018\u00010\b2\b\u0010S\u001a\u0004\u0018\u00010\b2\b\u0010\\\u001a\u0004\u0018\u00010\bJ+\u0010]\u001a\u00020O\"\u0004\b\u0000\u0010R2\b\u0010S\u001a\u0004\u0018\u00010\b2\u000e\u0010^\u001a\n\u0012\u0004\u0012\u0002HR\u0018\u00010Q\u00a2\u0006\u0002\u0010_J&\u0010`\u001a\u00020O\"\u0004\b\u0000\u0010R2\b\u0010S\u001a\u0004\u0018\u00010\b2\u000e\u0010a\u001a\n\u0012\u0004\u0012\u0002HR\u0018\u00010XJ#\u0010b\u001a\u00020O\"\u0004\b\u0000\u0010R2\b\u0010S\u001a\u0004\u0018\u00010\b2\u0006\u0010c\u001a\u0002HR\u00a2\u0006\u0002\u0010dJ\u0010\u0010e\u001a\u00020O2\b\u0010S\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R(\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR(\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR(\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u000eR(\u0010\u0017\u001a\u0004\u0018\u00010\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u000eR(\u0010\u001a\u001a\u0004\u0018\u00010\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001b\u0010\f\"\u0004\b\u001c\u0010\u000eR(\u0010\u001e\u001a\u0004\u0018\u00010\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000eR\u000e\u0010!\u001a\u00020\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010#\u001a\u0004\u0018\u00010\b2\b\u0010#\u001a\u0004\u0018\u00010\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b$\u0010\f\"\u0004\b%\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R$\u0010*\u001a\u00020+2\u0006\u0010*\u001a\u00020+8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b*\u0010,\"\u0004\b-\u0010.R(\u00100\u001a\u0004\u0018\u00010\b2\b\u0010/\u001a\u0004\u0018\u00010\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b0\u0010\f\"\u0004\b1\u0010\u000eR(\u00103\u001a\u0004\u0018\u00010\b2\b\u00102\u001a\u0004\u0018\u00010\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b4\u0010\f\"\u0004\b5\u0010\u000eR(\u00106\u001a\u0004\u0018\u00010\b2\b\u00106\u001a\u0004\u0018\u00010\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b7\u0010\f\"\u0004\b8\u0010\u000eR(\u0010:\u001a\u0004\u0018\u00010\b2\b\u00109\u001a\u0004\u0018\u00010\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b;\u0010\f\"\u0004\b<\u0010\u000eR(\u0010=\u001a\u0004\u0018\u00010\b2\b\u0010=\u001a\u0004\u0018\u00010\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b>\u0010\f\"\u0004\b?\u0010\u000eR\u000e\u0010@\u001a\u00020AX\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010B\u001a\u0004\u0018\u00010\b2\b\u00109\u001a\u0004\u0018\u00010\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bC\u0010\f\"\u0004\bD\u0010\u000eR(\u0010E\u001a\u0004\u0018\u00010\b2\b\u0010E\u001a\u0004\u0018\u00010\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bF\u0010\f\"\u0004\bG\u0010\u000eR(\u0010H\u001a\u0004\u0018\u00010\b2\b\u0010H\u001a\u0004\u0018\u00010\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bI\u0010\f\"\u0004\bJ\u0010\u000eR(\u0010K\u001a\u0004\u0018\u00010\b2\b\u0010K\u001a\u0004\u0018\u00010\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bL\u0010\f\"\u0004\bM\u0010\u000e\u00a8\u0006g"}, d2 = {"Lcom/tigwal/utils/MySharedPreferences;", "", "context", "Landroid/content/Context;", "gson", "Lcom/google/gson/Gson;", "(Landroid/content/Context;Lcom/google/gson/Gson;)V", "SP_NAME", "", "authToken1", "authToken", "getAuthToken", "()Ljava/lang/String;", "setAuthToken", "(Ljava/lang/String;)V", "countrycode", "getCountrycode", "setCountrycode", "countryName", "countryshortname", "getCountryshortname", "setCountryshortname", "deviceid", "deviceId", "getDeviceId", "setDeviceId", "deviceToken", "getDeviceToken", "setDeviceToken", "udiid1", "deviceUDID", "getDeviceUDID", "setDeviceUDID", "editor", "Landroid/content/SharedPreferences$Editor;", "email", "getEmail", "setEmail", "getGson", "()Lcom/google/gson/Gson;", "setGson", "(Lcom/google/gson/Gson;)V", "isLogin", "", "()Z", "setLogin", "(Z)V", "isNotification1", "isNotification", "setNotification", "language1", "language", "getLanguage", "setLanguage", "locationID", "getLocationID", "setLocationID", "id", "loginType", "getLoginType", "setLoginType", "phoneNumber", "getPhoneNumber", "setPhoneNumber", "sharedPreferences", "Landroid/content/SharedPreferences;", "userId", "getUserId", "setUserId", "userImage", "getUserImage", "setUserImage", "userName", "getUserName", "setUserName", "userType", "getUserType", "setUserType", "clearPreferences", "", "getArray", "", "T", "key", "clazz", "Ljava/lang/Class;", "(Ljava/lang/String;Ljava/lang/Class;)[Ljava/lang/Object;", "getList", "", "getObject", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "getString", "defaultValue", "putArray", "arrays", "(Ljava/lang/String;[Ljava/lang/Object;)V", "putList", "list", "putObject", "value", "(Ljava/lang/String;Ljava/lang/Object;)V", "removeKey", "Companion", "app_debug"})
public final class MySharedPreferences {
    private final java.lang.String SP_NAME = "p6_pref";
    private final android.content.SharedPreferences sharedPreferences = null;
    private final android.content.SharedPreferences.Editor editor = null;
    @org.jetbrains.annotations.NotNull()
    private com.google.gson.Gson gson;
    @org.jetbrains.annotations.NotNull()
    public static final com.tigwal.utils.MySharedPreferences.Companion Companion = null;
    private static com.tigwal.utils.MySharedPreferences mySharedPreferences;
    
    private MySharedPreferences(android.content.Context context, com.google.gson.Gson gson) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.gson.Gson getGson() {
        return null;
    }
    
    public final void setGson(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson p0) {
    }
    
    public final boolean isLogin() {
        return false;
    }
    
    public final void setLogin(boolean isLogin) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAuthToken() {
        return null;
    }
    
    public final void setAuthToken(@org.jetbrains.annotations.Nullable()
    java.lang.String authToken1) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDeviceId() {
        return null;
    }
    
    public final void setDeviceId(@org.jetbrains.annotations.Nullable()
    java.lang.String deviceid) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDeviceToken() {
        return null;
    }
    
    public final void setDeviceToken(@org.jetbrains.annotations.Nullable()
    java.lang.String deviceToken) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUserName() {
        return null;
    }
    
    public final void setUserName(@org.jetbrains.annotations.Nullable()
    java.lang.String userName) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.Nullable()
    java.lang.String email) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCountrycode() {
        return null;
    }
    
    public final void setCountrycode(@org.jetbrains.annotations.Nullable()
    java.lang.String countrycode) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUserType() {
        return null;
    }
    
    public final void setUserType(@org.jetbrains.annotations.Nullable()
    java.lang.String userType) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLoginType() {
        return null;
    }
    
    public final void setLoginType(@org.jetbrains.annotations.Nullable()
    java.lang.String id) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCountryshortname() {
        return null;
    }
    
    public final void setCountryshortname(@org.jetbrains.annotations.Nullable()
    java.lang.String countryName) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUserImage() {
        return null;
    }
    
    public final void setUserImage(@org.jetbrains.annotations.Nullable()
    java.lang.String userImage) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String isNotification() {
        return null;
    }
    
    public final void setNotification(@org.jetbrains.annotations.Nullable()
    java.lang.String isNotification1) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPhoneNumber() {
        return null;
    }
    
    public final void setPhoneNumber(@org.jetbrains.annotations.Nullable()
    java.lang.String phoneNumber) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUserId() {
        return null;
    }
    
    public final void setUserId(@org.jetbrains.annotations.Nullable()
    java.lang.String id) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLanguage() {
        return null;
    }
    
    public final void setLanguage(@org.jetbrains.annotations.Nullable()
    java.lang.String language1) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDeviceUDID() {
        return null;
    }
    
    public final void setDeviceUDID(@org.jetbrains.annotations.Nullable()
    java.lang.String udiid1) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLocationID() {
        return null;
    }
    
    public final void setLocationID(@org.jetbrains.annotations.Nullable()
    java.lang.String locationID) {
    }
    
    public final void clearPreferences() {
    }
    
    public final <T extends java.lang.Object>void putObject(@org.jetbrains.annotations.Nullable()
    java.lang.String key, T value) {
    }
    
    public final <T extends java.lang.Object>T getObject(@org.jetbrains.annotations.Nullable()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.Class<T> clazz) {
        return null;
    }
    
    public final <T extends java.lang.Object>void putList(@org.jetbrains.annotations.Nullable()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends T> list) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>java.util.List<T> getList(@org.jetbrains.annotations.Nullable()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.Class<T> clazz) {
        return null;
    }
    
    public final <T extends java.lang.Object>void putArray(@org.jetbrains.annotations.Nullable()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    T[] arrays) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>T[] getArray(@org.jetbrains.annotations.Nullable()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.Class<T[]> clazz) {
        return null;
    }
    
    public final void removeKey(@org.jetbrains.annotations.Nullable()
    java.lang.String key) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getString(@org.jetbrains.annotations.Nullable()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.String defaultValue) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007\u00a2\u0006\u0002\b\u0006R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/tigwal/utils/MySharedPreferences$Companion;", "", "()V", "mySharedPreferences", "Lcom/tigwal/utils/MySharedPreferences;", "getMySharedPreferences", "getMySharedPreferences1", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        @kotlin.jvm.JvmName(name = "getMySharedPreferences1")
        public final com.tigwal.utils.MySharedPreferences getMySharedPreferences1() {
            return null;
        }
    }
}