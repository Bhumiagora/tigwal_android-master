package com.tigwal.databinding;
import com.tigwal.R;
import com.tigwal.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityResetPasswordBindingImpl extends ActivityResetPasswordBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolBar, 2);
        sViewsWithIds.put(R.id.txtPasswordTitle, 3);
        sViewsWithIds.put(R.id.txtPasswordMessage, 4);
        sViewsWithIds.put(R.id.llNewPassword, 5);
        sViewsWithIds.put(R.id.et_new_password, 6);
        sViewsWithIds.put(R.id.iv_eye_password, 7);
        sViewsWithIds.put(R.id.passwordError, 8);
        sViewsWithIds.put(R.id.llConPassword, 9);
        sViewsWithIds.put(R.id.et_con_password, 10);
        sViewsWithIds.put(R.id.iv_eye_con_password, 11);
        sViewsWithIds.put(R.id.btn_submit, 12);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityResetPasswordBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private ActivityResetPasswordBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatButton) bindings[12]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[10]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[6]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[11]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[7]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.LinearLayout) bindings[5]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[8]
            , (bindings[2] != null) ? com.tigwal.databinding.LayoutToolbarBinding.bind((android.view.View) bindings[2]) : null
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
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
            setViewmodel((com.tigwal.ui.view_model.resetpassword.ResetPasswordViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable com.tigwal.ui.view_model.resetpassword.ResetPasswordViewModel Viewmodel) {
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