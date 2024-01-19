package com.tigwal.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u001e\u001fB\u001d\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0014\u001a\u00020\u000eH\u0016J\u001e\u0010\u0015\u001a\u00020\u00162\n\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\b\b\u0001\u0010\u0018\u001a\u00020\u000eH\u0017J\u001c\u0010\u0019\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000eH\u0016J\u0010\u0010\u001d\u001a\u00020\u00162\b\u0010\u000b\u001a\u0004\u0018\u00010\fR\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/tigwal/ui/adapter/TimeSlotAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/tigwal/ui/adapter/TimeSlotAdapter$MyViewHolder;", "arrayListTimeSlot", "Ljava/util/ArrayList;", "Lcom/tigwal/data/model/getTimeSlot/DataItem;", "strBookingDate", "", "(Ljava/util/ArrayList;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "onItemClickLister", "Lcom/tigwal/ui/adapter/TimeSlotAdapter$OnItemClickLister;", "selectedPosition", "", "srtAvailableQty", "getSrtAvailableQty", "()I", "setSrtAvailableQty", "(I)V", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnItemClickLister", "MyViewHolder", "OnItemClickLister", "app_release"})
public final class TimeSlotAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.tigwal.ui.adapter.TimeSlotAdapter.MyViewHolder> {
    private final java.util.ArrayList<com.tigwal.data.model.getTimeSlot.DataItem> arrayListTimeSlot = null;
    private final java.lang.String strBookingDate = null;
    private int selectedPosition = -1;
    private com.tigwal.ui.adapter.TimeSlotAdapter.OnItemClickLister onItemClickLister;
    private android.content.Context context;
    private int srtAvailableQty = 0;
    
    public TimeSlotAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.tigwal.data.model.getTimeSlot.DataItem> arrayListTimeSlot, @org.jetbrains.annotations.NotNull()
    java.lang.String strBookingDate) {
        super();
    }
    
    public final int getSrtAvailableQty() {
        return 0;
    }
    
    public final void setSrtAvailableQty(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.tigwal.ui.adapter.TimeSlotAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setOnItemClickLister(@org.jetbrains.annotations.Nullable()
    com.tigwal.ui.adapter.TimeSlotAdapter.OnItemClickLister onItemClickLister) {
    }
    
    @android.annotation.SuppressLint(value = {"UseCompatLoadingForDrawables", "NotifyDataSetChanged", "SetTextI18n", "NewApi"})
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.tigwal.ui.adapter.TimeSlotAdapter.MyViewHolder holder, @android.annotation.SuppressLint(value = {"RecyclerView"})
    int position) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0004H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000b\u00a8\u0006\u0012"}, d2 = {"Lcom/tigwal/ui/adapter/TimeSlotAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "itemView", "Landroid/view/View;", "(Lcom/tigwal/ui/adapter/TimeSlotAdapter;Landroid/view/View;)V", "txtAvailableCount", "Landroidx/appcompat/widget/AppCompatTextView;", "getTxtAvailableCount", "()Landroidx/appcompat/widget/AppCompatTextView;", "setTxtAvailableCount", "(Landroidx/appcompat/widget/AppCompatTextView;)V", "txtTimeSlot", "getTxtTimeSlot", "setTxtTimeSlot", "onClick", "", "v", "app_release"})
    public final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener {
        @org.jetbrains.annotations.NotNull()
        private androidx.appcompat.widget.AppCompatTextView txtTimeSlot;
        @org.jetbrains.annotations.NotNull()
        private androidx.appcompat.widget.AppCompatTextView txtAvailableCount;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getTxtTimeSlot() {
            return null;
        }
        
        public final void setTxtTimeSlot(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.AppCompatTextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getTxtAvailableCount() {
            return null;
        }
        
        public final void setTxtAvailableCount(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.AppCompatTextView p0) {
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&\u00a8\u0006\n"}, d2 = {"Lcom/tigwal/ui/adapter/TimeSlotAdapter$OnItemClickLister;", "", "itemClicked", "", "view", "Landroid/view/View;", "position", "", "get", "Lcom/tigwal/data/model/getTimeSlot/DataItem;", "app_release"})
    public static abstract interface OnItemClickLister {
        
        public abstract void itemClicked(@org.jetbrains.annotations.Nullable()
        android.view.View view, int position, @org.jetbrains.annotations.Nullable()
        com.tigwal.data.model.getTimeSlot.DataItem get);
    }
}