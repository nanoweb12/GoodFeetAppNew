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
import com.example.goodfeetapp.adapter.Newactivityadapter;
import com.example.goodfeetapp.adapter.Newshoewadapter;

public class Steptwo extends Fragment {
	static String TAG = "Steptwo";
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.second_grid, container, false);
		System.out.println("in fragment login");
		GridView gridview1 = (GridView) view.findViewById(R.id.grid_shoes);
		gridview1.setAdapter(new Newshoewadapter(getActivity()));
		GridView gridview2 = (GridView) view.findViewById(R.id.grid_activity);
		gridview2.setAdapter(new Newactivityadapter(getActivity()));
		ImageView im = (ImageView) view.findViewById(R.id.next);
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
				// TODO Auto-generated method stub
				FragmentTransaction ft = getFragmentManager()
						.beginTransaction();
			Recuperate recuperrate = new Recuperate();
				// Replace the container with the new fragment
				ft.replace(R.id.your_placeholder, recuperrate, Steptwo.TAG);
				ft.addToBackStack(null);
				// or ft.add(R.id.your_placeholder, new FooFragment());
				// Execute the changes specified
				ft.commit();
			}
		});

		gridview1.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View v,
					int position, long id) {
				/*Toast.makeText(getActivity(), "" + position, Toast.LENGTH_SHORT)
						.show();*/
			}
		});

		return view;
	}
}
