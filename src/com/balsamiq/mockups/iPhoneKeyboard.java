package com.balsamiq.mockups;

/**
 * @author Edgar Anzaldúa Moreno
 * Follow me @edgarator
 * Created on Tue Apr 29 21:37:36 CST 2014
 */
public class iPhoneKeyboard extends UIElement{


    public iPhoneKeyboard() {
        super();
        super.getControlAttributes().get("controlTypeID").setPropertyValue("com.balsamiq.mockups::iPhoneKeyboard");         
        super.getControlNodes().put("device", null);
        super.getControlNodes().put("orientation", null);
    }

    public Property getDevice() {
        return super.getControlNodes().get("device");
    }

    public void setDevice(String device) {
        this.setPropertyNode("device", device);
    }

    public Property getOrientation() {
        return super.getControlNodes().get("orientation");
    }

    public void setOrientation(String orientation) {
        this.setPropertyNode("orientation", orientation);
    }

    @Override
    public String toString() {
        return super.toString() + "\niPhoneKeyboard{" + "device=" + super.getControlNodes().get("device") + ", " + "orientation=" + super.getControlNodes().get("orientation") + "}";
    }
}