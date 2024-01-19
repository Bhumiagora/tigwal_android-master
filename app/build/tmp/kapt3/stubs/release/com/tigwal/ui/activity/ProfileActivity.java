package com.tigwal.ui.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\f\u0018\u0000 e2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001eB\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010F\u001a\u00020GH\u0017J\u0006\u0010H\u001a\u00020GJ\b\u0010I\u001a\u00020GH\u0002J\b\u0010J\u001a\u00020GH\u0016J\"\u0010K\u001a\u00020G2\u0006\u0010L\u001a\u00020\u00062\u0006\u0010M\u001a\u00020\u00062\b\u0010N\u001a\u0004\u0018\u00010OH\u0014J\u0012\u0010P\u001a\u00020G2\b\u0010Q\u001a\u0004\u0018\u00010RH\u0016J\u0012\u0010S\u001a\u00020G2\b\u0010T\u001a\u0004\u0018\u00010UH\u0014J-\u0010V\u001a\u00020G2\u0006\u0010L\u001a\u00020\u00062\u000e\u0010W\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0X2\u0006\u0010Y\u001a\u00020ZH\u0017\u00a2\u0006\u0002\u0010[J\b\u0010\\\u001a\u00020GH\u0002J\b\u0010]\u001a\u00020GH\u0002J\b\u0010^\u001a\u00020GH\u0002J\u0012\u0010_\u001a\u00020G2\b\u0010`\u001a\u0004\u0018\u00010RH\u0002J\b\u0010a\u001a\u00020GH\u0002J\b\u0010b\u001a\u00020GH\u0016J\b\u0010c\u001a\u00020GH\u0002J\b\u0010d\u001a\u00020GH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001b\u0010%\u001a\u00020&8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b)\u0010\u0013\u001a\u0004\b\'\u0010(R\u0010\u0010*\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010+\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001c\"\u0004\b-\u0010\u001eR\u001a\u0010.\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001c\"\u0004\b0\u0010\u001eR\u001a\u00101\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001c\"\u0004\b3\u0010\u001eR\u001a\u00104\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u001c\"\u0004\b6\u0010\u001eR\u001a\u00107\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u001c\"\u0004\b9\u0010\u001eR\u001a\u0010:\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u001c\"\u0004\b<\u0010\u001eR\u001a\u0010=\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u001c\"\u0004\b?\u0010\u001eR\u001a\u0010@\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u001c\"\u0004\bB\u0010\u001eR\u000e\u0010C\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020EX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006f"}, d2 = {"Lcom/tigwal/ui/activity/ProfileActivity;", "Lcom/tigwal/base/BaseActivity;", "Lorg/kodein/di/KodeinAware;", "Landroid/view/View$OnClickListener;", "()V", "PLACE_PICKER_REQUEST_CODE", "", "binding", "Lcom/tigwal/databinding/ActivityProfileBinding;", "calendar", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "expiryselectedDate", "", "factory", "Lcom/tigwal/ui/factory/ProfileViewFactory;", "getFactory", "()Lcom/tigwal/ui/factory/ProfileViewFactory;", "factory$delegate", "Lkotlin/Lazy;", "file_upload", "Ljava/io/File;", "getFile_upload", "()Ljava/io/File;", "setFile_upload", "(Ljava/io/File;)V", "filename", "getFilename", "()Ljava/lang/String;", "setFilename", "(Ljava/lang/String;)V", "imageUri", "Landroid/net/Uri;", "getImageUri", "()Landroid/net/Uri;", "setImageUri", "(Landroid/net/Uri;)V", "kodein", "Lorg/kodein/di/Kodein;", "getKodein", "()Lorg/kodein/di/Kodein;", "kodein$delegate", "picturePath", "selectedGender", "getSelectedGender", "setSelectedGender", "strAddress", "getStrAddress", "setStrAddress", "strBookingDate", "getStrBookingDate", "setStrBookingDate", "strCountryCode", "getStrCountryCode", "setStrCountryCode", "str_latitude", "getStr_latitude", "setStr_latitude", "str_longitude", "getStr_longitude", "setStr_longitude", "strcountryShortName", "getStrcountryShortName", "setStrcountryShortName", "strselectedCountry", "getStrselectedCountry", "setStrselectedCountry", "userChoosenTask", "viewModel", "Lcom/tigwal/ui/view_model/profile/ProfileViewModel;", "clickListener", "", "datePickerDialogFinal", "dialogeDeleteUserApp", "getIntentData", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onClick", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "openCamera", "pickImage", "placePicker", "popupView", "view", "selectImage", "setFontTypeface", "setupObservers", "setupViewModel", "Companion", "app_release"})
public final class ProfileActivity extends com.tigwal.base.BaseActivity implements org.kodein.di.KodeinAware, android.view.View.OnClickListener {
    private com.tigwal.databinding.ActivityProfileBinding binding;
    private com.tigwal.ui.view_model.profile.ProfileViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy kodein$delegate = null;
    private final kotlin.Lazy factory$delegate = null;
    private java.lang.String userChoosenTask = " ";
    private java.lang.String picturePath = "";
    @org.jetbrains.annotations.Nullable()
    private java.io.File file_upload;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String filename = "";
    @org.jetbrains.annotations.Nullable()
    private android.net.Uri imageUri;
    private final int PLACE_PICKER_REQUEST_CODE = 159;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String str_latitude = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String str_longitude = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String strAddress = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String strCountryCode = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String strcountryShortName = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String strBookingDate = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String selectedGender = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String strselectedCountry = "";
    @org.jetbrains.annotations.NotNull()
    public static final com.tigwal.ui.activity.ProfileActivity.Companion Companion = null;
    public static final int PICK_IMAGE_REQUEST_CODE = 1000;
    public static final int READ_EXTERNAL_STORAGE_REQUEST_CODE = 1001;
    private static final int PERMISSION_CODE = 1000;
    private static final int PICK_CAMERA_REQUEST = 1001;
    private java.lang.String expiryselectedDate = "";
    private java.util.Calendar calendar;
    private java.util.HashMap _$_findViewCache;
    
    public ProfileActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.kodein.di.Kodein getKodein() {
        return null;
    }
    
    private final com.tigwal.ui.factory.ProfileViewFactory getFactory() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.io.File getFile_upload() {
        return null;
    }
    
    public final void setFile_upload(@org.jetbrains.annotations.Nullable()
    java.io.File p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFilename() {
        return null;
    }
    
    public final void setFilename(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.net.Uri getImageUri() {
        return null;
    }
    
    public final void setImageUri(@org.jetbrains.annotations.Nullable()
    android.net.Uri p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStr_latitude() {
        return null;
    }
    
    public final void setStr_latitude(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStr_longitude() {
        return null;
    }
    
    public final void setStr_longitude(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrAddress() {
        return null;
    }
    
    public final void setStrAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrCountryCode() {
        return null;
    }
    
    public final void setStrCountryCode(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrcountryShortName() {
        return null;
    }
    
    public final void setStrcountryShortName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrBookingDate() {
        return null;
    }
    
    public final void setStrBookingDate(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSelectedGender() {
        return null;
    }
    
    public final void setSelectedGender(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrselectedCountry() {
        return null;
    }
    
    public final void setStrselectedCountry(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
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
    
    public final void datePickerDialogFinal() {
    }
    
    private final void setupViewModel() {
    }
    
    private final void setupObservers() {
    }
    
    private final void selectImage() {
    }
    
    private final void openCamera() {
    }
    
    @android.annotation.SuppressLint(value = {"MissingSuperCall"})
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    private final void pickImage() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void placePicker() {
    }
    
    private final void popupView(android.view.View view) {
    }
    
    private final void dialogeDeleteUserApp() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.kodein.di.KodeinContext<?> getKodeinContext() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public org.kodein.di.KodeinTrigger getKodeinTrigger() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/tigwal/ui/activity/ProfileActivity$Companion;", "", "()V", "PERMISSION_CODE", "", "PICK_CAMERA_REQUEST", "PICK_IMAGE_REQUEST_CODE", "READ_EXTERNAL_STORAGE_REQUEST_CODE", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}