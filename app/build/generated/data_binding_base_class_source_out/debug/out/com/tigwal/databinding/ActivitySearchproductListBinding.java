// Generated by data binding compiler. Do not edit!
package com.tigwal.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.tigwal.R;
import com.tigwal.ui.view_model.search_productlist.SearchProductListViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivitySearchproductListBinding extends ViewDataBinding {
  @NonNull
  public final LayoutDataNotFoundBinding layoutNotFound;

  @NonNull
  public final LinearLayout llall;

  @NonNull
  public final RecyclerView recyclerProductList;

  @NonNull
  public final LayoutToolbarBinding toolBar;

  @Bindable
  protected SearchProductListViewModel mViewmodel;

  protected ActivitySearchproductListBinding(Object _bindingComponent, View _root,
      int _localFieldCount, LayoutDataNotFoundBinding layoutNotFound, LinearLayout llall,
      RecyclerView recyclerProductList, LayoutToolbarBinding toolBar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.layoutNotFound = layoutNotFound;
    this.llall = llall;
    this.recyclerProductList = recyclerProductList;
    this.toolBar = toolBar;
  }

  public abstract void setViewmodel(@Nullable SearchProductListViewModel viewmodel);

  @Nullable
  public SearchProductListViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static ActivitySearchproductListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_searchproduct_list, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivitySearchproductListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivitySearchproductListBinding>inflateInternal(inflater, R.layout.activity_searchproduct_list, root, attachToRoot, component);
  }

  @NonNull
  public static ActivitySearchproductListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_searchproduct_list, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivitySearchproductListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivitySearchproductListBinding>inflateInternal(inflater, R.layout.activity_searchproduct_list, null, false, component);
  }

  public static ActivitySearchproductListBinding bind(@NonNull View view) {
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
  public static ActivitySearchproductListBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ActivitySearchproductListBinding)bind(component, view, R.layout.activity_searchproduct_list);
  }
}
