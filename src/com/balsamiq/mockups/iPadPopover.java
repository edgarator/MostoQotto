package com.balsamiq.mockups;

/**
 * @author Edgar Anzaldúa Moreno
 * Follow me @edgarator
 * Created on Tue Apr 29 21:37:36 CST 2014
 */
public class iPadPopover extends UIElement{


    public iPadPopover() {
        super();
        super.getControlAttributes().get("controlTypeID").setPropertyValue("com.balsamiq.mockups::iPadPopover");         
        super.getControlNodes().put("color", null);
        super.getControlNodes().put("popoverArrowPosition", null);
        super.getControlNodes().put("popoverArrowSide", null);
    }

    public Property getColor() {
        return super.getControlNodes().get("color");
    }

    public void setColor(String color) {
        this.setPropertyNode("color", color);
    }

    public Property getPopoverArrowPosition() {
        return super.getControlNodes().get("popoverArrowPosition");
    }

    public void setPopoverArrowPosition(String popoverArrowPosition) {
        this.setPropertyNode("popoverArrowPosition", popoverArrowPosition);
    }

    public Property getPopoverArrowSide() {
        return super.getControlNodes().get("popoverArrowSide");
    }

    public void setPopoverArrowSide(String popoverArrowSide) {
        this.setPropertyNode("popoverArrowSide", popoverArrowSide);
    }

    @Override
    public String toString() {
        return super.toString() + "\niPadPopover{" + "color=" + super.getControlNodes().get("color") + ", " + "popoverArrowPosition=" + super.getControlNodes().get("popoverArrowPosition") + ", " + "popoverArrowSide=" + super.getControlNodes().get("popoverArrowSide") + "}";
    }
}