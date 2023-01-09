package com.android.tv.classics.fragments;

import androidx.annotation.NonNull;
import com.android.tv.classics.NavGraphDirections;
import com.android.tv.classics.models.TvMediaMetadata;

public class NowPlayingFragmentDirections {
  private NowPlayingFragmentDirections() {
  }

  @NonNull
  public static NavGraphDirections.ActionToMediaBrowser actionToMediaBrowser() {
    return NavGraphDirections.actionToMediaBrowser();
  }

  @NonNull
  public static NavGraphDirections.ActionToNowPlaying actionToNowPlaying(
      @NonNull TvMediaMetadata metadata) {
    return NavGraphDirections.actionToNowPlaying(metadata);
  }
}
