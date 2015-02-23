package com.javatpoint.goodfeet;




import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity {

			Button button2;
			Spinner spinner;
			ImageView button1;
			
		 @Override
		 
		 protected void onCreate(Bundle savedInstanceState) {
		  super.onCreate(savedInstanceState);
		  setContentView(R.layout.activity_main);
		  ActionBar actionBar = getActionBar(); 
		  actionBar.hide();
		  button1 = (ImageView) findViewById(R.id.button1);
		  button2 = (Button) findViewById(R.id.button2);
		  
		  button1.setOnClickListener(new OnClickListener() {
		 
		   @Override
		   public void onClick(View v) {
			//Creating the instance of PopupMenu
		    PopupMenu popup = new PopupMenu(MainActivity.this, button1);
		    //Inflating the Popup using xml file
		    popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());
		 
		    //registering popup with OnMenuItemClickListener
		    popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
		    	
		     public boolean onMenuItemClick(MenuItem item) {
		    	 
		      Toast.makeText(MainActivity.this,"You Clicked : " + item.getTitle(),Toast.LENGTH_SHORT).show();
		      if(item.getTitle().toString().equalsIgnoreCase("New Customer"))
		      {
		    	 Intent i=new Intent(MainActivity.this,New_customer.class);
		    	 startActivity(i);
		    	  
		      }
		      
		      else if(item.getTitle().toString().equalsIgnoreCase("Lookup CRM"))
		      {
		    	  Intent it=new Intent(MainActivity.this,Lookup_crm.class);
		    	  startActivity(it);
		    	  
		      }
		      return true;
		     }
		    });
		 
		    popup.show();//showing popup menu
		   }
		  });//closing the setOnClickListener method
		  
		  spinner.setOnClickListener(new OnClickListener() {
				 
			   @Override
			   public void onClick(View v) {
				//Creating the instance of PopupMenu
			    PopupMenu popup = new PopupMenu(MainActivity.this, button2);
			    //Inflating the Popup using xml file
			    popup.getMenuInflater().inflate(R.menu.popup_menu_second, popup.getMenu());
			 
			    //registering popup with OnMenuItemClickListener
			    popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
			    	
			     public boolean onMenuItemClick(MenuItem item) {
			      Toast.makeText(MainActivity.this,"You Clicked : " + item.getTitle(),Toast.LENGTH_SHORT).show();
			      
			      if(item.getTitle().toString().equalsIgnoreCase("Customer Information"))
			      {
			    	  
			    	  Intent i=new Intent(MainActivity.this,Fetchdata.class);
				    	 startActivity(i);
			    	  
			      }
			      return true;
			     }
			    });
			 
			    popup.show();//showing popup menu
			   }
			  });//closing the setOnClickListener method
		 
		 }
		 
	}
