package com.vhp.tourguide.adapter;

/**
 * Created by root on 29/3/17.
 */

public class Location {

    /** Title of the location */
    private String title;
    /** Information about attraction */
    private String information;
    /** location images */
    private int imageResourceId;


    /**
     * creates a new Location object
     * @param title title of the attraction
     * @param information information about the attraction
     * @param imageResourceId is the image resource
     */
    public Location(String title, String information, int imageResourceId) {
        this.title = title;
        this.information = information;
        this.imageResourceId = imageResourceId;
    }


    /**
     * get the Relevant attraction's information
     */
    public String getInformation() {
        return information;
    }

    /**
     * get the title of attraction
     */
    public String getTitle() {
        return title;
    }

    /**
     * get the image for that word
     */
    public int getImageResourceId() {
        return imageResourceId;
    }
}
