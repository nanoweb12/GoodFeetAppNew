package com.javatpoint.goodfeet;

import java.util.HashSet;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class New_customer extends Activity {
EditText txt1,txt2;
Button toggleButton5;
String value_name,value_mail;

HashSet<String> myset;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		myset=new HashSet<String>();
		setContentView(R.layout.activity_new_customer);
		
		txt1=(EditText) findViewById(R.id.toggleButton2);
		txt2=(EditText) findViewById(R.id.toggleButton4);
		toggleButton5=(Button) findViewById(R.id.toggleButton5);
		
		 final DatabaseHandler db = new DatabaseHandler(this);
		toggleButton5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				value_name=txt1.getText().toString();
				value_mail=txt1.getText().toString();
				
		         
			        /**
			         * CRUD Operations
			         * */
			        // Inserting Contacts
			        Log.d("Insert: ", "Inserting ..");
			        db.addContact(new Contact(value_name, value_mail));       
			       
			         
				
			}
		});
		
		
		
	}

	

}
