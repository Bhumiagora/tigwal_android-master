package com.tigwal.data.model.product_detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012 \b\u0002\u0010\u0002\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003j\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u0001`\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ!\u0010\r\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003j\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u0001`\u0005H\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J7\u0010\u000f\u001a\u00020\u00002 \b\u0002\u0010\u0002\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003j\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u0001`\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR.\u0010\u0002\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003j\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u0001`\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0017"}, d2 = {"Lcom/tigwal/data/model/product_detail/Data;", "", "relatedData", "Ljava/util/ArrayList;", "Lcom/tigwal/data/model/product_detail/RelatedDataItem;", "Lkotlin/collections/ArrayList;", "location", "Lcom/tigwal/data/model/product_detail/Location;", "(Ljava/util/ArrayList;Lcom/tigwal/data/model/product_detail/Location;)V", "getLocation", "()Lcom/tigwal/data/model/product_detail/Location;", "getRelatedData", "()Ljava/util/ArrayList;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"})
public final class Data {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "related_Data")
    private final java.util.ArrayList<com.tigwal.data.model.product_detail.RelatedDataItem> relatedData = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "location")
    private final com.tigwal.data.model.product_detail.Location location = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.tigwal.data.model.product_detail.Data copy(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.tigwal.data.model.product_detail.RelatedDataItem> relatedData, @org.jetbrains.annotations.Nullable()
    com.tigwal.data.model.product_detail.Location location) {
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
    java.util.ArrayList<com.tigwal.data.model.product_detail.RelatedDataItem> relatedData, @org.jetbrains.annotations.Nullable()
    com.tigwal.data.model.product_detail.Location location) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.tigwal.data.model.product_detail.RelatedDataItem> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.tigwal.data.model.product_detail.RelatedDataItem> getRelatedData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tigwal.data.model.product_detail.Location component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tigwal.data.model.product_detail.Location getLocation() {
        return null;
    }
}