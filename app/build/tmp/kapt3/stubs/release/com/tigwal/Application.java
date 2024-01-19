package com.tigwal;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \n2\u00020\u00012\u00020\u0002:\u0001\nB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/tigwal/Application;", "Lorg/kodein/di/KodeinAware;", "Landroidx/multidex/MultiDexApplication;", "()V", "kodein", "Lorg/kodein/di/LazyKodein;", "getKodein", "()Lorg/kodein/di/LazyKodein;", "onCreate", "", "Companion", "app_release"})
public class Application extends androidx.multidex.MultiDexApplication implements org.kodein.di.KodeinAware {
    @org.jetbrains.annotations.NotNull()
    public static final com.tigwal.Application.Companion Companion = null;
    @org.jetbrains.annotations.Nullable()
    private static android.app.Application application;
    @org.jetbrains.annotations.NotNull()
    private final org.kodein.di.LazyKodein kodein = null;
    
    public Application() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final android.app.Application getApplication() {
        return null;
    }
    
    private static final void setApplication(android.app.Application p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.kodein.di.LazyKodein getKodein() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.kodein.di.KodeinContext<?> getKodeinContext() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public org.kodein.di.KodeinTrigger getKodeinTrigger() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R0\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@BX\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/tigwal/Application$Companion;", "", "()V", "<set-?>", "Landroid/app/Application;", "application", "getApplication$annotations", "getApplication", "()Landroid/app/Application;", "setApplication", "(Landroid/app/Application;)V", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.app.Application getApplication() {
            return null;
        }
        
        @kotlin.jvm.JvmStatic()
        @java.lang.Deprecated()
        public static void getApplication$annotations() {
        }
        
        private final void setApplication(android.app.Application p0) {
        }
    }
}