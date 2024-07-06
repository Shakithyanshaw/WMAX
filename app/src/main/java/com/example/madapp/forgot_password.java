package com.example.madapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.text.TextUtils;

public class forgot_password extends AppCompatActivity {
    EditText emailEditText;
    Button backButton, resetButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgotpassword);

        emailEditText = findViewById(R.id.email_edittext);
        backButton = findViewById(R.id.button1);
        resetButton = findViewById(R.id.reset_button);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the behavior when the back button is clicked
                Intent intent = new Intent(forgot_password.this, login.class); // Replace LoginActivity.class with the desired class to go back to
                startActivity(intent);
            }
        });

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailEditText.getText().toString().trim();

                // Perform the reset password logic here

                if (!TextUtils.isEmpty(email) && android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                    // TODO: Implement password reset logic here
                    performPasswordReset(email);
                } else {
                    Toast.makeText(forgot_password.this, "Please enter a valid email", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private boolean isValidEmail(CharSequence target) {
        return !TextUtils.isEmpty(target) && android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
    }

        private void performPasswordReset(String email) {
            // TODO: Implement your password reset logic here


            // Provide feedback to the user that a password reset request has been initiated
            String resetMessage = "Password reset initiated for " + email + ". Please check your email for further instructions.";

            Toast.makeText(forgot_password.this, "Password reset request sent to the provided email", Toast.LENGTH_SHORT).show();
    }
}
