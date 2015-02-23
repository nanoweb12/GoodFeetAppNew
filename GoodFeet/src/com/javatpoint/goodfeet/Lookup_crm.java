package com.javatpoint.goodfeet;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Lookup_crm extends Activity{
	
	EditText edt_fname,edt_lname,edt_email;
	Button btn_submitt;
	String str_fname,str_lname,str_email;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lookup_crm);
		
		edt_fname=(EditText)findViewById(R.id.edt_name);
		edt_lname=(EditText)findViewById(R.id.edt_lname);
		edt_email=(EditText)findViewById(R.id.edt_email);
		
		btn_submitt=(Button)findViewById(R.id.btn_submit);
		btn_submitt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			
				str_fname=edt_fname.getText().toString();
				str_lname=edt_lname.getText().toString();
				str_email=edt_email.getText().toString();
				
			}
		});
	}

}
