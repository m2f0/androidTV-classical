package com.android.tv.classics.models;

import java.lang.System;

/**
 * Room database implementation
 */
@androidx.room.Database(version = 1, entities = {com.android.tv.classics.models.TvMediaMetadata.class, com.android.tv.classics.models.TvMediaCollection.class, com.android.tv.classics.models.TvMediaBackground.class})
@androidx.room.TypeConverters(value = {com.android.tv.classics.models.TvMediaConverters.class})
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\n"}, d2 = {"Lcom/android/tv/classics/models/TvMediaDatabase;", "Landroidx/room/RoomDatabase;", "()V", "backgrounds", "Lcom/android/tv/classics/models/TvMediaBackgroundDAO;", "collections", "Lcom/android/tv/classics/models/TvMediaCollectionDAO;", "metadata", "Lcom/android/tv/classics/models/TvMediaMetadataDAO;", "Companion", "app_debug"})
public abstract class TvMediaDatabase extends androidx.room.RoomDatabase {
    private static final java.lang.String DATABASE_NAME = null;
    
    /**
     * Singleton property
     */
    private static volatile com.android.tv.classics.models.TvMediaDatabase INSTANCE;
    @org.jetbrains.annotations.NotNull()
    public static final com.android.tv.classics.models.TvMediaDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.android.tv.classics.models.TvMediaMetadataDAO metadata();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.android.tv.classics.models.TvMediaCollectionDAO collections();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.android.tv.classics.models.TvMediaBackgroundDAO backgrounds();
    
    public TvMediaDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/android/tv/classics/models/TvMediaDatabase$Companion;", "", "()V", "DATABASE_NAME", "", "INSTANCE", "Lcom/android/tv/classics/models/TvMediaDatabase;", "getInstance", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        /**
         * Convenience method used to get an instance of our database, taken from official codelab:
         * https://codelabs.developers.google.com/codelabs/android-room-with-a-view-kotlin/#6
         */
        @org.jetbrains.annotations.NotNull()
        public final com.android.tv.classics.models.TvMediaDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}