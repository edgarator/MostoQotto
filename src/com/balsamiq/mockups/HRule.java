package com.balsamiq.mockups;

/**
 * @author Edgar Anzaldúa Moreno
 * Follow me @edgarator
 * Created on Tue Apr 29 21:37:36 CST 2014
 */
public class HRule extends UIElement{


    public HRule() {
        super();
        super.getControlAttributes().get("controlTypeID").setPropertyValue("com.balsamiq.mockups::HRule");         
        super.getControlNodes().put("backgroundAlpha", null);
        super.getControlNodes().put("color", null);
        super.getControlNodes().put("stroke", null);
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

    public Property getStroke() {
        return super.getControlNodes().get("stroke");
    }

    public void setStroke(String stroke) {
        this.setPropertyNode("stroke", stroke);
    }

    @Override
    public String toString() {
        return super.toString() + "\nHRule{" + "backgroundAlpha=" + super.getControlNodes().get("backgroundAlpha") + ", " + "color=" + super.getControlNodes().get("color") + ", " + "stroke=" + super.getControlNodes().get("stroke") + "}";
    }
}