package com.balsamiq.mockups;

/**
 * @author Edgar Anzaldúa Moreno
 * Follow me @edgarator
 * Created on Tue Apr 29 21:37:36 CST 2014
 */
public class PieChart extends UIElement{


    public PieChart() {
        super();
        super.getControlAttributes().get("controlTypeID").setPropertyValue("com.balsamiq.mockups::PieChart");         
    }

    @Override
    public String toString() {
        return super.toString() + "\nPieChart{" + "}";
    }
}