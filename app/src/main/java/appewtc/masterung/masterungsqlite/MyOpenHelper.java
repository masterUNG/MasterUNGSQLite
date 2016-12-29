package appewtc.masterung.masterungsqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by masterUNG on 12/30/2016 AD.
 */

public class MyOpenHelper extends SQLiteOpenHelper{

    //Explicit
    public static final String database_name = "masterUNG.db";
    private static final int database_version = 1;
    private static final String table_name = "ungTABLE";
    private static final String column_id = "id";
    private static final String column_name = "Name";
    private static final String column_surname = "Surname";
    private static final String column_address = "Address";
    private static final String schema_ungTABLE = "CREATE TABLE " + table_name + "("
            + column_id + " INTEGER PRIMARY KEY,"
            + column_name + " TEXT,"
            + column_surname + " TEXT,"
            + column_address + " TEXT);";

    private Context context;

    public MyOpenHelper(Context context) {
        super(context, database_name, null, database_version);
        this.context = context;
    }   // Constructor


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(schema_ungTABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}   // Main Class
