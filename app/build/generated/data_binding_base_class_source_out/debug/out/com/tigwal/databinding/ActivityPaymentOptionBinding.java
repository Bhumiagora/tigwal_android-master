// Generated by data binding compiler. Do not edit!
package com.tigwal.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.tigwal.R;
import com.tigwal.ui.view_model.payment_option.PaymentOptionViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityPaymentOptionBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatButton btnPayNow;

  @NonNull
  public final AppCompatEditText etCouponCode;

  @NonNull
  public final LinearLayout llDiscount;

  @NonNull
  public final LayoutToolbarBinding toolBar;

  @NonNull
  public final AppCompatTextView tvDiscount;

  @NonNull
  public final AppCompatTextView tvNoOfItems;

  @NonNull
  public final AppCompatTextView tvPaymentSummary;

  @NonNull
  public final AppCompatTextView tvPrice;

  @NonNull
  public final AppCompatTextView tvTaxes;

  @NonNull
  public final AppCompatTextView tvTotalPrice;

  @NonNull
  public final AppCompatTextView txtCheck;

  @NonNull
  public final AppCompatTextView txtDiscount;

  @NonNull
  public final AppCompatTextView txtNumberOfItem;

  @NonNull
  public final AppCompatTextView txtPrice;

  @NonNull
  public final AppCompatTextView txtTaxes;

  @NonNull
  public final AppCompatTextView txtTotalPrice;

  @Bindable
  protected PaymentOptionViewModel mViewmodel;

  protected ActivityPaymentOptionBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatButton btnPayNow, AppCompatEditText etCouponCode, LinearLayout llDiscount,
      LayoutToolbarBinding toolBar, AppCompatTextView tvDiscount, AppCompatTextView tvNoOfItems,
      AppCompatTextView tvPaymentSummary, AppCompatTextView tvPrice, AppCompatTextView tvTaxes,
      AppCompatTextView tvTotalPrice, AppCompatTextView txtCheck, AppCompatTextView txtDiscount,
      AppCompatTextView txtNumberOfItem, AppCompatTextView txtPrice, AppCompatTextView txtTaxes,
      AppCompatTextView txtTotalPrice) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnPayNow = btnPayNow;
    this.etCouponCode = etCouponCode;
    this.llDiscount = llDiscount;
    this.toolBar = toolBar;
    this.tvDiscount = tvDiscount;
    this.tvNoOfItems = tvNoOfItems;
    this.tvPaymentSummary = tvPaymentSummary;
    this.tvPrice = tvPrice;
    this.tvTaxes = tvTaxes;
    this.tvTotalPrice = tvTotalPrice;
    this.txtCheck = txtCheck;
    this.txtDiscount = txtDiscount;
    this.txtNumberOfItem = txtNumberOfItem;
    this.txtPrice = txtPrice;
    this.txtTaxes = txtTaxes;
    this.txtTotalPrice = txtTotalPrice;
  }

  public abstract void setViewmodel(@Nullable PaymentOptionViewModel viewmodel);

  @Nullable
  public PaymentOptionViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static ActivityPaymentOptionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_payment_option, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityPaymentOptionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityPaymentOptionBinding>inflateInternal(inflater, R.layout.activity_payment_option, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityPaymentOptionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_payment_option, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityPaymentOptionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityPaymentOptionBinding>inflateInternal(inflater, R.layout.activity_payment_option, null, false, component);
  }

  public static ActivityPaymentOptionBinding bind(@NonNull View view) {
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
  public static ActivityPaymentOptionBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityPaymentOptionBinding)bind(component, view, R.layout.activity_payment_option);
  }
}