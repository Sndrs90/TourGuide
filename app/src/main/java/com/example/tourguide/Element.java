package com.example.tourguide;

/**
 * A class that stores information about 1 item (element) from a category (Sights, Events etc)
 */
public class Element {
    /** Image resource ID of the element*/
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    /** name of the element*/
    private String mName;
    /** distance to city center in km*/
    private int mDistance;
    /** information about element or its address*/
    private String mDescription;
    /** date of the event*/
    private String mDate;

    private static final int NO_IMAGE_PROVIDED = -1;

    /** Constructor for sights, accommodation and food*/
    public Element(int imageResourceId, String name, int distance, String description) {
        mImageResourceId = imageResourceId;
        mName = name;
        mDistance = distance;
        mDescription = description;
    }

    /** Constructor for events*/
    public Element(int imageResourceId, String name, String date, String description) {
        mImageResourceId = imageResourceId;
        mName = name;
        mDate = date;
        mDescription = description;
    }

    /** Get image resource id of the element*/
    public int getImageResourceId() {
        return mImageResourceId;
    }
    /** Get element's name*/
    public String getName() {
        return mName;
    }
    /** Get distance value*/
    public int getDistance() {
        return mDistance;
    }
    /** Get description or address of the element*/
    public String getDescription() {
        return mDescription;
    }
    /** Get date if the element is an event*/
    public String getDate() {
        return mDate;
    }

    /**
     * Returns whether or not there is an image for this element.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Returns whether or not there is a date for this element.
     */
    public boolean hasDate() {
        return mDate != null;
    }

    /**
     * toString method for log purposes
     */
    @Override
    public String toString() {
        return "Element{" +
                "mImageResourceId=" + mImageResourceId +
                ", mName='" + mName + '\'' +
                ", mDistance=" + mDistance +
                ", mDescription='" + mDescription + '\'' +
                ", mDate='" + mDate + '\'' +
                '}';
    }
}
