package com.tigwal.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\'\u00a8\u0006\t"}, d2 = {"Lcom/tigwal/data/api/ApiInterfaceTAP;", "", "refunds", "Lretrofit2/Call;", "Lcom/tigwal/data/model/cancel_order/RefundApiResponse;", "token", "", "params", "Lokhttp3/RequestBody;", "app_debug"})
public abstract interface ApiInterfaceTAP {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "refunds")
    @retrofit2.http.Headers(value = {"Content-Type:application/json"})
    public abstract retrofit2.Call<com.tigwal.data.model.cancel_order.RefundApiResponse> refunds(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    okhttp3.RequestBody params);
}