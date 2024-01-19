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
import com.tigwal.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RowDashboardCategoryListBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final CardView cardViewCategoryGrid;

  @NonNull
  public final AppCompatImageView imgCategory;

  @NonNull
  public final AppCompatTextView txtCategoryName;

  private RowDashboardCategoryListBinding(@NonNull RelativeLayout rootView,
      @NonNull CardView cardViewCategoryGrid, @NonNull AppCompatImageView imgCategory,
      @NonNull AppCompatTextView txtCategoryName) {
    this.rootView = rootView;
    this.cardViewCategoryGrid = cardViewCategoryGrid;
    this.imgCategory = imgCategory;
    this.txtCategoryName = txtCategoryName;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RowDashboardCategoryListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RowDashboardCategoryListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.row_dashboard_category_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RowDashboardCategoryListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cardViewCategoryGrid;
      CardView cardViewCategoryGrid = rootView.findViewById(id);
      if (cardViewCategoryGrid == null) {
        break missingId;
      }

      id = R.id.imgCategory;
      AppCompatImageView imgCategory = rootView.findViewById(id);
      if (imgCategory == null) {
        break missingId;
      }

      id = R.id.txtCategoryName;
      AppCompatTextView txtCategoryName = rootView.findViewById(id);
      if (txtCategoryName == null) {
        break missingId;
      }

      return new RowDashboardCategoryListBinding((RelativeLayout) rootView, cardViewCategoryGrid,
          imgCategory, txtCategoryName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}