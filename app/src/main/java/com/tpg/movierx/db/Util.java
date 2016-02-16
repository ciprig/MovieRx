package com.tpg.movierx.db;

/**
 * Created by karoly.szanto on 11/11/15.
 */
public class Util {

    public static final String ALL_MOVIES_QUERY = "SELECT * FROM "
            + MovieItem.TABLE
            + " = ? ORDER BY "
            + MovieItem.TITLE
            + " ASC";
}
