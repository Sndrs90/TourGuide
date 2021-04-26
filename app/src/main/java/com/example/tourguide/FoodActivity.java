package com.example.tourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.element_list);

        // Create a list of elements
        final ArrayList<Element> elements = new ArrayList<Element>();
        elements.add(new Element(R.drawable.shaurma_41, "Shawarma near PSU",3,"st. Krasnaya, 49b"));
        elements.add(new Element(R.drawable.mcdonalds_42, "McDonalds",0,"st. Moskovskaya, 73"));
        elements.add(new Element(R.drawable.kfc_43, "KFC",0,"st. Moskovskaya, 78"));
        elements.add(new Element(R.drawable.elmira_44, "Elmira cafe",1,"st. Oktyabrskaya, 4"));
        elements.add(new Element(R.drawable.corner_45, "Ugolok",1,"st. Suvorova, 20a"));

        //Create an adapter and make link with ListView to show ArrayList words on screen
        ElementAdapter adapter = new ElementAdapter(this, elements, R.color.category_food);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}