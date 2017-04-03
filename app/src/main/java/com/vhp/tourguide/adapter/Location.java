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
    /** action items */
    private int actionFlow;


    /**
     * creates a new Location object
     * @param title title of the attraction
     * @param information information about the attraction
     * @param imageResourceId is the image resource
     * @param actionFlow decides the action items
     */
    public Location(String title, String information, int imageResourceId , int actionFlow) {
        this.title = title;
        this.information = information;
        this.imageResourceId = imageResourceId;
        this.actionFlow = actionFlow;
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
     * get the image for that location
     */
    public int getImageResourceId() {
        return imageResourceId;
    }

    /**
     * gets the action flow of the location
     */
    public int getActionFlow() {
        return actionFlow;
    }
}
