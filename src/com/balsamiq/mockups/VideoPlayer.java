package com.balsamiq.mockups;

/**
 * @author Edgar Anzaldúa Moreno
 * Follow me @edgarator
 * Created on Tue Apr 29 21:37:36 CST 2014
 */
public class VideoPlayer extends UIElement{


    public VideoPlayer() {
        super();
        super.getControlAttributes().get("controlTypeID").setPropertyValue("com.balsamiq.mockups::VideoPlayer");         
    }

    @Override
    public String toString() {
        return super.toString() + "\nVideoPlayer{" + "}";
    }
}