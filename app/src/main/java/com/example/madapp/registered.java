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

public class registered extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registered);


        // Find the ImageView
        ImageView imageView = findViewById(R.id.imageView2);
        TextView textView5 = findViewById(R.id.textView5);
        Button button2 = findViewById(R.id.registered);
        TextView welcomeTextView = findViewById(R.id.welcomeTextView);

        // Load the animation from the XML resource
        Animation top = AnimationUtils.loadAnimation(this, R.anim.top);
        Animation bottom = AnimationUtils.loadAnimation(this, R.anim.bottom);
        Animation in = AnimationUtils.loadAnimation(this, R.anim.in);

        // Apply the animation to the ImageView
        imageView.startAnimation(top);
        textView5.startAnimation(bottom);
        button2.startAnimation(bottom);
        welcomeTextView.startAnimation(in);

        Button RegisteredButton = findViewById(R.id.registered);

        RegisteredButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle the login logic here (e.g., check username and password).
                // If login is successful, navigate to the "NextActivity."
                // For now, let's navigate unconditionally.

                Intent intent = new Intent(registered.this, login.class);
                startActivity(intent);
            }
        });
// Retrieve the username from the intent
        Intent intent = getIntent();
        if (intent != null) {
            String username = intent.getStringExtra("USERNAME");

            if (username != null) {
                TextView greetingTextView = findViewById(R.id.welcomeTextView);
                greetingTextView.setText("Hello, " + username);
            }
        }
    }

}