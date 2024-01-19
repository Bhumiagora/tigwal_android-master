package com.tigwal.data.model.tap_payment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bO\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u00dd\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\u0012\b\u0002\u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010#\u0018\u00010\"\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\'\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-\u00a2\u0006\u0002\u0010.J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\u0010\u0010_\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003\u00a2\u0006\u0002\u00102J\u000b\u0010`\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0010\u0010a\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00107J\u0010\u0010b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00107J\u000b\u0010c\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u001bH\u00c6\u0003J\u0010\u0010e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00107J\u000b\u0010f\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0010\u0010g\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00107J\u0010\u0010h\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00107J\u000b\u0010i\u001a\u0004\u0018\u00010 H\u00c6\u0003J\u0013\u0010j\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010#\u0018\u00010\"H\u00c6\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010%H\u00c6\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\'H\u00c6\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010)H\u00c6\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010-H\u00c6\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u00e6\u0002\u0010x\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\u0012\b\u0002\u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010#\u0018\u00010\"2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\'2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-H\u00c6\u0001\u00a2\u0006\u0002\u0010yJ\u0013\u0010z\u001a\u00020\u00052\b\u0010{\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010|\u001a\u00020}H\u00d6\u0001J\t\u0010~\u001a\u00020\u0007H\u00d6\u0001R \u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010#\u0018\u00010\"8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u00103\u001a\u0004\b1\u00102R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u00108\u001a\u0004\b6\u00107R\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u00108\u001a\u0004\b9\u00107R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u00105R\u0018\u0010,\u001a\u0004\u0018\u00010-8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u00105R\u0018\u0010(\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u00105R\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u00108\u001a\u0004\bA\u00107R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u00105R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u00105R\u0018\u0010*\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u00105R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u00105R\u0018\u0010$\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u0010QR\u0018\u0010\u001f\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u00108\u001a\u0004\bT\u00107R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bW\u00105R\u0018\u0010+\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bX\u00105R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u00108\u001a\u0004\bY\u00107R\u0018\u0010&\u001a\u0004\u0018\u00010\'8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bZ\u0010[\u00a8\u0006\u007f"}, d2 = {"Lcom/tigwal/data/model/tap_payment/Data;", "", "metadata", "Lcom/tigwal/data/model/tap_payment/Metadata;", "threeDSecure", "", "description", "", "merchantId", "source", "Lcom/tigwal/data/model/tap_payment/Source;", "statementDescriptor", "reference", "Lcom/tigwal/data/model/tap_payment/Reference;", "post", "Lcom/tigwal/data/model/tap_payment/Post;", "currency", "id", "redirect", "Lcom/tigwal/data/model/tap_payment/Redirect;", "amount", "", "product", "autoReversed", "saveCard", "method", "merchant", "Lcom/tigwal/data/model/tap_payment/Merchant;", "cardThreeDSecure", "apiVersion", "liveMode", "response", "Lcom/tigwal/data/model/tap_payment/Response;", "activities", "", "Lcom/tigwal/data/model/tap_payment/ActivitiesItem;", "receipt", "Lcom/tigwal/data/model/tap_payment/Receipt;", "transaction", "Lcom/tigwal/data/model/tap_payment/Transaction;", "gateway", "Lcom/tigwal/data/model/tap_payment/Gateway;", "object11", "status", "customer", "Lcom/tigwal/data/model/tap_payment/Customer;", "(Lcom/tigwal/data/model/tap_payment/Metadata;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/tigwal/data/model/tap_payment/Source;Ljava/lang/String;Lcom/tigwal/data/model/tap_payment/Reference;Lcom/tigwal/data/model/tap_payment/Post;Ljava/lang/String;Ljava/lang/String;Lcom/tigwal/data/model/tap_payment/Redirect;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/tigwal/data/model/tap_payment/Merchant;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lcom/tigwal/data/model/tap_payment/Response;Ljava/util/List;Lcom/tigwal/data/model/tap_payment/Receipt;Lcom/tigwal/data/model/tap_payment/Transaction;Lcom/tigwal/data/model/tap_payment/Gateway;Ljava/lang/String;Ljava/lang/String;Lcom/tigwal/data/model/tap_payment/Customer;)V", "getActivities", "()Ljava/util/List;", "getAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getApiVersion", "()Ljava/lang/String;", "getAutoReversed", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCardThreeDSecure", "getCurrency", "getCustomer", "()Lcom/tigwal/data/model/tap_payment/Customer;", "getDescription", "getGateway", "()Lcom/tigwal/data/model/tap_payment/Gateway;", "getId", "getLiveMode", "getMerchant", "()Lcom/tigwal/data/model/tap_payment/Merchant;", "getMerchantId", "getMetadata", "()Lcom/tigwal/data/model/tap_payment/Metadata;", "getMethod", "getObject11", "getPost", "()Lcom/tigwal/data/model/tap_payment/Post;", "getProduct", "getReceipt", "()Lcom/tigwal/data/model/tap_payment/Receipt;", "getRedirect", "()Lcom/tigwal/data/model/tap_payment/Redirect;", "getReference", "()Lcom/tigwal/data/model/tap_payment/Reference;", "getResponse", "()Lcom/tigwal/data/model/tap_payment/Response;", "getSaveCard", "getSource", "()Lcom/tigwal/data/model/tap_payment/Source;", "getStatementDescriptor", "getStatus", "getThreeDSecure", "getTransaction", "()Lcom/tigwal/data/model/tap_payment/Transaction;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/tigwal/data/model/tap_payment/Metadata;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/tigwal/data/model/tap_payment/Source;Ljava/lang/String;Lcom/tigwal/data/model/tap_payment/Reference;Lcom/tigwal/data/model/tap_payment/Post;Ljava/lang/String;Ljava/lang/String;Lcom/tigwal/data/model/tap_payment/Redirect;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/tigwal/data/model/tap_payment/Merchant;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lcom/tigwal/data/model/tap_payment/Response;Ljava/util/List;Lcom/tigwal/data/model/tap_payment/Receipt;Lcom/tigwal/data/model/tap_payment/Transaction;Lcom/tigwal/data/model/tap_payment/Gateway;Ljava/lang/String;Ljava/lang/String;Lcom/tigwal/data/model/tap_payment/Customer;)Lcom/tigwal/data/model/tap_payment/Data;", "equals", "other", "hashCode", "", "toString", "app_release"})
public final class Data {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "metadata")
    private final com.tigwal.data.model.tap_payment.Metadata metadata = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "threeDSecure")
    private final java.lang.Boolean threeDSecure = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "description")
    private final java.lang.String description = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "merchant_id")
    private final java.lang.String merchantId = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "source")
    private final com.tigwal.data.model.tap_payment.Source source = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "statement_descriptor")
    private final java.lang.String statementDescriptor = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "reference")
    private final com.tigwal.data.model.tap_payment.Reference reference = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "post")
    private final com.tigwal.data.model.tap_payment.Post post = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "currency")
    private final java.lang.String currency = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "id")
    private final java.lang.String id = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "redirect")
    private final com.tigwal.data.model.tap_payment.Redirect redirect = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "amount")
    private final java.lang.Double amount = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "product")
    private final java.lang.String product = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "auto_reversed")
    private final java.lang.Boolean autoReversed = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "save_card")
    private final java.lang.Boolean saveCard = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "method")
    private final java.lang.String method = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "merchant")
    private final com.tigwal.data.model.tap_payment.Merchant merchant = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "card_threeDSecure")
    private final java.lang.Boolean cardThreeDSecure = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "api_version")
    private final java.lang.String apiVersion = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "live_mode")
    private final java.lang.Boolean liveMode = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "response")
    private final com.tigwal.data.model.tap_payment.Response response = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "activities")
    private final java.util.List<com.tigwal.data.model.tap_payment.ActivitiesItem> activities = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "receipt")
    private final com.tigwal.data.model.tap_payment.Receipt receipt = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "transaction")
    private final com.tigwal.data.model.tap_payment.Transaction transaction = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "gateway")
    private final com.tigwal.data.model.tap_payment.Gateway gateway = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "object")
    private final java.lang.String object11 = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "status")
    private final java.lang.String status = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "customer")
    private final com.tigwal.data.model.tap_payment.Customer customer = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.tigwal.data.model.tap_payment.Data copy(@org.jetbrains.annotations.Nullable()
    com.tigwal.data.model.tap_payment.Metadata metadata, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean threeDSecure, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    java.lang.String merchantId, @org.jetbrains.annotations.Nullable()
    com.tigwal.data.model.tap_payment.Source source, @org.jetbrains.annotations.Nullable()
    java.lang.String statementDescriptor, @org.jetbrains.annotations.Nullable()
    com.tigwal.data.model.tap_payment.Reference reference, @org.jetbrains.annotations.Nullable()
    com.tigwal.data.model.tap_payment.Post post, @org.jetbrains.annotations.Nullable()
    java.lang.String currency, @org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    com.tigwal.data.model.tap_payment.Redirect redirect, @org.jetbrains.annotations.Nullable()
    java.lang.Double amount, @org.jetbrains.annotations.Nullable()
    java.lang.String product, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean autoReversed, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean saveCard, @org.jetbrains.annotations.Nullable()
    java.lang.String method, @org.jetbrains.annotations.Nullable()
    com.tigwal.data.model.tap_payment.Merchant merchant, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean cardThreeDSecure, @org.jetbrains.annotations.Nullable()
    java.lang.String apiVersion, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean liveMode, @org.jetbrains.annotations.Nullable()
    com.tigwal.data.model.tap_payment.Response response, @org.jetbrains.annotations.Nullable()
    java.util.List<com.tigwal.data.model.tap_payment.ActivitiesItem> activities, @org.jetbrains.annotations.Nullable()
    com.tigwal.data.model.tap_payment.Receipt receipt, @org.jetbrains.annotations.Nullable()
    com.tigwal.data.model.tap_payment.Transaction transaction, @org.jetbrains.annotations.Nullable()
    com.tigwal.data.model.tap_payment.Gateway gateway, @org.jetbrains.annotations.Nullable()
    java.lang.String object11, @org.jetbrains.annotations.Nullable()
    java.lang.String status, @org.jetbrains.annotations.Nullable()
    com.tigwal.data.model.tap_payment.Customer customer) {
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
    com.tigwal.data.model.tap_payment.Metadata metadata, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean threeDSecure, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    java.lang.String merchantId, @org.jetbrains.annotations.Nullable()
    com.tigwal.data.model.tap_payment.Source source, @org.jetbrains.annotations.Nullable()
    java.lang.String statementDescriptor, @org.jetbrains.annotations.Nullable()
    com.tigwal.data.model.tap_payment.Reference reference, @org.jetbrains.annotations.Nullable()
    com.tigwal.data.model.tap_payment.Post post, @org.jetbrains.annotations.Nullable()
    java.lang.String currency, @org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    com.tigwal.data.model.tap_payment.Redirect redirect, @org.jetbrains.annotations.Nullable()
    java.lang.Double amount, @org.jetbrains.annotations.Nullable()
    java.lang.String product, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean autoReversed, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean saveCard, @org.jetbrains.annotations.Nullable()
    java.lang.String method, @org.jetbrains.annotations.Nullable()
    com.tigwal.data.model.tap_payment.Merchant merchant, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean cardThreeDSecure, @org.jetbrains.annotations.Nullable()
    java.lang.String apiVersion, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean liveMode, @org.jetbrains.annotations.Nullable()
    com.tigwal.data.model.tap_payment.Response response, @org.jetbrains.annotations.Nullable()
    java.util.List<com.tigwal.data.model.tap_payment.ActivitiesItem> activities, @org.jetbrains.annotations.Nullable()
    com.tigwal.data.model.tap_payment.Receipt receipt, @org.jetbrains.annotations.Nullable()
    com.tigwal.data.model.tap_payment.Transaction transaction, @org.jetbrains.annotations.Nullable()
    com.tigwal.data.model.tap_payment.Gateway gateway, @org.jetbrains.annotations.Nullable()
    java.lang.String object11, @org.jetbrains.annotations.Nullable()
    java.lang.String status, @org.jetbrains.annotations.Nullable()
    com.tigwal.data.model.tap_payment.Customer customer) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tigwal.data.model.tap_payment.Metadata component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tigwal.data.model.tap_payment.Metadata getMetadata() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getThreeDSecure() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMerchantId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tigwal.data.model.tap_payment.Source component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tigwal.data.model.tap_payment.Source getSource() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStatementDescriptor() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tigwal.data.model.tap_payment.Reference component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tigwal.data.model.tap_payment.Reference getReference() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tigwal.data.model.tap_payment.Post component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tigwal.data.model.tap_payment.Post getPost() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCurrency() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tigwal.data.model.tap_payment.Redirect component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tigwal.data.model.tap_payment.Redirect getRedirect() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getAmount() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getProduct() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getAutoReversed() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getSaveCard() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMethod() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tigwal.data.model.tap_payment.Merchant component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tigwal.data.model.tap_payment.Merchant getMerchant() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getCardThreeDSecure() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getApiVersion() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getLiveMode() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tigwal.data.model.tap_payment.Response component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tigwal.data.model.tap_payment.Response getResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.tigwal.data.model.tap_payment.ActivitiesItem> component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.tigwal.data.model.tap_payment.ActivitiesItem> getActivities() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tigwal.data.model.tap_payment.Receipt component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tigwal.data.model.tap_payment.Receipt getReceipt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tigwal.data.model.tap_payment.Transaction component24() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tigwal.data.model.tap_payment.Transaction getTransaction() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tigwal.data.model.tap_payment.Gateway component25() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tigwal.data.model.tap_payment.Gateway getGateway() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component26() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getObject11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component27() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tigwal.data.model.tap_payment.Customer component28() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tigwal.data.model.tap_payment.Customer getCustomer() {
        return null;
    }
}