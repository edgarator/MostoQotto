package com.balsamiq.mockups;

/**
 * @author Edgar Anzaldúa Moreno
 * Follow me @edgarator
 * Created on Tue Apr 29 21:37:36 CST 2014
 */
public class ColorPicker extends UIElement{


    public ColorPicker() {
        super();
        super.getControlAttributes().get("controlTypeID").setPropertyValue("com.balsamiq.mockups::ColorPicker");         
        super.getControlNodes().put("color", null);
    }

    public Property getColor() {
        return super.getControlNodes().get("color");
    }

    public void setColor(String color) {
        this.setPropertyNode("color", color);
    }

    @Override
    public String toString() {
        return super.toString() + "\nColorPicker{" + "color=" + super.getControlNodes().get("color") + "}";
    }
}