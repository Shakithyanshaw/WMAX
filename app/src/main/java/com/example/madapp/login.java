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
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import java.util.HashMap;


import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity {

    EditText emailEditText, passwordEditText;
    Button loginButton, backButton;

    // Map to store email-password combinations
    private HashMap<String, String> credentials;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        emailEditText = findViewById(R.id.username);
        passwordEditText = findViewById(R.id.Password);
        loginButton = findViewById(R.id.button4);
        backButton = findViewById(R.id.button1);

        // Initialize the HashMap with email-password pairs
        credentials = new HashMap<>();
        credentials.put("shaki", "123");
        credentials.put("neepaja", "1234");
        credentials.put("navinya", "12345");
        credentials.put("ahamad", "123456");


        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = emailEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                if (isValidCredentials(email, password)) {
                    Intent intent = new Intent(login.this, dashbord.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(login.this, "Invalid email or password", Toast.LENGTH_SHORT).show();
                }
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login.this, splash_screen.class);
                startActivity(intent);
            }
        });



        TextView textViewLink = findViewById(R.id.forgotpassword);
        textViewLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the activity you want to navigate to
                Intent intent = new Intent(login.this,
                        forgot_password.class);
                startActivity(intent);
            }
        });
    }

    private boolean isValidCredentials(String email, String password) {
        // Check if the email exists in the credentials map and if the entered password matches
        return credentials.containsKey(email) && credentials.get(email).equals(password);
    }
}