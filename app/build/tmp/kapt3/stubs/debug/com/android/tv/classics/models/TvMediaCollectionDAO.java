package com.android.tv.classics.models;

import java.lang.System;

/**
 * Data access object for the [TvMediaCollection] class
 */
@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\'J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\'J!\u0010\u000b\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\f\"\u00020\u0005H\'\u00a2\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u0003H\'J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0010"}, d2 = {"Lcom/android/tv/classics/models/TvMediaCollectionDAO;", "", "delete", "", "item", "Lcom/android/tv/classics/models/TvMediaCollection;", "findAll", "", "findById", "id", "", "insert", "", "([Lcom/android/tv/classics/models/TvMediaCollection;)V", "truncate", "update", "app_debug"})
public abstract interface TvMediaCollectionDAO {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM tvmediacollection")
    public abstract java.util.List<com.android.tv.classics.models.TvMediaCollection> findAll();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM tvmediacollection WHERE id LIKE :id LIMIT 1")
    public abstract com.android.tv.classics.models.TvMediaCollection findById(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.android.tv.classics.models.TvMediaCollection... item);
    
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    com.android.tv.classics.models.TvMediaCollection item);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.android.tv.classics.models.TvMediaCollection item);
    
    @androidx.room.Query(value = "DELETE FROM tvmediacollection")
    public abstract void truncate();
}