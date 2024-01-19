package com.tigwal.data.model.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0016"}, d2 = {"Lcom/tigwal/data/model/login/LoginResponse;", "", "()V", "code", "", "getCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "data", "Lcom/tigwal/data/model/login/LoginResponse$Data;", "getData", "()Lcom/tigwal/data/model/login/LoginResponse$Data;", "message", "", "getMessage", "()Ljava/lang/String;", "status", "", "getStatus", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "Data", "app_debug"})
public final class LoginResponse {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "code")
    private final java.lang.Integer code = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "data")
    private final com.tigwal.data.model.login.LoginResponse.Data data = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "message")
    private final java.lang.String message = "";
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "status")
    private final java.lang.Boolean status = null;
    
    public LoginResponse() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCode() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tigwal.data.model.login.LoginResponse.Data getData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getStatus() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b+\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0006R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0006R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0006R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0006R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0006R\u0018\u0010!\u001a\u0004\u0018\u00010\u00048\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0006R\u0018\u0010#\u001a\u0004\u0018\u00010\u00048\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0006R\u0018\u0010%\u001a\u0004\u0018\u00010\u00048\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0006R\u0018\u0010\'\u001a\u0004\u0018\u00010\u00048\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0006R\u0018\u0010)\u001a\u0004\u0018\u00010\u00048\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0006R\u0018\u0010+\u001a\u0004\u0018\u00010\u00048\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0006R\u0018\u0010-\u001a\u0004\u0018\u00010\u00048\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0006\u00a8\u0006/"}, d2 = {"Lcom/tigwal/data/model/login/LoginResponse$Data;", "", "()V", "address", "", "getAddress", "()Ljava/lang/String;", "appleToken", "getAppleToken", "birth_date", "getBirth_date", "country", "getCountry", "countryCode", "getCountryCode", "country_short_name", "getCountry_short_name", "email", "getEmail", "enable_notification", "getEnable_notification", "facebookToken", "getFacebookToken", "gender", "getGender", "googleToken", "getGoogleToken", "image", "getImage", "imageurl", "getImageurl", "lats", "getLats", "loginType", "getLoginType", "longs", "getLongs", "mobileNo", "getMobileNo", "name", "getName", "token", "getToken", "userId", "getUserId", "userType", "getUserType", "app_debug"})
    public static final class Data {
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "image")
        private final java.lang.String image = "";
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "country_short_name")
        private final java.lang.String country_short_name = "";
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "enable_notification")
        private final java.lang.String enable_notification = "";
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "imageurl")
        private final java.lang.String imageurl = "";
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "country_code")
        private final java.lang.String countryCode = "";
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "user_type")
        private final java.lang.String userType = "";
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "user_id")
        private final java.lang.String userId = "";
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "apple_token")
        private final java.lang.String appleToken = "";
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "login_type")
        private final java.lang.String loginType = "";
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "name")
        private final java.lang.String name = "";
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "mobile_no")
        private final java.lang.String mobileNo = "";
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "google_token")
        private final java.lang.String googleToken = "";
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "facebook_token")
        private final java.lang.String facebookToken = "";
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "email")
        private final java.lang.String email = "";
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "token")
        private final java.lang.String token = "";
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "address")
        private final java.lang.String address = "";
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "longs")
        private final java.lang.String longs = "";
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "lats")
        private final java.lang.String lats = "";
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "country")
        private final java.lang.String country = "";
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "birth_date")
        private final java.lang.String birth_date = "";
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "gender")
        private final java.lang.String gender = "";
        
        public Data() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getImage() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCountry_short_name() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getEnable_notification() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getImageurl() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCountryCode() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getUserType() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getUserId() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getAppleToken() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getLoginType() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getName() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getMobileNo() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getGoogleToken() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getFacebookToken() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getEmail() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getToken() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getAddress() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getLongs() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getLats() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCountry() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getBirth_date() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getGender() {
            return null;
        }
    }
}