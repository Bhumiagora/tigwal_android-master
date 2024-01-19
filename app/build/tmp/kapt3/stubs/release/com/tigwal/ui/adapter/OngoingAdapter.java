package com.tigwal.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0004\u001f !\"B)\u0012\u001a\u0010\u0003\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00152\n\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0013H\u0017J\u001c\u0010\u0018\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0013H\u0016J\u0010\u0010\u001c\u001a\u00020\u00152\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u001d\u001a\u00020\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u001e\u001a\u00020\u00152\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011R\"\u0010\u0003\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0005`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/tigwal/ui/adapter/OngoingAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/tigwal/ui/adapter/OngoingAdapter$MyViewHolder;", "arrayList", "Ljava/util/ArrayList;", "Lcom/tigwal/data/model/listOrder/OrdersItem;", "Lkotlin/collections/ArrayList;", "orderType", "", "(Ljava/util/ArrayList;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "onItemCancelOrderClickLister", "Lcom/tigwal/ui/adapter/OngoingAdapter$OnItemCancelOrderClickLister;", "onItemClickLister", "Lcom/tigwal/ui/adapter/OngoingAdapter$OnItemClickLister;", "onItemOrderSummaryClickLister", "Lcom/tigwal/ui/adapter/OngoingAdapter$OnItemOrderSummaryClickLister;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnItemCancelOrderClickLister", "setOnItemClickLister", "setOnItemOrderSummaryClickLister", "MyViewHolder", "OnItemCancelOrderClickLister", "OnItemClickLister", "OnItemOrderSummaryClickLister", "app_release"})
public final class OngoingAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.tigwal.ui.adapter.OngoingAdapter.MyViewHolder> {
    private final java.util.ArrayList<com.tigwal.data.model.listOrder.OrdersItem> arrayList = null;
    private final java.lang.String orderType = null;
    private android.content.Context context;
    private com.tigwal.ui.adapter.OngoingAdapter.OnItemClickLister onItemClickLister;
    private com.tigwal.ui.adapter.OngoingAdapter.OnItemOrderSummaryClickLister onItemOrderSummaryClickLister;
    private com.tigwal.ui.adapter.OngoingAdapter.OnItemCancelOrderClickLister onItemCancelOrderClickLister;
    
