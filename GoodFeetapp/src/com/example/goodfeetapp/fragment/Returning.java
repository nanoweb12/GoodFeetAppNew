package com.example.goodfeetapp.fragment;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.goodfeetapp.MainActivity;
import com.example.goodfeetapp.R;

public class Returning extends Fragment {
	
	public static String TAG="Fragment1";
	 @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container,
	      Bundle savedInstanceState) {
	      
	      View view = inflater.inflate(R.layout.returning, container, false);
	     
	      System.out.println("in main frag");
	      Button start=(Button) view.findViewById(R.id.btn_getstart);
	      start .setOnClickListener(new OnClickListener() {
	      	
	      	@Override
	      	public void onClick(View v) {
	      
	      		 openAlert(v);
	      	}

			private void openAlert(View v) {
			
				
				
				 AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getActivity());
				 	          
				          alertDialogBuilder.setTitle("Goodfeet");
					         alertDialogBuilder.setMessage("Do you want us to populate this session with your previous submissions?");
				 	         // set positive button: Yes message
				 	         alertDialogBuilder.setPositiveButton("Yes",new DialogInterface.OnClickListener() {
				 	                public void onClick(DialogInterface dialog,int id) {
				                     // go to a new activity of the app
//				                     Intent positveActivity = new Intent(getApplicationContext(),
//				 	                            PositiveActivity.class);
//				                     startActivity(positveActivity);
				 	                	
				 	                
				 	                	
				 	                	
				 	                	
				 	                	FragmentTransaction ft = getFragmentManager()
				 	   						.beginTransaction();
				 	                	Bring bring1=new Bring();
				 	   				// Replace the container with the new fragment
				 	   				ft.replace(R.id.your_placeholder, bring1, Fragment1.TAG);
				 	   				ft.addToBackStack(null);
				 	   				// or ft.add(R.id.your_placeholder, new FooFragment());
				 	   				// Execute the changes specified
				 	   				ft.commit();
				 	                	
				                 }
				 	              });
				 	         // set negative button: No message
				 	         alertDialogBuilder.setNegativeButton("No",new DialogInterface.OnClickListener() {
				 	                public void onClick(DialogInterface dialog,int id) {
				 	                    // cancel the alert box and put a Toast to the user
				 	                    dialog.cancel();
				 	                   /* Toast.makeText(getActivity(), "You chose a negative answer",
				 	                            Toast.LENGTH_LONG).show();*/
				 	                }
				 	            });
				 	         // set neutral button: Exit the app message
				 	       /*  alertDialogBuilder.setNeutralButton("Exit the app",new DialogInterface.OnClickListener() {
				 	                public void onClick(DialogInterface dialog,int id) {
				                     // exit the app and go to the HOME
				                     getActivity().finish();
				                 }
				 	            });*/
				 	          
				 	         AlertDialog alertDialog = alertDialogBuilder.create();
				 	         // show alert
				          alertDialog.show();
				
				
				
				
				
				
				
			}
	      });
	      
	  
	      
	      return view;
	    }
}