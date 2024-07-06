package com.example.madapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.content.Intent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class notification extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification);

// Get a reference to the ListView
        ListView listView = findViewById(R.id.notification);

        // Create an array of notification strings
        String[] notifications = {
                "Alert: Inventory for 'Product X' is running low. Current stock: 10 units. Reorder suggested to maintain optimal levels.",
                "-----------------------------------------------------",
                "Inventory Analysis: 'Product F' demand has increased by 30% in the last month. Consider adjusting stock levels accordingly.",
                "-----------------------------------------------------",
                "Reminder: Invoice #7890 from Supplier C is due in 3 days. Please process payment.",
                "-----------------------------------------------------",
                "Quality issue detected for 'Product Z.' Please review and take necessary action.",
                "-----------------------------------------------------",
                "Order #123456: Shipped. Expected delivery date: 15th November 2023."};

        // Create an ArrayAdapter and set it to the ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, notifications);
        listView.setAdapter(adapter);





        ImageView closeImage = findViewById(R.id.imageButton2);
        closeImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Perform action when image is clicked
                startActivity(new Intent(notification.this, dashbord.class));
            }
        });

        ImageView notiImage = findViewById(R.id.imageView18);
        notiImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Perform action when image is clicked
                startActivity(new Intent(notification.this, notification.class));
            }
        });



    }
}