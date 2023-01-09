package com.android.tv.classics.fragments;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.NavArgs;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class MediaBrowserFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private MediaBrowserFragmentArgs() {
  }

  private MediaBrowserFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static MediaBrowserFragmentArgs fromBundle(@NonNull Bundle bundle) {
    MediaBrowserFragmentArgs __result = new MediaBrowserFragmentArgs();
    bundle.setClassLoader(MediaBrowserFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("channel_id")) {
      String channelId;
      channelId = bundle.getString("channel_id");
      __result.arguments.put("channel_id", channelId);
    } else {
      __result.arguments.put("channel_id", null);
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @Nullable
  public String getChannelId() {
    return (String) arguments.get("channel_id");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
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
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    MediaBrowserFragmentArgs that = (MediaBrowserFragmentArgs) object;
    if (arguments.containsKey("channel_id") != that.arguments.containsKey("channel_id")) {
      return false;
    }
    if (getChannelId() != null ? !getChannelId().equals(that.getChannelId()) : that.getChannelId() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getChannelId() != null ? getChannelId().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "MediaBrowserFragmentArgs{"
        + "channelId=" + getChannelId()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(MediaBrowserFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder() {
    }

    @NonNull
    public MediaBrowserFragmentArgs build() {
      MediaBrowserFragmentArgs result = new MediaBrowserFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setChannelId(@Nullable String channelId) {
      this.arguments.put("channel_id", channelId);
      return this;
    }

    @SuppressWarnings("unchecked")
    @Nullable
    public String getChannelId() {
      return (String) arguments.get("channel_id");
    }
  }
}
