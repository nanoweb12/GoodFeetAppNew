package com.example.goodfeetapp.fragment;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Gravity;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.goodfeetapp.R;

public class Bodyfrag extends Fragment implements OnClickListener {
	static String TAG = "Body";
	ArrayAdapter<String> adapter;
	Button btn_a, btn_b, btn_c, btn_d, btn_e, btn_f, btn_g, btn_h, btn_j,
			btn_k, btn_l, btn_m, btn_n, btn_p, btn_q, btn_s, btn_v, btn_w,
			btn_y, btn_x;
	String[] choices = { "1", "2", "3", "4", "5" };
	int val = 0;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		final View view = inflater.inflate(R.layout.body, container, false);
		System.out.println("in fragment login");
		btn_a = (Button) view.findViewById(R.id.btn_A);
		btn_b = (Button) view.findViewById(R.id.btn_B);

		btn_c = (Button) view.findViewById(R.id.btn_C);
		btn_d = (Button) view.findViewById(R.id.btn_D);
		btn_e = (Button) view.findViewById(R.id.btn_E);
		btn_f = (Button) view.findViewById(R.id.btn_F);
		btn_g = (Button) view.findViewById(R.id.btn_G);
		btn_h = (Button) view.findViewById(R.id.btn_H);

		btn_j = (Button) view.findViewById(R.id.btn_J);
		btn_k = (Button) view.findViewById(R.id.btn_K);
		btn_l = (Button) view.findViewById(R.id.btn_L);
		btn_m = (Button) view.findViewById(R.id.btn_M);
		btn_n = (Button) view.findViewById(R.id.btn_N);
		btn_p = (Button) view.findViewById(R.id.btn_P);
		btn_q = (Button) view.findViewById(R.id.btn_Q);
		btn_s = (Button) view.findViewById(R.id.btn_S);
		btn_v = (Button) view.findViewById(R.id.btn_V);
		btn_w = (Button) view.findViewById(R.id.btn_W);
		btn_y = (Button) view.findViewById(R.id.btn_Y);
		btn_x = (Button) view.findViewById(R.id.btn_X);

		btn_a.setOnClickListener((OnClickListener) this);
		btn_b.setOnClickListener((OnClickListener) this);
		btn_c.setOnClickListener((OnClickListener) this);
		btn_d.setOnClickListener((OnClickListener) this);
		btn_e.setOnClickListener((OnClickListener) this);
		btn_f.setOnClickListener((OnClickListener) this);
		btn_g.setOnClickListener((OnClickListener) this);

		btn_h.setOnClickListener((OnClickListener) this);
		btn_j.setOnClickListener((OnClickListener) this);
		btn_k.setOnClickListener((OnClickListener) this);
		btn_l.setOnClickListener((OnClickListener) this);
		btn_m.setOnClickListener((OnClickListener) this);

		btn_n.setOnClickListener((OnClickListener) this);
		btn_p.setOnClickListener((OnClickListener) this);
		btn_q.setOnClickListener((OnClickListener) this);
		btn_s.setOnClickListener((OnClickListener) this);
		btn_v.setOnClickListener((OnClickListener) this);

		btn_w.setOnClickListener((OnClickListener) this);
		btn_y.setOnClickListener((OnClickListener) this);
		btn_x.setOnClickListener((OnClickListener) this);
		ImageView bt = (ImageView) view.findViewById(R.id.next);

		// button = (Button) view.findViewById(R.id.first);

		// add button listener

