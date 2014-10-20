package com.example.touchstudy01;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class TouchStudy01Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_touch_study01);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.touch_study01, menu);
		return true;
	}

}
