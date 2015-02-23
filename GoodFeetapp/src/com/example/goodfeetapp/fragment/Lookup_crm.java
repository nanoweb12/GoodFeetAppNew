package com.example.goodfeetapp.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.goodfeetapp.R;
import com.example.goodfeetapp.database.Database_Lookup;

public class Lookup_crm  extends Fragment{
	
	Button btn_save;
	
	EditText edt_fname,edt_lname,edt_email,edt_phone,edt_address;
	
	Database_Lookup mylookup;
	
	public static String TAG="CRM";
	 @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container,
	      Bundle savedInstanceState) {
			
		 View view=inflater.inflate(R.layout.lookup_crm, container,false);
		 
		 btn_save=(Button)view.findViewById(R.id.btn_lookup);
		 edt_fname=(EditText)view.findViewById(R.id.edt_Fname);
		 edt_lname=(EditText)view.findViewById(R.id.edt_Lname);
		 edt_email=(EditText)view.findViewById(R.id.edt_email);
		 edt_phone=(EditText)view.findViewById(R.id.edt_phone);
		 edt_address=(EditText)view.findViewById(R.id.edt_address);
		 
		 
		 btn_save.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				String str1=edt_fname.getText().toString();
				String str2=edt_lname.getText().toString();
				String str3=edt_email.getText().toString();
				String str4=edt_phone.getText().toString();
				String str5=edt_address.getText().toString();
				if(str1.trim().length()>0&str2.trim().length()>0&str3.trim().length()>0&str4.trim().length()>0&str5.trim().length()>0)
				{
				
				
				mylookup=new Database_Lookup(getActivity());
				mylookup.insert(str1, str2, str3, str4, str5);
				
				System.out.println("the is str1 value======"+str1);
				System.out.println("the is str1 value======"+str2);
				System.out.println("the is str1 value======"+str3);
				System.out.println("the is str1 value======"+str4);
				System.out.println("the is str1 value======"+str5);
				
				}
				
			}
		});
		 
		 
		 
		return view;
		
	
		
	      
	 }
}
