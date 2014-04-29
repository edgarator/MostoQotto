package com.balsamiq.mockups;

/**
 * @author Edgar Anzaldúa Moreno
 * Follow me @edgarator
 * Created on Tue Apr 29 21:37:36 CST 2014
 */
public class RedX extends UIElement{


    public RedX() {
        super();
        super.getControlAttributes().get("controlTypeID").setPropertyValue("com.balsamiq.mockups::RedX");         
    }

    @Override
    public String toString() {
        return super.toString() + "\nRedX{" + "}";
    }
}