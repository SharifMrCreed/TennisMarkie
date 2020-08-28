package com.alle.san.tennismarchy.database;

import android.provider.BaseColumns;

public class MatchDb {

    public static final class MatchesTable implements BaseColumns {

        public static final String TABLE_NAME = "matches";
        public static final String _ID = BaseColumns._ID;
        public static final String A_NAME = "a_name";
        public static final String B_NAME = "b_name";
        public static final String SET1A = "set_one_a_score";
        public static final String SET1B = "set_one_b_score";
        public static final String SET2A = "set_two_a_score";
        public static final String SET2B = "set_two_b_score";
        public static final String SET3A = "set_three_a_score";
        public static final String SET3B = "set_three_b_score";
        public static final String SET4A = "set_four_a_score";
        public static final String SET4B = "set_four_b_score";
        public static final String SET5A = "set_five_a_score";
        public static final String SET5B = "set_five_b_score";

        public static final String SQL_CREATE_MATCH_TABLE_COMMAND =
                "CREATE TABLE " + TABLE_NAME + " ( " + _ID + " PRIMARY KEY AUTOINCREMENT, " +
                        A_NAME + " NOTNULL, "+ B_NAME + " NOTNULL, "+ SET1A + " NOTNULL, "+
                        SET1B + " NOTNULL, "+ SET2A+ ", "+ SET2B + ", "+ SET3A + ", " +
                        SET3B + ", "+ SET4A + ", "+ SET4B + ", " + SET5A + ", " +
                        SET5B + ");";
    }
}
