package com.example.croombrowser;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.opengl.Visibility;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;

public class MainActivity extends Activity {
	
	private Spinner spinner1;
	ImageView img;
	Button btn;
	LinearLayout formLayout;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		img=(ImageView)findViewById(R.id.image);
		spinner1 = (Spinner) findViewById(R.id.spinner1);
		
		
		
		addItemsOnSpinner1();
	
		addListenerOnSpinnerItemSelection();
		
			}

	

	private void addListenerOnSpinnerItemSelection() {
		
		spinner1 = (Spinner) findViewById(R.id.spinner1);
		spinner1.setOnItemSelectedListener(new CustomOnItemSelectedListener());
		
		
	}

	private void addItemsOnSpinner1() {
		spinner1 = (Spinner) findViewById(R.id.spinner1);
	
		List<String> list = new ArrayList<String>();
		
		list.add("BROWSER STYLE");
		
		ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
		android.R.layout.simple_spinner_item, list);


		dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner1.setAdapter(dataAdapter);
	
	}


	
}
