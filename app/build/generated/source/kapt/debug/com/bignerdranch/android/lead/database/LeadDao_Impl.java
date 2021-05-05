package com.bignerdranch.android.lead.database;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.lifecycle.ComputableLiveData;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.InvalidationTracker.Observer;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.bignerdranch.android.lead.Lead;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@SuppressWarnings("unchecked")
public final class LeadDao_Impl implements LeadDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfLead;

  private final LeadTypeConverters __leadTypeConverters = new LeadTypeConverters();

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfLead;

  public LeadDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfLead = new EntityInsertionAdapter<Lead>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Lead`(`id`,`name`,`phone`,`preference`,`date`,`isContacted`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Lead value) {
        final String _tmp;
        _tmp = __leadTypeConverters.fromUUID(value.getId());
        if (_tmp == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, _tmp);
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getPhone() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPhone());
        }
        if (value.getPreference() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getPreference());
        }
        final Long _tmp_1;
        _tmp_1 = __leadTypeConverters.fromDate(value.getDate());
        if (_tmp_1 == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, _tmp_1);
        }
        final int _tmp_2;
        _tmp_2 = value.isContacted() ? 1 : 0;
        stmt.bindLong(6, _tmp_2);
      }
    };
    this.__updateAdapterOfLead = new EntityDeletionOrUpdateAdapter<Lead>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Lead` SET `id` = ?,`name` = ?,`phone` = ?,`preference` = ?,`date` = ?,`isContacted` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Lead value) {
        final String _tmp;
        _tmp = __leadTypeConverters.fromUUID(value.getId());
        if (_tmp == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, _tmp);
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getPhone() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPhone());
        }
        if (value.getPreference() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getPreference());
        }
        final Long _tmp_1;
        _tmp_1 = __leadTypeConverters.fromDate(value.getDate());
        if (_tmp_1 == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, _tmp_1);
        }
        final int _tmp_2;
        _tmp_2 = value.isContacted() ? 1 : 0;
        stmt.bindLong(6, _tmp_2);
        final String _tmp_3;
        _tmp_3 = __leadTypeConverters.fromUUID(value.getId());
        if (_tmp_3 == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, _tmp_3);
        }
      }
    };
  }

  @Override
  public void addLead(Lead lead) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfLead.insert(lead);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateLead(Lead lead) {
    __db.beginTransaction();
    try {
      __updateAdapterOfLead.handle(lead);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<Lead>> getLeads() {
    final String _sql = "SELECT * FROM lead";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new ComputableLiveData<List<Lead>>(__db.getQueryExecutor()) {
      private Observer _observer;

      @Override
      protected List<Lead> compute() {
        if (_observer == null) {
          _observer = new Observer("lead") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
          final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
          final int _cursorIndexOfPhone = _cursor.getColumnIndexOrThrow("phone");
          final int _cursorIndexOfPreference = _cursor.getColumnIndexOrThrow("preference");
          final int _cursorIndexOfDate = _cursor.getColumnIndexOrThrow("date");
          final int _cursorIndexOfIsContacted = _cursor.getColumnIndexOrThrow("isContacted");
          final List<Lead> _result = new ArrayList<Lead>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Lead _item;
            final UUID _tmpId;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfId);
            _tmpId = __leadTypeConverters.toUUID(_tmp);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpPhone;
            _tmpPhone = _cursor.getString(_cursorIndexOfPhone);
            final String _tmpPreference;
            _tmpPreference = _cursor.getString(_cursorIndexOfPreference);
            final Date _tmpDate;
            final Long _tmp_1;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getLong(_cursorIndexOfDate);
            }
            _tmpDate = __leadTypeConverters.toDate(_tmp_1);
            final boolean _tmpIsContacted;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfIsContacted);
            _tmpIsContacted = _tmp_2 != 0;
            _item = new Lead(_tmpId,_tmpName,_tmpPhone,_tmpPreference,_tmpDate,_tmpIsContacted);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    }.getLiveData();
  }

  @Override
  public LiveData<Lead> getLead(UUID id) {
    final String _sql = "SELECT * FROM lead WHERE id=(?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final String _tmp;
    _tmp = __leadTypeConverters.fromUUID(id);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, _tmp);
    }
    return new ComputableLiveData<Lead>(__db.getQueryExecutor()) {
      private Observer _observer;

      @Override
      protected Lead compute() {
        if (_observer == null) {
          _observer = new Observer("lead") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
          final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
          final int _cursorIndexOfPhone = _cursor.getColumnIndexOrThrow("phone");
          final int _cursorIndexOfPreference = _cursor.getColumnIndexOrThrow("preference");
          final int _cursorIndexOfDate = _cursor.getColumnIndexOrThrow("date");
          final int _cursorIndexOfIsContacted = _cursor.getColumnIndexOrThrow("isContacted");
          final Lead _result;
          if(_cursor.moveToFirst()) {
            final UUID _tmpId;
            final String _tmp_1;
            _tmp_1 = _cursor.getString(_cursorIndexOfId);
            _tmpId = __leadTypeConverters.toUUID(_tmp_1);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpPhone;
            _tmpPhone = _cursor.getString(_cursorIndexOfPhone);
            final String _tmpPreference;
            _tmpPreference = _cursor.getString(_cursorIndexOfPreference);
            final Date _tmpDate;
            final Long _tmp_2;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getLong(_cursorIndexOfDate);
            }
            _tmpDate = __leadTypeConverters.toDate(_tmp_2);
            final boolean _tmpIsContacted;
            final int _tmp_3;
            _tmp_3 = _cursor.getInt(_cursorIndexOfIsContacted);
            _tmpIsContacted = _tmp_3 != 0;
            _result = new Lead(_tmpId,_tmpName,_tmpPhone,_tmpPreference,_tmpDate,_tmpIsContacted);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    }.getLiveData();
  }
}
