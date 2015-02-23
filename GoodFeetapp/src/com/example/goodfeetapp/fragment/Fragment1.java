package com.example.goodfeetapp.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.goodfeetapp.R;

public class Fragment1 extends Fragment {
	public static String TAG="Fragment1";
	 @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container,
	      Bundle savedInstanceState) {
	      
	      View view = inflater.inflate(R.layout.frag1, container, false);
	      Button no=(Button) view.findViewById(R.id.btn_no);
	      Button yes=(Button) view.findViewById(R.id.btn_yes);
	      System.out.println("in main frag");
	      no.setOnClickListener(new OnClickListener() {
	      	
	      	@Override
	      	public void onClick(View v) {
	      		// TODO Auto-generated method stub
	      		System.out.println("in listener=========");
	      		FragmentTransaction ft = getFragmentManager().beginTransaction();
	      		Loginfrag login = new Loginfrag();
	      		// Replace the container with the new fragment
	      		ft.replace(R.id.your_placeholder, login, Fragment1.TAG);
	      		ft.addToBackStack(null);
	      		// or ft.add(R.id.your_placeholder, new FooFragment());
	      		// Execute the changes specified
	      		ft.commit();
	      		System.out.println("in end listener=========");
	      	}
	      });
	      
	       yes=(Button) view.findViewById(R.id.btn_yes);
	      yes.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				System.out.println("in listener=========");
	      		FragmentTransaction ft = getFragmentManager().beginTransaction();
	      		Returning returning = new Returning();
	      		// Replace the container with the new fragment
	      		ft.replace(R.id.your_placeholder, returning, Fragment1.TAG);
	      		ft.addToBackStack(null);
	      		// or ft.add(R.id.your_placeholder, new FooFragment());
	      		// Execute the changes specified
	      		ft.commit();
	      		System.out.println("in end listener=========");
				
			
				
			}
		});
	      
	      
	      return view;
	    }
}
