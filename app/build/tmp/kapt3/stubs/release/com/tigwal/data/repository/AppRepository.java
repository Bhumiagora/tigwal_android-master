package com.tigwal.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u00f6\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ5\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J)\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ5\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ5\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ5\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ?\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00042&\u0010 \u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\rj\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007`!H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"JG\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u00042\u0006\u0010\u0006\u001a\u00020\u00072&\u0010 \u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\rj\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007`!H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ-\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u00042\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J?\u0010\'\u001a\b\u0012\u0004\u0012\u00020(0\u00042&\u0010 \u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\rj\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007`!H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J7\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0016\b\u0001\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ1\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.JG\u0010/\u001a\b\u0012\u0004\u0012\u00020$0\u00042\u0006\u0010\u0006\u001a\u00020\u00072&\u0010 \u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\rj\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007`!H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ?\u00100\u001a\b\u0012\u0004\u0012\u0002010\u00042&\u0010 \u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\rj\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007`!H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J\u001f\u00102\u001a\b\u0012\u0004\u0012\u0002030\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\'\u00104\u001a\b\u0012\u0004\u0012\u0002050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u00106\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00107J)\u00108\u001a\b\u0012\u0004\u0012\u0002090\u00042\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\'\u0010:\u001a\b\u0012\u0004\u0012\u0002030\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00107J\'\u0010<\u001a\b\u0012\u0004\u0012\u00020*0\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010=\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00107J\u001f\u0010>\u001a\b\u0012\u0004\u0012\u00020?0\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011JG\u0010@\u001a\b\u0012\u0004\u0012\u00020A0\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010B\u001a\u00020\u00072\u0006\u0010C\u001a\u00020\u00072\u0006\u0010D\u001a\u00020\u00072\u0006\u0010E\u001a\u00020\u00072\u0006\u0010F\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010GJ\'\u0010H\u001a\b\u0012\u0004\u0012\u00020I0\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010J\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00107J\'\u0010K\u001a\b\u0012\u0004\u0012\u00020L0\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010J\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00107J\u001f\u0010M\u001a\b\u0012\u0004\u0012\u00020N0\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u001f\u0010O\u001a\b\u0012\u0004\u0012\u00020P0\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J?\u0010Q\u001a\b\u0012\u0004\u0012\u00020(0\u00042&\u0010 \u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\rj\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007`!H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"JG\u0010R\u001a\b\u0012\u0004\u0012\u00020(0\u00042\u0006\u0010S\u001a\u00020\u00072&\u0010 \u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\rj\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007`!H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u001f\u0010T\u001a\b\u0012\u0004\u0012\u00020U0\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u001f\u0010V\u001a\b\u0012\u0004\u0012\u00020(0\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J?\u0010W\u001a\b\u0012\u0004\u0012\u00020X0\u00042&\u0010 \u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\rj\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007`!H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J?\u0010Y\u001a\b\u0012\u0004\u0012\u00020Z0\u00042&\u0010 \u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\rj\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007`!H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J?\u0010[\u001a\b\u0012\u0004\u0012\u00020(0\u00042&\u0010 \u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\rj\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007`!H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J1\u0010\\\u001a\b\u0012\u0004\u0012\u00020]0\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010^\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.JQ\u0010_\u001a\b\u0012\u0004\u0012\u00020(0\u00042\u0006\u0010\u0006\u001a\u00020\u00072&\u0010 \u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\rj\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t`!2\b\u0010`\u001a\u0004\u0018\u00010aH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006c"}, d2 = {"Lcom/tigwal/data/repository/AppRepository;", "", "()V", "CancelOrder", "Lretrofit2/Response;", "Lcom/tigwal/data/model/cancel_order/CancelOrderResponse;", "token1", "", "params1", "Lokhttp3/RequestBody;", "(Ljava/lang/String;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ChatDetails", "Lcom/tigwal/data/model/chat/ChatDetailsResponse;", "Ljava/util/HashMap;", "(Ljava/lang/String;Ljava/util/HashMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ChatList", "Lcom/tigwal/data/model/chatlist/ChatListResponse;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "DeleteUser", "Lcom/tigwal/data/model/DeleteUserResponse;", "RecommendsList", "Lcom/tigwal/data/model/recommendation/RecommendationResponse;", "SearchLocation", "Lcom/tigwal/data/model/search/SearchListResponse;", "SendChat", "Lcom/tigwal/data/model/chat/SendChatResponse;", "addCart", "Lcom/tigwal/data/model/addtocart/AddToCartResponse;", "addRating", "Lcom/tigwal/data/model/rating/RatingResponse;", "appInstallation", "Lcom/tigwal/data/model/splash/AppInstallationResponse;", "params", "Lkotlin/collections/HashMap;", "(Ljava/util/HashMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "change_password", "Lcom/tigwal/data/model/notification_enable/NotificationUpdateResponse;", "check_email_mobile_exists_or_not", "Lcom/tigwal/data/model/check_email_mobile_exist/CheckEmailMobileExitsResponse;", "check_social_id_exists", "Lcom/tigwal/data/model/login/LoginResponse;", "createOrder", "Lcom/tigwal/data/model/tap_payment/TapPaymentResponse;", "deleteCart", "Lcom/tigwal/data/model/cart_item/CartItemResponse;", "delete_id1", "(Ljava/lang/String;Ljava/lang/String;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "enable_notification", "forgot_password", "Lcom/tigwal/data/model/forgotpassword/ForgotPasswordResponse;", "getCategory", "Lcom/tigwal/data/model/getcategory/CategoryResponse;", "getOrder", "Lcom/tigwal/data/model/order_detail/OrderDetailResponse;", "order_id", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSlots", "Lcom/tigwal/data/model/getTimeSlot/GetTimeSlotResposne;", "getSubCategory", "category_id1", "getTapPayment", "charges_id", "get_banners", "Lcom/tigwal/data/model/banners/BannersResponse;", "get_category_locations", "Lcom/tigwal/data/model/product_listing/ProductListResponse;", "id1", "vendor_id1", "price_order_By1", "per_page1", "page1", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "get_cms_pages", "Lcom/tigwal/data/model/cms_page/CMSResponse;", "slug1", "get_location_details", "Lcom/tigwal/data/model/product_detail/ProductDetailResponse;", "listCart", "Lcom/tigwal/data/model/listCart/CartListResponse;", "listOrder", "Lcom/tigwal/data/model/listOrder/ListOrderResponse;", "login", "logout", "headertoken", "notifications", "Lcom/tigwal/data/model/notification_list/NotificationListResponse;", "referesh_user", "reset_password", "Lcom/tigwal/data/model/resetpassword/ResetPasswordResponse;", "send_otp", "Lcom/tigwal/data/model/otp/SendOtpResponse;", "signup", "updateCart", "Lcom/tigwal/data/model/cart_item/UpdateCartItemResponse;", "cart_item_id1", "update_profile", "image", "Lokhttp3/MultipartBody$Part;", "(Ljava/lang/String;Ljava/util/HashMap;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public final class AppRepository {
    
    public AppRepository() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object appInstallation(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.tigwal.data.model.splash.AppInstallationResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object login(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.tigwal.data.model.login.LoginResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object logout(@org.jetbrains.annotations.NotNull()
    java.lang.String headertoken, @org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.tigwal.data.model.login.LoginResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object forgot_password(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.tigwal.data.model.forgotpassword.ForgotPasswordResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object reset_password(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.tigwal.data.model.resetpassword.ResetPasswordResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object signup(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.tigwal.data.model.login.LoginResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object send_otp(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.tigwal.data.model.otp.SendOtpResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object check_social_id_exists(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.tigwal.data.model.login.LoginResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object referesh_user(@org.jetbrains.annotations.NotNull()
    java.lang.String token1, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.tigwal.data.model.login.LoginResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object update_profile(@org.jetbrains.annotations.NotNull()
    java.lang.String token1, @org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, okhttp3.RequestBody> params, @org.jetbrains.annotations.Nullable()
    okhttp3.MultipartBody.Part image, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.tigwal.data.model.login.LoginResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object enable_notification(@org.jetbrains.annotations.NotNull()
    java.lang.String token1, @org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.tigwal.data.model.notification_enable.NotificationUpdateResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object change_password(@org.jetbrains.annotations.NotNull()
    java.lang.String token1, @org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.tigwal.data.model.notification_enable.NotificationUpdateResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String token1, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.tigwal.data.model.getcategory.CategoryResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSubCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String token1, @org.jetbrains.annotations.NotNull()
    java.lang.String category_id1, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.tigwal.data.model.getcategory.CategoryResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object get_cms_pages(@org.jetbrains.annotations.NotNull()
    java.lang.String token1, @org.jetbrains.annotations.NotNull()
    java.lang.String slug1, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.tigwal.data.model.cms_page.CMSResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object get_category_locations(@org.jetbrains.annotations.NotNull()
    java.lang.String token1, @org.jetbrains.annotations.NotNull()
    java.lang.String id1, @org.jetbrains.annotations.NotNull()
    java.lang.String vendor_id1, @org.jetbrains.annotations.NotNull()
    java.lang.String price_order_By1, @org.jetbrains.annotations.NotNull()
    java.lang.String per_page1, @org.jetbrains.annotations.NotNull()
    java.lang.String page1, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.tigwal.data.model.product_listing.ProductListResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object get_location_details(@org.jetbrains.annotations.NotNull()
    java.lang.String token1, @org.jetbrains.annotations.NotNull()
    java.lang.String slug1, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.tigwal.data.model.product_detail.ProductDetailResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addCart(@org.jetbrains.annotations.NotNull()
    java.lang.String token1, @org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> params1, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.tigwal.data.model.addtocart.AddToCartResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object listCart(@org.jetbrains.annotations.NotNull()
    java.lang.String token1, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.tigwal.data.model.listCart.CartListResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteCart(@org.jetbrains.annotations.NotNull()
    java.lang.String token1, @org.jetbrains.annotations.NotNull()
    java.lang.String delete_id1, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    okhttp3.RequestBody params1, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.tigwal.data.model.cart_item.CartItemResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateCart(@org.jetbrains.annotations.NotNull()
    java.lang.String token1, @org.jetbrains.annotations.NotNull()
    java.lang.String cart_item_id1, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    okhttp3.RequestBody params1, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.tigwal.data.model.cart_item.UpdateCartItemResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTapPayment(@org.jetbrains.annotations.NotNull()
    java.lang.String token1, @org.jetbrains.annotations.NotNull()
    java.lang.String charges_id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.tigwal.data.model.tap_payment.TapPaymentResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object createOrder(@org.jetbrains.annotations.NotNull()
    java.lang.String token1, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    java.util.HashMap<java.lang.String, okhttp3.RequestBody> params1, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.tigwal.data.model.tap_payment.TapPaymentResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object get_banners(@org.jetbrains.annotations.NotNull()
    java.lang.String token1, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.tigwal.data.model.banners.BannersResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object listOrder(@org.jetbrains.annotations.NotNull()
    java.lang.String token1, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.tigwal.data.model.listOrder.ListOrderResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getOrder(@org.jetbrains.annotations.NotNull()
    java.lang.String token1, @org.jetbrains.annotations.NotNull()
    java.lang.String order_id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.tigwal.data.model.order_detail.OrderDetailResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object notifications(@org.jetbrains.annotations.NotNull()
    java.lang.String token1, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.tigwal.data.model.notification_list.NotificationListResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSlots(@org.jetbrains.annotations.NotNull()
    java.lang.String token1, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    okhttp3.RequestBody params1, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.tigwal.data.model.getTimeSlot.GetTimeSlotResposne>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object CancelOrder(@org.jetbrains.annotations.NotNull()
    java.lang.String token1, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    okhttp3.RequestBody params1, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.tigwal.data.model.cancel_order.CancelOrderResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object RecommendsList(@org.jetbrains.annotations.NotNull()
    java.lang.String token1, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.tigwal.data.model.recommendation.RecommendationResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object SearchLocation(@org.jetbrains.annotations.NotNull()
    java.lang.String token1, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    okhttp3.RequestBody params1, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.tigwal.data.model.search.SearchListResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object SendChat(@org.jetbrains.annotations.NotNull()
    java.lang.String token1, @org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> params1, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.tigwal.data.model.chat.SendChatResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object ChatDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String token1, @org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> params1, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.tigwal.data.model.chat.ChatDetailsResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addRating(@org.jetbrains.annotations.NotNull()
    java.lang.String token1, @org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> params1, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.tigwal.data.model.rating.RatingResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object ChatList(@org.jetbrains.annotations.NotNull()
    java.lang.String token1, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.tigwal.data.model.chatlist.ChatListResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object check_email_mobile_exists_or_not(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> params1, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.tigwal.data.model.check_email_mobile_exist.CheckEmailMobileExitsResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object DeleteUser(@org.jetbrains.annotations.NotNull()
    java.lang.String token1, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.tigwal.data.model.DeleteUserResponse>> continuation) {
        return null;
    }
}