package com.example.goodfeetapp.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

import com.example.goodfeetapp.R;

public class Activityadapter extends BaseAdapter {
	private Context mContext;
	
	
	boolean isClicked0=true;
	boolean isClicked1=true;
	boolean isClicked2=true;
	boolean isClicked3=true;
	boolean isClicked4=true;
	boolean isClicked5=true;
	boolean isClicked6=true;
	boolean isClicked7=true;
	boolean isClicked8=true;
	boolean isClicked9=true;
	boolean isClicked10=true;
	boolean isClicked11=true;
	public Activityadapter(Context c) {
		mContext = c;
	}

	public int getCount() {
		return mThumbIds.length;
	}

	public Object getItem(int position) {
		return null;
	}

	public long getItemId(int position) {
		return 0;
	}

	// create a new ImageView for each item referenced by the Adapter
	public View getView(final int position, View convertView, ViewGroup parent) {
		final Button btn;
		if (convertView == null) { // if it's not recycled, initialize some
			// attributes
			btn = new Button(mContext);
			// imageView.setBackgroundColor(Color.b);
			btn.setLayoutParams(new GridView.LayoutParams(100, 65));
			btn.setBackgroundResource(R.drawable.my_shape);
			btn.setTextColor(Color.parseColor("#ffffff")); 
			btn.setTextSize(18);
			btn.setPadding(5, 6, 0, 0);

		} else {
			btn = (Button) convertView;
		}



		btn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// Toast.makeText(mContext, " Hello This i position [0]" + position, Toast.LENGTH_SHORT).show();
				if(position==0&&isClicked0==true)
				{

			


					// btn_shoe.setBackgroundResource(R.drawable.red);
					btn.setBackgroundResource(R.drawable.clicked_red); 
					isClicked0=false;

					System.out.println("a1 is true===========");

				}
				else
				{
					System.out.println("a1 is false===========");
					if(position==0)
					{
						btn.setBackgroundResource(R.drawable.my_shape);

						isClicked0=true;
					}
				}
				//1

				if(position==1&&isClicked1==true)
				{

					/*Toast.makeText(mContext, " Hello This i position [postion]=" + position, Toast.LENGTH_SHORT).show();*/


					// btn_shoe.setBackgroundResource(R.drawable.red);
					btn.setBackgroundResource(R.drawable.clicked_red); 
					isClicked1=false;

					System.out.println("a1 is true===========");

				}
				else
				{
					System.out.println("a1 is false===========");
					if(position==1)
					{
						btn.setBackgroundResource(R.drawable.my_shape);

						isClicked1=true;
					}
				}

				//2

				if(position==2&&isClicked2==true)
				{

					


					// btn_shoe.setBackgroundResource(R.drawable.red);
					btn.setBackgroundResource(R.drawable.clicked_red); 
					isClicked2=false;

					System.out.println("a1 is true===========");

				}
				else
				{
					System.out.println("a1 is false===========");
					if(position==2)
					{
						btn.setBackgroundResource(R.drawable.my_shape);

						isClicked2=true;
					}
				}


				//3
				if(position==3&&isClicked3==true)
				{

					


					// btn_shoe.setBackgroundResource(R.drawable.red);
					btn.setBackgroundResource(R.drawable.clicked_red); 
					isClicked3=false;

					System.out.println("a1 is true===========");

				}
				else
				{
					System.out.println("a1 is false===========");
					if(position==3)
					{
						btn.setBackgroundResource(R.drawable.my_shape);

						isClicked3=true;
					}
				}

				//4
				if(position==4&&isClicked4==true)
				{

					


					// btn_shoe.setBackgroundResource(R.drawable.red);
					btn.setBackgroundResource(R.drawable.clicked_red); 
					isClicked4=false;

					System.out.println("a1 is true===========");

				}
				else
				{
					System.out.println("a1 is false===========");
					if(position==4)
					{
						btn.setBackgroundResource(R.drawable.my_shape);
						isClicked4=true;
					}
				}
				//5

				if(position==5&&isClicked5==true)
				{

					


					// btn_shoe.setBackgroundResource(R.drawable.red);
					btn.setBackgroundResource(R.drawable.clicked_red); 
					isClicked5=false;

					System.out.println("a1 is true===========");

				}
				else
				{
					System.out.println("a1 is false===========");
					if(position==5)
					{
						btn.setBackgroundResource(R.drawable.my_shape);

						isClicked5=true;
					}
				}

				//6

				if(position==6&&isClicked6==true)
				{

					


					// btn_shoe.setBackgroundResource(R.drawable.red);
					btn.setBackgroundResource(R.drawable.clicked_red); 
					isClicked6=false;

					System.out.println("a1 is true===========");

				}
				else
				{
					System.out.println("a1 is false===========");
					if(position==6)
					{
						btn.setBackgroundResource(R.drawable.my_shape);

						isClicked6=true;
					}
				}


				//7



				if(position==7&&isClicked7==true)
				{

					


					// btn_shoe.setBackgroundResource(R.drawable.red);
					btn.setBackgroundResource(R.drawable.clicked_red); 
					isClicked7=false;

					System.out.println("a1 is true===========");

				}
				else
				{
					System.out.println("a1 is false===========");
					if(position==7)
					{
						btn.setBackgroundResource(R.drawable.my_shape);

						isClicked7=true;
					}
				}






				//8






				if(position==8&&isClicked8==true)
				{

					


					// btn_shoe.setBackgroundResource(R.drawable.red);
					btn.setBackgroundResource(R.drawable.clicked_red);  
					isClicked8=false;

					System.out.println("a1 is true===========");

				}
				else
				{
					System.out.println("a1 is false===========");
					if(position==8)
					{
						btn.setBackgroundResource(R.drawable.my_shape);

						isClicked8=true;
					}
				}











				//9





				if(position==9&&isClicked9==true)
				{

					


					// btn_shoe.setBackgroundResource(R.drawable.red);
					btn.setBackgroundResource(R.drawable.clicked_red); 
					isClicked9=false;

					System.out.println("a1 is true===========");

				}
				else
				{
					System.out.println("a1 is false===========");
					if(position==9)
					{
						
						btn.setBackgroundResource(R.drawable.my_shape);
						//btn.setBackgroundColor(Color.parseColor("#00BFFF")); 

						isClicked9=true;
					}
				}











				//10







				if(position==10&&isClicked10==true)
				{

					


					// btn_shoe.setBackgroundResource(R.drawable.red);
					btn.setBackgroundResource(R.drawable.clicked_red); 
					isClicked10=false;

					System.out.println("a1 is true===========");

				}
				else
				{
					System.out.println("a1 is false===========");
					if(position==10)
					{
						//btn.setBackgroundColor(Color.parseColor("#00BFFF")); 
						btn.setBackgroundResource(R.drawable.my_shape);

						isClicked10=true;
					}
				}








				//11




				if(position==11&&isClicked11==true)
				{

					


					// btn_shoe.setBackgroundResource(R.drawable.red);
					btn.setBackgroundResource(R.drawable.clicked_red); 
					isClicked11=false;

					System.out.println("a1 is true===========");

				}
				else
				{
					System.out.println("a1 is false===========");
					if(position==11)
					{
						//btn.setBackgroundColor(Color.parseColor("#00BFFF")); 
						
						btn.setBackgroundResource(R.drawable.my_shape);

						isClicked11=true;
					}
				}








			}
		});









		btn.setText(mThumbIds[position]);
		return btn;
	}

	// references to our images
	private String[] mThumbIds = { "Sit", "Stand", "Walk",
			"Run!", "Heavy lifting!", "Climb Ladders!",
			"Indoor!","Outdoor!","Hard surfaces","Uneven terrain","Long Shifts","Aditional Activities"  };
}
