package dbutils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;



public class DataBaseHelper extends SQLiteOpenHelper {
    private static final String  DATABASE_NAME= "DrinkInf.db";
    private static final int DATABASE_VERSION= 1;
    private static final String TABLE_NAME="DrinkDetails";
    private static final String TABLE_CONTACTS= "contacts";
    private static final String KEY_NAME= "name";
    private static final String KEY_INF= "information";
    private static final int PRICE= 1;
    private static final int IMAGE_ID= 1;

//    private static final int DATABASE_VERSION = 1;
//    private static final String DATABASE_NAME = "contactsManager";
//    private static final String TABLE_CONTACTS = "contacts";
//    private static final String KEY_ID = "id";
//    private static final String KEY_NAME = "name";
//    private static final String KEY_PH_NO = "phone_number";

//    String CREATE_CONTACTS_TABLE = "CREATE TABLE " + TABLE_CONTACTS + "("
//            + KEY_ID + " INTEGER PRIMARY KEY," + KEY_NAME + " TEXT,"
//            + KEY_PH_NO + " TEXT" + ")";
//        db.execSQL(CREATE_CONTACTS_TABLE);


    public DataBaseHelper(Context context ) {
        super(context,DATABASE_NAME , null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_CONTACTS_TABLE =("Create table drink( id integer PRIMARY KEY AUTOINCREMENT,"+
           "name varchar(30),information varchar(60),price integer,imgid integer)");
        db.execSQL(CREATE_CONTACTS_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
