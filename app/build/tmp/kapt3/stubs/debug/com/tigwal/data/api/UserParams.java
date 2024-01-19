package com.tigwal.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b=\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006A"}, d2 = {"Lcom/tigwal/data/api/UserParams;", "", "()V", "_method", "", "address", "amount", "apns_token", "app_identifier", "app_name", "app_version", "apple_token", "birth_date", "book_date", "cancellation_reason", "charge_id", "charge_refund_id", "country", "country_code", "country_short_name", "currency", "current_latitude", "current_longtitude", "date", "description", "device_token", "device_type", "email", "enable_notification", "facebook_token", "fcm_token", "gender", "google_token", "lats", "location_id", "login_type", "longs", "message", "mobile_no", "name", "new_password", "notes", "old_password", "order_id", "order_item", "otp", "password", "payment_id", "price", "price_order_By", "profile", "qty", "rating", "reason", "receiver_id", "refund_amount", "refund_percentage", "review", "search", "slot_id", "status", "timezone", "total_amount", "total_service_tax", "user_id", "app_debug"})
public final class UserParams {
    @org.jetbrains.annotations.NotNull()
    public static final com.tigwal.data.api.UserParams INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String app_name = "app_name";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String app_version = "app_version";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String device_token = "device_token";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String gender = "gender";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String device_type = "device_type";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String country = "country";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String fcm_token = "fcm_token";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String apns_token = "apns_token";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String app_identifier = "app_identifier";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String timezone = "timezone";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String user_id = "user_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String birth_date = "birth_date";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String name = "name";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String email = "email";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String login_type = "login_type";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String country_code = "country_code";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String mobile_no = "mobile_no";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String password = "password";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String facebook_token = "facebook_token";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String google_token = "google_token";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String apple_token = "apple_token";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String country_short_name = "country_short_name";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String otp = "otp";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String profile = "profile";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String enable_notification = "enable_notification";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String old_password = "old_password";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String new_password = "new_password";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String address = "address";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String lats = "lats";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String longs = "longs";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String location_id = "location_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String slot_id = "slot_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String qty = "qty";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String _method = "_method";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String price = "price";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String book_date = "book_date";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String notes = "notes";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String payment_id = "payment_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String charge_id = "charge_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String status = "status";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String total_amount = "total_amount";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String date = "date";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String order_id = "order_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String order_item = "order_item";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String refund_amount = "refund_amount";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String refund_percentage = "refund_percentage";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String charge_refund_id = "charge_refund_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String cancellation_reason = "cancellation_reason";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String amount = "amount";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String currency = "currency";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String description = "description";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String reason = "reason";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String search = "search";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String current_latitude = "current_latitude";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String current_longtitude = "current_longtitude";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String message = "message";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String receiver_id = "receiver_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String rating = "rating";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String review = "review";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String price_order_By = "price_order_By";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String total_service_tax = "total_service_tax";
    
    private UserParams() {
        super();
    }
}