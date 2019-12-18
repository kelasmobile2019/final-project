package android.example.projectuas;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
private static int SPLASH_TIME_OUT = 4000;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.splash_screen);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                 Intent homeintent = new Intent(SplashActivity.this, MainActivity.class);
                 startActivity(homeintent);
                 finish();
                }
            },SPLASH_TIME_OUT);

    }
}
