package com.example.tourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the view for category Sights
        RelativeLayout sights = (RelativeLayout) findViewById(R.id.sights_layout);

        // Set a click listener on that View
        sights.setOnClickListener(new View.OnClickListener() {
            // Start SightsActivity when the user clicks on category Sights
            @Override
            public void onClick(View view) {
                Intent sightsIntent = new Intent(MainActivity.this, SightsActivity.class);
                startActivity(sightsIntent);
            }
        });

        // Find the view for category Events
        RelativeLayout events = (RelativeLayout) findViewById(R.id.events_layout);

        // Set a click listener on that View
        events.setOnClickListener(new View.OnClickListener() {
            // Start EventsActivity when the user clicks on category Events
            @Override
            public void onClick(View view) {
                Intent eventsIntent = new Intent(MainActivity.this, EventsActivity.class);
                startActivity(eventsIntent);
            }
        });

        // Find the view for category Hotels
        RelativeLayout hotels = (RelativeLayout) findViewById(R.id.hotels_layout);

        // Set a click listener on that View
        hotels.setOnClickListener(new View.OnClickListener() {
            // Start HotelsActivity when the user clicks on category Hotels
            @Override
            public void onClick(View view) {
                Intent hotelsIntent = new Intent(MainActivity.this, HotelsActivity.class);
                startActivity(hotelsIntent);
            }
        });

        // Find the view for category Food
        RelativeLayout food = (RelativeLayout) findViewById(R.id.food_layout);

        // Set a click listener on that View
        food.setOnClickListener(new View.OnClickListener() {
            // Start FoodActivity when the user clicks on category Food
            @Override
            public void onClick(View view) {
                Intent foodIntent = new Intent(MainActivity.this, FoodActivity.class);
                startActivity(foodIntent);
            }
        });
    }
}