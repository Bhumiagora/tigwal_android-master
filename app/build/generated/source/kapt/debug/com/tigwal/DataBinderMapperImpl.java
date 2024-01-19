package com.tigwal;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.tigwal.databinding.ActivityCancelOrderBindingImpl;
import com.tigwal.databinding.ActivityChangePasswordBindingImpl;
import com.tigwal.databinding.ActivityChatListBindingImpl;
import com.tigwal.databinding.ActivityCmsScreenBindingImpl;
import com.tigwal.databinding.ActivityDashboardBindingImpl;
import com.tigwal.databinding.ActivityForgotPasswordBindingImpl;
import com.tigwal.databinding.ActivityLanguageBindingImpl;
import com.tigwal.databinding.ActivityLoginBindingImpl;
import com.tigwal.databinding.ActivityOrderReceiveBindingImpl;
import com.tigwal.databinding.ActivityOrderSummaryBindingImpl;
import com.tigwal.databinding.ActivityPaymentOptionBindingImpl;
import com.tigwal.databinding.ActivityProductDetailBindingImpl;
import com.tigwal.databinding.ActivityProductListBindingImpl;
import com.tigwal.databinding.ActivityProfileBindingImpl;
import com.tigwal.databinding.ActivityResetPasswordBindingImpl;
import com.tigwal.databinding.ActivitySearchproductListBindingImpl;
import com.tigwal.databinding.ActivitySplashBindingImpl;
import com.tigwal.databinding.ActivitySubCategoryBindingImpl;
import com.tigwal.databinding.ActivitySupportChatBindingImpl;
import com.tigwal.databinding.ActivityVerifyOtpBindingImpl;
import com.tigwal.databinding.ActivityViewAllCategoryBindingImpl;
import com.tigwal.databinding.FragmentCartBindingImpl;
import com.tigwal.databinding.FragmentDashboardBindingImpl;
import com.tigwal.databinding.FragmentNotificationBindingImpl;
import com.tigwal.databinding.FragmentOnGoingOrderBindingImpl;
import com.tigwal.databinding.FragmentSettingBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYCANCELORDER = 1;

  private static final int LAYOUT_ACTIVITYCHANGEPASSWORD = 2;

  private static final int LAYOUT_ACTIVITYCHATLIST = 3;

  private static final int LAYOUT_ACTIVITYCMSSCREEN = 4;

  private static final int LAYOUT_ACTIVITYDASHBOARD = 5;

  private static final int LAYOUT_ACTIVITYFORGOTPASSWORD = 6;

  private static final int LAYOUT_ACTIVITYLANGUAGE = 7;

  private static final int LAYOUT_ACTIVITYLOGIN = 8;

  private static final int LAYOUT_ACTIVITYORDERRECEIVE = 9;

  private static final int LAYOUT_ACTIVITYORDERSUMMARY = 10;

  private static final int LAYOUT_ACTIVITYPAYMENTOPTION = 11;

  private static final int LAYOUT_ACTIVITYPRODUCTDETAIL = 12;

  private static final int LAYOUT_ACTIVITYPRODUCTLIST = 13;

  private static final int LAYOUT_ACTIVITYPROFILE = 14;

  private static final int LAYOUT_ACTIVITYRESETPASSWORD = 15;

  private static final int LAYOUT_ACTIVITYSEARCHPRODUCTLIST = 16;

  private static final int LAYOUT_ACTIVITYSPLASH = 17;

  private static final int LAYOUT_ACTIVITYSUBCATEGORY = 18;

  private static final int LAYOUT_ACTIVITYSUPPORTCHAT = 19;

  private static final int LAYOUT_ACTIVITYVERIFYOTP = 20;

  private static final int LAYOUT_ACTIVITYVIEWALLCATEGORY = 21;

  private static final int LAYOUT_FRAGMENTCART = 22;

  private static final int LAYOUT_FRAGMENTDASHBOARD = 23;

  private static final int LAYOUT_FRAGMENTNOTIFICATION = 24;

  private static final int LAYOUT_FRAGMENTONGOINGORDER = 25;

  private static final int LAYOUT_FRAGMENTSETTING = 26;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(26);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.tigwal.R.layout.activity_cancel_order, LAYOUT_ACTIVITYCANCELORDER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.tigwal.R.layout.activity_change_password, LAYOUT_ACTIVITYCHANGEPASSWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.tigwal.R.layout.activity_chat_list, LAYOUT_ACTIVITYCHATLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.tigwal.R.layout.activity_cms_screen, LAYOUT_ACTIVITYCMSSCREEN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.tigwal.R.layout.activity_dashboard, LAYOUT_ACTIVITYDASHBOARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.tigwal.R.layout.activity_forgot_password, LAYOUT_ACTIVITYFORGOTPASSWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.tigwal.R.layout.activity_language, LAYOUT_ACTIVITYLANGUAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.tigwal.R.layout.activity_login, LAYOUT_ACTIVITYLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.tigwal.R.layout.activity_order_receive, LAYOUT_ACTIVITYORDERRECEIVE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.tigwal.R.layout.activity_order_summary, LAYOUT_ACTIVITYORDERSUMMARY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.tigwal.R.layout.activity_payment_option, LAYOUT_ACTIVITYPAYMENTOPTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.tigwal.R.layout.activity_product_detail, LAYOUT_ACTIVITYPRODUCTDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.tigwal.R.layout.activity_product_list, LAYOUT_ACTIVITYPRODUCTLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.tigwal.R.layout.activity_profile, LAYOUT_ACTIVITYPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.tigwal.R.layout.activity_reset_password, LAYOUT_ACTIVITYRESETPASSWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.tigwal.R.layout.activity_searchproduct_list, LAYOUT_ACTIVITYSEARCHPRODUCTLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.tigwal.R.layout.activity_splash, LAYOUT_ACTIVITYSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.tigwal.R.layout.activity_sub_category, LAYOUT_ACTIVITYSUBCATEGORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.tigwal.R.layout.activity_support_chat, LAYOUT_ACTIVITYSUPPORTCHAT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.tigwal.R.layout.activity_verify_otp, LAYOUT_ACTIVITYVERIFYOTP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.tigwal.R.layout.activity_view_all_category, LAYOUT_ACTIVITYVIEWALLCATEGORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.tigwal.R.layout.fragment_cart, LAYOUT_FRAGMENTCART);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.tigwal.R.layout.fragment_dashboard, LAYOUT_FRAGMENTDASHBOARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.tigwal.R.layout.fragment_notification, LAYOUT_FRAGMENTNOTIFICATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.tigwal.R.layout.fragment_on_going_order, LAYOUT_FRAGMENTONGOINGORDER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.tigwal.R.layout.fragment_setting, LAYOUT_FRAGMENTSETTING);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYCANCELORDER: {
          if ("layout/activity_cancel_order_0".equals(tag)) {
            return new ActivityCancelOrderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_cancel_order is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYCHANGEPASSWORD: {
          if ("layout/activity_change_password_0".equals(tag)) {
            return new ActivityChangePasswordBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_change_password is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYCHATLIST: {
          if ("layout/activity_chat_list_0".equals(tag)) {
            return new ActivityChatListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_chat_list is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYCMSSCREEN: {
          if ("layout/activity_cms_screen_0".equals(tag)) {
            return new ActivityCmsScreenBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_cms_screen is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYDASHBOARD: {
          if ("layout/activity_dashboard_0".equals(tag)) {
            return new ActivityDashboardBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_dashboard is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYFORGOTPASSWORD: {
          if ("layout/activity_forgot_password_0".equals(tag)) {
            return new ActivityForgotPasswordBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_forgot_password is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLANGUAGE: {
          if ("layout/activity_language_0".equals(tag)) {
            return new ActivityLanguageBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_language is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLOGIN: {
          if ("layout/activity_login_0".equals(tag)) {
            return new ActivityLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_login is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYORDERRECEIVE: {
          if ("layout/activity_order_receive_0".equals(tag)) {
            return new ActivityOrderReceiveBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_order_receive is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYORDERSUMMARY: {
          if ("layout/activity_order_summary_0".equals(tag)) {
            return new ActivityOrderSummaryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_order_summary is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYPAYMENTOPTION: {
          if ("layout/activity_payment_option_0".equals(tag)) {
            return new ActivityPaymentOptionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_payment_option is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYPRODUCTDETAIL: {
          if ("layout/activity_product_detail_0".equals(tag)) {
            return new ActivityProductDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_product_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYPRODUCTLIST: {
          if ("layout/activity_product_list_0".equals(tag)) {
            return new ActivityProductListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_product_list is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYPROFILE: {
          if ("layout/activity_profile_0".equals(tag)) {
            return new ActivityProfileBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_profile is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYRESETPASSWORD: {
          if ("layout/activity_reset_password_0".equals(tag)) {
            return new ActivityResetPasswordBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_reset_password is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSEARCHPRODUCTLIST: {
          if ("layout/activity_searchproduct_list_0".equals(tag)) {
            return new ActivitySearchproductListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_searchproduct_list is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSPLASH: {
          if ("layout/activity_splash_0".equals(tag)) {
            return new ActivitySplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSUBCATEGORY: {
          if ("layout/activity_sub_category_0".equals(tag)) {
            return new ActivitySubCategoryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_sub_category is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSUPPORTCHAT: {
          if ("layout/activity_support_chat_0".equals(tag)) {
            return new ActivitySupportChatBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_support_chat is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYVERIFYOTP: {
          if ("layout/activity_verify_otp_0".equals(tag)) {
            return new ActivityVerifyOtpBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_verify_otp is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYVIEWALLCATEGORY: {
          if ("layout/activity_view_all_category_0".equals(tag)) {
            return new ActivityViewAllCategoryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_view_all_category is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCART: {
          if ("layout/fragment_cart_0".equals(tag)) {
            return new FragmentCartBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_cart is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDASHBOARD: {
          if ("layout/fragment_dashboard_0".equals(tag)) {
            return new FragmentDashboardBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_dashboard is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTNOTIFICATION: {
          if ("layout/fragment_notification_0".equals(tag)) {
            return new FragmentNotificationBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_notification is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTONGOINGORDER: {
          if ("layout/fragment_on_going_order_0".equals(tag)) {
            return new FragmentOnGoingOrderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_on_going_order is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSETTING: {
          if ("layout/fragment_setting_0".equals(tag)) {
            return new FragmentSettingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_setting is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "viewmodel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(26);

    static {
      sKeys.put("layout/activity_cancel_order_0", com.tigwal.R.layout.activity_cancel_order);
      sKeys.put("layout/activity_change_password_0", com.tigwal.R.layout.activity_change_password);
      sKeys.put("layout/activity_chat_list_0", com.tigwal.R.layout.activity_chat_list);
      sKeys.put("layout/activity_cms_screen_0", com.tigwal.R.layout.activity_cms_screen);
      sKeys.put("layout/activity_dashboard_0", com.tigwal.R.layout.activity_dashboard);
      sKeys.put("layout/activity_forgot_password_0", com.tigwal.R.layout.activity_forgot_password);
      sKeys.put("layout/activity_language_0", com.tigwal.R.layout.activity_language);
      sKeys.put("layout/activity_login_0", com.tigwal.R.layout.activity_login);
      sKeys.put("layout/activity_order_receive_0", com.tigwal.R.layout.activity_order_receive);
      sKeys.put("layout/activity_order_summary_0", com.tigwal.R.layout.activity_order_summary);
      sKeys.put("layout/activity_payment_option_0", com.tigwal.R.layout.activity_payment_option);
      sKeys.put("layout/activity_product_detail_0", com.tigwal.R.layout.activity_product_detail);
      sKeys.put("layout/activity_product_list_0", com.tigwal.R.layout.activity_product_list);
      sKeys.put("layout/activity_profile_0", com.tigwal.R.layout.activity_profile);
      sKeys.put("layout/activity_reset_password_0", com.tigwal.R.layout.activity_reset_password);
      sKeys.put("layout/activity_searchproduct_list_0", com.tigwal.R.layout.activity_searchproduct_list);
      sKeys.put("layout/activity_splash_0", com.tigwal.R.layout.activity_splash);
      sKeys.put("layout/activity_sub_category_0", com.tigwal.R.layout.activity_sub_category);
      sKeys.put("layout/activity_support_chat_0", com.tigwal.R.layout.activity_support_chat);
      sKeys.put("layout/activity_verify_otp_0", com.tigwal.R.layout.activity_verify_otp);
      sKeys.put("layout/activity_view_all_category_0", com.tigwal.R.layout.activity_view_all_category);
      sKeys.put("layout/fragment_cart_0", com.tigwal.R.layout.fragment_cart);
      sKeys.put("layout/fragment_dashboard_0", com.tigwal.R.layout.fragment_dashboard);
      sKeys.put("layout/fragment_notification_0", com.tigwal.R.layout.fragment_notification);
      sKeys.put("layout/fragment_on_going_order_0", com.tigwal.R.layout.fragment_on_going_order);
      sKeys.put("layout/fragment_setting_0", com.tigwal.R.layout.fragment_setting);
    }
  }
}
