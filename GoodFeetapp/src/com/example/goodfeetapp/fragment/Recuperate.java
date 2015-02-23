package com.example.goodfeetapp.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

import com.example.goodfeetapp.R;

public class Recuperate extends Fragment {
	
	
	
	static String TAG="Recuperate";
	 @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container,
	      Bundle savedInstanceState) {
	      
	      View view = inflater.inflate(R.layout.recuperate, container, false);
	      System.out.println("in fragment login");
	      ImageView im1 = (ImageView) view.findViewById(R.id.img_left);
	      ImageView next = (ImageView) view.findViewById(R.id.img_right);
	      next.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				FragmentTransaction ft = getFragmentManager()
						.beginTransaction();
				Click_picture click = new Click_picture();
				// Replace the container with the new fragment
				ft.replace(R.id.your_placeholder, click, Click_picture.TAG);
				ft.addToBackStack(null);
				// or ft.add(R.id.your_placeholder, new FooFragment());
				// Execute the changes specified
				ft.commit();
			}
		});
			im1.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					 getFragmentManager().popBackStackImmediate(); 
					
				}
			});
	     // GridView gridview = (GridView) view.findViewById(R.id.grid_view1);
	     // gridview.setAdapter(new CombinationAdapter(getActivity()));
	
	     /* Button bt = (Button) view.findViewById(R.id.submit);
	    
	      bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				FragmentTransaction ft = getFragmentManager().beginTransaction();
				Work_act_shoe apt= new Work_act_shoe();
	      		// Replace the container with the new fragment
	      		ft.replace(R.id.your_placeholder, apt, Work_act_shoe.TAG);
	      		ft.addToBackStack(null);
	      		// or ft.add(R.id.your_placeholder, new FooFragment());
	      		// Execute the changes specified
	      		ft.commit();
			}
		});*/
	      return view;
	    }


}
	
	


