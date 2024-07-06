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
import android.widget.EditText;
import android.util.Log;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

public class register extends AppCompatActivity {
    EditText orgName, email, phone, address, password, confirmPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        // EditText initialization
        orgName = findViewById(R.id.orgname);
        email = findViewById(R.id.mail);
        phone = findViewById(R.id.phone);
        address = findViewById(R.id.address);
        password = findViewById(R.id.password);
        confirmPassword = findViewById(R.id.editTextTextPassword2);

        // Button initialization and click listeners
        Button backButton = findViewById(R.id.button6);
        backButton.setOnClickListener(v -> finish()); // Handle back button click

        Button enterButton = findViewById(R.id.button6);
        enterButton.setOnClickListener(v -> {
            Intent intent = new Intent(register.this, splash_screen.class);
            startActivity(intent);
        });

        Button registerButton = findViewById(R.id.button5);
        registerButton.setOnClickListener(v -> {
            if (validateInputs()) {
                registerUser();
            }
        });
    }

    // Validation method for form inputs
    private boolean validateInputs() {
        String orgNameText = orgName.getText().toString().trim();
        String emailText = email.getText().toString().trim();
        String phoneText = phone.getText().toString().trim();
        String addressText = address.getText().toString().trim();
        String passwordText = password.getText().toString().trim();
        String confirmPassText = confirmPassword.getText().toString().trim();

        // Check if any field is empty
        if (orgNameText.isEmpty() || emailText.isEmpty() || phoneText.isEmpty() ||
                addressText.isEmpty() || passwordText.isEmpty() || confirmPassText.isEmpty()) {
            // Display an error or toast to prompt the user to fill all fields
            return false; // Return false if any field is empty
        }

        // Check for a valid email format
        if (!android.util.Patterns.EMAIL_ADDRESS.matcher(emailText).matches()) {
            // Display an error for an invalid email format
            email.setError("Enter a valid email address");
            return false; // Return false if the email format is invalid
        }

        // Check if the password and confirmed password match
        if (!passwordText.equals(confirmPassText)) {
            // Display an error for password mismatch
            confirmPassword.setError("Passwords do not match");
            return false; // Return false if passwords don't match
        }




        // If all validations pass, return true
        return true;
    }

    // Method for registering the user
    private void registerUser() {
        if (validateInputs()) {
            String orgNameText = orgName.getText().toString().trim();

            if (!orgNameText.isEmpty()) {
                Intent intent = new Intent(register.this, registered.class);
                intent.putExtra("USERNAME", orgNameText);

                startActivity(intent);
            } else {
                // Log an error if the orgName is empty
                Log.e("RegisterActivity", "Username is empty");
            }
        } else {
            // Log an error if validation fails
            Log.e("RegisterActivity", "Validation failed");
            Toast.makeText(register.this, "Please fill all fields correctly", Toast.LENGTH_SHORT).show();
        }
        // Add the registration process logic here
    }
}
