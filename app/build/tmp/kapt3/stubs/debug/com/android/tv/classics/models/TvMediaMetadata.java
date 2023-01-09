package com.android.tv.classics.models;

import java.lang.System;

/**
 * Data class representing a piece of content metadata (title, content URI, state-related fields
 * [playback position], etc.)
 */
@kotlinx.android.parcel.Parcelize()
@androidx.room.Entity()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\bJ\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 r2\u00020\u0001:\u0001rB\u00cf\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u001aJ\t\u0010M\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010N\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010H\u00c6\u0003J\u0011\u0010O\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010H\u00c6\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010Q\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010EJ\u000b\u0010R\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\t\u0010S\u001a\u00020\u000bH\u00c6\u0003J\t\u0010T\u001a\u00020\u0017H\u00c6\u0003J\t\u0010U\u001a\u00020\u0017H\u00c6\u0003J\t\u0010V\u001a\u00020\u000bH\u00c6\u0003J\t\u0010W\u001a\u00020\u0003H\u00c6\u0003J\t\u0010X\u001a\u00020\u0003H\u00c6\u0003J\t\u0010Y\u001a\u00020\u0003H\u00c6\u0003J\t\u0010Z\u001a\u00020\bH\u00c6\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\\\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010EJ\u0010\u0010]\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0002\u00107J\u0010\u0010^\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0002\u00107J\u00e0\u0001\u0010_\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00102\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u000bH\u00c6\u0001\u00a2\u0006\u0002\u0010`J!\u0010a\u001a\u00020b\"\f\b\u0000\u0010c*\u0006\u0012\u0002\b\u00030d2\u0006\u0010e\u001a\u0002Hc\u00a2\u0006\u0002\u0010fJ\t\u0010g\u001a\u00020\u000bH\u00d6\u0001J\u0013\u0010h\u001a\u00020\u00172\b\u0010i\u001a\u0004\u0018\u00010jH\u0096\u0002J\b\u0010k\u001a\u00020\u000bH\u0016J\b\u0010l\u001a\u00020\u0017H\u0002J\t\u0010m\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010n\u001a\u00020b2\u0006\u0010o\u001a\u00020p2\u0006\u0010q\u001a\u00020\u000bH\u00d6\u0001R\u001a\u0010\u0015\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010$\"\u0004\b(\u0010&R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010 \"\u0004\b*\u0010\"R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010$\"\u0004\b,\u0010&R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010$R\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010:\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010:\u001a\u0004\b;\u00107\"\u0004\b<\u00109R\u001a\u0010\u0019\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u001c\"\u0004\b>\u0010\u001eR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010.\"\u0004\b@\u00100R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010$R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010$\"\u0004\bC\u0010&R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010H\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001a\u0010\u0018\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u00102\"\u0004\bJ\u00104R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010H\u001a\u0004\bK\u0010E\"\u0004\bL\u0010G\u00a8\u0006s"}, d2 = {"Lcom/android/tv/classics/models/TvMediaMetadata;", "Landroid/os/Parcelable;", "id", "", "collectionId", "title", "searchableTitle", "contentUri", "Landroid/net/Uri;", "author", "year", "", "playbackDurationMillis", "", "playbackPositionMillis", "ratings", "", "genres", "description", "trackNumber", "artUri", "artAspectRatio", "hidden", "", "watchNext", "programType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Landroid/net/Uri;IZZI)V", "getArtAspectRatio", "()I", "setArtAspectRatio", "(I)V", "getArtUri", "()Landroid/net/Uri;", "setArtUri", "(Landroid/net/Uri;)V", "getAuthor", "()Ljava/lang/String;", "setAuthor", "(Ljava/lang/String;)V", "getCollectionId", "setCollectionId", "getContentUri", "setContentUri", "getDescription", "setDescription", "getGenres", "()Ljava/util/List;", "setGenres", "(Ljava/util/List;)V", "getHidden", "()Z", "setHidden", "(Z)V", "getId", "getPlaybackDurationMillis", "()Ljava/lang/Long;", "setPlaybackDurationMillis", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getPlaybackPositionMillis", "setPlaybackPositionMillis", "getProgramType", "setProgramType", "getRatings", "setRatings", "getSearchableTitle", "getTitle", "setTitle", "getTrackNumber", "()Ljava/lang/Integer;", "setTrackNumber", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getWatchNext", "setWatchNext", "getYear", "setYear", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Landroid/net/Uri;IZZI)Lcom/android/tv/classics/models/TvMediaMetadata;", "copyToBuilder", "", "T", "Landroidx/tvprovider/media/tv/BasePreviewProgram$Builder;", "builder", "(Landroidx/tvprovider/media/tv/BasePreviewProgram$Builder;)V", "describeContents", "equals", "other", "", "hashCode", "isStateless", "toString", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "app_debug"})
public final class TvMediaMetadata implements android.os.Parcelable {
    
    /**
     * User-provided identifier for this piece of content
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.PrimaryKey()
    private final java.lang.String id = null;
    
    /**
     * Each metadata item can only be part of one collection
     */
    @org.jetbrains.annotations.NotNull()
    private java.lang.String collectionId;
    
    /**
     * Title displayed to user
     */
    @org.jetbrains.annotations.NotNull()
    private java.lang.String title;
    
    /**
     * Store a searchable version of the title as a property]
     */
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String searchableTitle = null;
    
    /**
     * URI for the content to be played
     */
    @org.jetbrains.annotations.NotNull()
    private android.net.Uri contentUri;
    
    /**
     * Author of the metadata content
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.String author;
    
    /**
     * Year in which the metadata content was released
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer year;
    
    /**
     * Duration in seconds of the metadata content
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long playbackDurationMillis;
    
    /**
     * Current playback position for this piece of content
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long playbackPositionMillis;
    
    /**
     * Content ratings (e.g. G, PG, R)
     */
    @org.jetbrains.annotations.Nullable()
    private java.util.List<java.lang.String> ratings;
    
    /**
     * Content genres, from TvContractCompat.Programs.Genres
     */
    @org.jetbrains.annotations.Nullable()
    private java.util.List<java.lang.String> genres;
    
    /**
     * Short description of the content shown to users
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.String description;
    
    /**
     * Track or episode number for this piece of metadata
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer trackNumber;
    
    /**
     * URI pointing to the album or poster art
     */
    @org.jetbrains.annotations.Nullable()
    private android.net.Uri artUri;
    
    /**
     * Aspect ratio for the art, must be one of the constants under
     * [TvContractCompat.PreviewPrograms]. Defaults to movie poster.
     */
    private int artAspectRatio;
    
    /**
     * Flag indicating if it's hidden from home screen channel
     */
    private boolean hidden;
    
    /**
     * Flag indicating if it's added to watch next channel
     */
    private boolean watchNext;
    
    /**
     * The type of program. Defaults to movie, must be one of PreviewProgramColumns.TYPE_...
     */
    private int programType;
    @org.jetbrains.annotations.NotNull()
    public static final com.android.tv.classics.models.TvMediaMetadata.Companion Companion = null;
    public static final android.os.Parcelable.Creator<com.android.tv.classics.models.TvMediaMetadata> CREATOR = null;
    
    /**
     * Determine if an instance of this class carries state based on whether the fields below have
     * anything other than the default values.
     */
    private final boolean isStateless() {
        return false;
    }
    
    /**
     * Compares only fields not related to the state
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * We must override [hashCode] if we override the [equals] function
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Helper function used to copy as much information as possible into a program builder
     */
    public final <T extends androidx.tvprovider.media.tv.BasePreviewProgram.Builder<?>>void copyToBuilder(@org.jetbrains.annotations.NotNull()
    T builder) {
    }
    
    /**
     * User-provided identifier for this piece of content
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    /**
     * Each metadata item can only be part of one collection
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCollectionId() {
        return null;
    }
    
    /**
     * Each metadata item can only be part of one collection
     */
    public final void setCollectionId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    /**
     * Title displayed to user
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    /**
     * Title displayed to user
     */
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    /**
     * Store a searchable version of the title as a property]
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSearchableTitle() {
        return null;
    }
    
    /**
     * URI for the content to be played
     */
    @org.jetbrains.annotations.NotNull()
    public final android.net.Uri getContentUri() {
        return null;
    }
    
    /**
     * URI for the content to be played
     */
    public final void setContentUri(@org.jetbrains.annotations.NotNull()
    android.net.Uri p0) {
    }
    
    /**
     * Author of the metadata content
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAuthor() {
        return null;
    }
    
    /**
     * Author of the metadata content
     */
    public final void setAuthor(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    /**
     * Year in which the metadata content was released
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getYear() {
        return null;
    }
    
    /**
     * Year in which the metadata content was released
     */
    public final void setYear(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    /**
     * Duration in seconds of the metadata content
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getPlaybackDurationMillis() {
        return null;
    }
    
    /**
     * Duration in seconds of the metadata content
     */
    public final void setPlaybackDurationMillis(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    /**
     * Current playback position for this piece of content
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getPlaybackPositionMillis() {
        return null;
    }
    
    /**
     * Current playback position for this piece of content
     */
    public final void setPlaybackPositionMillis(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    /**
     * Content ratings (e.g. G, PG, R)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getRatings() {
        return null;
    }
    
    /**
     * Content ratings (e.g. G, PG, R)
     */
    public final void setRatings(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> p0) {
    }
    
    /**
     * Content genres, from TvContractCompat.Programs.Genres
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getGenres() {
        return null;
    }
    
    /**
     * Content genres, from TvContractCompat.Programs.Genres
     */
    public final void setGenres(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> p0) {
    }
    
    /**
     * Short description of the content shown to users
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    /**
     * Short description of the content shown to users
     */
    public final void setDescription(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    /**
     * Track or episode number for this piece of metadata
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTrackNumber() {
        return null;
    }
    
    /**
     * Track or episode number for this piece of metadata
     */
    public final void setTrackNumber(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    /**
     * URI pointing to the album or poster art
     */
    @org.jetbrains.annotations.Nullable()
    public final android.net.Uri getArtUri() {
        return null;
    }
    
    /**
     * URI pointing to the album or poster art
     */
    public final void setArtUri(@org.jetbrains.annotations.Nullable()
    android.net.Uri p0) {
    }
    
    /**
     * Aspect ratio for the art, must be one of the constants under
     * [TvContractCompat.PreviewPrograms]. Defaults to movie poster.
     */
    public final int getArtAspectRatio() {
        return 0;
    }
    
    /**
     * Aspect ratio for the art, must be one of the constants under
     * [TvContractCompat.PreviewPrograms]. Defaults to movie poster.
     */
    public final void setArtAspectRatio(int p0) {
    }
    
    /**
     * Flag indicating if it's hidden from home screen channel
     */
    public final boolean getHidden() {
        return false;
    }
    
    /**
     * Flag indicating if it's hidden from home screen channel
     */
    public final void setHidden(boolean p0) {
    }
    
    /**
     * Flag indicating if it's added to watch next channel
     */
    public final boolean getWatchNext() {
        return false;
    }
    
    /**
     * Flag indicating if it's added to watch next channel
     */
    public final void setWatchNext(boolean p0) {
    }
    
    /**
     * The type of program. Defaults to movie, must be one of PreviewProgramColumns.TYPE_...
     */
    public final int getProgramType() {
        return 0;
    }
    
    /**
     * The type of program. Defaults to movie, must be one of PreviewProgramColumns.TYPE_...
     */
    public final void setProgramType(int p0) {
    }
    
    public TvMediaMetadata(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String collectionId, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String searchableTitle, @org.jetbrains.annotations.NotNull()
    android.net.Uri contentUri, @org.jetbrains.annotations.Nullable()
    java.lang.String author, @org.jetbrains.annotations.Nullable()
    java.lang.Integer year, @org.jetbrains.annotations.Nullable()
    java.lang.Long playbackDurationMillis, @org.jetbrains.annotations.Nullable()
    java.lang.Long playbackPositionMillis, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> ratings, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> genres, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    java.lang.Integer trackNumber, @org.jetbrains.annotations.Nullable()
    android.net.Uri artUri, int artAspectRatio, boolean hidden, boolean watchNext, int programType) {
        super();
    }
    
    /**
     * User-provided identifier for this piece of content
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    /**
     * Each metadata item can only be part of one collection
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    /**
     * Title displayed to user
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    /**
     * Store a searchable version of the title as a property]
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    /**
     * URI for the content to be played
     */
    @org.jetbrains.annotations.NotNull()
    public final android.net.Uri component5() {
        return null;
    }
    
    /**
     * Author of the metadata content
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    /**
     * Year in which the metadata content was released
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component7() {
        return null;
    }
    
    /**
     * Duration in seconds of the metadata content
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component8() {
        return null;
    }
    
    /**
     * Current playback position for this piece of content
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component9() {
        return null;
    }
    
    /**
     * Content ratings (e.g. G, PG, R)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component10() {
        return null;
    }
    
    /**
     * Content genres, from TvContractCompat.Programs.Genres
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component11() {
        return null;
    }
    
    /**
     * Short description of the content shown to users
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    /**
     * Track or episode number for this piece of metadata
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component13() {
        return null;
    }
    
    /**
     * URI pointing to the album or poster art
     */
    @org.jetbrains.annotations.Nullable()
    public final android.net.Uri component14() {
        return null;
    }
    
    /**
     * Aspect ratio for the art, must be one of the constants under
     * [TvContractCompat.PreviewPrograms]. Defaults to movie poster.
     */
    public final int component15() {
        return 0;
    }
    
    /**
     * Flag indicating if it's hidden from home screen channel
     */
    public final boolean component16() {
        return false;
    }
    
    /**
     * Flag indicating if it's added to watch next channel
     */
    public final boolean component17() {
        return false;
    }
    
    /**
     * The type of program. Defaults to movie, must be one of PreviewProgramColumns.TYPE_...
     */
    public final int component18() {
        return 0;
    }
    
    /**
     * Data class representing a piece of content metadata (title, content URI, state-related fields
     * [playback position], etc.)
     */
    @org.jetbrains.annotations.NotNull()
    public final com.android.tv.classics.models.TvMediaMetadata copy(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String collectionId, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String searchableTitle, @org.jetbrains.annotations.NotNull()
    android.net.Uri contentUri, @org.jetbrains.annotations.Nullable()
    java.lang.String author, @org.jetbrains.annotations.Nullable()
    java.lang.Integer year, @org.jetbrains.annotations.Nullable()
    java.lang.Long playbackDurationMillis, @org.jetbrains.annotations.Nullable()
    java.lang.Long playbackPositionMillis, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> ratings, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> genres, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    java.lang.Integer trackNumber, @org.jetbrains.annotations.Nullable()
    android.net.Uri artUri, int artAspectRatio, boolean hidden, boolean watchNext, int programType) {
        return null;
    }
    
    /**
     * Data class representing a piece of content metadata (title, content URI, state-related fields
     * [playback position], etc.)
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.android.tv.classics.models.TvMediaMetadata> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.android.tv.classics.models.TvMediaMetadata[] newArray(int size) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.android.tv.classics.models.TvMediaMetadata createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u00a8\u0006\u0006"}, d2 = {"Lcom/android/tv/classics/models/TvMediaMetadata$Companion;", "", "()V", "searchableText", "", "text", "app_debug"})
    public static final class Companion {
        
        /**
         * Convenience function used to maximize search matches by ignoring punctuation symbols
         */
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String searchableText(@org.jetbrains.annotations.NotNull()
        java.lang.String text) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}