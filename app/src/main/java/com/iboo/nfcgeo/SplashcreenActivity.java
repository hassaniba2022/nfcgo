package com.iboo.nfcgeo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.provider.ContactsContract;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;

public class SplashcreenActivity extends AppCompatActivity {

    private static int SPLASH_SCREEN_TIMEOUT =4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN );
        setContentView(R.layout.activity_splashcreen);
        Animation animationLogo =new AlphaAnimation(1,0);
        animationLogo.setInterpolator(new AccelerateDecelerateInterpolator());
        animationLogo.setStartOffset(500);
        animationLogo.setDuration(1800);
        ImageView image = findViewById(R.id.imageView2);
        image.setAnimation(animationLogo);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent(SplashcreenActivity.this,MainActivity.class );
                startActivity(intent);
                finish();

            }
        },SPLASH_SCREEN_TIMEOUT);
    }
}