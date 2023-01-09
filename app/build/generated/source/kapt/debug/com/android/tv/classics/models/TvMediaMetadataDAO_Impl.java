package com.android.tv.classics.models;

import android.database.Cursor;
import android.net.Uri;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class TvMediaMetadataDAO_Impl implements TvMediaMetadataDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<TvMediaMetadata> __insertionAdapterOfTvMediaMetadata;

  private final TvMediaConverters __tvMediaConverters = new TvMediaConverters();

  private final EntityDeletionOrUpdateAdapter<TvMediaMetadata> __deletionAdapterOfTvMediaMetadata;

  private final EntityDeletionOrUpdateAdapter<TvMediaMetadata> __updateAdapterOfTvMediaMetadata;

  private final SharedSQLiteStatement __preparedStmtOfTruncate;

  public TvMediaMetadataDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTvMediaMetadata = new EntityInsertionAdapter<TvMediaMetadata>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `TvMediaMetadata` (`id`,`collectionId`,`title`,`searchableTitle`,`contentUri`,`author`,`year`,`playbackDurationMillis`,`playbackPositionMillis`,`ratings`,`genres`,`description`,`trackNumber`,`artUri`,`artAspectRatio`,`hidden`,`watchNext`,`programType`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TvMediaMetadata value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getCollectionId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCollectionId());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTitle());
        }
        if (value.getSearchableTitle() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getSearchableTitle());
        }
        final String _tmp;
        _tmp = __tvMediaConverters.uriToString(value.getContentUri());
        if (_tmp == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, _tmp);
        }
        if (value.getAuthor() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getAuthor());
        }
        if (value.getYear() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, value.getYear());
        }
        if (value.getPlaybackDurationMillis() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindLong(8, value.getPlaybackDurationMillis());
        }
        if (value.getPlaybackPositionMillis() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindLong(9, value.getPlaybackPositionMillis());
        }
        final String _tmp_1;
        _tmp_1 = __tvMediaConverters.stringListToString(value.getRatings());
        if (_tmp_1 == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, _tmp_1);
        }
        final String _tmp_2;
        _tmp_2 = __tvMediaConverters.stringListToString(value.getGenres());
        if (_tmp_2 == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, _tmp_2);
        }
        if (value.getDescription() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getDescription());
        }
        if (value.getTrackNumber() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindLong(13, value.getTrackNumber());
        }
        final String _tmp_3;
        _tmp_3 = __tvMediaConverters.uriToString(value.getArtUri());
        if (_tmp_3 == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, _tmp_3);
        }
        stmt.bindLong(15, value.getArtAspectRatio());
        final int _tmp_4;
        _tmp_4 = value.getHidden() ? 1 : 0;
        stmt.bindLong(16, _tmp_4);
        final int _tmp_5;
        _tmp_5 = value.getWatchNext() ? 1 : 0;
        stmt.bindLong(17, _tmp_5);
        stmt.bindLong(18, value.getProgramType());
      }
    };
    this.__deletionAdapterOfTvMediaMetadata = new EntityDeletionOrUpdateAdapter<TvMediaMetadata>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `TvMediaMetadata` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TvMediaMetadata value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
      }
    };
    this.__updateAdapterOfTvMediaMetadata = new EntityDeletionOrUpdateAdapter<TvMediaMetadata>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `TvMediaMetadata` SET `id` = ?,`collectionId` = ?,`title` = ?,`searchableTitle` = ?,`contentUri` = ?,`author` = ?,`year` = ?,`playbackDurationMillis` = ?,`playbackPositionMillis` = ?,`ratings` = ?,`genres` = ?,`description` = ?,`trackNumber` = ?,`artUri` = ?,`artAspectRatio` = ?,`hidden` = ?,`watchNext` = ?,`programType` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TvMediaMetadata value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getCollectionId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCollectionId());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTitle());
        }
        if (value.getSearchableTitle() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getSearchableTitle());
        }
        final String _tmp;
        _tmp = __tvMediaConverters.uriToString(value.getContentUri());
        if (_tmp == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, _tmp);
        }
        if (value.getAuthor() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getAuthor());
        }
        if (value.getYear() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, value.getYear());
        }
        if (value.getPlaybackDurationMillis() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindLong(8, value.getPlaybackDurationMillis());
        }
        if (value.getPlaybackPositionMillis() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindLong(9, value.getPlaybackPositionMillis());
        }
        final String _tmp_1;
        _tmp_1 = __tvMediaConverters.stringListToString(value.getRatings());
        if (_tmp_1 == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, _tmp_1);
        }
        final String _tmp_2;
        _tmp_2 = __tvMediaConverters.stringListToString(value.getGenres());
        if (_tmp_2 == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, _tmp_2);
        }
        if (value.getDescription() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getDescription());
        }
        if (value.getTrackNumber() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindLong(13, value.getTrackNumber());
        }
        final String _tmp_3;
        _tmp_3 = __tvMediaConverters.uriToString(value.getArtUri());
        if (_tmp_3 == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, _tmp_3);
        }
        stmt.bindLong(15, value.getArtAspectRatio());
        final int _tmp_4;
        _tmp_4 = value.getHidden() ? 1 : 0;
        stmt.bindLong(16, _tmp_4);
        final int _tmp_5;
        _tmp_5 = value.getWatchNext() ? 1 : 0;
        stmt.bindLong(17, _tmp_5);
        stmt.bindLong(18, value.getProgramType());
        if (value.getId() == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindString(19, value.getId());
        }
      }
    };
    this.__preparedStmtOfTruncate = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM tvmediametadata";
        return _query;
      }
    };
  }

  @Override
  public void insert(final TvMediaMetadata... metadata) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfTvMediaMetadata.insert(metadata);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final TvMediaMetadata metadata) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfTvMediaMetadata.handle(metadata);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final TvMediaMetadata metadata) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfTvMediaMetadata.handle(metadata);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void truncate() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfTruncate.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfTruncate.release(_stmt);
    }
  }

  @Override
  public Cursor contentProviderQuery(final String title) {
    final String _sql = "SELECT id as _id, id as suggest_intent_data_id, title as suggest_text_1, description as suggest_text_2, artUri as suggest_result_card_image, year as suggest_production_year, playbackDurationMillis as suggest_duration FROM tvmediametadata WHERE ? LIKE '%' || searchableTitle || '%'";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (title == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, title);
    }
    final Cursor _tmpResult = __db.query(_statement);
    return _tmpResult;
  }

  @Override
  public List<TvMediaMetadata> findAll() {
    final String _sql = "SELECT * FROM tvmediametadata";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfCollectionId = CursorUtil.getColumnIndexOrThrow(_cursor, "collectionId");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfSearchableTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "searchableTitle");
      final int _cursorIndexOfContentUri = CursorUtil.getColumnIndexOrThrow(_cursor, "contentUri");
      final int _cursorIndexOfAuthor = CursorUtil.getColumnIndexOrThrow(_cursor, "author");
      final int _cursorIndexOfYear = CursorUtil.getColumnIndexOrThrow(_cursor, "year");
      final int _cursorIndexOfPlaybackDurationMillis = CursorUtil.getColumnIndexOrThrow(_cursor, "playbackDurationMillis");
      final int _cursorIndexOfPlaybackPositionMillis = CursorUtil.getColumnIndexOrThrow(_cursor, "playbackPositionMillis");
      final int _cursorIndexOfRatings = CursorUtil.getColumnIndexOrThrow(_cursor, "ratings");
      final int _cursorIndexOfGenres = CursorUtil.getColumnIndexOrThrow(_cursor, "genres");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfTrackNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "trackNumber");
      final int _cursorIndexOfArtUri = CursorUtil.getColumnIndexOrThrow(_cursor, "artUri");
      final int _cursorIndexOfArtAspectRatio = CursorUtil.getColumnIndexOrThrow(_cursor, "artAspectRatio");
      final int _cursorIndexOfHidden = CursorUtil.getColumnIndexOrThrow(_cursor, "hidden");
      final int _cursorIndexOfWatchNext = CursorUtil.getColumnIndexOrThrow(_cursor, "watchNext");
      final int _cursorIndexOfProgramType = CursorUtil.getColumnIndexOrThrow(_cursor, "programType");
      final List<TvMediaMetadata> _result = new ArrayList<TvMediaMetadata>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final TvMediaMetadata _item;
        final String _tmpId;
        _tmpId = _cursor.getString(_cursorIndexOfId);
        final String _tmpCollectionId;
        _tmpCollectionId = _cursor.getString(_cursorIndexOfCollectionId);
        final String _tmpTitle;
        _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        final String _tmpSearchableTitle;
        _tmpSearchableTitle = _cursor.getString(_cursorIndexOfSearchableTitle);
        final Uri _tmpContentUri;
        final String _tmp;
        _tmp = _cursor.getString(_cursorIndexOfContentUri);
        _tmpContentUri = __tvMediaConverters.stringToUri(_tmp);
        final String _tmpAuthor;
        _tmpAuthor = _cursor.getString(_cursorIndexOfAuthor);
        final Integer _tmpYear;
        if (_cursor.isNull(_cursorIndexOfYear)) {
          _tmpYear = null;
        } else {
          _tmpYear = _cursor.getInt(_cursorIndexOfYear);
        }
        final Long _tmpPlaybackDurationMillis;
        if (_cursor.isNull(_cursorIndexOfPlaybackDurationMillis)) {
          _tmpPlaybackDurationMillis = null;
        } else {
          _tmpPlaybackDurationMillis = _cursor.getLong(_cursorIndexOfPlaybackDurationMillis);
        }
        final Long _tmpPlaybackPositionMillis;
        if (_cursor.isNull(_cursorIndexOfPlaybackPositionMillis)) {
          _tmpPlaybackPositionMillis = null;
        } else {
          _tmpPlaybackPositionMillis = _cursor.getLong(_cursorIndexOfPlaybackPositionMillis);
        }
        final List<String> _tmpRatings;
        final String _tmp_1;
        _tmp_1 = _cursor.getString(_cursorIndexOfRatings);
        _tmpRatings = __tvMediaConverters.stringToStringList(_tmp_1);
        final List<String> _tmpGenres;
        final String _tmp_2;
        _tmp_2 = _cursor.getString(_cursorIndexOfGenres);
        _tmpGenres = __tvMediaConverters.stringToStringList(_tmp_2);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        final Integer _tmpTrackNumber;
        if (_cursor.isNull(_cursorIndexOfTrackNumber)) {
          _tmpTrackNumber = null;
        } else {
          _tmpTrackNumber = _cursor.getInt(_cursorIndexOfTrackNumber);
        }
        final Uri _tmpArtUri;
        final String _tmp_3;
        _tmp_3 = _cursor.getString(_cursorIndexOfArtUri);
        _tmpArtUri = __tvMediaConverters.stringToUri(_tmp_3);
        final int _tmpArtAspectRatio;
        _tmpArtAspectRatio = _cursor.getInt(_cursorIndexOfArtAspectRatio);
        final boolean _tmpHidden;
        final int _tmp_4;
        _tmp_4 = _cursor.getInt(_cursorIndexOfHidden);
        _tmpHidden = _tmp_4 != 0;
        final boolean _tmpWatchNext;
        final int _tmp_5;
        _tmp_5 = _cursor.getInt(_cursorIndexOfWatchNext);
        _tmpWatchNext = _tmp_5 != 0;
        final int _tmpProgramType;
        _tmpProgramType = _cursor.getInt(_cursorIndexOfProgramType);
        _item = new TvMediaMetadata(_tmpId,_tmpCollectionId,_tmpTitle,_tmpSearchableTitle,_tmpContentUri,_tmpAuthor,_tmpYear,_tmpPlaybackDurationMillis,_tmpPlaybackPositionMillis,_tmpRatings,_tmpGenres,_tmpDescription,_tmpTrackNumber,_tmpArtUri,_tmpArtAspectRatio,_tmpHidden,_tmpWatchNext,_tmpProgramType);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public TvMediaMetadata findById(final String id) {
    final String _sql = "SELECT * FROM tvmediametadata WHERE id = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfCollectionId = CursorUtil.getColumnIndexOrThrow(_cursor, "collectionId");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfSearchableTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "searchableTitle");
      final int _cursorIndexOfContentUri = CursorUtil.getColumnIndexOrThrow(_cursor, "contentUri");
      final int _cursorIndexOfAuthor = CursorUtil.getColumnIndexOrThrow(_cursor, "author");
      final int _cursorIndexOfYear = CursorUtil.getColumnIndexOrThrow(_cursor, "year");
      final int _cursorIndexOfPlaybackDurationMillis = CursorUtil.getColumnIndexOrThrow(_cursor, "playbackDurationMillis");
      final int _cursorIndexOfPlaybackPositionMillis = CursorUtil.getColumnIndexOrThrow(_cursor, "playbackPositionMillis");
      final int _cursorIndexOfRatings = CursorUtil.getColumnIndexOrThrow(_cursor, "ratings");
      final int _cursorIndexOfGenres = CursorUtil.getColumnIndexOrThrow(_cursor, "genres");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfTrackNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "trackNumber");
      final int _cursorIndexOfArtUri = CursorUtil.getColumnIndexOrThrow(_cursor, "artUri");
      final int _cursorIndexOfArtAspectRatio = CursorUtil.getColumnIndexOrThrow(_cursor, "artAspectRatio");
      final int _cursorIndexOfHidden = CursorUtil.getColumnIndexOrThrow(_cursor, "hidden");
      final int _cursorIndexOfWatchNext = CursorUtil.getColumnIndexOrThrow(_cursor, "watchNext");
      final int _cursorIndexOfProgramType = CursorUtil.getColumnIndexOrThrow(_cursor, "programType");
      final TvMediaMetadata _result;
      if(_cursor.moveToFirst()) {
        final String _tmpId;
        _tmpId = _cursor.getString(_cursorIndexOfId);
        final String _tmpCollectionId;
        _tmpCollectionId = _cursor.getString(_cursorIndexOfCollectionId);
        final String _tmpTitle;
        _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        final String _tmpSearchableTitle;
        _tmpSearchableTitle = _cursor.getString(_cursorIndexOfSearchableTitle);
        final Uri _tmpContentUri;
        final String _tmp;
        _tmp = _cursor.getString(_cursorIndexOfContentUri);
        _tmpContentUri = __tvMediaConverters.stringToUri(_tmp);
        final String _tmpAuthor;
        _tmpAuthor = _cursor.getString(_cursorIndexOfAuthor);
        final Integer _tmpYear;
        if (_cursor.isNull(_cursorIndexOfYear)) {
          _tmpYear = null;
        } else {
          _tmpYear = _cursor.getInt(_cursorIndexOfYear);
        }
        final Long _tmpPlaybackDurationMillis;
        if (_cursor.isNull(_cursorIndexOfPlaybackDurationMillis)) {
          _tmpPlaybackDurationMillis = null;
        } else {
          _tmpPlaybackDurationMillis = _cursor.getLong(_cursorIndexOfPlaybackDurationMillis);
        }
        final Long _tmpPlaybackPositionMillis;
        if (_cursor.isNull(_cursorIndexOfPlaybackPositionMillis)) {
          _tmpPlaybackPositionMillis = null;
        } else {
          _tmpPlaybackPositionMillis = _cursor.getLong(_cursorIndexOfPlaybackPositionMillis);
        }
        final List<String> _tmpRatings;
        final String _tmp_1;
        _tmp_1 = _cursor.getString(_cursorIndexOfRatings);
        _tmpRatings = __tvMediaConverters.stringToStringList(_tmp_1);
        final List<String> _tmpGenres;
        final String _tmp_2;
        _tmp_2 = _cursor.getString(_cursorIndexOfGenres);
        _tmpGenres = __tvMediaConverters.stringToStringList(_tmp_2);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        final Integer _tmpTrackNumber;
        if (_cursor.isNull(_cursorIndexOfTrackNumber)) {
          _tmpTrackNumber = null;
        } else {
          _tmpTrackNumber = _cursor.getInt(_cursorIndexOfTrackNumber);
        }
        final Uri _tmpArtUri;
        final String _tmp_3;
        _tmp_3 = _cursor.getString(_cursorIndexOfArtUri);
        _tmpArtUri = __tvMediaConverters.stringToUri(_tmp_3);
        final int _tmpArtAspectRatio;
        _tmpArtAspectRatio = _cursor.getInt(_cursorIndexOfArtAspectRatio);
        final boolean _tmpHidden;
        final int _tmp_4;
        _tmp_4 = _cursor.getInt(_cursorIndexOfHidden);
        _tmpHidden = _tmp_4 != 0;
        final boolean _tmpWatchNext;
        final int _tmp_5;
        _tmp_5 = _cursor.getInt(_cursorIndexOfWatchNext);
        _tmpWatchNext = _tmp_5 != 0;
        final int _tmpProgramType;
        _tmpProgramType = _cursor.getInt(_cursorIndexOfProgramType);
        _result = new TvMediaMetadata(_tmpId,_tmpCollectionId,_tmpTitle,_tmpSearchableTitle,_tmpContentUri,_tmpAuthor,_tmpYear,_tmpPlaybackDurationMillis,_tmpPlaybackPositionMillis,_tmpRatings,_tmpGenres,_tmpDescription,_tmpTrackNumber,_tmpArtUri,_tmpArtAspectRatio,_tmpHidden,_tmpWatchNext,_tmpProgramType);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<TvMediaMetadata> findByCollection(final String collectionId) {
    final String _sql = "SELECT * FROM tvmediametadata WHERE collectionId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (collectionId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, collectionId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfCollectionId = CursorUtil.getColumnIndexOrThrow(_cursor, "collectionId");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfSearchableTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "searchableTitle");
      final int _cursorIndexOfContentUri = CursorUtil.getColumnIndexOrThrow(_cursor, "contentUri");
      final int _cursorIndexOfAuthor = CursorUtil.getColumnIndexOrThrow(_cursor, "author");
      final int _cursorIndexOfYear = CursorUtil.getColumnIndexOrThrow(_cursor, "year");
      final int _cursorIndexOfPlaybackDurationMillis = CursorUtil.getColumnIndexOrThrow(_cursor, "playbackDurationMillis");
      final int _cursorIndexOfPlaybackPositionMillis = CursorUtil.getColumnIndexOrThrow(_cursor, "playbackPositionMillis");
      final int _cursorIndexOfRatings = CursorUtil.getColumnIndexOrThrow(_cursor, "ratings");
      final int _cursorIndexOfGenres = CursorUtil.getColumnIndexOrThrow(_cursor, "genres");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfTrackNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "trackNumber");
      final int _cursorIndexOfArtUri = CursorUtil.getColumnIndexOrThrow(_cursor, "artUri");
      final int _cursorIndexOfArtAspectRatio = CursorUtil.getColumnIndexOrThrow(_cursor, "artAspectRatio");
      final int _cursorIndexOfHidden = CursorUtil.getColumnIndexOrThrow(_cursor, "hidden");
      final int _cursorIndexOfWatchNext = CursorUtil.getColumnIndexOrThrow(_cursor, "watchNext");
      final int _cursorIndexOfProgramType = CursorUtil.getColumnIndexOrThrow(_cursor, "programType");
      final List<TvMediaMetadata> _result = new ArrayList<TvMediaMetadata>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final TvMediaMetadata _item;
        final String _tmpId;
        _tmpId = _cursor.getString(_cursorIndexOfId);
        final String _tmpCollectionId;
        _tmpCollectionId = _cursor.getString(_cursorIndexOfCollectionId);
        final String _tmpTitle;
        _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        final String _tmpSearchableTitle;
        _tmpSearchableTitle = _cursor.getString(_cursorIndexOfSearchableTitle);
        final Uri _tmpContentUri;
        final String _tmp;
        _tmp = _cursor.getString(_cursorIndexOfContentUri);
        _tmpContentUri = __tvMediaConverters.stringToUri(_tmp);
        final String _tmpAuthor;
        _tmpAuthor = _cursor.getString(_cursorIndexOfAuthor);
        final Integer _tmpYear;
        if (_cursor.isNull(_cursorIndexOfYear)) {
          _tmpYear = null;
        } else {
          _tmpYear = _cursor.getInt(_cursorIndexOfYear);
        }
        final Long _tmpPlaybackDurationMillis;
        if (_cursor.isNull(_cursorIndexOfPlaybackDurationMillis)) {
          _tmpPlaybackDurationMillis = null;
        } else {
          _tmpPlaybackDurationMillis = _cursor.getLong(_cursorIndexOfPlaybackDurationMillis);
        }
        final Long _tmpPlaybackPositionMillis;
        if (_cursor.isNull(_cursorIndexOfPlaybackPositionMillis)) {
          _tmpPlaybackPositionMillis = null;
        } else {
          _tmpPlaybackPositionMillis = _cursor.getLong(_cursorIndexOfPlaybackPositionMillis);
        }
        final List<String> _tmpRatings;
        final String _tmp_1;
        _tmp_1 = _cursor.getString(_cursorIndexOfRatings);
        _tmpRatings = __tvMediaConverters.stringToStringList(_tmp_1);
        final List<String> _tmpGenres;
        final String _tmp_2;
        _tmp_2 = _cursor.getString(_cursorIndexOfGenres);
        _tmpGenres = __tvMediaConverters.stringToStringList(_tmp_2);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        final Integer _tmpTrackNumber;
        if (_cursor.isNull(_cursorIndexOfTrackNumber)) {
          _tmpTrackNumber = null;
        } else {
          _tmpTrackNumber = _cursor.getInt(_cursorIndexOfTrackNumber);
        }
        final Uri _tmpArtUri;
        final String _tmp_3;
        _tmp_3 = _cursor.getString(_cursorIndexOfArtUri);
        _tmpArtUri = __tvMediaConverters.stringToUri(_tmp_3);
        final int _tmpArtAspectRatio;
        _tmpArtAspectRatio = _cursor.getInt(_cursorIndexOfArtAspectRatio);
        final boolean _tmpHidden;
        final int _tmp_4;
        _tmp_4 = _cursor.getInt(_cursorIndexOfHidden);
        _tmpHidden = _tmp_4 != 0;
        final boolean _tmpWatchNext;
        final int _tmp_5;
        _tmp_5 = _cursor.getInt(_cursorIndexOfWatchNext);
        _tmpWatchNext = _tmp_5 != 0;
        final int _tmpProgramType;
        _tmpProgramType = _cursor.getInt(_cursorIndexOfProgramType);
        _item = new TvMediaMetadata(_tmpId,_tmpCollectionId,_tmpTitle,_tmpSearchableTitle,_tmpContentUri,_tmpAuthor,_tmpYear,_tmpPlaybackDurationMillis,_tmpPlaybackPositionMillis,_tmpRatings,_tmpGenres,_tmpDescription,_tmpTrackNumber,_tmpArtUri,_tmpArtAspectRatio,_tmpHidden,_tmpWatchNext,_tmpProgramType);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
