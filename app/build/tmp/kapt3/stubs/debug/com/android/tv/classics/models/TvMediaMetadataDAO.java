package com.android.tv.classics.models;

import java.lang.System;

/**
 * Data access object for the [TvMediaMetadata] class
 */
@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\'J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\'J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u0006\u0010\r\u001a\u00020\u0005H\'J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u0005H\'J!\u0010\u0010\u001a\u00020\u00072\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\u0011\"\u00020\tH\'\u00a2\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0007H\'J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\'\u00a8\u0006\u0015"}, d2 = {"Lcom/android/tv/classics/models/TvMediaMetadataDAO;", "", "contentProviderQuery", "Landroid/database/Cursor;", "title", "", "delete", "", "metadata", "Lcom/android/tv/classics/models/TvMediaMetadata;", "findAll", "", "findByCollection", "collectionId", "findById", "id", "insert", "", "([Lcom/android/tv/classics/models/TvMediaMetadata;)V", "truncate", "update", "app_debug"})
public abstract interface TvMediaMetadataDAO {
    
    /**
     * Builds a projection for content provider search results using the mappings described in
     * https://developer.android.com/training/tv/discovery/searchable.html#columns.
     */
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT id as _id, id as suggest_intent_data_id, title as suggest_text_1, description as suggest_text_2, artUri as suggest_result_card_image, year as suggest_production_year, playbackDurationMillis as suggest_duration FROM tvmediametadata WHERE :title LIKE \'%\' || searchableTitle || \'%\'")
    public abstract android.database.Cursor contentProviderQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String title);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM tvmediametadata")
    public abstract java.util.List<com.android.tv.classics.models.TvMediaMetadata> findAll();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM tvmediametadata WHERE id = :id LIMIT 1")
    public abstract com.android.tv.classics.models.TvMediaMetadata findById(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM tvmediametadata WHERE collectionId = :collectionId")
    public abstract java.util.List<com.android.tv.classics.models.TvMediaMetadata> findByCollection(@org.jetbrains.annotations.NotNull()
    java.lang.String collectionId);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.android.tv.classics.models.TvMediaMetadata... metadata);
    
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    com.android.tv.classics.models.TvMediaMetadata metadata);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.android.tv.classics.models.TvMediaMetadata metadata);
    
    @androidx.room.Query(value = "DELETE FROM tvmediametadata")
    public abstract void truncate();
}