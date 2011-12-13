package com.appoke.hello.world;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import com.appoke.sdk.ShareActivity;

public class TestReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		Log.d("TestReceiver", "Sharing received");
		boolean twitter = intent.getBooleanExtra(ShareActivity.TWITTER_EXTRA, false);
		boolean facebook = intent.getBooleanExtra(ShareActivity.FACEBOOK_EXTRA, false);
		
		Toast.makeText(context, "Sharing received : facebook = " + String.valueOf(facebook) + ", twitter = " + String.valueOf(twitter), 
				Toast.LENGTH_LONG).show();
	}

}
