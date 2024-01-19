package com.tigwal.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0017\u0018B!\u0012\u001a\u0010\u0003\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0005`\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\rH\u0017J\u001c\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rH\u0016J\u0010\u0010\u0016\u001a\u00020\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\u000bR\"\u0010\u0003\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0005`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/tigwal/ui/adapter/RecommendationAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/tigwal/ui/adapter/RecommendationAdapter$MyViewHolder;", "arrayListRecommendation", "Ljava/util/ArrayList;", "Lcom/tigwal/data/model/product_detail/RelatedDataItem;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "context", "Landroid/content/Context;", "onItemClickLister", "Lcom/tigwal/ui/adapter/RecommendationAdapter$OnItemClickLister;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnItemClickLister", "MyViewHolder", "OnItemClickLister", "app_debug"})
public final class RecommendationAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.tigwal.ui.adapter.RecommendationAdapter.MyViewHolder> {
    private final java.util.ArrayList<com.tigwal.data.model.product_detail.RelatedDataItem> arrayListRecommendation = null;
    private com.tigwal.ui.adapter.RecommendationAdapter.OnItemClickLister onItemClickLister;
    private android.content.Context context;
    
    public RecommendationAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.tigwal.data.model.product_detail.RelatedDataItem> arrayListRecommendation) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.tigwal.ui.adapter.RecommendationAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setOnItemClickLister(@org.jetbrains.annotations.Nullable()
    com.tigwal.ui.adapter.RecommendationAdapter.OnItemClickLister onItemClickLister) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.tigwal.ui.adapter.RecommendationAdapter.MyViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0004H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011\u00a8\u0006\u0018"}, d2 = {"Lcom/tigwal/ui/adapter/RecommendationAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "itemView", "Landroid/view/View;", "(Lcom/tigwal/ui/adapter/RecommendationAdapter;Landroid/view/View;)V", "imgProduct", "Lcom/tigwal/utils/RoundRectCornerImageView;", "getImgProduct", "()Lcom/tigwal/utils/RoundRectCornerImageView;", "setImgProduct", "(Lcom/tigwal/utils/RoundRectCornerImageView;)V", "txtCategoryName", "Landroidx/appcompat/widget/AppCompatTextView;", "getTxtCategoryName", "()Landroidx/appcompat/widget/AppCompatTextView;", "setTxtCategoryName", "(Landroidx/appcompat/widget/AppCompatTextView;)V", "txtRateCount", "getTxtRateCount", "setTxtRateCount", "onClick", "", "v", "app_debug"})
    public final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener {
        @org.jetbrains.annotations.NotNull()
        private androidx.appcompat.widget.AppCompatTextView txtRateCount;
        @org.jetbrains.annotations.NotNull()
        private androidx.appcompat.widget.AppCompatTextView txtCategoryName;
        @org.jetbrains.annotations.NotNull()
        private com.tigwal.utils.RoundRectCornerImageView imgProduct;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getTxtRateCount() {
            return null;
        }
        
        public final void setTxtRateCount(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.AppCompatTextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getTxtCategoryName() {
            return null;
        }
        
        public final void setTxtCategoryName(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.AppCompatTextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.tigwal.utils.RoundRectCornerImageView getImgProduct() {
            return null;
        }
        
        public final void setImgProduct(@org.jetbrains.annotations.NotNull()
        com.tigwal.utils.RoundRectCornerImageView p0) {
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lcom/tigwal/ui/adapter/RecommendationAdapter$OnItemClickLister;", "", "itemClicked", "", "view", "Landroid/view/View;", "position", "", "get", "Lcom/tigwal/data/model/product_detail/RelatedDataItem;", "app_debug"})
    public static abstract interface OnItemClickLister {
        
        public abstract void itemClicked(@org.jetbrains.annotations.Nullable()
        android.view.View view, int position, @org.jetbrains.annotations.NotNull()
        com.tigwal.data.model.product_detail.RelatedDataItem get);
    }
}