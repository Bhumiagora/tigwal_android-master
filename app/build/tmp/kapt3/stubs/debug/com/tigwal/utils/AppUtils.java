package com.tigwal.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u000f\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0004jklmB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001a\u001a\u00020\u001bJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001d\u001a\u00020\u0004J\u000e\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0004J\u000e\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0004J\u0012\u0010\"\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001f\u001a\u00020\u0004H\u0007J\u0012\u0010#\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001f\u001a\u00020\u0004H\u0007J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'H\u0007J\u0012\u0010(\u001a\u0004\u0018\u00010\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004J\u0010\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020\u0004J\u0010\u0010,\u001a\u0004\u0018\u00010\u00062\u0006\u0010-\u001a\u00020\'J\u0010\u0010.\u001a\u0004\u0018\u00010\u00062\u0006\u0010-\u001a\u00020\'J\u0010\u0010/\u001a\u0004\u0018\u00010\u00062\u0006\u0010-\u001a\u00020\'J\u0012\u00100\u001a\u0004\u0018\u00010\u00042\b\u00101\u001a\u0004\u0018\u00010\u0004J\u0010\u00102\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\'H\u0007J\u0010\u00103\u001a\u0004\u0018\u00010\u00042\u0006\u00104\u001a\u000205J\u0010\u00106\u001a\u0004\u0018\u00010\u00062\u0006\u0010-\u001a\u00020\'J\u0010\u00107\u001a\u0004\u0018\u00010\u00062\u0006\u0010-\u001a\u00020\'J\u0010\u00108\u001a\u0004\u0018\u00010\u00062\u0006\u0010-\u001a\u00020\'J\u0012\u00109\u001a\u0004\u0018\u00010:2\b\u0010;\u001a\u0004\u0018\u00010\u0004J\u0010\u0010<\u001a\u0004\u0018\u00010\u00062\u0006\u0010-\u001a\u00020\'J\u0010\u0010=\u001a\u00020\u00042\u0006\u0010>\u001a\u00020?H\u0007J\u000e\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020CJ\u0010\u0010D\u001a\u00020%2\u0006\u0010E\u001a\u00020FH\u0007J\u0012\u0010G\u001a\u00020A2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0007J\u0010\u0010H\u001a\u00020A2\b\u0010I\u001a\u0004\u0018\u00010\u0004J\u0010\u0010J\u001a\u00020A2\b\u0010K\u001a\u0004\u0018\u00010*J\u001c\u0010L\u001a\u00020A2\n\u0010M\u001a\u0006\u0012\u0002\b\u00030N2\u0006\u0010&\u001a\u00020\'H\u0007J\u0010\u0010O\u001a\u00020A2\b\u0010P\u001a\u0004\u0018\u00010\u0004J\u0010\u0010Q\u001a\u00020A2\b\u0010R\u001a\u0004\u0018\u00010\u0004J\u0012\u0010S\u001a\u00020A2\b\u0010T\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010U\u001a\u00020A2\b\u0010V\u001a\u0004\u0018\u00010\u0004J\u001a\u0010W\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'2\b\u0010X\u001a\u0004\u0018\u00010YJ\u0018\u0010Z\u001a\u00020%2\u0006\u0010&\u001a\u00020\'2\b\u0010[\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\\\u001a\u00020\u001b2\b\u0010]\u001a\u0004\u0018\u00010\u0004J\u0010\u0010^\u001a\u00020_2\u0006\u0010`\u001a\u00020_H\u0007J\"\u0010a\u001a\u00020%2\u0006\u0010&\u001a\u00020\'2\b\u0010b\u001a\u0004\u0018\u00010\u00042\b\u0010]\u001a\u0004\u0018\u00010\u0004J\u001a\u0010c\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'2\b\u0010]\u001a\u0004\u0018\u00010\u0004J\u0010\u0010d\u001a\u00020%2\u0006\u0010&\u001a\u00020\'H\u0007J\u0010\u0010e\u001a\u00020%2\u0006\u0010&\u001a\u00020\'H\u0007J\u0010\u0010f\u001a\u00020%2\u0006\u0010&\u001a\u00020\'H\u0007J\u0012\u0010g\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001f\u001a\u00020\u0004H\u0007J\u0012\u0010h\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001f\u001a\u00020\u0004H\u0007J\u0012\u0010i\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001f\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\n\u00a8\u0006n"}, d2 = {"Lcom/tigwal/utils/AppUtils;", "", "()V", "APP_TAG", "", "font_BOLD", "Landroid/graphics/Typeface;", "getFont_BOLD", "()Landroid/graphics/Typeface;", "setFont_BOLD", "(Landroid/graphics/Typeface;)V", "font_EXTRABOLD", "getFont_EXTRABOLD", "setFont_EXTRABOLD", "font_LIGHT", "getFont_LIGHT", "setFont_LIGHT", "font_MEDIUM", "getFont_MEDIUM", "setFont_MEDIUM", "font_REG", "getFont_REG", "setFont_REG", "addMonth", "Ljava/util/Date;", "date", "i", "", "capitalize", "capString", "convertTime", "time", "convertUTC2LocalDateTime", "datetime", "dateFormate", "dateFormateNew", "finishFromLeftToRight", "", "context", "Landroid/content/Context;", "formatToYesterdayOrToday", "fractionalPartValueFormate", "", "distanceInMiles", "getBOLD", "c", "getBOLDMIDIUM", "getBOLDNEW", "getDateFormate", "date1", "getDeviceId", "getErrorMessage", "responseBody", "Lokhttp3/ResponseBody;", "getLIGHT", "getMIDIUM", "getREG", "getRequestBody", "Lokhttp3/RequestBody;", "value", "getSEMIBOLD", "getText", "textView", "Landroid/widget/TextView;", "hasInternetConnection", "", "application", "Landroid/app/Application;", "hideSoftKeyboard", "activity", "Landroid/app/Activity;", "isConnectedToInternet", "isEmailValid", "email", "isEmpty", "str", "isMyServiceRunning", "serviceClass", "Ljava/lang/Class;", "isNameValid", "name", "isPhoneValid", "phone", "isValidPassword", "password", "isZipCodeValid", "zipCode", "languageIsRTL", "view", "Landroid/view/View;", "languageSelection", "lang", "logString", "message", "roundTwoDecimals", "", "d", "showAlertDialog", "title", "showToast", "startFromBottomToUp", "startFromRightToLeft", "startFromUpToBottom", "timeFormate", "timeSlotChange", "timeSlotChangeNew", "Amount", "AmountDcc", "TapCurrencyRequest", "TapCurrencyResponse", "app_debug"})
public final class AppUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.tigwal.utils.AppUtils INSTANCE = null;
    private static final java.lang.String APP_TAG = "CliniBook";
    @org.jetbrains.annotations.Nullable()
    private static android.graphics.Typeface font_BOLD;
    @org.jetbrains.annotations.Nullable()
    private static android.graphics.Typeface font_EXTRABOLD;
    @org.jetbrains.annotations.Nullable()
    private static android.graphics.Typeface font_LIGHT;
    @org.jetbrains.annotations.Nullable()
    private static android.graphics.Typeface font_MEDIUM;
    @org.jetbrains.annotations.Nullable()
    private static android.graphics.Typeface font_REG;
    
    private AppUtils() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.Typeface getFont_BOLD() {
        return null;
    }
    
    public final void setFont_BOLD(@org.jetbrains.annotations.Nullable()
    android.graphics.Typeface p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.Typeface getFont_EXTRABOLD() {
        return null;
    }
    
    public final void setFont_EXTRABOLD(@org.jetbrains.annotations.Nullable()
    android.graphics.Typeface p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.Typeface getFont_LIGHT() {
        return null;
    }
    
    public final void setFont_LIGHT(@org.jetbrains.annotations.Nullable()
    android.graphics.Typeface p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.Typeface getFont_MEDIUM() {
        return null;
    }
    
    public final void setFont_MEDIUM(@org.jetbrains.annotations.Nullable()
    android.graphics.Typeface p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.Typeface getFont_REG() {
        return null;
    }
    
    public final void setFont_REG(@org.jetbrains.annotations.Nullable()
    android.graphics.Typeface p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.Typeface getBOLD(@org.jetbrains.annotations.NotNull()
    android.content.Context c) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.Typeface getBOLDMIDIUM(@org.jetbrains.annotations.NotNull()
    android.content.Context c) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.Typeface getBOLDNEW(@org.jetbrains.annotations.NotNull()
    android.content.Context c) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.Typeface getLIGHT(@org.jetbrains.annotations.NotNull()
    android.content.Context c) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.Typeface getREG(@org.jetbrains.annotations.NotNull()
    android.content.Context c) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.Typeface getMIDIUM(@org.jetbrains.annotations.NotNull()
    android.content.Context c) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.Typeface getSEMIBOLD(@org.jetbrains.annotations.NotNull()
    android.content.Context c) {
        return null;
    }
    
    public final int logString(@org.jetbrains.annotations.Nullable()
    java.lang.String message) {
        return 0;
    }
    
    public final boolean isEmailValid(@org.jetbrains.annotations.Nullable()
    java.lang.String email) {
        return false;
    }
    
    public final boolean isZipCodeValid(@org.jetbrains.annotations.Nullable()
    java.lang.String zipCode) {
        return false;
    }
    
    public final boolean isEmpty(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence str) {
        return false;
    }
    
    public final boolean isNameValid(@org.jetbrains.annotations.Nullable()
    java.lang.String name) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.RequestBody getRequestBody(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final boolean isValidPassword(@org.jetbrains.annotations.Nullable()
    java.lang.String password) {
        return false;
    }
    
    public final boolean hasInternetConnection(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return false;
    }
    
    public final boolean isPhoneValid(@org.jetbrains.annotations.Nullable()
    java.lang.String phone) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String getText(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView) {
        return null;
    }
    
    public final void showToast(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String message) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void startFromRightToLeft(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void finishFromLeftToRight(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void startFromBottomToUp(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void startFromUpToBottom(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"HardwareIds"})
    public final java.lang.String getDeviceId(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void hideSoftKeyboard(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    public final void showAlertDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String message) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final double roundTwoDecimals(double d) {
        return 0.0;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final boolean isMyServiceRunning(@org.jetbrains.annotations.NotNull()
    java.lang.Class<?> serviceClass, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String capitalize(@org.jetbrains.annotations.NotNull()
    java.lang.String capString) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String timeSlotChange(@org.jetbrains.annotations.NotNull()
    java.lang.String time) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String timeSlotChangeNew(@org.jetbrains.annotations.NotNull()
    java.lang.String time) {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final boolean isConnectedToInternet(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String convertTime(@org.jetbrains.annotations.NotNull()
    java.lang.String time) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date addMonth(@org.jetbrains.annotations.Nullable()
    java.util.Date date, int i) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String dateFormate(@org.jetbrains.annotations.NotNull()
    java.lang.String time) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String dateFormateNew(@org.jetbrains.annotations.NotNull()
    java.lang.String time) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String timeFormate(@org.jetbrains.annotations.NotNull()
    java.lang.String time) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.CharSequence fractionalPartValueFormate(@org.jetbrains.annotations.NotNull()
    java.lang.String distanceInMiles) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String convertUTC2LocalDateTime(@org.jetbrains.annotations.NotNull()
    java.lang.String datetime) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDateFormate(@org.jetbrains.annotations.Nullable()
    java.lang.String date1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {java.text.ParseException.class})
    public final java.lang.String formatToYesterdayOrToday(@org.jetbrains.annotations.Nullable()
    java.lang.String date) throws java.text.ParseException {
        return null;
    }
    
    public final void languageIsRTL(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.view.View view) {
    }
    
    public final void languageSelection(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String lang) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getErrorMessage(@org.jetbrains.annotations.NotNull()
    okhttp3.ResponseBody responseBody) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f\u0012\u0006\u0010\r\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\nH\u00c6\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\fH\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J_\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f2\b\b\u0002\u0010\r\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\'\u001a\u00020\u0007H\u00d6\u0001J\t\u0010(\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006)"}, d2 = {"Lcom/tigwal/utils/AppUtils$TapCurrencyResponse;", "", "live_mode", "", "api_version", "feature_version", "created", "", "id", "from", "Lcom/tigwal/utils/AppUtils$Amount;", "to", "", "by", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/tigwal/utils/AppUtils$Amount;Ljava/util/List;Ljava/lang/String;)V", "getApi_version", "()Ljava/lang/String;", "getBy", "getCreated", "()I", "getFeature_version", "getFrom", "()Lcom/tigwal/utils/AppUtils$Amount;", "getId", "getLive_mode", "getTo", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
    public static final class TapCurrencyResponse {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String live_mode = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String api_version = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String feature_version = null;
        private final int created = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String id = null;
        @org.jetbrains.annotations.NotNull()
        private final com.tigwal.utils.AppUtils.Amount from = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.tigwal.utils.AppUtils.Amount> to = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String by = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.tigwal.utils.AppUtils.TapCurrencyResponse copy(@org.jetbrains.annotations.NotNull()
        java.lang.String live_mode, @org.jetbrains.annotations.NotNull()
        java.lang.String api_version, @org.jetbrains.annotations.NotNull()
        java.lang.String feature_version, int created, @org.jetbrains.annotations.NotNull()
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        com.tigwal.utils.AppUtils.Amount from, @org.jetbrains.annotations.NotNull()
        java.util.List<com.tigwal.utils.AppUtils.Amount> to, @org.jetbrains.annotations.NotNull()
        java.lang.String by) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public TapCurrencyResponse(@org.jetbrains.annotations.NotNull()
        java.lang.String live_mode, @org.jetbrains.annotations.NotNull()
        java.lang.String api_version, @org.jetbrains.annotations.NotNull()
        java.lang.String feature_version, int created, @org.jetbrains.annotations.NotNull()
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        com.tigwal.utils.AppUtils.Amount from, @org.jetbrains.annotations.NotNull()
        java.util.List<com.tigwal.utils.AppUtils.Amount> to, @org.jetbrains.annotations.NotNull()
        java.lang.String by) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLive_mode() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getApi_version() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFeature_version() {
            return null;
        }
        
        public final int component4() {
            return 0;
        }
        
        public final int getCreated() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.tigwal.utils.AppUtils.Amount component6() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.tigwal.utils.AppUtils.Amount getFrom() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.tigwal.utils.AppUtils.Amount> component7() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.tigwal.utils.AppUtils.Amount> getTo() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component8() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getBy() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/tigwal/utils/AppUtils$Amount;", "", "currency", "", "value", "(Ljava/lang/String;Ljava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class Amount {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String currency = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String value = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.tigwal.utils.AppUtils.Amount copy(@org.jetbrains.annotations.NotNull()
        java.lang.String currency, @org.jetbrains.annotations.NotNull()
        java.lang.String value) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Amount(@org.jetbrains.annotations.NotNull()
        java.lang.String currency, @org.jetbrains.annotations.NotNull()
        java.lang.String value) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCurrency() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getValue() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/tigwal/utils/AppUtils$AmountDcc;", "", "currency", "", "dcc_rate", "(Ljava/lang/String;Ljava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "getDcc_rate", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class AmountDcc {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String currency = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String dcc_rate = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.tigwal.utils.AppUtils.AmountDcc copy(@org.jetbrains.annotations.NotNull()
        java.lang.String currency, @org.jetbrains.annotations.NotNull()
        java.lang.String dcc_rate) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public AmountDcc(@org.jetbrains.annotations.NotNull()
        java.lang.String currency, @org.jetbrains.annotations.NotNull()
        java.lang.String dcc_rate) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCurrency() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDcc_rate() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\bH\u00c6\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\bH\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001a"}, d2 = {"Lcom/tigwal/utils/AppUtils$TapCurrencyRequest;", "", "from", "Lcom/tigwal/utils/AppUtils$Amount;", "to", "", "Lcom/tigwal/utils/AppUtils$AmountDcc;", "by", "", "(Lcom/tigwal/utils/AppUtils$Amount;Ljava/util/List;Ljava/lang/String;)V", "getBy", "()Ljava/lang/String;", "getFrom", "()Lcom/tigwal/utils/AppUtils$Amount;", "getTo", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class TapCurrencyRequest {
        @org.jetbrains.annotations.NotNull()
        private final com.tigwal.utils.AppUtils.Amount from = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.tigwal.utils.AppUtils.AmountDcc> to = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String by = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.tigwal.utils.AppUtils.TapCurrencyRequest copy(@org.jetbrains.annotations.NotNull()
        com.tigwal.utils.AppUtils.Amount from, @org.jetbrains.annotations.NotNull()
        java.util.List<com.tigwal.utils.AppUtils.AmountDcc> to, @org.jetbrains.annotations.NotNull()
        java.lang.String by) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public TapCurrencyRequest(@org.jetbrains.annotations.NotNull()
        com.tigwal.utils.AppUtils.Amount from, @org.jetbrains.annotations.NotNull()
        java.util.List<com.tigwal.utils.AppUtils.AmountDcc> to, @org.jetbrains.annotations.NotNull()
        java.lang.String by) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.tigwal.utils.AppUtils.Amount component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.tigwal.utils.AppUtils.Amount getFrom() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.tigwal.utils.AppUtils.AmountDcc> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.tigwal.utils.AppUtils.AmountDcc> getTo() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getBy() {
            return null;
        }
    }
}