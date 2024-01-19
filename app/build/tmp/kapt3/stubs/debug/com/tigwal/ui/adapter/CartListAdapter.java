package com.tigwal.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002)*B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u001f\u001a\u00020\u001bH\u0016J\u001c\u0010 \u001a\u00020!2\n\u0010\"\u001a\u00060\u0002R\u00020\u00002\u0006\u0010#\u001a\u00020\u001bH\u0017J\u001c\u0010$\u001a\u00060\u0002R\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u001bH\u0016J\u0010\u0010(\u001a\u00020!2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u000eR\u001a\u0010\u0016\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u000e\u0010\u0019\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u000e\u00a8\u0006+"}, d2 = {"Lcom/tigwal/ui/adapter/CartListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/tigwal/ui/adapter/CartListAdapter$MyViewHolder;", "arrayListCartList", "Ljava/util/ArrayList;", "Lcom/tigwal/data/model/listCart/CartListItem;", "admin_commision", "", "(Ljava/util/ArrayList;Ljava/lang/String;)V", "admin_commision_total", "", "getAdmin_commision_total", "()D", "setAdmin_commision_total", "(D)V", "context", "Landroid/content/Context;", "onItemClickLister", "Lcom/tigwal/ui/adapter/CartListAdapter$OnItemClickLister;", "price", "getPrice", "setPrice", "totalDiscount", "getTotalDiscount", "setTotalDiscount", "totalPrice", "totalQuantity", "", "totalServiceTax", "getTotalServiceTax", "setTotalServiceTax", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnItemClickLister", "MyViewHolder", "OnItemClickLister", "app_debug"})
public final class CartListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.tigwal.ui.adapter.CartListAdapter.MyViewHolder> {
    private final java.util.ArrayList<com.tigwal.data.model.listCart.CartListItem> arrayListCartList = null;
    private final java.lang.String admin_commision = null;
    private com.tigwal.ui.adapter.CartListAdapter.OnItemClickLister onItemClickLister;
    private android.content.Context context;
    private int totalQuantity = 0;
    private double totalPrice = 0.0;
    private double price = 0.0;
    private double totalDiscount = 0.0;
    private double totalServiceTax = 0.0;
    private double admin_commision_total = 0.0;
    
    public CartListAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.tigwal.data.model.listCart.CartListItem> arrayListCartList, @org.jetbrains.annotations.NotNull()
    java.lang.String admin_commision) {
        super();
    }
    
    public final double getPrice() {
        return 0.0;
    }
    
    public final void setPrice(double p0) {
    }
    
    public final double getTotalDiscount() {
        return 0.0;
    }
    
    public final void setTotalDiscount(double p0) {
    }
    
    public final double getTotalServiceTax() {
        return 0.0;
    }
    
    public final void setTotalServiceTax(double p0) {
    }
    
    public final double getAdmin_commision_total() {
        return 0.0;
    }
    
    public final void setAdmin_commision_total(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.tigwal.ui.adapter.CartListAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
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
    com.tigwal.ui.adapter.CartListAdapter.MyViewHolder holder, int position) {
    }
    
    public final void setOnItemClickLister(@org.jetbrains.annotations.Nullable()
    com.tigwal.ui.adapter.CartListAdapter.OnItemClickLister onItemClickLister) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020\u0004H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\t\"\u0004\b\u001a\u0010\u000bR\u001a\u0010\u001b\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\t\"\u0004\b\u001d\u0010\u000bR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u000f\"\u0004\b&\u0010\u0011R\u001a\u0010\'\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\t\"\u0004\b)\u0010\u000bR\u001a\u0010*\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\t\"\u0004\b,\u0010\u000bR\u001a\u0010-\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\t\"\u0004\b/\u0010\u000bR\u001a\u00100\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\t\"\u0004\b2\u0010\u000bR\u001a\u00103\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\t\"\u0004\b5\u0010\u000bR\u001a\u00106\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\t\"\u0004\b8\u0010\u000bR\u001a\u00109\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\t\"\u0004\b;\u0010\u000bR\u001a\u0010<\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\t\"\u0004\b>\u0010\u000bR\u001a\u0010?\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\t\"\u0004\bA\u0010\u000bR\u001a\u0010B\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\t\"\u0004\bD\u0010\u000bR\u001a\u0010E\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\t\"\u0004\bG\u0010\u000bR\u001a\u0010H\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\t\"\u0004\bJ\u0010\u000bR\u001a\u0010K\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\t\"\u0004\bM\u0010\u000b\u00a8\u0006Q"}, d2 = {"Lcom/tigwal/ui/adapter/CartListAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "itemView", "Landroid/view/View;", "(Lcom/tigwal/ui/adapter/CartListAdapter;Landroid/view/View;)V", "cartItemNotes", "Landroidx/appcompat/widget/AppCompatTextView;", "getCartItemNotes", "()Landroidx/appcompat/widget/AppCompatTextView;", "setCartItemNotes", "(Landroidx/appcompat/widget/AppCompatTextView;)V", "imgAddNote", "Landroid/widget/LinearLayout;", "getImgAddNote", "()Landroid/widget/LinearLayout;", "setImgAddNote", "(Landroid/widget/LinearLayout;)V", "imgCartDelete", "Landroidx/appcompat/widget/AppCompatImageView;", "getImgCartDelete", "()Landroidx/appcompat/widget/AppCompatImageView;", "setImgCartDelete", "(Landroidx/appcompat/widget/AppCompatImageView;)V", "iv_cart_minus", "getIv_cart_minus", "setIv_cart_minus", "iv_cart_plus", "getIv_cart_plus", "setIv_cart_plus", "iv_cart_productImage", "Lcom/tigwal/utils/RoundRectCornerImageView;", "getIv_cart_productImage", "()Lcom/tigwal/utils/RoundRectCornerImageView;", "setIv_cart_productImage", "(Lcom/tigwal/utils/RoundRectCornerImageView;)V", "llDiscount", "getLlDiscount", "setLlDiscount", "totalCalculatePrice", "getTotalCalculatePrice", "setTotalCalculatePrice", "txtAddNote", "getTxtAddNote", "setTxtAddNote", "txtBookingDate", "getTxtBookingDate", "setTxtBookingDate", "txtDiscount", "getTxtDiscount", "setTxtDiscount", "txtDiscountPercentage", "getTxtDiscountPercentage", "setTxtDiscountPercentage", "txtPerPerson", "getTxtPerPerson", "setTxtPerPerson", "txtPrice", "getTxtPrice", "setTxtPrice", "txtServiceProviderName", "getTxtServiceProviderName", "setTxtServiceProviderName", "txtTimeSlot", "getTxtTimeSlot", "setTxtTimeSlot", "txt_cart_location", "getTxt_cart_location", "setTxt_cart_location", "txt_cart_price", "getTxt_cart_price", "setTxt_cart_price", "txt_cart_productName", "getTxt_cart_productName", "setTxt_cart_productName", "txt_cart_total_item", "getTxt_cart_total_item", "setTxt_cart_total_item", "onClick", "", "v", "app_debug"})
    public final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener {
        @org.jetbrains.annotations.NotNull()
        private android.widget.LinearLayout imgAddNote;
        @org.jetbrains.annotations.NotNull()
        private androidx.appcompat.widget.AppCompatImageView imgCartDelete;
        @org.jetbrains.annotations.NotNull()
        private com.tigwal.utils.RoundRectCornerImageView iv_cart_productImage;
        @org.jetbrains.annotations.NotNull()
        private androidx.appcompat.widget.AppCompatTextView totalCalculatePrice;
        @org.jetbrains.annotations.NotNull()
        private androidx.appcompat.widget.AppCompatTextView cartItemNotes;
        @org.jetbrains.annotations.NotNull()
        private androidx.appcompat.widget.AppCompatTextView txt_cart_productName;
        @org.jetbrains.annotations.NotNull()
        private androidx.appcompat.widget.AppCompatTextView txt_cart_location;
        @org.jetbrains.annotations.NotNull()
        private androidx.appcompat.widget.AppCompatTextView txt_cart_price;
        @org.jetbrains.annotations.NotNull()
        private androidx.appcompat.widget.AppCompatTextView txtPrice;
        @org.jetbrains.annotations.NotNull()
        private androidx.appcompat.widget.AppCompatTextView iv_cart_minus;
        @org.jetbrains.annotations.NotNull()
        private androidx.appcompat.widget.AppCompatTextView txtBookingDate;
        @org.jetbrains.annotations.NotNull()
        private androidx.appcompat.widget.AppCompatTextView txtAddNote;
        @org.jetbrains.annotations.NotNull()
        private androidx.appcompat.widget.AppCompatTextView txtTimeSlot;
        @org.jetbrains.annotations.NotNull()
        private androidx.appcompat.widget.AppCompatTextView txt_cart_total_item;
        @org.jetbrains.annotations.NotNull()
        private androidx.appcompat.widget.AppCompatTextView iv_cart_plus;
        @org.jetbrains.annotations.NotNull()
        private androidx.appcompat.widget.AppCompatTextView txtServiceProviderName;
        @org.jetbrains.annotations.NotNull()
        private androidx.appcompat.widget.AppCompatTextView txtPerPerson;
        @org.jetbrains.annotations.NotNull()
        private androidx.appcompat.widget.AppCompatTextView txtDiscountPercentage;
        @org.jetbrains.annotations.NotNull()
        private androidx.appcompat.widget.AppCompatTextView txtDiscount;
        @org.jetbrains.annotations.NotNull()
        private android.widget.LinearLayout llDiscount;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.LinearLayout getImgAddNote() {
            return null;
        }
        
        public final void setImgAddNote(@org.jetbrains.annotations.NotNull()
        android.widget.LinearLayout p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatImageView getImgCartDelete() {
            return null;
        }
        
        public final void setImgCartDelete(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.AppCompatImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.tigwal.utils.RoundRectCornerImageView getIv_cart_productImage() {
            return null;
        }
        
        public final void setIv_cart_productImage(@org.jetbrains.annotations.NotNull()
        com.tigwal.utils.RoundRectCornerImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getTotalCalculatePrice() {
            return null;
        }
        
        public final void setTotalCalculatePrice(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.AppCompatTextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getCartItemNotes() {
            return null;
        }
        
        public final void setCartItemNotes(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.AppCompatTextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getTxt_cart_productName() {
            return null;
        }
        
        public final void setTxt_cart_productName(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.AppCompatTextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getTxt_cart_location() {
            return null;
        }
        
        public final void setTxt_cart_location(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.AppCompatTextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getTxt_cart_price() {
            return null;
        }
        
        public final void setTxt_cart_price(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.AppCompatTextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getTxtPrice() {
            return null;
        }
        
        public final void setTxtPrice(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.AppCompatTextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getIv_cart_minus() {
            return null;
        }
        
        public final void setIv_cart_minus(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.AppCompatTextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getTxtBookingDate() {
            return null;
        }
        
        public final void setTxtBookingDate(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.AppCompatTextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getTxtAddNote() {
            return null;
        }
        
        public final void setTxtAddNote(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.AppCompatTextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getTxtTimeSlot() {
            return null;
        }
        
        public final void setTxtTimeSlot(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.AppCompatTextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getTxt_cart_total_item() {
            return null;
        }
        
        public final void setTxt_cart_total_item(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.AppCompatTextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getIv_cart_plus() {
            return null;
        }
        
        public final void setIv_cart_plus(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.AppCompatTextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getTxtServiceProviderName() {
            return null;
        }
        
        public final void setTxtServiceProviderName(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.AppCompatTextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getTxtPerPerson() {
            return null;
        }
        
        public final void setTxtPerPerson(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.AppCompatTextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getTxtDiscountPercentage() {
            return null;
        }
        
        public final void setTxtDiscountPercentage(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.AppCompatTextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getTxtDiscount() {
            return null;
        }
        
        public final void setTxtDiscount(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.AppCompatTextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.LinearLayout getLlDiscount() {
            return null;
        }
        
        public final void setLlDiscount(@org.jetbrains.annotations.NotNull()
        android.widget.LinearLayout p0) {
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001a\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\r"}, d2 = {"Lcom/tigwal/ui/adapter/CartListAdapter$OnItemClickLister;", "", "itemAddNote", "", "position", "", "get", "Lcom/tigwal/data/model/listCart/CartListItem;", "itemCartUpdate", "itemClicked", "view", "Landroid/view/View;", "itemDelete", "app_debug"})
    public static abstract interface OnItemClickLister {
        
        public abstract void itemClicked(@org.jetbrains.annotations.Nullable()
        android.view.View view, int position);
        
        public abstract void itemDelete(int position, @org.jetbrains.annotations.NotNull()
        com.tigwal.data.model.listCart.CartListItem get);
        
        public abstract void itemCartUpdate(int position, @org.jetbrains.annotations.NotNull()
        com.tigwal.data.model.listCart.CartListItem get);
        
        public abstract void itemAddNote(int position, @org.jetbrains.annotations.NotNull()
        com.tigwal.data.model.listCart.CartListItem get);
    }
}