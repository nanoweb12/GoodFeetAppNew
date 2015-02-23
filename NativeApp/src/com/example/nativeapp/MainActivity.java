package com.example.nativeapp;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Spinner;
import android.widget.Toast;

@TargetApi(Build.VERSION_CODES.HONEYCOMB)
@SuppressLint("NewApi")
public class MainActivity extends Activity {

	
	Button btnfirst;
	int position=0;
	Intent it;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btnfirst=(Button)findViewById(R.id.btn_native);
		btnfirst.setOnClickListener(new OnClickListener() {
			
			@TargetApi(Build.VERSION_CODES.HONEYCOMB)
			@SuppressLint("NewApi")
			@Override
			public void onClick(View v) {
				//Creating the instance of PopupMenu
			    PopupMenu popup = new PopupMenu(MainActivity.this, btnfirst);
			    
			    //Inflating the Popup using xml file
			    popup.getMenuInflater().inflate(R.menu.popup, popup.getMenu());
			    
			  
			    
			  //registering popup with OnMenuItemClickListener
			    
			    popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
			     public boolean onMenuItemClick(MenuItem item) {
			    	
			    	
//			    	if(item.getItemId()==1)
//			    	{
////			    		  if(1==position)
////						    {}
//						    	
//						    	 it=new Intent(MainActivity.this,Login.class);
//						    	startActivity(it);
//						    	  Toast.makeText(MainActivity.this,"You Clicked : " + item.getItemId(),Toast.LENGTH_SHORT).show();
//			    	}
			      Toast.makeText(MainActivity.this,"You Clicked : " + item.getTitle(),Toast.LENGTH_SHORT).show();
			      return true;
			     }
			    });
			    
			    popup.show();//showing popup menu
			}
		});
		
		 Spinner sp = (Spinner) findViewById(R.id.spinner);
	        ArrayAdapter adapter = ArrayAdapter.createFromResource(
	                this, R.array.versiones, android.R.layout.simple_spinner_item);
	        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	        sp.setAdapter(adapter);
	        
	        sp.setOnItemSelectedListener(new OnItemSelectedListener() {
	           
	            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) 
	            {
	            	
	            	Toast.makeText(parentView.getContext(), "Has selected"+
	            	          parentView.getItemAtPosition(position).toString(), Toast.LENGTH_LONG).show();
//	            	 getActionBar().setBackgroundDrawable(new 
//	                         ColorDrawable(Color.parseColor("#347391")));
	            	    
	            }
	                                 
	            public void onNothingSelected(AdapterView<?> parentView) {
	            	
	            }
	            
	            
	        }); 
		
		
		
	}

	

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
}
