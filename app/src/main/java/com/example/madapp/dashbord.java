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

public class dashbord extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashbord);





        ImageView rectangle1Image = findViewById(R.id.inventory);
        rectangle1Image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Perform action when image is clicked
                startActivity(new Intent(dashbord.this, inventory.class));
            }
        });

        ImageView rectangle2Image = findViewById(R.id.supplier);
        rectangle2Image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Perform action when image is clicked
                startActivity(new Intent(dashbord.this, supplier.class));
            }
        });

        ImageView homeImage = findViewById(R.id.b);
        homeImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Perform action when image is clicked
                startActivity(new Intent(dashbord.this, dashbord.class));
            }
        });

        ImageView notiImage = findViewById(R.id.imageView18);
        notiImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Perform action when image is clicked
                startActivity(new Intent(dashbord.this, notification.class));
            }
        });

    }
}