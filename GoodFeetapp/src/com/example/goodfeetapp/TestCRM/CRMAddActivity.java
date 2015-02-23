package com.example.goodfeetapp.TestCRM;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.goodfeetapp.R;
import com.example.goodfeetapp.TestCRM.database.ContactDAO;
import com.example.goodfeetapp.TestCRM.entity.Contact;

public class CRMAddActivity extends Activity {
	
	EditText et_client = null;
	EditText et_lstname = null;
	EditText et_tel = null;
	EditText et_email = null;
	EditText et_address = null;
	Button bt_ok = null;
	Button bt_cancel = null;
	String client_name = null;
	String contact_name = null;
	String tel = null;
	String email = null;
	String address = null;
	ContactDAO contactDAO = null;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.add);
		
		 getFragmentManager().popBackStackImmediate(); 
		
		final ActionBar actionBar = getActionBar();
		actionBar.hide();
		actionBar.setCustomView(R.layout.actionbar_item);
		actionBar.setDisplayShowTitleEnabled(false);
		actionBar.setDisplayShowCustomEnabled(true);
		actionBar.setDisplayUseLogoEnabled(false);
		actionBar.setDisplayShowHomeEnabled(false);
		
		
		
		
		
		
		et_client = (EditText) findViewById(R.id.et_client);
		et_lstname = (EditText) findViewById(R.id.et_lastname);
		et_tel = (EditText) findViewById(R.id.et_tel);
		et_email = (EditText) findViewById(R.id.et_email);
		et_address = (EditText) findViewById(R.id.et_address);
		bt_ok = (Button) findViewById(R.id.bt_ok);
		bt_cancel = (Button) findViewById(R.id.bt_cancel);
		
		contactDAO = new ContactDAO(this);
		contactDAO.createDatabase();
		
		bt_ok.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				client_name = et_client.getText().toString();
				contact_name = et_lstname.getText().toString();
				tel = et_tel.getText().toString();
				email = et_email.getText().toString();
				address = et_address.getText().toString();
				System.out.println(client_name + "," + contact_name + "," + tel);
				if(!client_name.trim().equals("") && !contact_name.trim().equals("") && !tel.trim().equals("")){
					Contact contact = new Contact();
					contact.setClient_name(client_name);
					contact.setContact_name(contact_name);
					contact.setTel(tel);
					contact.setEmail(email);
					contact.setAddress(address);
					long i = contactDAO.insertContact(contact);
					if(i == -1){
						Toast.makeText(getApplicationContext(), "Add Error, fail", Toast.LENGTH_LONG).show();
					}else{
						Intent intent = new Intent(CRMAddActivity.this, CRMListActivity.class);
						startActivity(intent);
					}
				}else{
					Toast.makeText(getApplicationContext(), "Please insert full info", Toast.LENGTH_LONG).show();
				}				
			}
		});
		
		bt_cancel.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				et_client.setText("");
				et_lstname.setText("");
				et_tel.setText("");
				et_email.setText("");
				et_address.setText("");
			}
		});
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}

	
