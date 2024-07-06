package com.example.madapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.content.Intent;
import android.view.View;

public class finished_goods extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finished_goods);







        ImageView closeImage = findViewById(R.id.imageButton5);
        closeImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Perform action when image is clicked
                startActivity(new Intent(finished_goods.this, inventory.class));
            }
        });

        ImageView doneImage = findViewById(R.id.imageButton4);
        doneImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Perform action when image is clicked
                startActivity(new Intent(finished_goods.this, inventory.class));
            }
        });

        ImageView notiImage = findViewById(R.id.imageView18);
        notiImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Perform action when image is clicked
                startActivity(new Intent(finished_goods.this, notification.class));
            }
        });

    }
}