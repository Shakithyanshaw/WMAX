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
import android.widget.ImageButton;
import android.widget.LinearLayout;



import androidx.appcompat.app.AppCompatActivity;

public class supplier extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.supplier);





       ImageView homeImage = findViewById(R.id.b);
        homeImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Perform action when image is clicked
                startActivity(new Intent(supplier.this, dashbord.class));
            }
        });



        ImageView addImage = findViewById(R.id.imageButton);
        addImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Perform action when image is clicked
                startActivity(new Intent(supplier.this, add_supplier.class));
            }
        });



        Button haneefButton = findViewById(R.id.detail_btn);
        haneefButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(supplier.this, haneef_details.class);
                startActivity(intent);
            }
        });

        Button neepajaButton = findViewById(R.id.detail_btn3);
        neepajaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(supplier.this, neepaja_details.class);
                startActivity(intent);
            }
        });

        Button navinsButton = findViewById(R.id.detail_btn2);
        navinsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(supplier.this, naveens_details.class);
                startActivity(intent);
            }
        });


        ImageView closeImage = findViewById(R.id.imageView18);
        closeImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Perform action when image is clicked
                startActivity(new Intent(supplier.this, notification.class));
            }
        });






        ImageButton deleteButton = findViewById(R.id.delete_btn);
        final LinearLayout linearLayout = findViewById(R.id.linearLayout1);

        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout.removeAllViews();
            }
        });


        ImageButton delete_2Button = findViewById(R.id.delete_btn3);
        final LinearLayout linearLayout2 = findViewById(R.id.linearLayout);

        delete_2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout2.removeAllViews();
            }
        });


        ImageButton delete_3Button = findViewById(R.id.delete_btn2);
        final LinearLayout linearLayout3 = findViewById(R.id.linearLayout2);

        delete_3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout3.removeAllViews();
            }
        });

    }
}