package com.example.broadcastreceiverproject;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MyBroadcastReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		if (intent.getAction() == MainActivity.ACTION_BROADCAST) {
			Bundle extras = intent.getExtras();
			if (extras != null) {
				String text = extras.getString("toastText");
				Toast.makeText(context, text, Toast.LENGTH_LONG).show();
			}
		}
	}

}
