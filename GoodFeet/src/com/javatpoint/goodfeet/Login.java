package com.javatpoint.goodfeet;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
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
	SQLiteDatabase db=null;
	
	DatabaseHandlerr databasehandler;
	Intent i;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		
		
		databasehandler=new DatabaseHandlerr(Login.this);
		

		
		edt1=(EditText)findViewById(R.id.edt_namel);
		edt2=(EditText)findViewById(R.id.edt_emaill);
		
		//new entry
				db=openOrCreateDatabase("mydb", MODE_PRIVATE, null);
		
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
		
		btn=(Button)findViewById(R.id.btn_getstartl);
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				
				
				String name,email;
				
				name=edt1.getText().toString();
				email=edt2.getText().toString();
				
				if(name==null||name==""||name.length()<10)
				{
					Toast.makeText(Login.this,"please enter correct name",Toast.LENGTH_LONG).show();
				}
				
				else if(email==null||email==""||email.length()<10)
				{
					Toast.makeText(Login.this,"please enter correct email",Toast.LENGTH_LONG).show();
				}
				
				else
				{		
					Cursor c=db.rawQuery("select * from login where uname='"+name+"' and email='"+email+"'",null);	
					c.moveToFirst();
					if(c.getCount()>0)
					{
						i=new Intent(Login.this,Welcome.class);
						startActivityForResult(i,500);

						db.close();
						finish();
					}
					
					
					
					
				}
				
				
				
				
				//previos start
				
				Cursor cursor=databasehandler.getRow("pass");
				//Cursor cursor =databaseadapter.getRow2("name", "pass");

				if (cursor != null && cursor.getCount() != 0) {

					try{
						cursor.moveToFirst();
					}catch (Exception e)

					{
						Log.e("Failed", "Couldn't moveToFirst"); //I get a successful moveToFirst
					}

					try{

						do{

							//Getting value from Registration activity

							String store=cursor.getString(cursor.getColumnIndex(databasehandler.CUSTOMER_NAME));

							String store2=cursor.getString(cursor.getColumnIndex(databasehandler.CUSTOMER_EMAIL));

							//Toast.makeText(getApplicationContext(),"This the response store2 :"+store2,Toast.LENGTH_LONG ).show();


							if(name.equals(store)&&email.equals(store2))
							{
								Toast.makeText(Login.this, "Congrats: Login Successfully", Toast.LENGTH_LONG).show();

								Intent ii=new Intent(Login.this,Welcome.class);
								startActivity(ii);
							}

							else if(email.equals("")&&name.equals("")){
								Toast.makeText(Login.this, "Please Enter Your name and email", Toast.LENGTH_LONG).show();
							}





						}while(cursor.moveToNext());

					}catch (Exception e)


					{
						e.printStackTrace();

					}
					finally{
						cursor.close();

					}
				} 
			
			
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
	
	
	protected void onDestroy() {
		databasehandler.close();
		super.onDestroy();
	}
	
	
}
