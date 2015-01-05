package com.sanjogpractise.dropdown;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.PopupWindow;

public class Popupwindow extends ActionBarActivity implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_popupwindow);
		 final Button btnOpenPopup = (Button)findViewById(R.id.button);
	        btnOpenPopup.setOnClickListener(new View.OnClickListener(){

	   @Override
	   public void onClick(View arg0) {
	    LayoutInflater layoutInflater 
	     = (LayoutInflater)getBaseContext()
	      .getSystemService(LAYOUT_INFLATER_SERVICE);  
	    View popupView = layoutInflater.inflate(R.layout.popup, null);  
	             final PopupWindow popupWindow = new PopupWindow(
	               popupView, 
	               LayoutParams.WRAP_CONTENT,  
	                     LayoutParams.WRAP_CONTENT);  
	             
	           
	               
	             popupWindow.showAsDropDown(btnOpenPopup, 50, -30);
	         
	   }});
	    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
	}