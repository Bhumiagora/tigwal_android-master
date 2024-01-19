package com.tigwal.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0016B/\u0012\u001e\u0010\u0003\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004j\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u0001`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u001c\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rH\u0016R&\u0010\u0003\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004j\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u0001`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/tigwal/ui/adapter/ChatAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/tigwal/ui/adapter/ChatAdapter$MyViewHolder;", "arrayListChat", "Ljava/util/ArrayList;", "Lcom/tigwal/data/model/chat/ChatItem;", "Lkotlin/collections/ArrayList;", "imageVendor1", "", "(Ljava/util/ArrayList;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MyViewHolder", "app_debug"})
public final class ChatAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.tigwal.ui.adapter.ChatAdapter.MyViewHolder> {
    private final java.util.ArrayList<com.tigwal.data.model.chat.ChatItem> arrayListChat = null;
    private java.lang.String imageVendor1;
    private android.content.Context context;
    
    public ChatAdapter(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.tigwal.data.model.chat.ChatItem> arrayListChat, @org.jetbrains.annotations.Nullable()
    java.lang.String imageVendor1) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.tigwal.ui.adapter.ChatAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.tigwal.ui.adapter.ChatAdapter.MyViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0004H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\u001a\u0010!\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dR\u001a\u0010$\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001b\"\u0004\b&\u0010\u001dR\u001a\u0010\'\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010\u001d\u00a8\u0006-"}, d2 = {"Lcom/tigwal/ui/adapter/ChatAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "itemView", "Landroid/view/View;", "(Lcom/tigwal/ui/adapter/ChatAdapter;Landroid/view/View;)V", "img_profilePic", "Lde/hdodenhof/circleimageview/CircleImageView;", "getImg_profilePic", "()Lde/hdodenhof/circleimageview/CircleImageView;", "setImg_profilePic", "(Lde/hdodenhof/circleimageview/CircleImageView;)V", "llReceiverView", "Landroid/widget/LinearLayout;", "getLlReceiverView", "()Landroid/widget/LinearLayout;", "setLlReceiverView", "(Landroid/widget/LinearLayout;)V", "llSenderView", "getLlSenderView", "setLlSenderView", "llViewDateTime", "getLlViewDateTime", "setLlViewDateTime", "txtDate", "Landroidx/appcompat/widget/AppCompatTextView;", "getTxtDate", "()Landroidx/appcompat/widget/AppCompatTextView;", "setTxtDate", "(Landroidx/appcompat/widget/AppCompatTextView;)V", "txtReceiverDateTime", "getTxtReceiverDateTime", "setTxtReceiverDateTime", "txtReceiverName", "getTxtReceiverName", "setTxtReceiverName", "txtSenderDateTime", "getTxtSenderDateTime", "setTxtSenderDateTime", "txtSenderMessage", "getTxtSenderMessage", "setTxtSenderMessage", "onClick", "", "v", "app_debug"})
    public final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener {
        @org.jetbrains.annotations.NotNull()
        private android.widget.LinearLayout llSenderView;
        @org.jetbrains.annotations.NotNull()
        private android.widget.LinearLayout llReceiverView;
        @org.jetbrains.annotations.NotNull()
        private androidx.appcompat.widget.AppCompatTextView txtSenderMessage;
        @org.jetbrains.annotations.NotNull()
        private androidx.appcompat.widget.AppCompatTextView txtReceiverName;
        @org.jetbrains.annotations.NotNull()
        private androidx.appcompat.widget.AppCompatTextView txtSenderDateTime;
        @org.jetbrains.annotations.NotNull()
        private androidx.appcompat.widget.AppCompatTextView txtReceiverDateTime;
        @org.jetbrains.annotations.NotNull()
        private de.hdodenhof.circleimageview.CircleImageView img_profilePic;
        @org.jetbrains.annotations.NotNull()
        private android.widget.LinearLayout llViewDateTime;
        @org.jetbrains.annotations.NotNull()
        private androidx.appcompat.widget.AppCompatTextView txtDate;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.LinearLayout getLlSenderView() {
            return null;
        }
        
        public final void setLlSenderView(@org.jetbrains.annotations.NotNull()
        android.widget.LinearLayout p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.LinearLayout getLlReceiverView() {
            return null;
        }
        
        public final void setLlReceiverView(@org.jetbrains.annotations.NotNull()
        android.widget.LinearLayout p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getTxtSenderMessage() {
            return null;
        }
        
        public final void setTxtSenderMessage(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.AppCompatTextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getTxtReceiverName() {
            return null;
        }
        
        public final void setTxtReceiverName(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.AppCompatTextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getTxtSenderDateTime() {
            return null;
        }
        
        public final void setTxtSenderDateTime(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.AppCompatTextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getTxtReceiverDateTime() {
            return null;
        }
        
        public final void setTxtReceiverDateTime(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.AppCompatTextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final de.hdodenhof.circleimageview.CircleImageView getImg_profilePic() {
            return null;
        }
        
        public final void setImg_profilePic(@org.jetbrains.annotations.NotNull()
        de.hdodenhof.circleimageview.CircleImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.LinearLayout getLlViewDateTime() {
            return null;
        }
        
        public final void setLlViewDateTime(@org.jetbrains.annotations.NotNull()
        android.widget.LinearLayout p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getTxtDate() {
            return null;
        }
        
        public final void setTxtDate(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.AppCompatTextView p0) {
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
        }
    }
}