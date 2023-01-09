package com.android.tv.classics.workers;

import java.lang.System;

/**
 * Worker that parses metadata from our assets folder and synchronizes the database
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0002\t\nB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/android/tv/classics/workers/TvMediaSynchronizer;", "Landroidx/work/Worker;", "context", "Landroid/content/Context;", "params", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "Companion", "FeedParseResult", "app_debug"})
public final class TvMediaSynchronizer extends androidx.work.Worker {
    private final android.content.Context context = null;
    private static final java.lang.String TAG = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.android.tv.classics.workers.TvMediaSynchronizer.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.work.ListenableWorker.Result doWork() {
        return null;
    }
    
    public TvMediaSynchronizer(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    androidx.work.WorkerParameters params) {
        super(null, null);
    }
    
    /**
     * Helper data class used to pass results around functions
     */
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\u0002\u0010\tJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\u00c6\u0003J9\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b\u00a8\u0006\u0019"}, d2 = {"Lcom/android/tv/classics/workers/TvMediaSynchronizer$FeedParseResult;", "", "metadata", "", "Lcom/android/tv/classics/models/TvMediaMetadata;", "collections", "Lcom/android/tv/classics/models/TvMediaCollection;", "backgrounds", "Lcom/android/tv/classics/models/TvMediaBackground;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getBackgrounds", "()Ljava/util/List;", "getCollections", "getMetadata", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    static final class FeedParseResult {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.android.tv.classics.models.TvMediaMetadata> metadata = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.android.tv.classics.models.TvMediaCollection> collections = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.android.tv.classics.models.TvMediaBackground> backgrounds = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.android.tv.classics.models.TvMediaMetadata> getMetadata() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.android.tv.classics.models.TvMediaCollection> getCollections() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.android.tv.classics.models.TvMediaBackground> getBackgrounds() {
            return null;
        }
        
        public FeedParseResult(@org.jetbrains.annotations.NotNull()
        java.util.List<com.android.tv.classics.models.TvMediaMetadata> metadata, @org.jetbrains.annotations.NotNull()
        java.util.List<com.android.tv.classics.models.TvMediaCollection> collections, @org.jetbrains.annotations.NotNull()
        java.util.List<com.android.tv.classics.models.TvMediaBackground> backgrounds) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.android.tv.classics.models.TvMediaMetadata> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.android.tv.classics.models.TvMediaCollection> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.android.tv.classics.models.TvMediaBackground> component3() {
            return null;
        }
        
        /**
         * Helper data class used to pass results around functions
         */
        @org.jetbrains.annotations.NotNull()
        public final com.android.tv.classics.workers.TvMediaSynchronizer.FeedParseResult copy(@org.jetbrains.annotations.NotNull()
        java.util.List<com.android.tv.classics.models.TvMediaMetadata> metadata, @org.jetbrains.annotations.NotNull()
        java.util.List<com.android.tv.classics.models.TvMediaCollection> collections, @org.jetbrains.annotations.NotNull()
        java.util.List<com.android.tv.classics.models.TvMediaBackground> backgrounds) {
            return null;
        }
        
        /**
         * Helper data class used to pass results around functions
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        /**
         * Helper data class used to pass results around functions
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * Helper data class used to pass results around functions
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/android/tv/classics/workers/TvMediaSynchronizer$Companion;", "", "()V", "TAG", "", "parseMediaFeed", "Lcom/android/tv/classics/workers/TvMediaSynchronizer$FeedParseResult;", "context", "Landroid/content/Context;", "synchronize", "", "app_debug"})
    public static final class Companion {
        
        /**
         * Fetches the metadata feed from our assets folder and parses its metadata
         */
        private final com.android.tv.classics.workers.TvMediaSynchronizer.FeedParseResult parseMediaFeed(android.content.Context context) {
            return null;
        }
        
        /**
         * Parses metadata from our assets folder and synchronizes the database
         */
        public final synchronized void synchronize(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
        
        private Companion() {
            super();
        }
    }
}