package com.bignerdranch.android.lead.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;

@SuppressWarnings("unchecked")
public final class LeadDatabase_Impl extends LeadDatabase {
  private volatile LeadDao _leadDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Lead` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `phone` TEXT NOT NULL, `preference` TEXT NOT NULL, `date` INTEGER NOT NULL, `isContacted` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"371abf8fc8209aa15ff26c5928b5bd0e\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `Lead`");
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
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsLead = new HashMap<String, TableInfo.Column>(6);
        _columnsLead.put("id", new TableInfo.Column("id", "TEXT", true, 1));
        _columnsLead.put("name", new TableInfo.Column("name", "TEXT", true, 0));
        _columnsLead.put("phone", new TableInfo.Column("phone", "TEXT", true, 0));
        _columnsLead.put("preference", new TableInfo.Column("preference", "TEXT", true, 0));
        _columnsLead.put("date", new TableInfo.Column("date", "INTEGER", true, 0));
        _columnsLead.put("isContacted", new TableInfo.Column("isContacted", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysLead = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesLead = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoLead = new TableInfo("Lead", _columnsLead, _foreignKeysLead, _indicesLead);
        final TableInfo _existingLead = TableInfo.read(_db, "Lead");
        if (! _infoLead.equals(_existingLead)) {
          throw new IllegalStateException("Migration didn't properly handle Lead(com.bignerdranch.android.lead.Lead).\n"
                  + " Expected:\n" + _infoLead + "\n"
                  + " Found:\n" + _existingLead);
        }
      }
    }, "371abf8fc8209aa15ff26c5928b5bd0e", "99d579aadc94688cd6e048e71f88f70b");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "Lead");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `Lead`");
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
  public LeadDao leadDao() {
    if (_leadDao != null) {
      return _leadDao;
    } else {
      synchronized(this) {
        if(_leadDao == null) {
          _leadDao = new LeadDao_Impl(this);
        }
        return _leadDao;
      }
    }
  }
}
