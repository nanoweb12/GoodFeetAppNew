package com.example.goodfeetapp.adapter;



import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;

import com.example.goodfeetapp.R;

public class CombinationAdapter extends BaseAdapter {

	private Context mContext;

	public CombinationAdapter(Context c) {
		mContext = c;
	}

	public int getCount() {
		return comb.length;
	}

	public Object getItem(int position) {
		return null;
	}

	public long getItemId(int position) {
		return 0;
	}

	// create a new ImageView for each item referenced by the Adapter
	public View getView(int position, View convertView, ViewGroup parent) {
		Button btn;
		if (convertView == null) { // if it's not recycled, initialize some
									// attributes
			btn = new Button(mContext);
			// imageView.setBackgroundColor(Color.b);
			btn.setLayoutParams(new GridView.LayoutParams(95, 65));
			btn.setBackgroundResource(R.drawable.my_shape);
			btn.setTextSize(24);
			btn.setSingleLine(true);
			btn.setPadding(5, 10, 0, 0);

		} else {
			btn = (Button) convertView;
		}

		btn.setText(comb[position]);
		return btn;
	}

	// references to our images
	private String[] comb = { "Athletic!", "Dress", "Oxford","Boots","Sandals","Additional Styles"
			 };
}

