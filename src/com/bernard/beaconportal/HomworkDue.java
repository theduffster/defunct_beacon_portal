package com.bernard.beaconportal;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class HomworkDue extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_homwork_due);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.homwork_due, menu);
		return true;
	}

}
