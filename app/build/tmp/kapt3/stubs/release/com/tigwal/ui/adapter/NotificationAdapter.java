package com.tigwal.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0017\u0018B%\u0012\u001e\u0010\u0003\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004j\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u0001`\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\rH\u0017J\u001c\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rH\u0016J\u0010\u0010\u0016\u001a\u00020\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\u000bR&\u0010\u0003\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004j\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u0001`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/tigwal/ui/adapter/NotificationAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/tigwal/ui/adapter/NotificationAdapter$MyViewHolder;", "arrayListNotification", "Ljava/util/ArrayList;", "Lcom/tigwal/data/model/notification_list/DataItem;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "context", "Landroid/content/Context;", "onItemClickLister", "Lcom/tigwal/ui/adapter/NotificationAdapter$OnItemClickLister;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnItemClickLister", "MyViewHolder", "OnItemClickLister", "app_release"})
public final class NotificationAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.tigwal.ui.adapter.NotificationAdapter.MyViewHolder> {
    private final java.util.ArrayList<com.tigwal.data.model.notification_list.DataItem> arrayListNotification = null;
    private com.tigwal.ui.adapter.NotificationAdapter.OnItemClickLister onItemClickLister;
    private android.content.Context context;
    
    public NotificationAdapter(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.tigwal.data.model.notification_list.DataItem> arrayListNotification) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.tigwal.ui.adapter.NotificationAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setOnItemClickLister(@org.jetbrains.annotations.Nullable()
    com.tigwal.ui.adapter.NotificationAdapter.OnItemClickLister onItemClickLister) {
    }
    
    @android.annotation.SuppressLint(value = {"ResourceType"})
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.tigwal.ui.adapter.NotificationAdapter.MyViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0004H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000b\u00a8\u0006\u0018"}, d2 = {"Lcom/tigwal/ui/adapter/NotificationAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "itemView", "Landroid/view/View;", "(Lcom/tigwal/ui/adapter/NotificationAdapter;Landroid/view/View;)V", "tvDate", "Landroidx/appcompat/widget/AppCompatTextView;", "getTvDate", "()Landroidx/appcompat/widget/AppCompatTextView;", "setTvDate", "(Landroidx/appcompat/widget/AppCompatTextView;)V", "tvTime", "getTvTime", "setTvTime", "txtNotificationTitle", "getTxtNotificationTitle", "setTxtNotificationTitle", "txt_notification_desc", "getTxt_notification_desc", "setTxt_notification_desc", "onClick", "", "v", "app_release"})
    public final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener {
        @org.jetbrains.annotations.NotNull()
        private androidx.appcompat.widget.AppCompatTextView txtNotificationTitle;
        @org.jetbrains.annotations.NotNull()
        private androidx.appcompat.widget.AppCompatTextView txt_notification_desc;
        @org.jetbrains.annotations.NotNull()
        private androidx.appcompat.widget.AppCompatTextView tvDate;
        @org.jetbrains.annotations.NotNull()
        private androidx.appcompat.widget.AppCompatTextView tvTime;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getTxtNotificationTitle() {
            return null;
        }
        
        public final void setTxtNotificationTitle(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.AppCompatTextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getTxt_notification_desc() {
            return null;
        }
        
        public final void setTxt_notification_desc(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.AppCompatTextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getTvDate() {
            return null;
        }
        
        public final void setTvDate(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.AppCompatTextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getTvTime() {
            return null;
        }
        
        public final void setTvTime(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.AppCompatTextView p0) {
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/tigwal/ui/adapter/NotificationAdapter$OnItemClickLister;", "", "itemClicked", "", "view", "Landroid/view/View;", "position", "", "app_release"})
    public static abstract interface OnItemClickLister {
        
        public abstract void itemClicked(@org.jetbrains.annotations.Nullable()
        android.view.View view, int position);
    }
}