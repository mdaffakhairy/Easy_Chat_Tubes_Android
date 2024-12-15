package com.daffakhairy.easychat;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Delay execution using Handler tied to the main looper
        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            // Start LoginPhoneNumberActivity after 3 seconds
            startActivity(new Intent(SplashActivity.this, LoginPhoneNumberActivity.class));
            finish(); // End SplashActivity
        }, 3000); // delayMillis: 3000
    }
}
