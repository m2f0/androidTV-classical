package com.android.tv.classics.fragments;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import com.android.tv.classics.models.TvMediaMetadata;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class NowPlayingFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private NowPlayingFragmentArgs() {
  }

  private NowPlayingFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static NowPlayingFragmentArgs fromBundle(@NonNull Bundle bundle) {
    NowPlayingFragmentArgs __result = new NowPlayingFragmentArgs();
    bundle.setClassLoader(NowPlayingFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("metadata")) {
      TvMediaMetadata metadata;
      if (Parcelable.class.isAssignableFrom(TvMediaMetadata.class) || Serializable.class.isAssignableFrom(TvMediaMetadata.class)) {
        metadata = (TvMediaMetadata) bundle.get("metadata");
      } else {
        throw new UnsupportedOperationException(TvMediaMetadata.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (metadata == null) {
        throw new IllegalArgumentException("Argument \"metadata\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("metadata", metadata);
    } else {
      throw new IllegalArgumentException("Required argument \"metadata\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public TvMediaMetadata getMetadata() {
    return (TvMediaMetadata) arguments.get("metadata");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
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
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    NowPlayingFragmentArgs that = (NowPlayingFragmentArgs) object;
    if (arguments.containsKey("metadata") != that.arguments.containsKey("metadata")) {
      return false;
    }
    if (getMetadata() != null ? !getMetadata().equals(that.getMetadata()) : that.getMetadata() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getMetadata() != null ? getMetadata().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "NowPlayingFragmentArgs{"
        + "metadata=" + getMetadata()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(NowPlayingFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(@NonNull TvMediaMetadata metadata) {
      if (metadata == null) {
        throw new IllegalArgumentException("Argument \"metadata\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("metadata", metadata);
    }

    @NonNull
    public NowPlayingFragmentArgs build() {
      NowPlayingFragmentArgs result = new NowPlayingFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setMetadata(@NonNull TvMediaMetadata metadata) {
      if (metadata == null) {
        throw new IllegalArgumentException("Argument \"metadata\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("metadata", metadata);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public TvMediaMetadata getMetadata() {
      return (TvMediaMetadata) arguments.get("metadata");
    }
  }
}
