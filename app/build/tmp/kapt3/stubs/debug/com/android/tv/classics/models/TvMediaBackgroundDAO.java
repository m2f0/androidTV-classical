package com.android.tv.classics.models;

import java.lang.System;

/**
 * Data access object for the [TvMediaBackground] class
 */
@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\'J!\u0010\b\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t\"\u00020\u0005H\'\u00a2\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\u0003H\'J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\r"}, d2 = {"Lcom/android/tv/classics/models/TvMediaBackgroundDAO;", "", "delete", "", "item", "Lcom/android/tv/classics/models/TvMediaBackground;", "findAll", "", "insert", "", "([Lcom/android/tv/classics/models/TvMediaBackground;)V", "truncate", "update", "app_debug"})
public abstract interface TvMediaBackgroundDAO {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM tvmediabackground")
    public abstract java.util.List<com.android.tv.classics.models.TvMediaBackground> findAll();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.android.tv.classics.models.TvMediaBackground... item);
    
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    com.android.tv.classics.models.TvMediaBackground item);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.android.tv.classics.models.TvMediaBackground item);
    
    @androidx.room.Query(value = "DELETE FROM tvmediabackground")
    public abstract void truncate();
}