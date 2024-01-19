package com.tigwal.data.model.register;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR \u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b\u00a8\u0006\u0016"}, d2 = {"Lcom/tigwal/data/model/register/RegisterResponse;", "", "()V", "code", "", "getCode", "()Ljava/lang/String;", "setCode", "(Ljava/lang/String;)V", "data", "Lcom/tigwal/data/model/register/RegisterResponse$Data;", "getData", "()Lcom/tigwal/data/model/register/RegisterResponse$Data;", "setData", "(Lcom/tigwal/data/model/register/RegisterResponse$Data;)V", "message", "getMessage", "setMessage", "status", "getStatus", "setStatus", "Data", "app_debug"})
public final class RegisterResponse {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "code")
    private java.lang.String code = "";
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "status")
    private java.lang.String status = "";
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "data")
    private com.tigwal.data.model.register.RegisterResponse.Data data;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "message")
    private java.lang.String message = "";
    
    public RegisterResponse() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCode() {
        return null;
    }
    
    public final void setCode(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tigwal.data.model.register.RegisterResponse.Data getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    com.tigwal.data.model.register.RegisterResponse.Data p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMessage() {
        return null;
    }
    
    public final void setMessage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\bP\n\u0002\u0010\u0002\n\u0002\b(\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010,\u001a\u0004\u0018\u00010\u0004J\b\u0010-\u001a\u0004\u0018\u00010\u0004J\b\u0010.\u001a\u0004\u0018\u00010\u0004J\b\u0010/\u001a\u0004\u0018\u00010\u0004J\b\u00100\u001a\u0004\u0018\u00010\u0004J\b\u00101\u001a\u0004\u0018\u00010\u0004J\b\u00102\u001a\u0004\u0018\u00010\u0004J\b\u00103\u001a\u0004\u0018\u00010\u0004J\b\u00104\u001a\u0004\u0018\u00010\u0004J\b\u00105\u001a\u0004\u0018\u00010\u0004J\b\u00106\u001a\u0004\u0018\u00010\u0004J\b\u00107\u001a\u0004\u0018\u00010\u0004J\b\u00108\u001a\u0004\u0018\u00010\u0004J\b\u00109\u001a\u0004\u0018\u00010\u0004J\b\u0010:\u001a\u0004\u0018\u00010\u0004J\b\u0010;\u001a\u0004\u0018\u00010\u0004J\b\u0010<\u001a\u0004\u0018\u00010\u0004J\b\u0010=\u001a\u0004\u0018\u00010\u0004J\b\u0010>\u001a\u0004\u0018\u00010\u0004J\b\u0010?\u001a\u0004\u0018\u00010\u0004J\b\u0010@\u001a\u0004\u0018\u00010\u0004J\b\u0010A\u001a\u0004\u0018\u00010\u0004J\b\u0010B\u001a\u0004\u0018\u00010\u0004J\b\u0010C\u001a\u0004\u0018\u00010\u0004J\b\u0010D\u001a\u0004\u0018\u00010\u0004J\b\u0010E\u001a\u0004\u0018\u00010\u0004J\b\u0010F\u001a\u0004\u0018\u00010\u0004J\b\u0010G\u001a\u0004\u0018\u00010\u0004J\b\u0010H\u001a\u0004\u0018\u00010\u0004J\b\u0010I\u001a\u0004\u0018\u00010\u0004J\b\u0010J\u001a\u0004\u0018\u00010\u0004J\b\u0010K\u001a\u0004\u0018\u00010\u0004J\b\u0010L\u001a\u0004\u0018\u00010\u0004J\b\u0010M\u001a\u0004\u0018\u00010\u0004J\b\u0010N\u001a\u0004\u0018\u00010\u0004J\b\u0010O\u001a\u0004\u0018\u00010\u0004J\b\u0010P\u001a\u0004\u0018\u00010\u0004J\b\u0010Q\u001a\u0004\u0018\u00010\u0004J\b\u0010R\u001a\u0004\u0018\u00010\u0004J\b\u0010S\u001a\u0004\u0018\u00010\u0004J\u0010\u0010T\u001a\u00020U2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\u0010\u0010V\u001a\u00020U2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0010\u0010W\u001a\u00020U2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004J\u0010\u0010X\u001a\u00020U2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004J\u0010\u0010Y\u001a\u00020U2\b\u0010\b\u001a\u0004\u0018\u00010\u0004J\u0010\u0010Z\u001a\u00020U2\b\u0010\t\u001a\u0004\u0018\u00010\u0004J\u0010\u0010[\u001a\u00020U2\b\u0010\n\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\\\u001a\u00020U2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004J\u0010\u0010]\u001a\u00020U2\b\u0010\f\u001a\u0004\u0018\u00010\u0004J\u0010\u0010^\u001a\u00020U2\b\u0010\r\u001a\u0004\u0018\u00010\u0004J\u0010\u0010_\u001a\u00020U2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004J\u0010\u0010`\u001a\u00020U2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004J\u0010\u0010a\u001a\u00020U2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004J\u0010\u0010b\u001a\u00020U2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004J\u0010\u0010c\u001a\u00020U2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004J\u0010\u0010d\u001a\u00020U2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004J\u0010\u0010e\u001a\u00020U2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004J\u0010\u0010f\u001a\u00020U2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004J\u0010\u0010g\u001a\u00020U2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004J\u0010\u0010h\u001a\u00020U2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004J\u0010\u0010i\u001a\u00020U2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004J\u0010\u0010j\u001a\u00020U2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004J\u0010\u0010k\u001a\u00020U2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004J\u0010\u0010l\u001a\u00020U2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004J\u0010\u0010m\u001a\u00020U2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004J\u0010\u0010n\u001a\u00020U2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004J\u0010\u0010o\u001a\u00020U2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0004J\u0010\u0010p\u001a\u00020U2\b\u0010 \u001a\u0004\u0018\u00010\u0004J\u0010\u0010q\u001a\u00020U2\b\u0010!\u001a\u0004\u0018\u00010\u0004J\u0010\u0010r\u001a\u00020U2\b\u0010\"\u001a\u0004\u0018\u00010\u0004J\u0010\u0010s\u001a\u00020U2\b\u0010#\u001a\u0004\u0018\u00010\u0004J\u0010\u0010t\u001a\u00020U2\b\u0010$\u001a\u0004\u0018\u00010\u0004J\u0010\u0010u\u001a\u00020U2\b\u0010%\u001a\u0004\u0018\u00010\u0004J\u0010\u0010v\u001a\u00020U2\b\u0010&\u001a\u0004\u0018\u00010\u0004J\u0010\u0010w\u001a\u00020U2\b\u0010\'\u001a\u0004\u0018\u00010\u0004J\u0010\u0010x\u001a\u00020U2\b\u0010(\u001a\u0004\u0018\u00010\u0004J\u0010\u0010y\u001a\u00020U2\b\u0010)\u001a\u0004\u0018\u00010\u0004J\u0010\u0010z\u001a\u00020U2\b\u0010*\u001a\u0004\u0018\u00010\u0004J\u0010\u0010{\u001a\u00020U2\b\u0010+\u001a\u0004\u0018\u00010\u0004J\u0010\u0010|\u001a\u00020U2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010 \u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010!\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010#\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010$\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010%\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010&\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\'\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010(\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010)\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010*\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010+\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006}"}, d2 = {"Lcom/tigwal/data/model/register/RegisterResponse$Data;", "", "()V", "accessToken", "", "apartmentNumber", "appNotification", "appleidToken", "area", "block", "city", "country", "createdDate", "currency", "currencySymbol", "currency_short_name", "deviceToken", "email", "emailNotification", "facebookToken", "fcmToken", "floor", "googleToken", "houseNumber", "id", "landmark", "lane", "language", "latitude", "loginOption", "longitude", "matrixUnit", "modifedDate", "name", "phoneNumber", "phonecode", "postalCode", "profilePic", "registerType", "state", "status", "street", "twitterToken", "whatsappNotification", "getAccessToken", "getApartmentNumber", "getAppNotification", "getAppleidToken", "getArea", "getBlock", "getCity", "getCountry", "getCreatedDate", "getCurrency", "getCurrencySymbol", "getDeviceToken", "getEmail", "getEmailNotification", "getFacebookToken", "getFcmToken", "getFloor", "getGoogleToken", "getHouseNumber", "getId", "getLandmark", "getLane", "getLanguage", "getLatitude", "getLoginOption", "getLongitude", "getMatrixUnit", "getModifedDate", "getName", "getPhoneNumber", "getPhonecode", "getPostalCode", "getProfilePic", "getRegisterType", "getState", "getStatus", "getStreet", "getTwitterToken", "getWhatsappNotification", "getcurrency_short_name", "setAccessToken", "", "setApartmentNumber", "setAppNotification", "setAppleidToken", "setArea", "setBlock", "setCity", "setCountry", "setCreatedDate", "setCurrency", "setCurrencySymbol", "setDeviceToken", "setEmail", "setEmailNotification", "setFacebookToken", "setFcmToken", "setFloor", "setGoogleToken", "setHouseNumber", "setId", "setLandmark", "setLane", "setLanguage", "setLatitude", "setLoginOption", "setLongitude", "setMatrixUnit", "setModifedDate", "setName", "setPhoneNumber", "setPhonecode", "setPostalCode", "setProfilePic", "setRegisterType", "setState", "setStatus", "setStreet", "setTwitterToken", "setWhatsappNotification", "setcurrency_short_name", "app_debug"})
    public static final class Data {
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "id")
        private java.lang.String id = "";
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "register_type")
        private java.lang.String registerType = "";
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "login_option")
        private java.lang.String loginOption = "";
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "name")
        private java.lang.String name = "";
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "email")
        private java.lang.String email = "";
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "phonecode")
        private java.lang.String phonecode = "";
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "phone_number")
        private java.lang.String phoneNumber = "";
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "profile_pic")
        private java.lang.String profilePic = "";
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "status")
        private java.lang.String status = "";
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "language")
        private java.lang.String language = "";
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "currency")
        private java.lang.String currency = "";
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "currency_symbol")
        private java.lang.String currencySymbol = "";
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "google_token")
        private java.lang.String googleToken = "";
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "facebook_token")
        private java.lang.String facebookToken = "";
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "twitter_token")
        private java.lang.String twitterToken = "";
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "appleid_token")
        private java.lang.String appleidToken = "";
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "modifed_date")
        private java.lang.String modifedDate = "";
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "created_date")
        private java.lang.String createdDate = "";
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "area")
        private java.lang.String area = "";
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "block")
        private java.lang.String block = "";
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "street")
        private java.lang.String street = "";
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "lane")
        private java.lang.String lane = "";
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "house_number")
        private java.lang.String houseNumber = "";
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "floor")
        private java.lang.String floor = "";
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "apartment_number")
        private java.lang.String apartmentNumber = "";
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "postal_code")
        private java.lang.String postalCode = "";
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "landmark")
        private java.lang.String landmark = "";
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "city")
        private java.lang.String city = "";
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "state")
        private java.lang.String state = "";
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "country")
        private java.lang.String country = "";
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "latitude")
        private java.lang.String latitude = "";
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "longitude")
        private java.lang.String longitude = "";
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "device_token")
        private java.lang.String deviceToken = "";
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "fcm_token")
        private java.lang.String fcmToken = "";
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "access_token")
        private java.lang.String accessToken = "";
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "whatsapp_notification")
        private java.lang.String whatsappNotification = "";
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "email_notification")
        private java.lang.String emailNotification = "";
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "app_notification")
        private java.lang.String appNotification = "";
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "matrix_unit")
        private java.lang.String matrixUnit = "";
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "currency_short_name")
        private java.lang.String currency_short_name = "";
        
        public Data() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getId() {
            return null;
        }
        
        public final void setId(@org.jetbrains.annotations.Nullable()
        java.lang.String id) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getRegisterType() {
            return null;
        }
        
        public final void setRegisterType(@org.jetbrains.annotations.Nullable()
        java.lang.String registerType) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getLoginOption() {
            return null;
        }
        
        public final void setLoginOption(@org.jetbrains.annotations.Nullable()
        java.lang.String loginOption) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getName() {
            return null;
        }
        
        public final void setName(@org.jetbrains.annotations.Nullable()
        java.lang.String name) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getEmail() {
            return null;
        }
        
        public final void setEmail(@org.jetbrains.annotations.Nullable()
        java.lang.String email) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPhonecode() {
            return null;
        }
        
        public final void setPhonecode(@org.jetbrains.annotations.Nullable()
        java.lang.String phonecode) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPhoneNumber() {
            return null;
        }
        
        public final void setPhoneNumber(@org.jetbrains.annotations.Nullable()
        java.lang.String phoneNumber) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getProfilePic() {
            return null;
        }
        
        public final void setProfilePic(@org.jetbrains.annotations.Nullable()
        java.lang.String profilePic) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getStatus() {
            return null;
        }
        
        public final void setStatus(@org.jetbrains.annotations.Nullable()
        java.lang.String status) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getLanguage() {
            return null;
        }
        
        public final void setLanguage(@org.jetbrains.annotations.Nullable()
        java.lang.String language) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCurrency() {
            return null;
        }
        
        public final void setCurrency(@org.jetbrains.annotations.Nullable()
        java.lang.String currency) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCurrencySymbol() {
            return null;
        }
        
        public final void setCurrencySymbol(@org.jetbrains.annotations.Nullable()
        java.lang.String currencySymbol) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getGoogleToken() {
            return null;
        }
        
        public final void setGoogleToken(@org.jetbrains.annotations.Nullable()
        java.lang.String googleToken) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getFacebookToken() {
            return null;
        }
        
        public final void setFacebookToken(@org.jetbrains.annotations.Nullable()
        java.lang.String facebookToken) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTwitterToken() {
            return null;
        }
        
        public final void setTwitterToken(@org.jetbrains.annotations.Nullable()
        java.lang.String twitterToken) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getAppleidToken() {
            return null;
        }
        
        public final void setAppleidToken(@org.jetbrains.annotations.Nullable()
        java.lang.String appleidToken) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getModifedDate() {
            return null;
        }
        
        public final void setModifedDate(@org.jetbrains.annotations.Nullable()
        java.lang.String modifedDate) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCreatedDate() {
            return null;
        }
        
        public final void setCreatedDate(@org.jetbrains.annotations.Nullable()
        java.lang.String createdDate) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getArea() {
            return null;
        }
        
        public final void setArea(@org.jetbrains.annotations.Nullable()
        java.lang.String area) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getBlock() {
            return null;
        }
        
        public final void setBlock(@org.jetbrains.annotations.Nullable()
        java.lang.String block) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getStreet() {
            return null;
        }
        
        public final void setStreet(@org.jetbrains.annotations.Nullable()
        java.lang.String street) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getLane() {
            return null;
        }
        
        public final void setLane(@org.jetbrains.annotations.Nullable()
        java.lang.String lane) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getHouseNumber() {
            return null;
        }
        
        public final void setHouseNumber(@org.jetbrains.annotations.Nullable()
        java.lang.String houseNumber) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getFloor() {
            return null;
        }
        
        public final void setFloor(@org.jetbrains.annotations.Nullable()
        java.lang.String floor) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getApartmentNumber() {
            return null;
        }
        
        public final void setApartmentNumber(@org.jetbrains.annotations.Nullable()
        java.lang.String apartmentNumber) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPostalCode() {
            return null;
        }
        
        public final void setPostalCode(@org.jetbrains.annotations.Nullable()
        java.lang.String postalCode) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getLandmark() {
            return null;
        }
        
        public final void setLandmark(@org.jetbrains.annotations.Nullable()
        java.lang.String landmark) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCity() {
            return null;
        }
        
        public final void setCity(@org.jetbrains.annotations.Nullable()
        java.lang.String city) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getState() {
            return null;
        }
        
        public final void setState(@org.jetbrains.annotations.Nullable()
        java.lang.String state) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCountry() {
            return null;
        }
        
        public final void setCountry(@org.jetbrains.annotations.Nullable()
        java.lang.String country) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getLatitude() {
            return null;
        }
        
        public final void setLatitude(@org.jetbrains.annotations.Nullable()
        java.lang.String latitude) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getLongitude() {
            return null;
        }
        
        public final void setLongitude(@org.jetbrains.annotations.Nullable()
        java.lang.String longitude) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDeviceToken() {
            return null;
        }
        
        public final void setDeviceToken(@org.jetbrains.annotations.Nullable()
        java.lang.String deviceToken) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getFcmToken() {
            return null;
        }
        
        public final void setFcmToken(@org.jetbrains.annotations.Nullable()
        java.lang.String fcmToken) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getAccessToken() {
            return null;
        }
        
        public final void setAccessToken(@org.jetbrains.annotations.Nullable()
        java.lang.String accessToken) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getWhatsappNotification() {
            return null;
        }
        
        public final void setWhatsappNotification(@org.jetbrains.annotations.Nullable()
        java.lang.String whatsappNotification) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getEmailNotification() {
            return null;
        }
        
        public final void setEmailNotification(@org.jetbrains.annotations.Nullable()
        java.lang.String emailNotification) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getAppNotification() {
            return null;
        }
        
        public final void setAppNotification(@org.jetbrains.annotations.Nullable()
        java.lang.String appNotification) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getMatrixUnit() {
            return null;
        }
        
        public final void setMatrixUnit(@org.jetbrains.annotations.Nullable()
        java.lang.String matrixUnit) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getcurrency_short_name() {
            return null;
        }
        
        public final void setcurrency_short_name(@org.jetbrains.annotations.Nullable()
        java.lang.String currency_short_name) {
        }
    }
}