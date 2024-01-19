package com.tigwal.databinding;
import com.tigwal.R;
import com.tigwal.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSettingBindingImpl extends FragmentSettingBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolBar, 2);
        sViewsWithIds.put(R.id.llAll, 3);
        sViewsWithIds.put(R.id.rlSignin, 4);
        sViewsWithIds.put(R.id.tvSignin, 5);
        sViewsWithIds.put(R.id.ivSignin, 6);
        sViewsWithIds.put(R.id.rlProfile, 7);
        sViewsWithIds.put(R.id.tvProfile, 8);
        sViewsWithIds.put(R.id.ivProfile, 9);
        sViewsWithIds.put(R.id.rlChangePassword, 10);
        sViewsWithIds.put(R.id.txt_change_password, 11);
        sViewsWithIds.put(R.id.ivChangePassword, 12);
        sViewsWithIds.put(R.id.rlChangeLanguage, 13);
        sViewsWithIds.put(R.id.txtChangeLang, 14);
        sViewsWithIds.put(R.id.ivChangeLang, 15);
        sViewsWithIds.put(R.id.rlSupportChat, 16);
        sViewsWithIds.put(R.id.txt_support_chat, 17);
        sViewsWithIds.put(R.id.ivSupportChat, 18);
        sViewsWithIds.put(R.id.rlFaq, 19);
        sViewsWithIds.put(R.id.txtFaq, 20);
        sViewsWithIds.put(R.id.ivFaq, 21);
        sViewsWithIds.put(R.id.rlShareApp, 22);
        sViewsWithIds.put(R.id.txtShareApp, 23);
        sViewsWithIds.put(R.id.ivShareApp, 24);
        sViewsWithIds.put(R.id.rlHelp, 25);
        sViewsWithIds.put(R.id.txtHelp, 26);
        sViewsWithIds.put(R.id.ivHelp, 27);
        sViewsWithIds.put(R.id.rlLegal, 28);
        sViewsWithIds.put(R.id.txtLegal, 29);
        sViewsWithIds.put(R.id.ivLegal, 30);
        sViewsWithIds.put(R.id.rlPrivacyPolicy, 31);
        sViewsWithIds.put(R.id.txtPrivacyPolicy, 32);
        sViewsWithIds.put(R.id.ivPrivacyPolicy, 33);
        sViewsWithIds.put(R.id.rlLogout, 34);
        sViewsWithIds.put(R.id.txtLogout, 35);
        sViewsWithIds.put(R.id.ivLogout, 36);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentSettingBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 37, sIncludes, sViewsWithIds));
    }
    private FragmentSettingBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatImageView) bindings[15]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[12]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[21]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[27]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[30]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[36]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[33]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[9]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[24]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[6]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[18]
            , (android.widget.LinearLayout) bindings[3]
            , (android.widget.RelativeLayout) bindings[13]
            , (android.widget.RelativeLayout) bindings[10]
            , (android.widget.RelativeLayout) bindings[19]
            , (android.widget.RelativeLayout) bindings[25]
            , (android.widget.RelativeLayout) bindings[28]
            , (android.widget.RelativeLayout) bindings[34]
            , (android.widget.RelativeLayout) bindings[31]
            , (android.widget.RelativeLayout) bindings[7]
            , (android.widget.RelativeLayout) bindings[0]
            , (android.widget.RelativeLayout) bindings[22]
            , (android.widget.RelativeLayout) bindings[4]
            , (android.widget.RelativeLayout) bindings[16]
            , (bindings[2] != null) ? com.tigwal.databinding.LayoutToolbarBinding.bind((android.view.View) bindings[2]) : null
            , (androidx.appcompat.widget.AppCompatTextView) bindings[8]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[5]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[14]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[11]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[20]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[26]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[29]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[35]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[32]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[23]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[17]
            );
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.rlSetting.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewmodel == variableId) {
            setViewmodel((com.tigwal.ui.view_model.setting.SettingViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable com.tigwal.ui.view_model.setting.SettingViewModel Viewmodel) {
        this.mViewmodel = Viewmodel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}