    public OngoingAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.tigwal.data.model.listOrder.OrdersItem> arrayList, @org.jetbrains.annotations.NotNull()
    java.lang.String orderType) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.tigwal.ui.adapter.OngoingAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.tigwal.ui.adapter.OngoingAdapter.MyViewHolder holder, int position) {
    }
    
    public final void setOnItemClickLister(@org.jetbrains.annotations.Nullable()
    com.tigwal.ui.adapter.OngoingAdapter.OnItemClickLister onItemClickLister) {
    }
    
    public final void setOnItemCancelOrderClickLister(@org.jetbrains.annotations.Nullable()
    com.tigwal.ui.adapter.OngoingAdapter.OnItemCancelOrderClickLister onItemCancelOrderClickLister) {
    }
    
    public final void setOnItemOrderSummaryClickLister(@org.jetbrains.annotations.Nullable()
    com.tigwal.ui.adapter.OngoingAdapter.OnItemOrderSummaryClickLister onItemOrderSummaryClickLister) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u0004H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R\u001a\u0010\u001b\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\u001a\u0010\u001e\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0011R\u001a\u0010!\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u000f\"\u0004\b#\u0010\u0011R\u001a\u0010$\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u000f\"\u0004\b&\u0010\u0011R\u001a\u0010\'\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u000f\"\u0004\b)\u0010\u0011R\u001a\u0010*\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u000f\"\u0004\b,\u0010\u0011R\u001a\u0010-\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u000f\"\u0004\b/\u0010\u0011R\u001a\u00100\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u000f\"\u0004\b2\u0010\u0011R\u001a\u00103\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u000f\"\u0004\b5\u0010\u0011\u00a8\u00069"}, d2 = {"Lcom/tigwal/ui/adapter/OngoingAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "itemView", "Landroid/view/View;", "(Lcom/tigwal/ui/adapter/OngoingAdapter;Landroid/view/View;)V", "llStatusView", "Landroid/widget/LinearLayout;", "getLlStatusView", "()Landroid/widget/LinearLayout;", "setLlStatusView", "(Landroid/widget/LinearLayout;)V", "tvOrderId", "Landroidx/appcompat/widget/AppCompatTextView;", "getTvOrderId", "()Landroidx/appcompat/widget/AppCompatTextView;", "setTvOrderId", "(Landroidx/appcompat/widget/AppCompatTextView;)V", "tvOrderStatus", "getTvOrderStatus", "setTvOrderStatus", "tvTotalCharges", "getTvTotalCharges", "setTvTotalCharges", "tvTotalItems", "getTvTotalItems", "setTvTotalItems", "txtCancelOrder", "getTxtCancelOrder", "setTxtCancelOrder", "txtName", "getTxtName", "setTxtName", "txtOrderSummary", "getTxtOrderSummary", "setTxtOrderSummary", "txt_OrderStatus", "getTxt_OrderStatus", "setTxt_OrderStatus", "txt_cancel_orderDate", "getTxt_cancel_orderDate", "setTxt_cancel_orderDate", "txt_cancel_orderId", "getTxt_cancel_orderId", "setTxt_cancel_orderId", "txt_cancel_orderTime", "getTxt_cancel_orderTime", "setTxt_cancel_orderTime", "txt_cancel_totalOrder", "getTxt_cancel_totalOrder", "setTxt_cancel_totalOrder", "txt_order_totalCharge", "getTxt_order_totalCharge", "setTxt_order_totalCharge", "onClick", "", "v", "app_release"})
    public final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener {
        @org.jetbrains.annotations.NotNull()
        private androidx.appcompat.widget.AppCompatTextView txtOrderSummary;
        @org.jetbrains.annotations.NotNull()
        private androidx.appcompat.widget.AppCompatTextView txtCancelOrder;
        @org.jetbrains.annotations.NotNull()
        private androidx.appcompat.widget.AppCompatTextView tvOrderId;
        @org.jetbrains.annotations.NotNull()
        private androidx.appcompat.widget.AppCompatTextView txt_cancel_orderId;
        @org.jetbrains.annotations.NotNull()
        private androidx.appcompat.widget.AppCompatTextView tvTotalItems;
        @org.jetbrains.annotations.NotNull()
        private androidx.appcompat.widget.AppCompatTextView txt_cancel_totalOrder;
        @org.jetbrains.annotations.NotNull()
        private androidx.appcompat.widget.AppCompatTextView tvTotalCharges;
        @org.jetbrains.annotations.NotNull()
        private androidx.appcompat.widget.AppCompatTextView txt_order_totalCharge;
        @org.jetbrains.annotations.NotNull()
        private androidx.appcompat.widget.AppCompatTextView tvOrderStatus;
        @org.jetbrains.annotations.NotNull()
        private androidx.appcompat.widget.AppCompatTextView txt_OrderStatus;
        @org.jetbrains.annotations.NotNull()
        private androidx.appcompat.widget.AppCompatTextView txt_cancel_orderDate;
        @org.jetbrains.annotations.NotNull()
        private androidx.appcompat.widget.AppCompatTextView txt_cancel_orderTime;
        @org.jetbrains.annotations.NotNull()
        private android.widget.LinearLayout llStatusView;
        @org.jetbrains.annotations.NotNull()
        private androidx.appcompat.widget.AppCompatTextView txtName;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getTxtOrderSummary() {
            return null;
        }
        
        public final void setTxtOrderSummary(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.AppCompatTextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getTxtCancelOrder() {
            return null;
        }
        
        public final void setTxtCancelOrder(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.AppCompatTextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getTvOrderId() {
            return null;
        }
        
        public final void setTvOrderId(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.AppCompatTextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getTxt_cancel_orderId() {
            return null;
        }
        
        public final void setTxt_cancel_orderId(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.AppCompatTextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getTvTotalItems() {
            return null;
        }
        
        public final void setTvTotalItems(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.AppCompatTextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getTxt_cancel_totalOrder() {
            return null;
        }
        
        public final void setTxt_cancel_totalOrder(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.AppCompatTextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getTvTotalCharges() {
            return null;
        }
        
        public final void setTvTotalCharges(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.AppCompatTextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getTxt_order_totalCharge() {
            return null;
        }
        
        public final void setTxt_order_totalCharge(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.AppCompatTextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getTvOrderStatus() {
            return null;
        }
        
        public final void setTvOrderStatus(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.AppCompatTextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getTxt_OrderStatus() {
            return null;
        }
        
        public final void setTxt_OrderStatus(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.AppCompatTextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getTxt_cancel_orderDate() {
            return null;
        }
        
        public final void setTxt_cancel_orderDate(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.AppCompatTextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getTxt_cancel_orderTime() {
            return null;
        }
        
        public final void setTxt_cancel_orderTime(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.AppCompatTextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.LinearLayout getLlStatusView() {
            return null;
        }
        
        public final void setLlStatusView(@org.jetbrains.annotations.NotNull()
        android.widget.LinearLayout p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getTxtName() {
            return null;
        }
        
        public final void setTxtName(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.AppCompatTextView p0) {
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/tigwal/ui/adapter/OngoingAdapter$OnItemClickLister;", "", "itemClicked", "", "view", "Landroid/view/View;", "position", "", "app_release"})
    public static abstract interface OnItemClickLister {
        
        public abstract void itemClicked(@org.jetbrains.annotations.Nullable()
        android.view.View view, int position);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/tigwal/ui/adapter/OngoingAdapter$OnItemCancelOrderClickLister;", "", "itemCancelOrderClicked", "", "position", "", "get", "Lcom/tigwal/data/model/listOrder/OrdersItem;", "app_release"})
    public static abstract interface OnItemCancelOrderClickLister {
        
        public abstract void itemCancelOrderClicked(int position, @org.jetbrains.annotations.Nullable()
        com.tigwal.data.model.listOrder.OrdersItem get);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/tigwal/ui/adapter/OngoingAdapter$OnItemOrderSummaryClickLister;", "", "itemOrderSummaryClicked", "", "position", "", "get", "Lcom/tigwal/data/model/listOrder/OrdersItem;", "app_release"})
    public static abstract interface OnItemOrderSummaryClickLister {
        
        public abstract void itemOrderSummaryClicked(int position, @org.jetbrains.annotations.Nullable()
        com.tigwal.data.model.listOrder.OrdersItem get);
    }
}