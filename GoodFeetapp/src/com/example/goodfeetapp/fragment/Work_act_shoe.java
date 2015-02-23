package com.example.goodfeetapp.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.goodfeetapp.R;
import com.example.goodfeetapp.adapter.Activityadapter;
import com.example.goodfeetapp.adapter.Shoeadapter;
import com.example.goodfeetapp.adapter.Socksadapter;

public class Work_act_shoe extends Fragment{
	static String TAG="Activityadapter";
	 @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container,
	      Bundle savedInstanceState) {
	      
	      View view = inflater.inflate(R.layout.work_act_shoe, container, false);
	      System.out.println("in fragment login");
	      GridView gridview = (GridView) view.findViewById(R.id.grid_shoes);
	      gridview.setAdapter(new Shoeadapter(getActivity()));
 
     	GridView gridview1 = (GridView) view.findViewById(R.id.grid_socks);
     	gridview1.setAdapter(new Socksadapter(getActivity()));
      
	     GridView gridview2 = (GridView) view.findViewById(R.id.grid_activity);
	     gridview2.setAdapter(new Activityadapter(getActivity()));
      
      System.out.println("decalred grid==============");
	      ImageView im=(ImageView)view.findViewById(R.id.next);
	      ImageView im1 = (ImageView) view.findViewById(R.id.back);
			im1.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					 getFragmentManager().popBackStackImmediate(); 
					
				}
			});
	      im.setOnClickListener(new OnClickListener() {
			
			@Override 
			public void onClick(View v) {
				 FragmentTransaction ft = getFragmentManager()
							.beginTransaction();
					Steptwo two = new Steptwo();
					// Replace the container with the new fragment
					ft.replace(R.id.your_placeholder, two, Steptwo.TAG);
					ft.addToBackStack(null);
					// or ft.add(R.id.your_placeholder, new FooFragment());
					// Execute the changes specified
					ft.commit(); 
			}
		});
	      gridview.setOnItemClickListener(new OnItemClickListener() {
	          public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
	             /* Toast.makeText(getActivity(), "" + position, Toast.LENGTH_SHORT).show();*/
	          }
	      });
	     
	      return view;
	    }

}
