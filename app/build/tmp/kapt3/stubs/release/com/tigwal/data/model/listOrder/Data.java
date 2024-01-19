package com.tigwal.data.model.listOrder;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012 \b\u0002\u0010\u0002\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003j\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u0001`\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ!\u0010\u000e\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003j\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u0001`\u0005H\u00c6\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\fJ<\u0010\u0010\u001a\u00020\u00002 \b\u0002\u0010\u0002\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003j\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u0001`\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R.\u0010\u0002\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003j\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u0001`\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lcom/tigwal/data/model/listOrder/Data;", "", "orders", "Ljava/util/ArrayList;", "Lcom/tigwal/data/model/listOrder/OrdersItem;", "Lkotlin/collections/ArrayList;", "totalOrders", "", "(Ljava/util/ArrayList;Ljava/lang/Integer;)V", "getOrders", "()Ljava/util/ArrayList;", "getTotalOrders", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/util/ArrayList;Ljava/lang/Integer;)Lcom/tigwal/data/model/listOrder/Data;", "equals", "", "other", "hashCode", "toString", "", "app_release"})
public final class Data {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "orders")
    private final java.util.ArrayList<com.tigwal.data.model.listOrder.OrdersItem> orders = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "total_orders")
    private final java.lang.Integer totalOrders = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.tigwal.data.model.listOrder.Data copy(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.tigwal.data.model.listOrder.OrdersItem> orders, @org.jetbrains.annotations.Nullable()
    java.lang.Integer totalOrders) {
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
    java.util.ArrayList<com.tigwal.data.model.listOrder.OrdersItem> orders, @org.jetbrains.annotations.Nullable()
    java.lang.Integer totalOrders) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.tigwal.data.model.listOrder.OrdersItem> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.tigwal.data.model.listOrder.OrdersItem> getOrders() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTotalOrders() {
        return null;
    }
}