package com.tigwal.ui.fragment;

import java.lang.System;

@android.annotation.SuppressLint(value = {"UseRequireInsteadOfGet"})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 >2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001>B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*J\b\u0010+\u001a\u00020$H\u0016J\b\u0010,\u001a\u00020$H\u0002J\b\u0010-\u001a\u00020$H\u0016J\u0006\u0010.\u001a\u00020$J\u0006\u0010/\u001a\u00020$J\u0006\u00100\u001a\u00020$J\u0012\u00101\u001a\u00020$2\b\u00102\u001a\u0004\u0018\u000103H\u0016J&\u00104\u001a\u0004\u0018\u0001032\u0006\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u0001082\b\u00109\u001a\u0004\u0018\u00010:H\u0017J\b\u0010;\u001a\u00020$H\u0016J\b\u0010<\u001a\u00020$H\u0002J\b\u0010=\u001a\u00020$H\u0002R.\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0017\u001a\u00020\u00188VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"\u00a8\u0006?"}, d2 = {"Lcom/tigwal/ui/fragment/SettingFragment;", "Lcom/tigwal/base/BaseFragment;", "Lorg/kodein/di/KodeinAware;", "Landroid/view/View$OnClickListener;", "()V", "arrayList", "Ljava/util/ArrayList;", "Lcom/tigwal/data/model/language/LanguageListModel;", "Lkotlin/collections/ArrayList;", "getArrayList", "()Ljava/util/ArrayList;", "setArrayList", "(Ljava/util/ArrayList;)V", "binding", "Lcom/tigwal/databinding/FragmentSettingBinding;", "dashboardViewModel", "Lcom/tigwal/ui/view_model/setting/SettingViewModel;", "factory", "Lcom/tigwal/ui/factory/SettingViewFactory;", "getFactory", "()Lcom/tigwal/ui/factory/SettingViewFactory;", "factory$delegate", "Lkotlin/Lazy;", "kodein", "Lorg/kodein/di/Kodein;", "getKodein", "()Lorg/kodein/di/Kodein;", "kodein$delegate", "languagePreferences", "Lcom/tigwal/utils/LanguagePreferences;", "lun", "getLun", "()Lcom/tigwal/data/model/language/LanguageListModel;", "setLun", "(Lcom/tigwal/data/model/language/LanguageListModel;)V", "activeItem", "", "relativeLayout", "Landroid/widget/RelativeLayout;", "textView", "Landroidx/appcompat/widget/AppCompatTextView;", "imageView", "Landroidx/appcompat/widget/AppCompatImageView;", "clickListener", "dialogeLogoutApp", "getIntentData", "inactiveItem", "logoutApi", "logoutClear", "onClick", "v", "Landroid/view/View;", "onCreateFragmentView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "setFontTypeface", "setupObservers", "setupViewModel", "Companion", "app_debug"})
public final class SettingFragment extends com.tigwal.base.BaseFragment implements org.kodein.di.KodeinAware, android.view.View.OnClickListener {
    private final kotlin.Lazy factory$delegate = null;
    private com.tigwal.ui.view_model.setting.SettingViewModel dashboardViewModel;
    private com.tigwal.databinding.FragmentSettingBinding binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy kodein$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<com.tigwal.data.model.language.LanguageListModel> arrayList;
    @org.jetbrains.annotations.Nullable()
    private com.tigwal.data.model.language.LanguageListModel lun;
    private com.tigwal.utils.LanguagePreferences languagePreferences;
    @org.jetbrains.annotations.NotNull()
    public static final com.tigwal.ui.fragment.SettingFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public SettingFragment() {
        super();
    }
    
    private final com.tigwal.ui.factory.SettingViewFactory getFactory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.kodein.di.Kodein getKodein() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.tigwal.data.model.language.LanguageListModel> getArrayList() {
        return null;
    }
    
    public final void setArrayList(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.tigwal.data.model.language.LanguageListModel> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tigwal.data.model.language.LanguageListModel getLun() {
        return null;
    }
    
    public final void setLun(@org.jetbrains.annotations.Nullable()
    com.tigwal.data.model.language.LanguageListModel p0) {
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
    
    @org.jetbrains.annotations.Nullable()
    @android.annotation.SuppressLint(value = {"Range"})
    @java.lang.Override()
    public android.view.View onCreateFragmentView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    public final void activeItem(@org.jetbrains.annotations.NotNull()
    android.widget.RelativeLayout relativeLayout, @org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatTextView textView, @org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatImageView imageView) {
    }
    
    public final void inactiveItem() {
    }
    
    private final void setupViewModel() {
    }
    
    private final void setupObservers() {
    }
    
    public final void logoutClear() {
    }
    
    private final void dialogeLogoutApp() {
    }
    
    public final void logoutApi() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.kodein.di.KodeinContext<?> getKodeinContext() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public org.kodein.di.KodeinTrigger getKodeinTrigger() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tigwal/ui/fragment/SettingFragment$Companion;", "", "()V", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}