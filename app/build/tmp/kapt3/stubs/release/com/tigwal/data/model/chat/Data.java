package com.tigwal.data.model.chat;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012 \b\u0002\u0010\u0002\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003j\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u0001`\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ!\u0010\r\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003j\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u0001`\u0005H\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J7\u0010\u000f\u001a\u00020\u00002 \b\u0002\u0010\u0002\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003j\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u0001`\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R.\u0010\u0002\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003j\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u0001`\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0017"}, d2 = {"Lcom/tigwal/data/model/chat/Data;", "", "chat", "Ljava/util/ArrayList;", "Lcom/tigwal/data/model/chat/ChatItem;", "Lkotlin/collections/ArrayList;", "userprofile", "Lcom/tigwal/data/model/chat/Userprofile;", "(Ljava/util/ArrayList;Lcom/tigwal/data/model/chat/Userprofile;)V", "getChat", "()Ljava/util/ArrayList;", "getUserprofile", "()Lcom/tigwal/data/model/chat/Userprofile;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"})
public final class Data {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "chat")
    private final java.util.ArrayList<com.tigwal.data.model.chat.ChatItem> chat = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "userprofile")
    private final com.tigwal.data.model.chat.Userprofile userprofile = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.tigwal.data.model.chat.Data copy(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.tigwal.data.model.chat.ChatItem> chat, @org.jetbrains.annotations.Nullable()
    com.tigwal.data.model.chat.Userprofile userprofile) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Data() {
        super();
    }
    
    public Data(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.tigwal.data.model.chat.ChatItem> chat, @org.jetbrains.annotations.Nullable()
    com.tigwal.data.model.chat.Userprofile userprofile) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.tigwal.data.model.chat.ChatItem> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.tigwal.data.model.chat.ChatItem> getChat() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tigwal.data.model.chat.Userprofile component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tigwal.data.model.chat.Userprofile getUserprofile() {
        return null;
    }
}