		if (bt == null) {
			System.out.println("value is null=====");
		} else {
			System.out.println("value is no0yt null=====");
			bt.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					FragmentTransaction ft = getFragmentManager()
							.beginTransaction();
					Work_act_shoe apt = new Work_act_shoe();
					// Replace the container with the new fragment
					ft.replace(R.id.your_placeholder, apt, Work_act_shoe.TAG);
					ft.addToBackStack(null);
					// or ft.add(R.id.your_placeholder, new FooFragment());
					// Execute the changes specified
					ft.commit();
				}
			});
		}
		ImageView previous = (ImageView) view.findViewById(R.id.previous);
		previous.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				getFragmentManager().popBackStackImmediate();
				

			}
		});
		return view;
	}

	public void my_dialog(final View v) {

		AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
		final TextView myView = new TextView(getActivity());
		myView.setText("Please select on a scale from 1-5 how much pain you�re having in the selected area");
		myView.setGravity(Gravity.CENTER);
		myView.setTextSize(18);
		myView.setPadding(6,6,6, 6);
		builder.setCustomTitle(myView);
		//builder.setTitle("Please select on a scale from 1-5 how much pain you�re having in the selected area");
		
		builder.setItems(choices, new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// the user clicked on colors[which]

				switch (which) {

				case 0:
					v.setBackgroundResource(R.drawable.step1_red);

					break;
				case 1:
					v.setBackgroundResource(R.drawable.step2_red);

					break;
				case 2:
					v.setBackgroundResource(R.drawable.step3_red);

					break;
				case 3:
					v.setBackgroundResource(R.drawable.step4_red);

					break;
				case 4:
					v.setBackgroundResource(R.drawable.step5_red);

					break;

				}
			}
		});
		
		builder.show().getWindow().setLayout(360,345);
		
		
		

	}

	public void dialog_open(final View v) {
		
		// custom dialog
		final Dialog dialog = new Dialog(getActivity());
		System.out.println("111111");
		dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
		dialog.setContentView(R.layout.custom);
		System.out.println("2222222");
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_dropdown_item_1line, choices);
		System.out.println("33333333");
		dialog.setTitle("How much pain are you experiencing?");

		System.out.println("44444444");
		final Spinner Spin1 = (Spinner) dialog.findViewById(R.id.spinner);
		Spin1.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int position, long arg3) {
				// TODO Auto-generated method stub

				int getval = Spin1.getSelectedItemPosition();
				switch (position) {

				case 0:
					v.setBackgroundResource(R.drawable.step1_red);

					dialog.dismiss();
					break;
				case 1:
					v.setBackgroundResource(R.drawable.step2_red);
					dialog.dismiss();
					break;
				case 2:
					v.setBackgroundResource(R.drawable.step3_red);
					dialog.dismiss();
					break;
				case 3:
					v.setBackgroundResource(R.drawable.step4_red);
					dialog.dismiss();
					break;
				case 4:
					v.setBackgroundResource(R.drawable.step5_red);
					dialog.dismiss();
					break;

				}

			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub

			}
		});
		System.out.println("55555555");

		Spin1.setAdapter(adapter);
		System.out.println("666666666");
		// set the custom dialog components - text, image and button

		/*
		 * Button dialogButton = (Button)
		 * dialog.findViewById(R.id.dialogButtonOK); // if button is clicked,
		 * close the custom dialog dialogButton.setOnClickListener(new
		 * OnClickListener() {
		 * 
		 * @Override public void onClick(View v) { dialog.dismiss(); } });
		 */
		dialog.show();
		System.out.println("77777777777");

	}

	@Override
	public void onClick(View v) {

		System.out.println("in on click====================");
		switch (v.getId()) {
		case R.id.btn_A:
			// Play voicefile
			my_dialog(v);

			break;
		case R.id.btn_B:
			// Stop MediaPlayer
			my_dialog(v);
			break;
		case R.id.btn_C:
			// Stop MediaPlayer
			my_dialog(v);
			break;
		case R.id.btn_D:
			// Stop MediaPlayer
			my_dialog(v);
			break;
		case R.id.btn_E:
			// Stop MediaPlayer
			my_dialog(v);
			break;
		case R.id.btn_F:
			// Stop MediaPlayer
			my_dialog(v);
			break;

		case R.id.btn_G:
			// Stop MediaPlayer
			my_dialog(v);
			break;
		case R.id.btn_H:
			// Stop MediaPlayer
			my_dialog(v);
			break;
		case R.id.btn_J:
			// Stop MediaPlayer
			my_dialog(v);
			break;
		case R.id.btn_K:
			// Stop MediaPlayer
			my_dialog(v);
			break;

		case R.id.btn_L:
			// Stop MediaPlayer
			my_dialog(v);
			break;
		case R.id.btn_M:
			// Stop MediaPlayer
			my_dialog(v);
			break;
		case R.id.btn_N:
			// Stop MediaPlayer
			my_dialog(v);
			break;
		case R.id.btn_P:
			// Stop MediaPlayer
			my_dialog(v);
			break;
		case R.id.btn_Q:
			// Stop MediaPlayer
			my_dialog(v);
			break;

		case R.id.btn_S:
			// Stop MediaPlayer
			my_dialog(v);
			break;
		case R.id.btn_V:
			// Stop MediaPlayer
			my_dialog(v);
			break;
		case R.id.btn_W:
			// Stop MediaPlayer
			my_dialog(v);
			break;

		case R.id.btn_X:
			// Stop MediaPlayer
			my_dialog(v);
			break;
		case R.id.btn_Y:
			// Stop MediaPlayer
			my_dialog(v);
			break;

		}

		// TODO Auto-generated method stub

	}

}
