package com.android.tv.classics.fragments;

import java.lang.System;

/**
 * A fragment representing the current metadata item being played
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \"2\u00020\u0001:\u0002\"#B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0016H\u0016J\b\u0010\u001a\u001a\u00020\u0016H\u0016J\b\u0010\u001b\u001a\u00020\u0016H\u0016J\u001a\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u001b\u0010\u001f\u001a\u0004\u0018\u00010 2\n\u0010\u0011\u001a\u00060\u0012R\u00020\u0000H\u0002\u00a2\u0006\u0002\u0010!R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u00060\u0012R\u00020\u0000X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/android/tv/classics/fragments/NowPlayingFragment;", "Landroidx/leanback/app/VideoSupportFragment;", "()V", "args", "Lcom/android/tv/classics/fragments/NowPlayingFragmentArgs;", "getArgs", "()Lcom/android/tv/classics/fragments/NowPlayingFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "database", "Lcom/android/tv/classics/models/TvMediaDatabase;", "mediaSession", "Landroid/support/v4/media/session/MediaSessionCompat;", "mediaSessionConnector", "Lcom/google/android/exoplayer2/ext/mediasession/MediaSessionConnector;", "player", "Lcom/google/android/exoplayer2/SimpleExoPlayer;", "playerGlue", "Lcom/android/tv/classics/fragments/NowPlayingFragment$MediaPlayerGlue;", "updateMetadataTask", "Ljava/lang/Runnable;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "onResume", "onViewCreated", "view", "Landroid/view/View;", "preventControlsOverlay", "", "(Lcom/android/tv/classics/fragments/NowPlayingFragment$MediaPlayerGlue;)Ljava/lang/Boolean;", "Companion", "MediaPlayerGlue", "app_debug"})
public final class NowPlayingFragment extends androidx.leanback.app.VideoSupportFragment {
    
    /**
     * AndroidX navigation arguments
     */
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    private com.google.android.exoplayer2.SimpleExoPlayer player;
    private com.android.tv.classics.models.TvMediaDatabase database;
    
    /**
     * Allows interaction with transport controls, volume keys, media buttons
     */
    private android.support.v4.media.session.MediaSessionCompat mediaSession;
    
    /**
     * Glue layer between the player and our UI
     */
    private com.android.tv.classics.fragments.NowPlayingFragment.MediaPlayerGlue playerGlue;
    
    /**
     * Connects a [MediaSessionCompat] to a [Player] so transport controls are handled automatically
     */
    private com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector mediaSessionConnector;
    
    /**
     * Updates last know playback position
     */
    private final java.lang.Runnable updateMetadataTask = null;
    private static final java.lang.String TAG = null;
    
    /**
     * How often the player refreshes its views in milliseconds
     */
    private static final int PLAYER_UPDATE_INTERVAL_MILLIS = 100;
    
    /**
     * Time between metadata updates in milliseconds
     */
    private static final long METADATA_UPDATE_INTERVAL_MILLIS = 0L;
    
    /**
     * Default time used when skipping playback in milliseconds
     */
    private static final long SKIP_PLAYBACK_MILLIS = 0L;
    @org.jetbrains.annotations.NotNull()
    public static final com.android.tv.classics.fragments.NowPlayingFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    /**
     * AndroidX navigation arguments
     */
    private final com.android.tv.classics.fragments.NowPlayingFragmentArgs getArgs() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Workaround used to prevent controls overlay from showing and taking focus
     */
    private final java.lang.Boolean preventControlsOverlay(com.android.tv.classics.fragments.NowPlayingFragment.MediaPlayerGlue playerGlue) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    /**
     * Deactivates and removes callbacks from [MediaSessionCompat] since the [Player] instance is
     * destroyed in onStop and required metadata could be missing.
     */
    @java.lang.Override()
    public void onPause() {
    }
    
    /**
     * Do all final cleanup in onDestroy
     */
    @java.lang.Override()
    public void onDestroy() {
    }
    
    public NowPlayingFragment() {
        super();
    }
    
    /**
     * Custom implementation of [PlaybackTransportControlGlue]
     */
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0012H\u0014J\u000e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u0016\u001a\u00020\u000e2\b\b\u0002\u0010\u0017\u001a\u00020\u0018J\u0010\u0010\u0019\u001a\u00020\u000e2\b\b\u0002\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/android/tv/classics/fragments/NowPlayingFragment$MediaPlayerGlue;", "Landroidx/leanback/media/PlaybackTransportControlGlue;", "Lcom/google/android/exoplayer2/ext/leanback/LeanbackPlayerAdapter;", "context", "Landroid/content/Context;", "adapter", "(Lcom/android/tv/classics/fragments/NowPlayingFragment;Landroid/content/Context;Lcom/google/android/exoplayer2/ext/leanback/LeanbackPlayerAdapter;)V", "actionClosedCaptions", "Landroidx/leanback/widget/PlaybackControlsRow$ClosedCaptioningAction;", "actionFastForward", "Landroidx/leanback/widget/PlaybackControlsRow$FastForwardAction;", "actionRewind", "Landroidx/leanback/widget/PlaybackControlsRow$RewindAction;", "onActionClicked", "", "action", "Landroidx/leanback/widget/Action;", "onCreatePrimaryActions", "Landroidx/leanback/widget/ArrayObjectAdapter;", "setMetadata", "metadata", "Lcom/android/tv/classics/models/TvMediaMetadata;", "skipBackward", "millis", "", "skipForward", "app_debug"})
    final class MediaPlayerGlue extends androidx.leanback.media.PlaybackTransportControlGlue<com.google.android.exoplayer2.ext.leanback.LeanbackPlayerAdapter> {
        private final androidx.leanback.widget.PlaybackControlsRow.RewindAction actionRewind = null;
        private final androidx.leanback.widget.PlaybackControlsRow.FastForwardAction actionFastForward = null;
        private final androidx.leanback.widget.PlaybackControlsRow.ClosedCaptioningAction actionClosedCaptions = null;
        
        public final void skipForward(long millis) {
        }
        
        public final void skipBackward(long millis) {
        }
        
        @java.lang.Override()
        protected void onCreatePrimaryActions(@org.jetbrains.annotations.NotNull()
        androidx.leanback.widget.ArrayObjectAdapter adapter) {
        }
        
        @java.lang.Override()
        public void onActionClicked(@org.jetbrains.annotations.NotNull()
        androidx.leanback.widget.Action action) {
        }
        
        /**
         * Custom function used to update the metadata displayed for currently playing media
         */
        public final void setMetadata(@org.jetbrains.annotations.NotNull()
        com.android.tv.classics.models.TvMediaMetadata metadata) {
        }
        
        public MediaPlayerGlue(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        com.google.android.exoplayer2.ext.leanback.LeanbackPlayerAdapter adapter) {
            super(null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/android/tv/classics/fragments/NowPlayingFragment$Companion;", "", "()V", "METADATA_UPDATE_INTERVAL_MILLIS", "", "PLAYER_UPDATE_INTERVAL_MILLIS", "", "SKIP_PLAYBACK_MILLIS", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}