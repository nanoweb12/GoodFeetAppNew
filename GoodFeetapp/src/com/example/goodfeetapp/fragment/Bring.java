package com.example.goodfeetapp.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.goodfeetapp.R;
import com.example.goodfeetapp.adapter.ImageAdapter;

public class Bring extends Fragment {
	static String TAG = "Bring";

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.gridview, container, false);
		
		getActivity().getActionBar().show();
		TypedValue tv = new TypedValue();
		System.out.println("in fragment login");
		GridView gridview = (GridView) view.findViewById(R.id.grid);
		gridview.setAdapter(new ImageAdapter(getActivity()));
		ImageView im = (ImageView) view.findViewById(R.id.forward);
		im.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				FragmentTransaction ft = getFragmentManager()
						.beginTransaction();
				Feetfrag feet = new Feetfrag();
				// Replace the container with the new fragment
				ft.replace(R.id.your_placeholder, feet, Fragment1.TAG);
				ft.addToBackStack(null);
				// or ft.add(R.id.your_placeholder, new FooFragment());
				// Execute the changes specified
				ft.commit();
			}
		});
		ImageView im1 = (ImageView) view.findViewById(R.id.back_bring);
		im1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//getActivity().requestWindowFeature(Window.FEATURE_ACTION_BAR_OVERLAY);
				getActivity().getActionBar().hide();
				 getFragmentManager().popBackStackImmediate(); 
				 
				
			}
		});

		gridview.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View v,
					int position, long id) {
				/*Toast.makeText(getActivity(), "" + position, Toast.LENGTH_SHORT)
						.show();*/
			}
		});

		return view;
	}

}
