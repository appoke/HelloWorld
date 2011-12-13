package com.appoke.hello.world;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.appoke.sdk.AppokeAgent;
import com.appoke.sdk.R;

public class HelloWorldActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppokeAgent.onCreate(this);
        setContentView(R.layout.main);
        
		((Button)findViewById(R.id.facebook)).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				AppokeAgent.showLikeFBNotification(HelloWorldActivity.this);
			}
		});

		((Button)findViewById(R.id.twitter)).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				AppokeAgent.showFollowTwitterNotification(HelloWorldActivity.this);
				
			}
		});

		((Button)findViewById(R.id.rate)).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				AppokeAgent.showRatingNotification(HelloWorldActivity.this);
			}
		});
		((Button)findViewById(R.id.share)).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				AppokeAgent.showSharingNotification(HelloWorldActivity.this);
			}
		});
    }
    
}