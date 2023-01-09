package com.android.tv.classics.fragments;

import java.lang.System;

/**
 * A fragment that lets user browse our collection of metadata.
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u000bH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/android/tv/classics/fragments/MediaBrowserFragment;", "Landroidx/leanback/app/BrowseSupportFragment;", "()V", "backgroundAnimation", "Ljava/lang/Runnable;", "backgroundDrawable", "Lkotlinx/coroutines/Deferred;", "Landroid/graphics/drawable/Drawable;", "creditsRow", "Landroidx/leanback/widget/ListRow;", "currentTintColor", "", "database", "Lcom/android/tv/classics/models/TvMediaDatabase;", "listRowDiffCallback", "Landroidx/leanback/widget/DiffCallback;", "synchronizeJob", "Lkotlinx/coroutines/Job;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "populateAdapter", "adapter", "Landroidx/leanback/widget/ArrayObjectAdapter;", "updateBackgroundTint", "Landroid/animation/ValueAnimator;", "targetColor", "Companion", "app_debug"})
public final class MediaBrowserFragment extends androidx.leanback.app.BrowseSupportFragment {
    private com.android.tv.classics.models.TvMediaDatabase database;
    
    /**
     * Tint applied to the background, default to dark grey
     */
    private int currentTintColor;
    
    /**
     * Animation task used to update the background tint
     */
    private java.lang.Runnable backgroundAnimation;
    
    /**
     * Background for our fragment, selected randomly at runtime
     */
    private kotlinx.coroutines.Deferred<? extends android.graphics.drawable.Drawable> backgroundDrawable;
    
    /**
     * Job used to synchronize our media database
     */
    private kotlinx.coroutines.Job synchronizeJob;
    
    /**
     * List row used exclusively to display "credits" and no media content
     */
    private androidx.leanback.widget.ListRow creditsRow;
    
    /**
     * Used to efficiently add items to our array adapter for display
     */
    private final androidx.leanback.widget.DiffCallback<androidx.leanback.widget.ListRow> listRowDiffCallback = null;
    private static final java.lang.String TAG = null;
    
    /**
     * Animation time in milliseconds for background changes
     */
    private static final long BACKGROUND_ANIMATION_MILLIS = 0L;
    
    /**
     * Alpha component (0-255) of the background color tint
     */
    private static final int BACKGROUND_TINT_ALPHA = 150;
    @org.jetbrains.annotations.NotNull()
    public static final com.android.tv.classics.fragments.MediaBrowserFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Convenience function used to update the background tint to match the selected item
     */
    private final android.animation.ValueAnimator updateBackgroundTint(int targetColor) {
        return null;
    }
    
    /**
     * Convenience function used to populate the main screen's adapter with all media collections.
     * Since this function makes use of the database, it cannot be run from the main thread.
     */
    private final void populateAdapter(androidx.leanback.widget.ArrayObjectAdapter adapter) {
    }
    
    public MediaBrowserFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/android/tv/classics/fragments/MediaBrowserFragment$Companion;", "", "()V", "BACKGROUND_ANIMATION_MILLIS", "", "BACKGROUND_TINT_ALPHA", "", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}