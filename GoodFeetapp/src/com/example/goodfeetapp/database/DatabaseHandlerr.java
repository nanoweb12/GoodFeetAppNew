package com.example.goodfeetapp.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DatabaseHandlerr extends SQLiteOpenHelper{
	
	private static final String TAG = DatabaseHandlerr.class.getSimpleName();
	
	private static final String DATABASE_NAME = "login.db";
	private static final int DATABASE_VERSION = 3;
	
	private static final String _ID = "_id";
	private static final String TABLE_NAME_CUSTOMER = "customer";
	
	public static final String CUSTOMER_NAME= "customer_name";
	public static final String CUSTOMER_EMAIL="customer_email";
	
	Context context;
	
	//Table create quairy
		private static final String TABLE_LOGIN_CREATE
		= "CREATE TABLE " + TABLE_NAME_CUSTOMER
		+ " (" + _ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "

		+ CUSTOMER_NAME + " VARCHAR(255), "
		+ CUSTOMER_EMAIL + " VARCHAR(255)," ;
		
		private static final String TABLE_MESSAGE_DROP = 
				"DROP TABLE IF EXISTS "
						+TABLE_NAME_CUSTOMER;
		
		public DatabaseHandlerr (Context context) {
			super(context, DATABASE_NAME, null, DATABASE_VERSION);
		}
	

	public DatabaseHandlerr(Context context, String name,
			CursorFactory factory, int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}
	
	
	public SQLiteDatabase openOrCreateDatabase(String name, int mode,
	        CursorFactory factory) {
	    return openOrCreateDatabase(name, mode, factory);

	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(TABLE_LOGIN_CREATE);
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		Log.w(TAG, "Upgrade der DB von V: "+ oldVersion + " zu V:" + newVersion + "; Alle Daten werden gelöscht!");
		db.execSQL(TABLE_MESSAGE_DROP);
		onCreate(db);

		
	}
	
	
	public void insert(String fname, String email){
		Log.e("Row inserted", "Row inserted");
		long rowId = -1;
		try{

			SQLiteDatabase db = getWritableDatabase();
			ContentValues values = new ContentValues();
			
			
			values.put(CUSTOMER_NAME,fname);
			values.put(CUSTOMER_EMAIL, email);
		

			rowId = db.insert(TABLE_NAME_CUSTOMER, null, values);

		} catch (SQLiteException e){
			Log.e(TAG, "insert()", e);
		} finally {
			Log.d(TAG, "insert(): rowId=" + rowId);
		}

	}
	
	public Cursor get() {

		SQLiteDatabase db = getWritableDatabase();
		return db.query(TABLE_NAME_CUSTOMER, new String[] {_ID, CUSTOMER_NAME,
				CUSTOMER_EMAIL}, null, null, null, null, null);


	}
	
	public int deleteAllContacts() {
		SQLiteDatabase db = getWritableDatabase();
		return db.delete(TABLE_NAME_CUSTOMER, null, null);
	}
	
	public Cursor getRow(String mail) {

		SQLiteDatabase db = getWritableDatabase();
		return db.query(TABLE_NAME_CUSTOMER, new String[] {_ID,CUSTOMER_NAME,
				CUSTOMER_EMAIL}, CUSTOMER_EMAIL + "=" +mail, null, null, null, null);


	}
	
	
	
	

}
