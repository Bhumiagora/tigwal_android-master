// Generated by view binder compiler. Do not edit!
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
import androidx.viewbinding.ViewBinding;
import com.tigwal.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RowChangeLanguageListBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final AppCompatImageView cbCheck;

  @NonNull
  public final AppCompatImageView ivLanLogo;

  @NonNull
  public final LinearLayout llLanguageView;

  @NonNull
  public final AppCompatTextView tvLanName;

  private RowChangeLanguageListBinding(@NonNull RelativeLayout rootView,
      @NonNull AppCompatImageView cbCheck, @NonNull AppCompatImageView ivLanLogo,
      @NonNull LinearLayout llLanguageView, @NonNull AppCompatTextView tvLanName) {
    this.rootView = rootView;
    this.cbCheck = cbCheck;
    this.ivLanLogo = ivLanLogo;
    this.llLanguageView = llLanguageView;
    this.tvLanName = tvLanName;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RowChangeLanguageListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RowChangeLanguageListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.row_change_language_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RowChangeLanguageListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cb_check;
      AppCompatImageView cbCheck = rootView.findViewById(id);
      if (cbCheck == null) {
        break missingId;
      }

      id = R.id.iv_lanLogo;
      AppCompatImageView ivLanLogo = rootView.findViewById(id);
      if (ivLanLogo == null) {
        break missingId;
      }

      id = R.id.llLanguageView;
      LinearLayout llLanguageView = rootView.findViewById(id);
      if (llLanguageView == null) {
        break missingId;
      }

      id = R.id.tv_LanName;
      AppCompatTextView tvLanName = rootView.findViewById(id);
      if (tvLanName == null) {
        break missingId;
      }

      return new RowChangeLanguageListBinding((RelativeLayout) rootView, cbCheck, ivLanLogo,
          llLanguageView, tvLanName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
