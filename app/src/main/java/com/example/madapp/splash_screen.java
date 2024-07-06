package com.example.madapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;
import android.view.View;



import androidx.appcompat.app.AppCompatActivity;

public class splash_screen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_register);






        // Find the ImageView
        ImageView imageView = findViewById(R.id.imageView2);
        TextView textView5 = findViewById(R.id.textView5);
        Button button2 = findViewById(R.id.button2);
        Button button3= findViewById(R.id.button3);

        // Load the animation from the XML resource
        Animation top = AnimationUtils.loadAnimation(this, R.anim.top);
        Animation bottom = AnimationUtils.loadAnimation(this, R.anim.bottom);

        // Apply the animation to the ImageView
        imageView.startAnimation(top);
        textView5.startAnimation(bottom);
        button2.startAnimation(bottom);
        button3.startAnimation(bottom);


        Button loginButton = findViewById(R.id.button2);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle the login logic here (e.g., check username and password).
                // If login is successful, navigate to the "NextActivity."
                // For now, let's navigate unconditionally.

                Intent intent = new Intent(splash_screen.this, login.class);
                startActivity(intent);
            }
        });


        Button RegisterButton = findViewById(R.id.button3);

        RegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle the login logic here (e.g., check username and password).
                // If login is successful, navigate to the "NextActivity."
                // For now, let's navigate unconditionally.

                Intent intent = new Intent(splash_screen.this, register.class);
                startActivity(intent);
            }
        });


    }

}
