package com.example.fragmenttestone;

import java.util.zip.Inflater;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class LM_Fragment extends Fragment {
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle saveInstanceState)
	{
		return inflater.inflate(R.layout.lm_fragment,container,false);
	}

}
