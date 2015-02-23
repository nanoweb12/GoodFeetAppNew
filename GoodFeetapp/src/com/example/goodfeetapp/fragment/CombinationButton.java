package com.example.goodfeetapp.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.goodfeetapp.R;
import com.example.goodfeetapp.adapter.CombinationAdapter;

public class CombinationButton extends Fragment {
	
	static String TAG="Combination";
	 @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container,
	      Bundle savedInstanceState) {
	      
	      View view = inflater.inflate(R.layout.combination, container, false);
	      System.out.println("in fragment login");
	      GridView gridview = (GridView) view.findViewById(R.id.grid_view1);
	      gridview.setAdapter(new CombinationAdapter(getActivity()));
	
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
