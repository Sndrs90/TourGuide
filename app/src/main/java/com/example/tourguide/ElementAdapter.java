package com.example.tourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;

/**
 * ElementAdapter is an ArrayAdapter that can provide the layout for each list
 * based on a data source, which is a list of Element objects.
 * */
public class ElementAdapter extends ArrayAdapter<Element> {
    /**Resource ID for the background color for this list of elements*/
    private int mColorResourceId;

    /**
     * Custom constructor.
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context        The current context. Used to inflate the layout file.
     * @param elements A List of Element objects to display in a list
     * @param colorResourceId Resource ID for the background color of category
     */
    public ElementAdapter(Activity context, ArrayList<Element> elements, int colorResourceId) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for an ImageView and three TextViews, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, elements);
        mColorResourceId = colorResourceId;
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the Element object located at this position in the list
        Element currentElement = getItem(position);

        // Find the ImageView in the list_item.xml layout with the ID image
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Find out if Element object has image resource
        if (currentElement.hasImage()) {
            // Set the ImageView to the image resource specified in the current element
            imageView.setImageResource(currentElement.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);

        } else {
            // Otherwise hide the ImageView
            imageView.setVisibility(View.GONE);
        }

        // Find the first TextView in the list_item.xml layout with the ID
        TextView firstTextView = (TextView) listItemView.findViewById(R.id.first_text_view);
        // Get the name from the current Element object and
        // set this text on the TextView
        firstTextView.setText(currentElement.getName());

        // Find the second TextView in the list_item.xml layout with the ID
        TextView secondTextView = (TextView) listItemView.findViewById(R.id.second_text_view);
        // if the Element is event then second text will be date. Otherwise it will be distance
        if(currentElement.hasDate()) {
            secondTextView.setText(currentElement.getDate());
        } else {
            secondTextView.setText(currentElement.getDistance() + "km from city center");
        }

        // Find the third TextView in the list_item.xml layout with the ID
        TextView thirdTextView = (TextView) listItemView.findViewById(R.id.third_text_view);
        // Get the description or the address from the current Element object and
        // set this text on the TextView
        thirdTextView.setText(currentElement.getDescription());

        //Set the theme color for the list item
        View elementContainer = listItemView.findViewById(R.id.element_container);
        //Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        //Set the background color of the text container View
        elementContainer.setBackgroundColor(color);

        // Return the whole list item layout
        // so that it can be shown in the ListView
        return listItemView;
    }
}
