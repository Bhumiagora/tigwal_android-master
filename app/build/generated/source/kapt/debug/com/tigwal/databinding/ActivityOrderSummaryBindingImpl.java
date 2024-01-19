package com.tigwal.databinding;
import com.tigwal.R;
import com.tigwal.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityOrderSummaryBindingImpl extends ActivityOrderSummaryBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolBar, 1);
        sViewsWithIds.put(R.id.tvOrderDetails, 2);
        sViewsWithIds.put(R.id.tvOrderId, 3);
        sViewsWithIds.put(R.id.txt_cancel_orderId, 4);
        sViewsWithIds.put(R.id.tvTotalItems, 5);
        sViewsWithIds.put(R.id.txt_cancel_totalOrder, 6);
        sViewsWithIds.put(R.id.tvTotalCharges, 7);
        sViewsWithIds.put(R.id.txt_order_totalCharge, 8);
        sViewsWithIds.put(R.id.llStatusView, 9);
        sViewsWithIds.put(R.id.tvOrderStatus, 10);
        sViewsWithIds.put(R.id.txt_OrderStatus, 11);
        sViewsWithIds.put(R.id.txt_cancel_orderDate, 12);
        sViewsWithIds.put(R.id.txt_cancel_orderTime, 13);
        sViewsWithIds.put(R.id.tvItemList, 14);
        sViewsWithIds.put(R.id.recycler_ordersammry, 15);
        sViewsWithIds.put(R.id.btnCancelOrder, 16);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityOrderSummaryBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private ActivityOrderSummaryBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatButton) bindings[16]
            , (android.widget.LinearLayout) bindings[9]
            , (androidx.recyclerview.widget.RecyclerView) bindings[15]
            , (bindings[1] != null) ? com.tigwal.databinding.LayoutToolbarBinding.bind((android.view.View) bindings[1]) : null
            , (androidx.appcompat.widget.AppCompatTextView) bindings[14]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[10]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[7]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[5]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[12]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[13]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[6]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[11]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[8]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
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
            setViewmodel((com.tigwal.ui.view_model.order_summary.OrderSummaryViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable com.tigwal.ui.view_model.order_summary.OrderSummaryViewModel Viewmodel) {
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