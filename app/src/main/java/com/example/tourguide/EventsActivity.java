package com.example.tourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class EventsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.element_list);

        // Create a list of elements
        final ArrayList<Element> elements = new ArrayList<Element>();
        elements.add(new Element(R.drawable.jazz_may_21, "Jazz May","May 21 - 23","Music festival"));
        elements.add(new Element(R.drawable.balet_22, "Ballet in the Drama Theater","June 2","Classic dance performance"));
        elements.add(new Element(R.drawable.zaseka_23, "Carnival on the Zaseka slope","April 4","Traditional close of snowboarding season"));
        elements.add(new Element(R.drawable.darts_24, "Russian darts championship","April 16 - 18","The largest competitions in the country "));
        elements.add(new Element(R.drawable.lastochka_25, "Bike contest on the Lastochka slope","August 28","MTB competition in downhill"));

        //Create an adapter and make link with ListView to show ArrayList words on screen
        ElementAdapter adapter = new ElementAdapter(this, elements,R.color.category_events);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}