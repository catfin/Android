package com.example.broadcastsenderproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SendBroadcastMainAct extends Activity {

	private static final String ACTION_BROADCAST = "de.catfin.intent.action.BROADCAST";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button sendBroadtcast = (Button) findViewById(R.id.sendBroadcast);
		sendBroadtcast.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent broadcastSend = new Intent(ACTION_BROADCAST);
				broadcastSend.putExtra("toastText", ".. und alle so yaaay");
				getApplicationContext().sendBroadcast(broadcastSend);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
