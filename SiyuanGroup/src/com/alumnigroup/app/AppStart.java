package com.alumnigroup.app;

 

import com.alumnigroup.app.acty.Main;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.view.Menu;

public class AppStart extends BaseActivity  {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.acty_start);
		new Handler().postDelayed(new Runnable() {
			
			@Override
			public void run() {
				openActivity(Main.class);
				
			}
		}, 3000);
	}

	@Override
	protected void initData() {
		 
		
	}

	@Override
	protected void initLayout() {
		 
		
	}
 
}
