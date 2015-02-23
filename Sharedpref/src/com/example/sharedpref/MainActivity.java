package com.example.sharedpref;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	TextView txt_name,txt_number;
	EditText edt_name,edt_number;
	Button btn;
	SharedPreferences pref;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		//Store Value in SharedPreferance from EditText
		pref=getSharedPreferences(Sharedprefrence.PREFS_FILE, Context.MODE_PRIVATE);

		
		txt_name=(TextView)findViewById(R.id.txt_name);

		edt_name=(EditText)findViewById(R.id.edt_name);
		
		//Get Name field form SharedPreferance class

		String Name=Sharedprefrence.getName(pref);

		edt_name.setText(Name);
		//Get Number Field from SharedPreferance class	
		txt_number=(TextView)findViewById(R.id.txt_number);
		edt_number=(EditText)findViewById(R.id.edt_number);

		String Number=Sharedprefrence.getNumber(pref);
		edt_number.setText(Number);

		// Button for Save Both field in Sharedpreferance
		btn=(Button)findViewById(R.id.btn_save);
		btn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {


				if(edt_name.getText().toString().trim().length()==0||edt_number.getText().toString().trim().length()==0)
				{
					Toast.makeText(MainActivity.this,"Please enter values", Toast.LENGTH_SHORT).show();
					return;
				}
				Sharedprefrence.setName(pref, edt_name.getText().toString());
				Sharedprefrence.setNumber(pref,edt_number.getText().toString());
				finish();

				Toast.makeText(getBaseContext(), "Saved",Toast.LENGTH_SHORT).show();

				//Intent it=new Intent(MainActivity.this,ShowNext.class);
				//startActivity(it);
			}
		});


	}



}
