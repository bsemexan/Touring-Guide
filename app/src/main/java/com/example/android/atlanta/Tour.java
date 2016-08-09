package com.example.android.atlanta;

/**
 * Created by beryy on 8/7/16.
 *
 */
public class Tour {

    //title for tour location
    private String mTitle;

    //description for tour location
    private String mDescription;

    //image for the tour location
    private int mImageId = NO_IMAGE_PROVIDED;

    //constant value represents no image was provided
    private static final int NO_IMAGE_PROVIDED = -1;


    /**
     * create a new Tour project
     *
     * @param title is the name of the location
     * @param description is the description of the location
     */
    public Tour(String title, String description) {
        mTitle = title;
        mDescription = description;
    }

    /**
     * create a new Tour project
     *
     * @param title is the name of the location
     * @param description is the description ofhte location
     * @param imageId is the drawable ID for the image
     */
    public Tour(String title, String description, int imageId) {
    mTitle = title;
    mDescription = description;
    mImageId = imageId;
    }
    //get the title of the location
    public String getTitle(){
        return mTitle;
    }

    //get the description of the location
    public String getDescription(){
        return mDescription;
    }

    //return the image ID
    public int getImageId() {
        return mImageId;
    }

    //return whether or not there is an image
    public boolean hasImage(){
        return mImageId != NO_IMAGE_PROVIDED;
    }

}