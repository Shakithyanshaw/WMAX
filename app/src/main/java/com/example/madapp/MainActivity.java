package com.example.madapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;
import android.os.Handler;


public class MainActivity extends AppCompatActivity {

    // Delay in milliseconds before the main activity is shown
    private static final int SPLASH_DELAY = 5000;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        // Find the ImageView
        ImageView imageView = findViewById(R.id.imageView);
        TextView textView2 = findViewById(R.id.textView2);
        TextView textView3 = findViewById(R.id.textView3);
        TextView textView4= findViewById(R.id.textView4);

        // Load the animation from the XML resource
        Animation top = AnimationUtils.loadAnimation(this, R.anim.top);
        Animation bottom = AnimationUtils.loadAnimation(this, R.anim.bottom);

        // Apply the animation to the ImageView
        imageView.startAnimation(top);
        textView2.startAnimation(bottom);
        textView3.startAnimation(bottom);
        textView4.startAnimation(bottom);





        new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    // Start the main activity after the delay
                    Intent intent = new Intent(MainActivity.this, splash_screen.class);
                    startActivity(intent);
                    finish();
                }
            }, SPLASH_DELAY);
    }
}