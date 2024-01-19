package com.tigwal.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u001b\u001cB\u001d\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0011\u001a\u00020\u000bH\u0016J\u001c\u0010\u0012\u001a\u00020\u00132\n\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u000bH\u0016J\u001c\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000bH\u0016J\u0010\u0010\u001a\u001a\u00020\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/tigwal/ui/adapter/ChangeLanguageAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/tigwal/ui/adapter/ChangeLanguageAdapter$MyViewHolder;", "arraylist", "Ljava/util/ArrayList;", "Lcom/tigwal/data/model/language/LanguageListModel;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "conext", "Landroid/content/Context;", "isClick", "", "()I", "setClick", "(I)V", "onItemClickLister", "Lcom/tigwal/ui/adapter/ChangeLanguageAdapter$OnItemClickLister;", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnItemClickLister", "MyViewHolder", "OnItemClickLister", "app_release"})
public final class ChangeLanguageAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.tigwal.ui.adapter.ChangeLanguageAdapter.MyViewHolder> {
    private final java.util.ArrayList<com.tigwal.data.model.language.LanguageListModel> arraylist = null;
    private com.tigwal.ui.adapter.ChangeLanguageAdapter.OnItemClickLister onItemClickLister;
    private android.content.Context conext;
    private int isClick = 0;
    
    public ChangeLanguageAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.tigwal.data.model.language.LanguageListModel> arraylist) {
        super();
    }
    
    public final int isClick() {
        return 0;
    }
    
    public final void setClick(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.tigwal.ui.adapter.ChangeLanguageAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.tigwal.ui.adapter.ChangeLanguageAdapter.MyViewHolder holder, int position) {
    }
    
    public final void setOnItemClickLister(@org.jetbrains.annotations.Nullable()
    com.tigwal.ui.adapter.ChangeLanguageAdapter.OnItemClickLister onItemClickLister) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0004H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001e"}, d2 = {"Lcom/tigwal/ui/adapter/ChangeLanguageAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "itemView", "Landroid/view/View;", "(Lcom/tigwal/ui/adapter/ChangeLanguageAdapter;Landroid/view/View;)V", "cb_check", "Landroidx/appcompat/widget/AppCompatImageView;", "getCb_check", "()Landroidx/appcompat/widget/AppCompatImageView;", "setCb_check", "(Landroidx/appcompat/widget/AppCompatImageView;)V", "iv_lanLogo", "getIv_lanLogo", "setIv_lanLogo", "llLanguageView", "Landroid/widget/LinearLayout;", "getLlLanguageView", "()Landroid/widget/LinearLayout;", "setLlLanguageView", "(Landroid/widget/LinearLayout;)V", "tv_LanName", "Landroidx/appcompat/widget/AppCompatTextView;", "getTv_LanName", "()Landroidx/appcompat/widget/AppCompatTextView;", "setTv_LanName", "(Landroidx/appcompat/widget/AppCompatTextView;)V", "onClick", "", "v", "app_release"})
    public final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener {
        @org.jetbrains.annotations.NotNull()
        private androidx.appcompat.widget.AppCompatTextView tv_LanName;
        @org.jetbrains.annotations.NotNull()
        private androidx.appcompat.widget.AppCompatImageView iv_lanLogo;
        @org.jetbrains.annotations.NotNull()
        private androidx.appcompat.widget.AppCompatImageView cb_check;
        @org.jetbrains.annotations.NotNull()
        private android.widget.LinearLayout llLanguageView;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getTv_LanName() {
            return null;
        }
        
        public final void setTv_LanName(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.AppCompatTextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatImageView getIv_lanLogo() {
            return null;
        }
        
        public final void setIv_lanLogo(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.AppCompatImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatImageView getCb_check() {
            return null;
        }
        
        public final void setCb_check(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.AppCompatImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.LinearLayout getLlLanguageView() {
            return null;
        }
        
        public final void setLlLanguageView(@org.jetbrains.annotations.NotNull()
        android.widget.LinearLayout p0) {
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/tigwal/ui/adapter/ChangeLanguageAdapter$OnItemClickLister;", "", "itemClicked", "", "view", "Landroid/view/View;", "position", "", "app_release"})
    public static abstract interface OnItemClickLister {
        
        public abstract void itemClicked(@org.jetbrains.annotations.Nullable()
        android.view.View view, int position);
    }
}