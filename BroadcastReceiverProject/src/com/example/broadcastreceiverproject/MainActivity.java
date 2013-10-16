package com.example.broadcastreceiverproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends Activity {

	public static final String ACTION_BROADCAST = "de.catfin.intent.action.BROADCAST";

	// BroadcastReceiver mReceiver = new BroadcastReceiver() {
	//
	// @Override
	// public void onReceive(Context context, Intent intent) {
	// if (intent.getAction() == ACTION_BROADCAST) {
	// Toast.makeText(MainActivity.this, "und alle so yaaay",
	// Toast.LENGTH_LONG).show();
	// }
	// }
	// };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// getApplicationContext().registerReceiver(mReceiver,
		// new IntentFilter(ACTION_BROADCAST));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	protected void onDestroy() {
		// unregisterReceiver(mReceiver);
		super.onDestroy();
	}

}
