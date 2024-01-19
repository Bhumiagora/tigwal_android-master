package com.tigwal.databinding;
import com.tigwal.R;
import com.tigwal.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivitySupportChatBindingImpl extends ActivitySupportChatBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolBar, 4);
        sViewsWithIds.put(R.id.layoutNotFound, 6);
        sViewsWithIds.put(R.id.rvChat, 7);
        sViewsWithIds.put(R.id.editSearch, 8);
        sViewsWithIds.put(R.id.imgSendMessage, 9);
        sViewsWithIds.put(R.id.rlProgressView, 10);
        sViewsWithIds.put(R.id.progress, 11);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    @Nullable
    private final com.tigwal.databinding.LayoutDataNotFoundBinding mboundView2;
    @NonNull
    private final android.widget.LinearLayout mboundView3;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivitySupportChatBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private ActivitySupportChatBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatEditText) bindings[8]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[9]
            , (bindings[6] != null) ? com.tigwal.databinding.LayoutDataNotFoundBinding.bind((android.view.View) bindings[6]) : null
            , (android.widget.LinearLayout) bindings[2]
            , (android.widget.ProgressBar) bindings[11]
            , (android.widget.RelativeLayout) bindings[10]
            , (androidx.recyclerview.widget.RecyclerView) bindings[7]
            , (bindings[4] != null) ? com.tigwal.databinding.LayoutToolbarBinding.bind((android.view.View) bindings[4]) : null
            );
        this.llall.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (bindings[5] != null) ? com.tigwal.databinding.LayoutDataNotFoundBinding.bind((android.view.View) bindings[5]) : null;
        this.mboundView3 = (android.widget.LinearLayout) bindings[3];
        this.mboundView3.setTag(null);
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
            setViewmodel((com.tigwal.ui.view_model.support_chat.SupportChatViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable com.tigwal.ui.view_model.support_chat.SupportChatViewModel Viewmodel) {
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