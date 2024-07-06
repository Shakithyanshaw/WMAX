package com.example.madapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.content.Intent;
import android.view.View;

public class raw_materials extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.raw_materials);







        ImageView closeImage = findViewById(R.id.imageButton2);
        closeImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Perform action when image is clicked
                startActivity(new Intent(raw_materials.this, inventory.class));
            }
        });

        ImageView doneImage = findViewById(R.id.imageButton3);
        doneImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Perform action when image is clicked
                startActivity(new Intent(raw_materials.this, inventory.class));
            }
        });

        ImageView notiImage = findViewById(R.id.imageView18);
        notiImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Perform action when image is clicked
                startActivity(new Intent(raw_materials.this, notification.class));
            }
        });

    }
}