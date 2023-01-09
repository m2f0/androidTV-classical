package com.android.tv.classics.receivers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005\u00a2\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0003\u00a2\u0006\u0002\u0010\u000bJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0016JL\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00040\u0012H\u0002\u00a2\u0006\u0002\u0010\u0016\u00a8\u0006\u0018"}, d2 = {"Lcom/android/tv/classics/receivers/TvLauncherReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "getMediaItemFromProgramId", "Lcom/android/tv/classics/models/TvMediaMetadata;", "context", "Landroid/content/Context;", "db", "Lcom/android/tv/classics/models/TvMediaDatabase;", "programId", "", "(Landroid/content/Context;Lcom/android/tv/classics/models/TvMediaDatabase;Ljava/lang/Long;)Lcom/android/tv/classics/models/TvMediaMetadata;", "onReceive", "", "intent", "Landroid/content/Intent;", "updateMetadata", "action", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "metadata", "(Landroid/content/Context;Lcom/android/tv/classics/models/TvMediaDatabase;Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;", "Companion", "app_debug"})
public final class TvLauncherReceiver extends android.content.BroadcastReceiver {
    private static final java.lang.String TAG = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.android.tv.classics.receivers.TvLauncherReceiver.Companion Companion = null;
    
    /**
     * Execute the broadcast listener in a co-routine
     */
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    /**
     * Helper function used to update the media metadata for a given program ID
     */
    private final kotlin.Unit updateMetadata(android.content.Context context, com.android.tv.classics.models.TvMediaDatabase db, java.lang.Long programId, kotlin.jvm.functions.Function1<? super com.android.tv.classics.models.TvMediaMetadata, com.android.tv.classics.models.TvMediaMetadata> action) {
        return null;
    }
    
    /**
     * Helper method used to retrieve a metadata item object given its program ID. Restricted API
     * is being used to compared programs based on their ID.
     */
    @android.annotation.SuppressLint(value = {"RestrictedApi"})
    private final com.android.tv.classics.models.TvMediaMetadata getMediaItemFromProgramId(android.content.Context context, com.android.tv.classics.models.TvMediaDatabase db, java.lang.Long programId) {
        return null;
    }
    
    public TvLauncherReceiver() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/android/tv/classics/receivers/TvLauncherReceiver$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}