package com.balsamiq.mockups;

/**
 * @author Edgar Anzaldúa Moreno
 * Follow me @edgarator
 * Created on Tue Apr 29 21:37:36 CST 2014
 */
public class ColumnChart extends UIElement{


    public ColumnChart() {
        super();
        super.getControlAttributes().get("controlTypeID").setPropertyValue("com.balsamiq.mockups::ColumnChart");         
    }

    @Override
    public String toString() {
        return super.toString() + "\nColumnChart{" + "}";
    }
}