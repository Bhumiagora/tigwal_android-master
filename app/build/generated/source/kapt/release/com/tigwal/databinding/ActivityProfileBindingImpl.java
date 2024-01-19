package com.tigwal.databinding;
import com.tigwal.R;
import com.tigwal.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityProfileBindingImpl extends ActivityProfileBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolBar, 2);
        sViewsWithIds.put(R.id.llAll, 3);
        sViewsWithIds.put(R.id.img_profilePic, 4);
        sViewsWithIds.put(R.id.iv_uploadImg, 5);
        sViewsWithIds.put(R.id.txtNameTitle, 6);
        sViewsWithIds.put(R.id.txtEmailTitle, 7);
        sViewsWithIds.put(R.id.et_profile_fullName, 8);
        sViewsWithIds.put(R.id.et_profile_email, 9);
        sViewsWithIds.put(R.id.rlMobileNo, 10);
        sViewsWithIds.put(R.id.txtSelectedCountryCode, 11);
        sViewsWithIds.put(R.id.countrypicker, 12);
        sViewsWithIds.put(R.id.ViewCountryCode, 13);
        sViewsWithIds.put(R.id.et_profile_mobile, 14);
        sViewsWithIds.put(R.id.txtAddress, 15);
        sViewsWithIds.put(R.id.rlCountry, 16);
        sViewsWithIds.put(R.id.txtCountry, 17);
        sViewsWithIds.put(R.id.rlGender, 18);
        sViewsWithIds.put(R.id.txtGender, 19);
        sViewsWithIds.put(R.id.imgGender, 20);
        sViewsWithIds.put(R.id.rlBirthdate, 21);
        sViewsWithIds.put(R.id.txtDate, 22);
        sViewsWithIds.put(R.id.imgCalender, 23);
        sViewsWithIds.put(R.id.btn_update, 24);
        sViewsWithIds.put(R.id.btnDeleteUser, 25);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityProfileBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 26, sIncludes, sViewsWithIds));
    }
    private ActivityProfileBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.view.View) bindings[13]
            , (androidx.appcompat.widget.AppCompatButton) bindings[25]
            , (androidx.appcompat.widget.AppCompatButton) bindings[24]
            , (com.hbb20.CountryCodePicker) bindings[12]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[9]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[8]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[14]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[23]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[20]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[4]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[5]
            , (android.widget.LinearLayout) bindings[3]
            , (android.widget.RelativeLayout) bindings[21]
            , (android.widget.RelativeLayout) bindings[16]
            , (android.widget.RelativeLayout) bindings[18]
            , (android.widget.RelativeLayout) bindings[10]
            , (bindings[2] != null) ? com.tigwal.databinding.LayoutToolbarBinding.bind((android.view.View) bindings[2]) : null
            , (androidx.appcompat.widget.AppCompatTextView) bindings[15]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[17]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[22]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[7]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[19]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[6]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[11]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
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
            setViewmodel((com.tigwal.ui.view_model.profile.ProfileViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable com.tigwal.ui.view_model.profile.ProfileViewModel Viewmodel) {
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