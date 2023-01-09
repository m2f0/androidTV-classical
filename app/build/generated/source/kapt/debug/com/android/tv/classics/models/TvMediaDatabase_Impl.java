package com.android.tv.classics.models;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class TvMediaDatabase_Impl extends TvMediaDatabase {
  private volatile TvMediaMetadataDAO _tvMediaMetadataDAO;

  private volatile TvMediaCollectionDAO _tvMediaCollectionDAO;

  private volatile TvMediaBackgroundDAO _tvMediaBackgroundDAO;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `TvMediaMetadata` (`id` TEXT NOT NULL, `collectionId` TEXT NOT NULL, `title` TEXT NOT NULL, `searchableTitle` TEXT NOT NULL, `contentUri` TEXT NOT NULL, `author` TEXT, `year` INTEGER, `playbackDurationMillis` INTEGER, `playbackPositionMillis` INTEGER, `ratings` TEXT, `genres` TEXT, `description` TEXT, `trackNumber` INTEGER, `artUri` TEXT, `artAspectRatio` INTEGER NOT NULL, `hidden` INTEGER NOT NULL, `watchNext` INTEGER NOT NULL, `programType` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `TvMediaCollection` (`id` TEXT NOT NULL, `title` TEXT NOT NULL, `description` TEXT NOT NULL, `artUri` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `TvMediaBackground` (`id` TEXT NOT NULL, `uri` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '972757199e7901980ad373263ee7c66f')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `TvMediaMetadata`");
        _db.execSQL("DROP TABLE IF EXISTS `TvMediaCollection`");
        _db.execSQL("DROP TABLE IF EXISTS `TvMediaBackground`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsTvMediaMetadata = new HashMap<String, TableInfo.Column>(18);
        _columnsTvMediaMetadata.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvMediaMetadata.put("collectionId", new TableInfo.Column("collectionId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvMediaMetadata.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvMediaMetadata.put("searchableTitle", new TableInfo.Column("searchableTitle", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvMediaMetadata.put("contentUri", new TableInfo.Column("contentUri", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvMediaMetadata.put("author", new TableInfo.Column("author", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvMediaMetadata.put("year", new TableInfo.Column("year", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvMediaMetadata.put("playbackDurationMillis", new TableInfo.Column("playbackDurationMillis", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvMediaMetadata.put("playbackPositionMillis", new TableInfo.Column("playbackPositionMillis", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvMediaMetadata.put("ratings", new TableInfo.Column("ratings", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvMediaMetadata.put("genres", new TableInfo.Column("genres", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvMediaMetadata.put("description", new TableInfo.Column("description", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvMediaMetadata.put("trackNumber", new TableInfo.Column("trackNumber", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvMediaMetadata.put("artUri", new TableInfo.Column("artUri", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvMediaMetadata.put("artAspectRatio", new TableInfo.Column("artAspectRatio", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvMediaMetadata.put("hidden", new TableInfo.Column("hidden", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvMediaMetadata.put("watchNext", new TableInfo.Column("watchNext", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvMediaMetadata.put("programType", new TableInfo.Column("programType", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTvMediaMetadata = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTvMediaMetadata = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTvMediaMetadata = new TableInfo("TvMediaMetadata", _columnsTvMediaMetadata, _foreignKeysTvMediaMetadata, _indicesTvMediaMetadata);
        final TableInfo _existingTvMediaMetadata = TableInfo.read(_db, "TvMediaMetadata");
        if (! _infoTvMediaMetadata.equals(_existingTvMediaMetadata)) {
          return new RoomOpenHelper.ValidationResult(false, "TvMediaMetadata(com.android.tv.classics.models.TvMediaMetadata).\n"
                  + " Expected:\n" + _infoTvMediaMetadata + "\n"
                  + " Found:\n" + _existingTvMediaMetadata);
        }
        final HashMap<String, TableInfo.Column> _columnsTvMediaCollection = new HashMap<String, TableInfo.Column>(4);
        _columnsTvMediaCollection.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvMediaCollection.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvMediaCollection.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvMediaCollection.put("artUri", new TableInfo.Column("artUri", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTvMediaCollection = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTvMediaCollection = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTvMediaCollection = new TableInfo("TvMediaCollection", _columnsTvMediaCollection, _foreignKeysTvMediaCollection, _indicesTvMediaCollection);
        final TableInfo _existingTvMediaCollection = TableInfo.read(_db, "TvMediaCollection");
        if (! _infoTvMediaCollection.equals(_existingTvMediaCollection)) {
          return new RoomOpenHelper.ValidationResult(false, "TvMediaCollection(com.android.tv.classics.models.TvMediaCollection).\n"
                  + " Expected:\n" + _infoTvMediaCollection + "\n"
                  + " Found:\n" + _existingTvMediaCollection);
        }
        final HashMap<String, TableInfo.Column> _columnsTvMediaBackground = new HashMap<String, TableInfo.Column>(2);
        _columnsTvMediaBackground.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvMediaBackground.put("uri", new TableInfo.Column("uri", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTvMediaBackground = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTvMediaBackground = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTvMediaBackground = new TableInfo("TvMediaBackground", _columnsTvMediaBackground, _foreignKeysTvMediaBackground, _indicesTvMediaBackground);
        final TableInfo _existingTvMediaBackground = TableInfo.read(_db, "TvMediaBackground");
        if (! _infoTvMediaBackground.equals(_existingTvMediaBackground)) {
          return new RoomOpenHelper.ValidationResult(false, "TvMediaBackground(com.android.tv.classics.models.TvMediaBackground).\n"
                  + " Expected:\n" + _infoTvMediaBackground + "\n"
                  + " Found:\n" + _existingTvMediaBackground);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "972757199e7901980ad373263ee7c66f", "6612bfd9ddd105bba59e2f9ee0673216");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "TvMediaMetadata","TvMediaCollection","TvMediaBackground");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `TvMediaMetadata`");
      _db.execSQL("DELETE FROM `TvMediaCollection`");
      _db.execSQL("DELETE FROM `TvMediaBackground`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public TvMediaMetadataDAO metadata() {
    if (_tvMediaMetadataDAO != null) {
      return _tvMediaMetadataDAO;
    } else {
      synchronized(this) {
        if(_tvMediaMetadataDAO == null) {
          _tvMediaMetadataDAO = new TvMediaMetadataDAO_Impl(this);
        }
        return _tvMediaMetadataDAO;
      }
    }
  }

  @Override
  public TvMediaCollectionDAO collections() {
    if (_tvMediaCollectionDAO != null) {
      return _tvMediaCollectionDAO;
    } else {
      synchronized(this) {
        if(_tvMediaCollectionDAO == null) {
          _tvMediaCollectionDAO = new TvMediaCollectionDAO_Impl(this);
        }
        return _tvMediaCollectionDAO;
      }
    }
  }

  @Override
  public TvMediaBackgroundDAO backgrounds() {
    if (_tvMediaBackgroundDAO != null) {
      return _tvMediaBackgroundDAO;
    } else {
      synchronized(this) {
        if(_tvMediaBackgroundDAO == null) {
          _tvMediaBackgroundDAO = new TvMediaBackgroundDAO_Impl(this);
        }
        return _tvMediaBackgroundDAO;
      }
    }
  }
}
