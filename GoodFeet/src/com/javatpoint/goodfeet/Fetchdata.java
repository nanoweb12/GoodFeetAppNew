package com.javatpoint.goodfeet;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Fetchdata extends Activity {
	static ArrayList<String> mycontacts;
	ListView list;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fetchdata);
		list=(ListView) findViewById(R.id.list);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,
        android.R.layout.simple_list_item_1, // standard row layout provided by android
        mycontacts);
		mycontacts=new ArrayList<String>();
		 DatabaseHandler db = new DatabaseHandler(this);
		 List<Contact> contacts = db.getAllContacts();      
         
	        for (Contact cn : contacts) {
	            String log = cn.getName().toString();
	            mycontacts.add(log);
	                // Writing Contacts to log
	        Log.d("Name: ", log);
	        list.setAdapter(adapter);
	    }
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_fetchdata, menu);
		return true;
	}

}
