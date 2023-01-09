package com.android.tv.classics.utils;

import java.lang.System;

/**
 * Collection of static methods used to handle Android TV Home Screen Launcher operations
 */
@android.annotation.SuppressLint(value = {"RestrictedApi"})
@androidx.annotation.RequiresApi(value = 26)
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/android/tv/classics/utils/TvLauncherUtils;", "", "()V", "Companion", "app_debug"})
public final class TvLauncherUtils {
    private static final java.lang.String TAG = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.android.tv.classics.utils.TvLauncherUtils.Companion Companion = null;
    
    private TvLauncherUtils() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J%\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\fJ\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\u0002\u0010\u0016J\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001aJ\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001a\u00a2\u0006\u0002\u0010\u001cJ\u0016\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0012J5\u0010!\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00062\b\b\u0002\u0010#\u001a\u00020$\u00a2\u0006\u0002\u0010%J\u001d\u0010&\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001a\u00a2\u0006\u0002\u0010\u001cR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/android/tv/classics/utils/TvLauncherUtils$Companion;", "", "()V", "TAG", "", "getPreviewPrograms", "", "Landroidx/tvprovider/media/tv/PreviewProgram;", "context", "Landroid/content/Context;", "channelId", "", "(Landroid/content/Context;Ljava/lang/Long;)Ljava/util/List;", "getWatchNextPrograms", "Landroidx/tvprovider/media/tv/WatchNextProgram;", "parseAspectRatio", "Landroid/util/Rational;", "ratioConstant", "", "removeChannel", "collection", "Lcom/android/tv/classics/models/TvMediaCollection;", "(Landroid/content/Context;Lcom/android/tv/classics/models/TvMediaCollection;)Ljava/lang/Long;", "removeFromWatchNext", "Landroid/net/Uri;", "metadata", "Lcom/android/tv/classics/models/TvMediaMetadata;", "removeProgram", "(Landroid/content/Context;Lcom/android/tv/classics/models/TvMediaMetadata;)Ljava/lang/Long;", "resourceUri", "resources", "Landroid/content/res/Resources;", "id", "upsertChannel", "metadatas", "clearPrograms", "", "(Landroid/content/Context;Lcom/android/tv/classics/models/TvMediaCollection;Ljava/util/List;Z)Ljava/lang/Long;", "upsertWatchNext", "app_debug"})
    public static final class Companion {
        
        /**
         * Helper function used to get the URI of something from the resources folder
         */
        @org.jetbrains.annotations.NotNull()
        public final android.net.Uri resourceUri(@org.jetbrains.annotations.NotNull()
        android.content.res.Resources resources, int id) {
            return null;
        }
        
        /**
         * Parse an aspect ratio constant into the equivalent rational number. For example,
         * [TvContractCompat.PreviewPrograms.ASPECT_RATIO_16_9] becomes `Rational(16, 9)`. The
         * constant must be one of ASPECT_RATIO_* in [TvContractCompat.PreviewPrograms].
         */
        @org.jetbrains.annotations.NotNull()
        public final android.util.Rational parseAspectRatio(int ratioConstant) {
            return null;
        }
        
        /**
         * Retrieve the preview programs associated with the given channel ID or, if ID is null,
         * return all programs associated with any channel.
         */
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<androidx.tvprovider.media.tv.PreviewProgram> getPreviewPrograms(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.Nullable()
        java.lang.Long channelId) {
            return null;
        }
        
        /**
         * Retrieve all programs in watch next row that are ours
         */
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<androidx.tvprovider.media.tv.WatchNextProgram> getWatchNextPrograms(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        /**
         * Remove a program given a [TvMediaMetadata] object
         */
        @org.jetbrains.annotations.Nullable()
        public final synchronized java.lang.Long removeProgram(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        com.android.tv.classics.models.TvMediaMetadata metadata) {
            return null;
        }
        
        /**
         * Insert or update a channel given a [TvMediaCollection] object. Setting the argument
         * [clearPrograms] to true makes sure that the channel end up with only the items in
         * the [metadatas] argument.
         */
        @org.jetbrains.annotations.Nullable()
        public final synchronized java.lang.Long upsertChannel(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        com.android.tv.classics.models.TvMediaCollection collection, @org.jetbrains.annotations.NotNull()
        java.util.List<com.android.tv.classics.models.TvMediaMetadata> metadatas, boolean clearPrograms) {
            return null;
        }
        
        /**
         * Remove a [TvMediaCollection] object from the channel list
         */
        @org.jetbrains.annotations.Nullable()
        public final synchronized java.lang.Long removeChannel(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        com.android.tv.classics.models.TvMediaCollection collection) {
            return null;
        }
        
        /**
         * Insert or update a [TvMediaMetadata] into the watch next row
         */
        @org.jetbrains.annotations.Nullable()
        public final synchronized java.lang.Long upsertWatchNext(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        com.android.tv.classics.models.TvMediaMetadata metadata) {
            return null;
        }
        
        /**
         * Remove a [TvMediaMetadata] object from the watch next row
         */
        @org.jetbrains.annotations.Nullable()
        public final synchronized android.net.Uri removeFromWatchNext(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        com.android.tv.classics.models.TvMediaMetadata metadata) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}