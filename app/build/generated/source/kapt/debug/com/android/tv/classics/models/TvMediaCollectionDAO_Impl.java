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
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class TvMediaCollectionDAO_Impl implements TvMediaCollectionDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<TvMediaCollection> __insertionAdapterOfTvMediaCollection;

  private final TvMediaConverters __tvMediaConverters = new TvMediaConverters();

  private final EntityDeletionOrUpdateAdapter<TvMediaCollection> __deletionAdapterOfTvMediaCollection;

  private final EntityDeletionOrUpdateAdapter<TvMediaCollection> __updateAdapterOfTvMediaCollection;

  private final SharedSQLiteStatement __preparedStmtOfTruncate;

  public TvMediaCollectionDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTvMediaCollection = new EntityInsertionAdapter<TvMediaCollection>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `TvMediaCollection` (`id`,`title`,`description`,`artUri`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TvMediaCollection value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
        final String _tmp;
        _tmp = __tvMediaConverters.uriToString(value.getArtUri());
        if (_tmp == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, _tmp);
        }
      }
    };
    this.__deletionAdapterOfTvMediaCollection = new EntityDeletionOrUpdateAdapter<TvMediaCollection>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `TvMediaCollection` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TvMediaCollection value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
      }
    };
    this.__updateAdapterOfTvMediaCollection = new EntityDeletionOrUpdateAdapter<TvMediaCollection>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `TvMediaCollection` SET `id` = ?,`title` = ?,`description` = ?,`artUri` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TvMediaCollection value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
        final String _tmp;
        _tmp = __tvMediaConverters.uriToString(value.getArtUri());
        if (_tmp == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, _tmp);
        }
        if (value.getId() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getId());
        }
      }
    };
    this.__preparedStmtOfTruncate = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM tvmediacollection";
        return _query;
      }
    };
  }

  @Override
  public void insert(final TvMediaCollection... item) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfTvMediaCollection.insert(item);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final TvMediaCollection item) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfTvMediaCollection.handle(item);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final TvMediaCollection item) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfTvMediaCollection.handle(item);
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
  public List<TvMediaCollection> findAll() {
    final String _sql = "SELECT * FROM tvmediacollection";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfArtUri = CursorUtil.getColumnIndexOrThrow(_cursor, "artUri");
      final List<TvMediaCollection> _result = new ArrayList<TvMediaCollection>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final TvMediaCollection _item;
        final String _tmpId;
        _tmpId = _cursor.getString(_cursorIndexOfId);
        final String _tmpTitle;
        _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        final Uri _tmpArtUri;
        final String _tmp;
        _tmp = _cursor.getString(_cursorIndexOfArtUri);
        _tmpArtUri = __tvMediaConverters.stringToUri(_tmp);
        _item = new TvMediaCollection(_tmpId,_tmpTitle,_tmpDescription,_tmpArtUri);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public TvMediaCollection findById(final String id) {
    final String _sql = "SELECT * FROM tvmediacollection WHERE id LIKE ? LIMIT 1";
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
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfArtUri = CursorUtil.getColumnIndexOrThrow(_cursor, "artUri");
      final TvMediaCollection _result;
      if(_cursor.moveToFirst()) {
        final String _tmpId;
        _tmpId = _cursor.getString(_cursorIndexOfId);
        final String _tmpTitle;
        _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        final Uri _tmpArtUri;
        final String _tmp;
        _tmp = _cursor.getString(_cursorIndexOfArtUri);
        _tmpArtUri = __tvMediaConverters.stringToUri(_tmp);
        _result = new TvMediaCollection(_tmpId,_tmpTitle,_tmpDescription,_tmpArtUri);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
