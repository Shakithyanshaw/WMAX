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
import android.util.Patterns;


import androidx.appcompat.app.AppCompatActivity;

public class add_inventory extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_inventory);







        ImageView closeImage = findViewById(R.id.imageButton2);
        closeImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Perform action when image is clicked
                startActivity(new Intent(add_inventory.this, inventory.class));
            }
        });

        ImageView doneImage = findViewById(R.id.imageButton3);
        doneImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Perform action when image is clicked
                startActivity(new Intent(add_inventory.this, inventory.class));
            }
        });

        ImageView notiImage = findViewById(R.id.imageView18);
        notiImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Perform action when image is clicked
                startActivity(new Intent(add_inventory.this, notification.class));
            }
        });

    }
}