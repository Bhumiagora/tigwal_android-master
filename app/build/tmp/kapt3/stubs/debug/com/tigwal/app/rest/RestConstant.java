package com.tigwal.app.rest;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\bb\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\tR\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0007\"\u0004\b\u0017\u0010\tR\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u001a\u0010%\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0007\"\u0004\b\'\u0010\tR\u000e\u0010(\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u001a\u0010)\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0007\"\u0004\b+\u0010\tR\u000e\u0010,\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u001a\u0010/\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0007\"\u0004\b1\u0010\tR\u000e\u00102\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u001a\u0010H\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0007\"\u0004\bJ\u0010\tR\u001a\u0010K\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u0007\"\u0004\bM\u0010\tR\u000e\u0010N\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u001a\u0010S\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bT\u0010\u0007\"\u0004\bU\u0010\tR\u001a\u0010V\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bW\u0010\u0007\"\u0004\bX\u0010\tR\u001a\u0010Y\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010\u0007\"\u0004\b[\u0010\tR\u001a\u0010\\\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b]\u0010\u0007\"\u0004\b^\u0010\tR\u001a\u0010_\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b`\u0010\u0007\"\u0004\ba\u0010\tR\u000e\u0010b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010c\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010d\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006f"}, d2 = {"Lcom/tigwal/app/rest/RestConstant;", "", "()V", "APP_INSTALLATION", "", "AUTH_TOKEN", "getAUTH_TOKEN", "()Ljava/lang/String;", "setAUTH_TOKEN", "(Ljava/lang/String;)V", "BASE_URLS", "BEARER", "CancelOrder", "ChatDetails", "ChatList", "ContinueShopping", "getContinueShopping", "setContinueShopping", "DEVICE_Id", "DEVICE_TYPE", "DeleteUser", "FIREBASE_PUSH_NOTIFICATION", "getFIREBASE_PUSH_NOTIFICATION", "setFIREBASE_PUSH_NOTIFICATION", "IS_LOGIN", "IS_NOTIFICATION", "LANGUAGE", "RecommendsList", "SearchLocation", "SendChat", "USER_CONTACT_NUMBER", "USER_COUNTRY_CODE", "USER_EMAIL", "USER_ID", "USER_IMAGE", "USER_NAME", "addCart", "addPhoto", "getAddPhoto", "setAddPhoto", "addRating", "cancel", "getCancel", "setCancel", "change_password", "check_email_mobile_exists_or_not", "check_social_id_exists", "chooseLiberary", "getChooseLiberary", "setChooseLiberary", "countryshortname", "createOrder", "deleteCart", "deviceToken", "enable_notification", "forgot_password", "getOrder", "getSlots", "getTapPayment", "get_banners", "get_category", "get_category_locations", "get_location_details", "get_pages", "get_sub_category", "listCart", "listOrder", "locationID", "login", "login_type", "logout", "notifications", "ongoingMenuType", "getOngoingMenuType", "setOngoingMenuType", "productFilter", "getProductFilter", "setProductFilter", "referesh_user", "refunds", "reset_password", "send_otp", "signup", "socialEmail", "getSocialEmail", "setSocialEmail", "socialName", "getSocialName", "setSocialName", "socialTokenId", "getSocialTokenId", "setSocialTokenId", "socialTokenLoginType", "getSocialTokenLoginType", "setSocialTokenLoginType", "takePhoto", "getTakePhoto", "setTakePhoto", "udiid", "updateCart", "update_profile", "userType", "app_debug"})
public final class RestConstant {
    @org.jetbrains.annotations.NotNull()
    public static final com.tigwal.app.rest.RestConstant INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASE_URLS = "https://www.tigwal.net/api/v1/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BEARER = "Bearer ";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String APP_INSTALLATION = "app_installation";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String login = "login";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String logout = "logout";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String forgot_password = "forgot_password";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String reset_password = "reset_password";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String send_otp = "send_otp";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String signup = "signup";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String check_social_id_exists = "check_social_id_exists";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String referesh_user = "referesh_user";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String update_profile = "update_profile";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String enable_notification = "update_notification_flag";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String change_password = "change_password";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String get_category = "get_category";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String get_sub_category = "get_sub_category";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String get_pages = "get_pages/{slug}";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String get_category_locations = "get_category_locations";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String get_location_details = "get_location_details/{slug}";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String addCart = "addCart";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String listCart = "listCart";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String deleteCart = "deleteCart/{delete_id}";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String updateCart = "updateCart/{cart_item_id}";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getTapPayment = "getTab/{charges_id}";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String createOrder = "createOrder";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String get_banners = "get_banners";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String listOrder = "listOrder";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getOrder = "getOrder/{order_id}";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String notifications = "notifications";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getSlots = "getSlots";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CancelOrder = "CancelOrder";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String refunds = "refunds";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RecommendsList = "RecommendsList";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SearchLocation = "SearchLocation";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SendChat = "SendChat";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ChatDetails = "ChatDetails";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String addRating = "addRating";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ChatList = "ChatList";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String check_email_mobile_exists_or_not = "check_email_mobile_exists_or_not";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DeleteUser = "DeleteUser";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEVICE_TYPE = "A";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IS_LOGIN = "isLogin";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEVICE_Id = "user_device_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String deviceToken = "deviceToken";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER_NAME = "user_name";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER_EMAIL = "user_email";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER_COUNTRY_CODE = "user_country_code";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String userType = "userType";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String login_type = "login_type";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String udiid = "udiid";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER_CONTACT_NUMBER = "user_contact_number";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String countryshortname = "countryshortname";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IS_NOTIFICATION = "IS_NOTIFICATION";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER_IMAGE = "user_image";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER_ID = "user_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LANGUAGE = "LANGUAGE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String locationID = "locationID";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String AUTH_TOKEN = "AUTH_TOKEN";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String addPhoto = "";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String takePhoto = "";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String chooseLiberary = "";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String cancel = "";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String socialTokenId = "";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String socialTokenLoginType = "";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String socialName = "";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String socialEmail = "";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String ongoingMenuType = "0";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String productFilter = "";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String ContinueShopping = "0";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String FIREBASE_PUSH_NOTIFICATION = "notification_action";
    
    private RestConstant() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAUTH_TOKEN() {
        return null;
    }
    
    public final void setAUTH_TOKEN(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAddPhoto() {
        return null;
    }
    
    public final void setAddPhoto(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTakePhoto() {
        return null;
    }
    
    public final void setTakePhoto(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getChooseLiberary() {
        return null;
    }
    
    public final void setChooseLiberary(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCancel() {
        return null;
    }
    
    public final void setCancel(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSocialTokenId() {
        return null;
    }
    
    public final void setSocialTokenId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSocialTokenLoginType() {
        return null;
    }
    
    public final void setSocialTokenLoginType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSocialName() {
        return null;
    }
    
    public final void setSocialName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSocialEmail() {
        return null;
    }
    
    public final void setSocialEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOngoingMenuType() {
        return null;
    }
    
    public final void setOngoingMenuType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProductFilter() {
        return null;
    }
    
    public final void setProductFilter(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getContinueShopping() {
        return null;
    }
    
    public final void setContinueShopping(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFIREBASE_PUSH_NOTIFICATION() {
        return null;
    }
    
    public final void setFIREBASE_PUSH_NOTIFICATION(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
}