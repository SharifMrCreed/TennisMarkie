package com.alle.san.tennismarchy.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import static com.alle.san.tennismarchy.database.MatchDb.MatchesTable.SQL_CREATE_MATCH_TABLE_COMMAND;

public class MatchDbHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "matchesdb";
    public static final int DATABASE_VERSION = 1;

    public MatchDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        
        sqLiteDatabase.execSQL(SQL_CREATE_MATCH_TABLE_COMMAND);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
