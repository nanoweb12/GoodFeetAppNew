package com.example.goodfeetapp.fragment;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.goodfeetapp.R;
import com.example.goodfeetapp.database.DatabaseHandler;
import com.example.goodfeetapp.model.Customer_model;

public class Loginfrag extends Fragment {
	protected static final String MODE_PRIVATE = null;

	public static String TAG = "Login";

	EditText edt1, edt2;
	Context context;
	SQLiteDatabase db = null;
	DatabaseHandler databasehandler;

	Button btnlogin;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		final View view = inflater.inflate(R.layout.login, container, false);
		btnlogin = (Button) view.findViewById(R.id.btn_getstartl);
		btnlogin.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				//databasehandler = new DatabaseHandler(getActivity());

				edt1 = (EditText) view.findViewById(R.id.edt_namel);

				edt2 = (EditText) view.findViewById(R.id.edt_emaill);

				/*if (edt1.getText().toString() == null
						|| edt1.getText().toString() == "") {
					Toast.makeText(getActivity(), "Please enter name ",
							Toast.LENGTH_SHORT).show();

				} else if (edt2.getText().toString() == null
						|| edt2.getText().toString() == "") {
					Toast.makeText(getActivity(), "Please enter email ",
							Toast.LENGTH_SHORT).show();

				} else if (edt1.getText().toString() == null
						|| edt1.getText().toString() == ""
						&& edt2.getText().toString() == null
						|| edt2.getText().toString() == "") {
					Toast.makeText(getActivity(),
							"Please enter name and emailid", Toast.LENGTH_SHORT)
							.show();
				} else {
					boolean emailcheck = isEmailValid(edt2.getText().toString());
					if (emailcheck == true) {
						boolean check = true;
						List<Customer_model> contacts = databasehandler
								.getAllContacts();

						for (Customer_model cn : contacts) {
							String log = cn.getemail();
							// Writing Contacts to log
							Log.d("Name of email id stored are: ", log);
							if (contacts.size() > 0) {
								if (log.equalsIgnoreCase(edt2.getText()
										.toString())) {

									Toast.makeText(getActivity(),
											"Email id Already Registered",
											Toast.LENGTH_SHORT).show();
									check = false;
									break;

								}
							}

						}
						if (check == true) {
							databasehandler.addContact(new Customer_model(edt1
									.getText().toString(), edt2.getText()
									.toString()));
							FragmentTransaction ft = getFragmentManager()
									.beginTransaction();
							Bring bring = new Bring();
							// Replace the container with the new fragment
							ft.replace(R.id.your_placeholder, bring,
									Fragment1.TAG);
							ft.addToBackStack(null);
							// or ft.add(R.id.your_placeholder, new
							// FooFragment());
							// Execute the changes specified
							ft.commit();
						}
					} else {

						Toast.makeText(getActivity(),
								"Please enter valid email id",
								Toast.LENGTH_SHORT).show();
					}
				}*/
				// db.isOpen();

				// db.openOrCreateDatabase("sudoku.db", null);
				// db.openDatabase("login.db", Context.MODE_PRIVATE, null);

				// db.openDatabase("login.db", null, Context.MODE_PRIVATE);

				// String name,email;

				// name=edt1.getText().toString();
				// email=edt2.getText().toString();
				//

				// if(name==null||name==""||name.length()<10)
				// {
				// Toast.makeText(getActivity(),"please enter correct name",Toast.LENGTH_LONG).show();
				// }

				// else if(email==null||email==""||email.length()<10)
				// {
				// Toast.makeText(getActivity(),"please enter correct email",Toast.LENGTH_LONG).show();
				// }

				// else
				// {
				// Cursor
				// c=db.rawQuery("select * from login where uname='"+name+"' and email='"+email+"'",null);
				// c.moveToFirst();
				// if(c.getCount()>0)
				// {

				// db.close();

				// }

				// Cursor cursor=databasehandler.getRow("pass");
				// Cursor cursor =databaseadapter.getRow2("name", "pass");

				// if (cursor != null && cursor.getCount() != 0) {

				// try{
				// cursor.moveToFirst();
				// }catch (Exception e)

				// {
				// Log.e("Failed", "Couldn't moveToFirst"); //I get a successful
				// moveToFirst
				// }

				// try{

				// do{

				// Getting value from Registration activity

				// String
				// store=cursor.getString(cursor.getColumnIndex(databasehandler.CUSTOMER_NAME));

				// String
				// store2=cursor.getString(cursor.getColumnIndex(databasehandler.CUSTOMER_EMAIL));

				// Toast.makeText(getActivity(),"This the response store2 :"+store2,Toast.LENGTH_LONG
				// ).show();

				// if(name.equals(store)&&email.equals(store2))
				// {
				// Toast.makeText(getActivity(), "Congrats: Login Successfully",
				// Toast.LENGTH_LONG).show();

				// }

				// else if(email.equals("")&&name.equals("")){
				// Toast.makeText(getActivity(),
				// "Please Enter Your name and email",
				// Toast.LENGTH_LONG).show();
				// }

				// }while(cursor.moveToNext());

				// }catch (Exception e)

				// {
				// e.printStackTrace();

				// }
				// finally{
				// cursor.close();

				// }
				// }

				// }
				FragmentTransaction ft = getFragmentManager()
						.beginTransaction();
				Bring bring = new Bring();
				// Replace the container with the new fragment
				ft.replace(R.id.your_placeholder, bring,
						Fragment1.TAG);
				ft.addToBackStack(null);
				// or ft.add(R.id.your_placeholder, new
				// FooFragment());
				// Execute the changes specified
				ft.commit();
			}
		});
		System.out.println("in fragment login");

		return view;
	}

	public static boolean isEmailValid(String email) {
		boolean isValid = false;

		String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
		CharSequence inputStr = email;

		Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(inputStr);
		if (matcher.matches()) {
			isValid = true;
		} else {
			isValid = false;
		}
		return isValid;
	}

	public static Fragment newInstance(int index) {
		Fragment1 f = new Fragment1();
		Bundle args = new Bundle();
		args.putInt("index", index);
		f.setArguments(args);
		return f;
	}
}