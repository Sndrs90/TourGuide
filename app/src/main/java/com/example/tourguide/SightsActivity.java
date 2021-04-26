package com.example.tourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class SightsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.element_list);

        // Create a list of elements
        final ArrayList<Element> elements = new ArrayList<Element>();
        elements.add(new Element(R.drawable.nab_sputnik_11, "Embankment of Sputnik",7,"Place to walk"));
        elements.add(new Element(R.drawable.pioneers_palace_12, "Pioneers palace",5,"Place with beautiful view"));
        elements.add(new Element(R.drawable.train_13, "Train",3,"Monument"));
        elements.add(new Element(R.drawable.planetary_14, "Planetarium",2,"Education"));
        elements.add(new Element(R.drawable.fountain_15, "Fountain",0,"Culture sight"));

        //Create an adapter and make link with ListView to show ArrayList words on screen
        ElementAdapter adapter = new ElementAdapter(this, elements,R.color.category_sights);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}