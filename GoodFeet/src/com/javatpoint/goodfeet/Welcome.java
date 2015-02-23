package com.javatpoint.goodfeet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class Welcome extends Activity {

	Button btn_yes,btn_no;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.welcome);

		btn_yes=(Button)findViewById(R.id.btn_yes);
		btn_no=(Button)findViewById(R.id.btn_no);

				btn_yes.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View v) {
						
						Intent it=new Intent(Welcome.this,Login.class);
						startActivity(it);
					}
				});
				btn_no.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View v) {
						Intent i=new Intent(Welcome.this,Login.class);
						startActivity(i);
						
					}
				});
		
//		btn_yes.setOnClickListener((OnClickListener) this);
//		
//		btn_no.setOnClickListener((OnClickListener) this);

	}


//	public void onClick(View v)
//	{
//		switch (v.getId()) {
//		case R.id.btn_yes:
//			it=new Intent(Welcome.this,Login.class);
//			startActivity(it);
//			break;
//
//		case R.id.btn_no:
//			i=new Intent(Welcome.this,Login.class);
//			startActivity(i);
//			break;
//		}
//
//	}
	
}
