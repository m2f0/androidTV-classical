package com.android.tv.classics;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.NavDirections;
import com.android.tv.classics.models.TvMediaMetadata;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class NavGraphDirections {
  private NavGraphDirections() {
  }

  @NonNull
  public static ActionToMediaBrowser actionToMediaBrowser() {
    return new ActionToMediaBrowser();
  }

  @NonNull
  public static ActionToNowPlaying actionToNowPlaying(@NonNull TvMediaMetadata metadata) {
    return new ActionToNowPlaying(metadata);
  }

  public static class ActionToMediaBrowser implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionToMediaBrowser() {
    }

    @NonNull
    public ActionToMediaBrowser setChannelId(@Nullable String channelId) {
      this.arguments.put("channel_id", channelId);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("channel_id")) {
        String channelId = (String) arguments.get("channel_id");
        __result.putString("channel_id", channelId);
      } else {
        __result.putString("channel_id", null);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_to_media_browser;
    }

    @SuppressWarnings("unchecked")
    @Nullable
    public String getChannelId() {
      return (String) arguments.get("channel_id");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionToMediaBrowser that = (ActionToMediaBrowser) object;
      if (arguments.containsKey("channel_id") != that.arguments.containsKey("channel_id")) {
        return false;
      }
      if (getChannelId() != null ? !getChannelId().equals(that.getChannelId()) : that.getChannelId() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getChannelId() != null ? getChannelId().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionToMediaBrowser(actionId=" + getActionId() + "){"
          + "channelId=" + getChannelId()
          + "}";
    }
  }

  public static class ActionToNowPlaying implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionToNowPlaying(@NonNull TvMediaMetadata metadata) {
      if (metadata == null) {
        throw new IllegalArgumentException("Argument \"metadata\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("metadata", metadata);
    }

    @NonNull
    public ActionToNowPlaying setMetadata(@NonNull TvMediaMetadata metadata) {
      if (metadata == null) {
        throw new IllegalArgumentException("Argument \"metadata\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("metadata", metadata);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("metadata")) {
        TvMediaMetadata metadata = (TvMediaMetadata) arguments.get("metadata");
        if (Parcelable.class.isAssignableFrom(TvMediaMetadata.class) || metadata == null) {
          __result.putParcelable("metadata", Parcelable.class.cast(metadata));
        } else if (Serializable.class.isAssignableFrom(TvMediaMetadata.class)) {
          __result.putSerializable("metadata", Serializable.class.cast(metadata));
        } else {
          throw new UnsupportedOperationException(TvMediaMetadata.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_to_now_playing;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public TvMediaMetadata getMetadata() {
      return (TvMediaMetadata) arguments.get("metadata");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionToNowPlaying that = (ActionToNowPlaying) object;
      if (arguments.containsKey("metadata") != that.arguments.containsKey("metadata")) {
        return false;
      }
      if (getMetadata() != null ? !getMetadata().equals(that.getMetadata()) : that.getMetadata() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getMetadata() != null ? getMetadata().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionToNowPlaying(actionId=" + getActionId() + "){"
          + "metadata=" + getMetadata()
          + "}";
    }
  }
}
