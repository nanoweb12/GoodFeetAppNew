package com.example.sharedpref;

import android.content.SharedPreferences;

public class Sharedprefrence {
	
	public static final String PREFS_FILE="pref_file";
	public static String Name ="name";
	public static String Number="number";
	//public static String STATUS="status";
	
	
	public static void setName(SharedPreferences pref, String name){
		pref.edit().putString(Name, name).commit();
	}
	
	public static String getName(SharedPreferences pref){
		return pref.getString(Name, null);
		
	}
	
	public static void setNumber(SharedPreferences pref,String number)
	{
		pref.edit().putString(Number, number).commit();
	}
	public static String getNumber(SharedPreferences pref)
	{
		return pref.getString(Number, null);
	}
}
