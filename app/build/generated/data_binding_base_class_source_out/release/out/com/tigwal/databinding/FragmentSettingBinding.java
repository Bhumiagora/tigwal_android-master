// Generated by data binding compiler. Do not edit!
package com.tigwal.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.tigwal.R;
import com.tigwal.ui.view_model.setting.SettingViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentSettingBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatImageView ivChangeLang;

  @NonNull
  public final AppCompatImageView ivChangePassword;

  @NonNull
  public final AppCompatImageView ivFaq;

  @NonNull
  public final AppCompatImageView ivHelp;

  @NonNull
  public final AppCompatImageView ivLegal;

  @NonNull
  public final AppCompatImageView ivLogout;

  @NonNull
  public final AppCompatImageView ivPrivacyPolicy;

  @NonNull
  public final AppCompatImageView ivProfile;

  @NonNull
  public final AppCompatImageView ivShareApp;

  @NonNull
  public final AppCompatImageView ivSignin;

  @NonNull
  public final AppCompatImageView ivSupportChat;

  @NonNull
  public final LinearLayout llAll;

  @NonNull
  public final RelativeLayout rlChangeLanguage;

  @NonNull
  public final RelativeLayout rlChangePassword;

  @NonNull
  public final RelativeLayout rlFaq;

  @NonNull
  public final RelativeLayout rlHelp;

  @NonNull
  public final RelativeLayout rlLegal;

  @NonNull
  public final RelativeLayout rlLogout;

  @NonNull
  public final RelativeLayout rlPrivacyPolicy;

  @NonNull
  public final RelativeLayout rlProfile;

  @NonNull
  public final RelativeLayout rlSetting;

  @NonNull
  public final RelativeLayout rlShareApp;

  @NonNull
  public final RelativeLayout rlSignin;

  @NonNull
  public final RelativeLayout rlSupportChat;

  @NonNull
  public final LayoutToolbarBinding toolBar;

  @NonNull
  public final AppCompatTextView tvProfile;

  @NonNull
  public final AppCompatTextView tvSignin;

  @NonNull
  public final AppCompatTextView txtChangeLang;

  @NonNull
  public final AppCompatTextView txtChangePassword;

  @NonNull
  public final AppCompatTextView txtFaq;

  @NonNull
  public final AppCompatTextView txtHelp;

  @NonNull
  public final AppCompatTextView txtLegal;

  @NonNull
  public final AppCompatTextView txtLogout;

  @NonNull
  public final AppCompatTextView txtPrivacyPolicy;

  @NonNull
  public final AppCompatTextView txtShareApp;

  @NonNull
  public final AppCompatTextView txtSupportChat;

  @Bindable
  protected SettingViewModel mViewmodel;

  protected FragmentSettingBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatImageView ivChangeLang, AppCompatImageView ivChangePassword,
      AppCompatImageView ivFaq, AppCompatImageView ivHelp, AppCompatImageView ivLegal,
      AppCompatImageView ivLogout, AppCompatImageView ivPrivacyPolicy, AppCompatImageView ivProfile,
      AppCompatImageView ivShareApp, AppCompatImageView ivSignin, AppCompatImageView ivSupportChat,
      LinearLayout llAll, RelativeLayout rlChangeLanguage, RelativeLayout rlChangePassword,
      RelativeLayout rlFaq, RelativeLayout rlHelp, RelativeLayout rlLegal, RelativeLayout rlLogout,
      RelativeLayout rlPrivacyPolicy, RelativeLayout rlProfile, RelativeLayout rlSetting,
      RelativeLayout rlShareApp, RelativeLayout rlSignin, RelativeLayout rlSupportChat,
      LayoutToolbarBinding toolBar, AppCompatTextView tvProfile, AppCompatTextView tvSignin,
      AppCompatTextView txtChangeLang, AppCompatTextView txtChangePassword,
      AppCompatTextView txtFaq, AppCompatTextView txtHelp, AppCompatTextView txtLegal,
      AppCompatTextView txtLogout, AppCompatTextView txtPrivacyPolicy,
      AppCompatTextView txtShareApp, AppCompatTextView txtSupportChat) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ivChangeLang = ivChangeLang;
    this.ivChangePassword = ivChangePassword;
    this.ivFaq = ivFaq;
    this.ivHelp = ivHelp;
    this.ivLegal = ivLegal;
    this.ivLogout = ivLogout;
    this.ivPrivacyPolicy = ivPrivacyPolicy;
    this.ivProfile = ivProfile;
    this.ivShareApp = ivShareApp;
    this.ivSignin = ivSignin;
    this.ivSupportChat = ivSupportChat;
    this.llAll = llAll;
    this.rlChangeLanguage = rlChangeLanguage;
    this.rlChangePassword = rlChangePassword;
    this.rlFaq = rlFaq;
    this.rlHelp = rlHelp;
    this.rlLegal = rlLegal;
    this.rlLogout = rlLogout;
    this.rlPrivacyPolicy = rlPrivacyPolicy;
    this.rlProfile = rlProfile;
    this.rlSetting = rlSetting;
    this.rlShareApp = rlShareApp;
    this.rlSignin = rlSignin;
    this.rlSupportChat = rlSupportChat;
    this.toolBar = toolBar;
    this.tvProfile = tvProfile;
    this.tvSignin = tvSignin;
    this.txtChangeLang = txtChangeLang;
    this.txtChangePassword = txtChangePassword;
    this.txtFaq = txtFaq;
    this.txtHelp = txtHelp;
    this.txtLegal = txtLegal;
    this.txtLogout = txtLogout;
    this.txtPrivacyPolicy = txtPrivacyPolicy;
    this.txtShareApp = txtShareApp;
    this.txtSupportChat = txtSupportChat;
  }

  public abstract void setViewmodel(@Nullable SettingViewModel viewmodel);

  @Nullable
  public SettingViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static FragmentSettingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_setting, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSettingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentSettingBinding>inflateInternal(inflater, R.layout.fragment_setting, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentSettingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_setting, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSettingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentSettingBinding>inflateInternal(inflater, R.layout.fragment_setting, null, false, component);
  }

  public static FragmentSettingBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentSettingBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentSettingBinding)bind(component, view, R.layout.fragment_setting);
  }
}
