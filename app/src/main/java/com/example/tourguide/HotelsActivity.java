package com.example.tourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.element_list);

        // Create a list of elements
        final ArrayList<Element> elements = new ArrayList<Element>();
        elements.add(new Element(R.drawable.azimut_31, "AZIMUT Hotel Penza",10,"av. Stroiteley, 39v"));
        elements.add(new Element(R.drawable.heliopark_32, "Heliopark Residence",0,"st. Gorkogo, 22"));
        elements.add(new Element(R.drawable.life_hotel_33, "LIFE Hotel",1,"st. Volodarskogo, 23/12"));
        elements.add(new Element(R.drawable.prizma_34, "Hotel Prizma",4,"st. Izmaylova, 79"));
        elements.add(new Element(R.drawable.voyage_35, "Voyage Hotel",1,"st. Kirova, 19/21"));

        //Create an adapter and make link with ListView to show ArrayList words on screen
        ElementAdapter adapter = new ElementAdapter(this, elements, R.color.category_hotels);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}