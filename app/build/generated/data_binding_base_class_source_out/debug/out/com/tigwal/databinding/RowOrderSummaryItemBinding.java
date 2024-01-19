// Generated by view binder compiler. Do not edit!
package com.tigwal.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import com.tigwal.R;
import com.tigwal.utils.RoundRectCornerImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RowOrderSummaryItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final AppCompatImageView imgStar;

  @NonNull
  public final RoundRectCornerImageView ivOrderImage;

  @NonNull
  public final LinearLayout llChatView;

  @NonNull
  public final LinearLayout llDiscount;

  @NonNull
  public final LinearLayout llRatingView;

  @NonNull
  public final AppCompatTextView txtChat;

  @NonNull
  public final AppCompatTextView txtDiscount;

  @NonNull
  public final AppCompatTextView txtOrderLocation;

  @NonNull
  public final AppCompatTextView txtOrderName;

  @NonNull
  public final AppCompatTextView txtOrderPrice;

  @NonNull
  public final AppCompatTextView txtOrderQuantity;

  @NonNull
  public final AppCompatTextView txtPrice;

  @NonNull
  public final AppCompatTextView txtProductStar;

  @NonNull
  public final AppCompatTextView txtQuantity;

  @NonNull
  public final AppCompatTextView txtRatingTitle;

  @NonNull
  public final AppCompatTextView txtServiceProviderName;

  @NonNull
  public final AppCompatTextView txtTimeSlotFinal;

  @NonNull
  public final AppCompatTextView txtTimeSlotTitle;

  private RowOrderSummaryItemBinding(@NonNull LinearLayout rootView,
      @NonNull AppCompatImageView imgStar, @NonNull RoundRectCornerImageView ivOrderImage,
      @NonNull LinearLayout llChatView, @NonNull LinearLayout llDiscount,
      @NonNull LinearLayout llRatingView, @NonNull AppCompatTextView txtChat,
      @NonNull AppCompatTextView txtDiscount, @NonNull AppCompatTextView txtOrderLocation,
      @NonNull AppCompatTextView txtOrderName, @NonNull AppCompatTextView txtOrderPrice,
      @NonNull AppCompatTextView txtOrderQuantity, @NonNull AppCompatTextView txtPrice,
      @NonNull AppCompatTextView txtProductStar, @NonNull AppCompatTextView txtQuantity,
      @NonNull AppCompatTextView txtRatingTitle, @NonNull AppCompatTextView txtServiceProviderName,
      @NonNull AppCompatTextView txtTimeSlotFinal, @NonNull AppCompatTextView txtTimeSlotTitle) {
    this.rootView = rootView;
    this.imgStar = imgStar;
    this.ivOrderImage = ivOrderImage;
    this.llChatView = llChatView;
    this.llDiscount = llDiscount;
    this.llRatingView = llRatingView;
    this.txtChat = txtChat;
    this.txtDiscount = txtDiscount;
    this.txtOrderLocation = txtOrderLocation;
    this.txtOrderName = txtOrderName;
    this.txtOrderPrice = txtOrderPrice;
    this.txtOrderQuantity = txtOrderQuantity;
    this.txtPrice = txtPrice;
    this.txtProductStar = txtProductStar;
    this.txtQuantity = txtQuantity;
    this.txtRatingTitle = txtRatingTitle;
    this.txtServiceProviderName = txtServiceProviderName;
    this.txtTimeSlotFinal = txtTimeSlotFinal;
    this.txtTimeSlotTitle = txtTimeSlotTitle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RowOrderSummaryItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RowOrderSummaryItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.row_order_summary_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RowOrderSummaryItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imgStar;
      AppCompatImageView imgStar = rootView.findViewById(id);
      if (imgStar == null) {
        break missingId;
      }

      id = R.id.iv_order_image;
      RoundRectCornerImageView ivOrderImage = rootView.findViewById(id);
      if (ivOrderImage == null) {
        break missingId;
      }

      id = R.id.llChatView;
      LinearLayout llChatView = rootView.findViewById(id);
      if (llChatView == null) {
        break missingId;
      }

      id = R.id.llDiscount;
      LinearLayout llDiscount = rootView.findViewById(id);
      if (llDiscount == null) {
        break missingId;
      }

      id = R.id.llRatingView;
      LinearLayout llRatingView = rootView.findViewById(id);
      if (llRatingView == null) {
        break missingId;
      }

      id = R.id.txtChat;
      AppCompatTextView txtChat = rootView.findViewById(id);
      if (txtChat == null) {
        break missingId;
      }

      id = R.id.txtDiscount;
      AppCompatTextView txtDiscount = rootView.findViewById(id);
      if (txtDiscount == null) {
        break missingId;
      }

      id = R.id.txt_order_location;
      AppCompatTextView txtOrderLocation = rootView.findViewById(id);
      if (txtOrderLocation == null) {
        break missingId;
      }

      id = R.id.txt_order_name;
      AppCompatTextView txtOrderName = rootView.findViewById(id);
      if (txtOrderName == null) {
        break missingId;
      }

      id = R.id.txt_order_price;
      AppCompatTextView txtOrderPrice = rootView.findViewById(id);
      if (txtOrderPrice == null) {
        break missingId;
      }

      id = R.id.txt_order_quantity;
      AppCompatTextView txtOrderQuantity = rootView.findViewById(id);
      if (txtOrderQuantity == null) {
        break missingId;
      }

      id = R.id.txtPrice;
      AppCompatTextView txtPrice = rootView.findViewById(id);
      if (txtPrice == null) {
        break missingId;
      }

      id = R.id.txt_productStar;
      AppCompatTextView txtProductStar = rootView.findViewById(id);
      if (txtProductStar == null) {
        break missingId;
      }

      id = R.id.txtQuantity;
      AppCompatTextView txtQuantity = rootView.findViewById(id);
      if (txtQuantity == null) {
        break missingId;
      }

      id = R.id.txtRatingTitle;
      AppCompatTextView txtRatingTitle = rootView.findViewById(id);
      if (txtRatingTitle == null) {
        break missingId;
      }

      id = R.id.txtServiceProviderName;
      AppCompatTextView txtServiceProviderName = rootView.findViewById(id);
      if (txtServiceProviderName == null) {
        break missingId;
      }

      id = R.id.txtTimeSlotFinal;
      AppCompatTextView txtTimeSlotFinal = rootView.findViewById(id);
      if (txtTimeSlotFinal == null) {
        break missingId;
      }

      id = R.id.txtTimeSlotTitle;
      AppCompatTextView txtTimeSlotTitle = rootView.findViewById(id);
      if (txtTimeSlotTitle == null) {
        break missingId;
      }

      return new RowOrderSummaryItemBinding((LinearLayout) rootView, imgStar, ivOrderImage,
          llChatView, llDiscount, llRatingView, txtChat, txtDiscount, txtOrderLocation,
          txtOrderName, txtOrderPrice, txtOrderQuantity, txtPrice, txtProductStar, txtQuantity,
          txtRatingTitle, txtServiceProviderName, txtTimeSlotFinal, txtTimeSlotTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}