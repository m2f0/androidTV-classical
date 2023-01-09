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
public final class TvMediaBackgroundDAO_Impl implements TvMediaBackgroundDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<TvMediaBackground> __insertionAdapterOfTvMediaBackground;

  private final TvMediaConverters __tvMediaConverters = new TvMediaConverters();

  private final EntityDeletionOrUpdateAdapter<TvMediaBackground> __deletionAdapterOfTvMediaBackground;

  private final EntityDeletionOrUpdateAdapter<TvMediaBackground> __updateAdapterOfTvMediaBackground;

  private final SharedSQLiteStatement __preparedStmtOfTruncate;

  public TvMediaBackgroundDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTvMediaBackground = new EntityInsertionAdapter<TvMediaBackground>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `TvMediaBackground` (`id`,`uri`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TvMediaBackground value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        final String _tmp;
        _tmp = __tvMediaConverters.uriToString(value.getUri());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, _tmp);
        }
      }
    };
    this.__deletionAdapterOfTvMediaBackground = new EntityDeletionOrUpdateAdapter<TvMediaBackground>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `TvMediaBackground` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TvMediaBackground value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
      }
    };
    this.__updateAdapterOfTvMediaBackground = new EntityDeletionOrUpdateAdapter<TvMediaBackground>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `TvMediaBackground` SET `id` = ?,`uri` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TvMediaBackground value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        final String _tmp;
        _tmp = __tvMediaConverters.uriToString(value.getUri());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, _tmp);
        }
        if (value.getId() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getId());
        }
      }
    };
    this.__preparedStmtOfTruncate = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM tvmediabackground";
        return _query;
      }
    };
  }

  @Override
  public void insert(final TvMediaBackground... item) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfTvMediaBackground.insert(item);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final TvMediaBackground item) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfTvMediaBackground.handle(item);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final TvMediaBackground item) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfTvMediaBackground.handle(item);
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
  public List<TvMediaBackground> findAll() {
    final String _sql = "SELECT * FROM tvmediabackground";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfUri = CursorUtil.getColumnIndexOrThrow(_cursor, "uri");
      final List<TvMediaBackground> _result = new ArrayList<TvMediaBackground>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final TvMediaBackground _item;
        final String _tmpId;
        _tmpId = _cursor.getString(_cursorIndexOfId);
        final Uri _tmpUri;
        final String _tmp;
        _tmp = _cursor.getString(_cursorIndexOfUri);
        _tmpUri = __tvMediaConverters.stringToUri(_tmp);
        _item = new TvMediaBackground(_tmpId,_tmpUri);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
