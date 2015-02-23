package com.example.goodfeetapp.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class Database_Lookup extends SQLiteOpenHelper {
	
	private static final String TAG = Database_Lookup.class.getSimpleName();
	
	 private static final int DATABASE_VERSION = 1;
	 
	  // Database Name
	    private static final String DATABASE_NAME = "LookupCrm.db";
	    
	    // Contacts table name
	    private static final String TABLE_LOOKUP = "Customer";
	    
	    
	    
	    // Contacts Table Columns names
	    private static final String KEY_ID = "id";
	    private static final String KEY_FNAME = "fname";
	    private static final String KEY_LNAME="lname";
	    private static final String KEY_EMAIL = "email";
	    private static final String KEY_PHONE = "phone";
	    private static final String KEY_ADDRESS = "address";
	    
	    Context context;
	   
	

	public Database_Lookup(Context context) {
		super(context,DATABASE_NAME,null,DATABASE_VERSION);
		
	}
	
	
	//Table create quairy
		private static final String TABLE_MESSAGE_CREATE
		= "CREATE TABLE " + TABLE_LOOKUP
		+ " (" + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "

		+ KEY_FNAME + " VARCHAR(255), "
		+  KEY_LNAME + " VARCHAR(255), "
		+  KEY_EMAIL + " VARCHAR(255), "
		+  KEY_PHONE + " VARCHAR(255), "
		+KEY_ADDRESS + " VARCHAR(255));";

	
		private static final String TABLE_MESSAGE_DROP = 
				"DROP TABLE IF EXISTS "
						+ TABLE_LOOKUP;
	@Override
	public void onCreate(SQLiteDatabase db) {
	
	db.execSQL(TABLE_MESSAGE_CREATE);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		Log.w(TAG, "Upgrade der DB von V: "+ oldVersion + " zu V:" + newVersion + "; Alle Daten werden gelöscht!");
		db.execSQL(TABLE_MESSAGE_DROP);
		onCreate(db);
		
	}
	
	
	
	public void insert(String fname, String lname, String email, String phone,String address){
		Log.e("Row inserted", "Row inserted");
		long rowId = -1;
		try{

			SQLiteDatabase db = getWritableDatabase();
			
			ContentValues values = new ContentValues();
			
			
			values.put(KEY_FNAME,fname);
			values.put(KEY_LNAME, lname);
			values.put(KEY_EMAIL, email);
			values.put(KEY_PHONE, phone);
			values.put(KEY_ADDRESS,address);

			rowId = db.insert(TABLE_LOOKUP, null, values);

		} catch (SQLiteException e){
			Log.e(TAG, "insert()", e);
		} finally {
			Log.d(TAG, "insert(): rowId=" + rowId);
		}

	}
	
	public Cursor get() {

		SQLiteDatabase db = getWritableDatabase();
		return db.query(TABLE_LOOKUP, new String[] {KEY_ID, KEY_FNAME,
				KEY_LNAME, KEY_EMAIL,KEY_PHONE,KEY_ADDRESS}, null, null, null, null, null);


	}
	
	
	public int deleteAllContacts() {
		SQLiteDatabase db = getWritableDatabase();
		return db.delete(TABLE_LOOKUP, null, null);
	}
	
	
	
	public Cursor getRow(String mail) {

		SQLiteDatabase db = getWritableDatabase();
		return db.query(TABLE_LOOKUP, new String[] {KEY_ID,KEY_FNAME,
				KEY_EMAIL},KEY_EMAIL + "=" +mail, null, null, null, null);


	}
	
	

}
