// Generated by view binder compiler. Do not edit!
package com.tigwal.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import com.tigwal.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LayoutSigninBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final AppCompatButton btnLogin;

  @NonNull
  public final AppCompatEditText etEmail;

  @NonNull
  public final AppCompatEditText etPassword;

  @NonNull
  public final AppCompatImageView imgSigninPassword;

  @NonNull
  public final AppCompatImageView ivFacebook;

  @NonNull
  public final AppCompatImageView ivGoogle;

  @NonNull
  public final AppCompatImageView ivMail;

  @NonNull
  public final AppCompatImageView ivPassword;

  @NonNull
  public final LinearLayout llFb;

  @NonNull
  public final LinearLayout llGoogle;

  @NonNull
  public final LinearLayout llSignIn;

  @NonNull
  public final LinearLayout llemail;

  @NonNull
  public final AppCompatTextView txtForgtPassword;

  @NonNull
  public final AppCompatTextView txtLoginWith;

  @NonNull
  public final AppCompatTextView txtSkip;

  private LayoutSigninBinding(@NonNull LinearLayout rootView, @NonNull AppCompatButton btnLogin,
      @NonNull AppCompatEditText etEmail, @NonNull AppCompatEditText etPassword,
      @NonNull AppCompatImageView imgSigninPassword, @NonNull AppCompatImageView ivFacebook,
      @NonNull AppCompatImageView ivGoogle, @NonNull AppCompatImageView ivMail,
      @NonNull AppCompatImageView ivPassword, @NonNull LinearLayout llFb,
      @NonNull LinearLayout llGoogle, @NonNull LinearLayout llSignIn, @NonNull LinearLayout llemail,
      @NonNull AppCompatTextView txtForgtPassword, @NonNull AppCompatTextView txtLoginWith,
      @NonNull AppCompatTextView txtSkip) {
    this.rootView = rootView;
    this.btnLogin = btnLogin;
    this.etEmail = etEmail;
    this.etPassword = etPassword;
    this.imgSigninPassword = imgSigninPassword;
    this.ivFacebook = ivFacebook;
    this.ivGoogle = ivGoogle;
    this.ivMail = ivMail;
    this.ivPassword = ivPassword;
    this.llFb = llFb;
    this.llGoogle = llGoogle;
    this.llSignIn = llSignIn;
    this.llemail = llemail;
    this.txtForgtPassword = txtForgtPassword;
    this.txtLoginWith = txtLoginWith;
    this.txtSkip = txtSkip;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutSigninBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutSigninBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_signin, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutSigninBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_login;
      AppCompatButton btnLogin = rootView.findViewById(id);
      if (btnLogin == null) {
        break missingId;
      }

      id = R.id.et_email;
      AppCompatEditText etEmail = rootView.findViewById(id);
      if (etEmail == null) {
        break missingId;
      }

      id = R.id.et_password;
      AppCompatEditText etPassword = rootView.findViewById(id);
      if (etPassword == null) {
        break missingId;
      }

      id = R.id.imgSigninPassword;
      AppCompatImageView imgSigninPassword = rootView.findViewById(id);
      if (imgSigninPassword == null) {
        break missingId;
      }

      id = R.id.iv_facebook;
      AppCompatImageView ivFacebook = rootView.findViewById(id);
      if (ivFacebook == null) {
        break missingId;
      }

      id = R.id.iv_google;
      AppCompatImageView ivGoogle = rootView.findViewById(id);
      if (ivGoogle == null) {
        break missingId;
      }

      id = R.id.iv_mail;
      AppCompatImageView ivMail = rootView.findViewById(id);
      if (ivMail == null) {
        break missingId;
      }

      id = R.id.iv_password;
      AppCompatImageView ivPassword = rootView.findViewById(id);
      if (ivPassword == null) {
        break missingId;
      }

      id = R.id.llFb;
      LinearLayout llFb = rootView.findViewById(id);
      if (llFb == null) {
        break missingId;
      }

      id = R.id.llGoogle;
      LinearLayout llGoogle = rootView.findViewById(id);
      if (llGoogle == null) {
        break missingId;
      }

      LinearLayout llSignIn = (LinearLayout) rootView;

      id = R.id.llemail;
      LinearLayout llemail = rootView.findViewById(id);
      if (llemail == null) {
        break missingId;
      }

      id = R.id.txt_forgtPassword;
      AppCompatTextView txtForgtPassword = rootView.findViewById(id);
      if (txtForgtPassword == null) {
        break missingId;
      }

      id = R.id.txtLoginWith;
      AppCompatTextView txtLoginWith = rootView.findViewById(id);
      if (txtLoginWith == null) {
        break missingId;
      }

      id = R.id.txtSkip;
      AppCompatTextView txtSkip = rootView.findViewById(id);
      if (txtSkip == null) {
        break missingId;
      }

      return new LayoutSigninBinding((LinearLayout) rootView, btnLogin, etEmail, etPassword,
          imgSigninPassword, ivFacebook, ivGoogle, ivMail, ivPassword, llFb, llGoogle, llSignIn,
          llemail, txtForgtPassword, txtLoginWith, txtSkip);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}