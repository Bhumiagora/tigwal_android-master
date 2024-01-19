// Generated by view binder compiler. Do not edit!
package com.tigwal.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager.widget.ViewPager;
import com.tigwal.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LayoutViewpagerBgBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final AppCompatImageView imgLeft;

  @NonNull
  public final AppCompatImageView imgRight;

  @NonNull
  public final CardView llSearchView;

  @NonNull
  public final ViewPager pager;

  @NonNull
  public final RelativeLayout rlBannerView;

  @NonNull
  public final AppCompatTextView txtRateCount;

  private LayoutViewpagerBgBinding(@NonNull CardView rootView, @NonNull AppCompatImageView imgLeft,
      @NonNull AppCompatImageView imgRight, @NonNull CardView llSearchView,
      @NonNull ViewPager pager, @NonNull RelativeLayout rlBannerView,
      @NonNull AppCompatTextView txtRateCount) {
    this.rootView = rootView;
    this.imgLeft = imgLeft;
    this.imgRight = imgRight;
    this.llSearchView = llSearchView;
    this.pager = pager;
    this.rlBannerView = rlBannerView;
    this.txtRateCount = txtRateCount;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutViewpagerBgBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutViewpagerBgBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_viewpager_bg, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutViewpagerBgBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imgLeft;
      AppCompatImageView imgLeft = rootView.findViewById(id);
      if (imgLeft == null) {
        break missingId;
      }

      id = R.id.imgRight;
      AppCompatImageView imgRight = rootView.findViewById(id);
      if (imgRight == null) {
        break missingId;
      }

      CardView llSearchView = (CardView) rootView;

      id = R.id.pager;
      ViewPager pager = rootView.findViewById(id);
      if (pager == null) {
        break missingId;
      }

      id = R.id.rlBannerView;
      RelativeLayout rlBannerView = rootView.findViewById(id);
      if (rlBannerView == null) {
        break missingId;
      }

      id = R.id.txtRateCount;
      AppCompatTextView txtRateCount = rootView.findViewById(id);
      if (txtRateCount == null) {
        break missingId;
      }

      return new LayoutViewpagerBgBinding((CardView) rootView, imgLeft, imgRight, llSearchView,
          pager, rlBannerView, txtRateCount);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
