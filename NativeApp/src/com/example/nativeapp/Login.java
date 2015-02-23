package com.example.nativeapp;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends Activity {
	
	private SharedPreferences prefs;
	private String prefName = "report";
	
	TextView txtname,txtemail;
	EditText edt1,edt2;
	Button btn;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		
		txtname=(TextView)findViewById(R.id.text_name);
		txtemail=(TextView)findViewById(R.id.text_email);
		
		edt1=(EditText)findViewById(R.id.edit_name);
		edt2=(EditText)findViewById(R.id.edit_email);
		
		edt1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				
			}
		});
		
		edt2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				
			}
		});
		
		btn=(Button)findViewById(R.id.button1);
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				
				
			
				prefs = getSharedPreferences(prefName, MODE_PRIVATE);
        		SharedPreferences.Editor editor = prefs.edit();
        		
        		//---save the values in the EditText view to preferences---
    			
            		editor.putString("name", edt1.getText().toString());
            		editor.putString("email", edt2.getText().toString());
            		
            		//---saves the values---
                	editor.commit();
        
        		Toast.makeText(getBaseContext(), "Saved",Toast.LENGTH_SHORT).show();
        		Toast.makeText(getBaseContext(), prefs.getString("name", "Balaji"), Toast.LENGTH_SHORT).show();
        		
        		
			}
		});
	}
}
