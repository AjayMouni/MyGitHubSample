package com.ajaymouni.mygithubsample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends Activity {

    private static final long SCREEN_TIME_OUT = 3*1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                navigateHomeActivity();
                finish();
            }
        },SCREEN_TIME_OUT);
    }

    private void navigateHomeActivity() {
        startActivity(new Intent(this,HomeActivity.class));
    }
}
