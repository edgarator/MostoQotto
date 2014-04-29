package com.balsamiq.mockups;

/**
 * @author Edgar Anzaldúa Moreno
 * Follow me @edgarator
 * Created on Tue Apr 29 21:37:36 CST 2014
 */
public class ScratchOut extends UIElement{


    public ScratchOut() {
        super();
        super.getControlAttributes().get("controlTypeID").setPropertyValue("com.balsamiq.mockups::ScratchOut");         
        super.getControlNodes().put("backgroundAlpha", null);
        super.getControlNodes().put("color", null);
    }

    public Property getBackgroundAlpha() {
        return super.getControlNodes().get("backgroundAlpha");
    }

    public void setBackgroundAlpha(String backgroundAlpha) {
        this.setPropertyNode("backgroundAlpha", backgroundAlpha);
    }

    public Property getColor() {
        return super.getControlNodes().get("color");
    }

    public void setColor(String color) {
        this.setPropertyNode("color", color);
    }

    @Override
    public String toString() {
        return super.toString() + "\nScratchOut{" + "backgroundAlpha=" + super.getControlNodes().get("backgroundAlpha") + ", " + "color=" + super.getControlNodes().get("color") + "}";
    }
}