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


public class MyFragment extends Fragment {
	public static final String EXTRA_MESSAGE = "EXTRA_MESSAGE";

	public static final MyFragment newInstance(String message) {
		MyFragment f = new MyFragment();
		Bundle bdl = new Bundle(1);
		bdl.putString(EXTRA_MESSAGE, message);
		f.setArguments(bdl);
		return f;
	}

	 @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container,
	      Bundle savedInstanceState) {
	      
	      View view = inflater.inflate(R.layout.frag1, container, false);
	      Button yes=(Button) view.findViewById(R.id.btn_yes);
	      System.out.println("in main frag");
	      yes.setOnClickListener(new OnClickListener() {
	      	
	      	@Override
	      	public void onClick(View v) {
	      		// TODO Auto-generated method stub
	      		System.out.println("in listener=========");
	      		FragmentTransaction ft = getFragmentManager().beginTransaction();
	      		Loginfrag login = new Loginfrag();
	      		// Replace the container with the new fragment
	      		ft.replace(R.id.your_placeholder, login, Fragment1.TAG);

	      		// or ft.add(R.id.your_placeholder, new FooFragment());
	      		// Execute the changes specified
	      		ft.commit();
	      		System.out.println("in end listener=========");
	      	}
	      });
	      return view;
	    }

}
