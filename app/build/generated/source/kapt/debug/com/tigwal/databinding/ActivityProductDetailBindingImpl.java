package com.tigwal.databinding;
import com.tigwal.R;
import com.tigwal.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityProductDetailBindingImpl extends ActivityProductDetailBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolBar, 3);
        sViewsWithIds.put(R.id.slider_view, 4);
        sViewsWithIds.put(R.id.nodatafoundview, 5);
        sViewsWithIds.put(R.id.txtDate, 6);
        sViewsWithIds.put(R.id.txtTime, 7);
        sViewsWithIds.put(R.id.tvProductName, 8);
        sViewsWithIds.put(R.id.txtDiscountPrice, 9);
        sViewsWithIds.put(R.id.tvSlash, 10);
        sViewsWithIds.put(R.id.txtPrice, 11);
        sViewsWithIds.put(R.id.txtOfferRate, 12);
        sViewsWithIds.put(R.id.txtHeaderTitle1, 13);
        sViewsWithIds.put(R.id.txtAddress, 14);
        sViewsWithIds.put(R.id.txtBookingDate, 15);
        sViewsWithIds.put(R.id.imgCalender, 16);
        sViewsWithIds.put(R.id.recyclerviewTimeSlot, 17);
        sViewsWithIds.put(R.id.txtTimeSlotNotFound, 18);
        sViewsWithIds.put(R.id.llQuantity, 19);
        sViewsWithIds.put(R.id.txtQuantity, 20);
        sViewsWithIds.put(R.id.tvDescription, 21);
        sViewsWithIds.put(R.id.recyclerCategory, 22);
        sViewsWithIds.put(R.id.tvRelatedProduct, 23);
        sViewsWithIds.put(R.id.recyclerRecommendations, 24);
        sViewsWithIds.put(R.id.rlAddToCart, 25);
        sViewsWithIds.put(R.id.btn_submit, 26);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    @NonNull
    private final android.widget.LinearLayout mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityProductDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 27, sIncludes, sViewsWithIds));
    }
    private ActivityProductDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatTextView) bindings[26]
            , (android.widget.FrameLayout) bindings[0]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[16]
            , (androidx.appcompat.widget.LinearLayoutCompat) bindings[19]
            , (bindings[5] != null) ? com.tigwal.databinding.LayoutDataNotFoundBinding.bind((android.view.View) bindings[5]) : null
            , (androidx.recyclerview.widget.RecyclerView) bindings[22]
            , (androidx.recyclerview.widget.RecyclerView) bindings[24]
            , (androidx.recyclerview.widget.RecyclerView) bindings[17]
            , (android.widget.RelativeLayout) bindings[25]
            , (bindings[4] != null) ? com.tigwal.databinding.LayoutViewpagerBgBinding.bind((android.view.View) bindings[4]) : null
            , (bindings[3] != null) ? com.tigwal.databinding.LayoutToolbarBinding.bind((android.view.View) bindings[3]) : null
            , (androidx.appcompat.widget.AppCompatTextView) bindings[21]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[8]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[23]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[10]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[14]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[15]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[6]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[9]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[13]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[12]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[11]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[20]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[7]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[18]
            );
        this.frame.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.LinearLayout) bindings[2];
        this.mboundView2.setTag(null);
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
            setViewmodel((com.tigwal.ui.view_model.product_detail.ProductDetailViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable com.tigwal.ui.view_model.product_detail.ProductDetailViewModel Viewmodel) {
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