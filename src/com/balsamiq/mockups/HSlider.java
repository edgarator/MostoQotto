package com.balsamiq.mockups;

/**
 * @author Edgar Anzaldúa Moreno
 * Follow me @edgarator
 * Created on Tue Apr 29 21:37:36 CST 2014
 */
public class HSlider extends UIElement{


    public HSlider() {
        super();
        super.getControlAttributes().get("controlTypeID").setPropertyValue("com.balsamiq.mockups::HSlider");         
        super.getControlNodes().put("state", null);
        super.getControlNodes().put("value", null);
    }

    public Property getState() {
        return super.getControlNodes().get("state");
    }

    public void setState(String state) {
        this.setPropertyNode("state", state);
    }

    public Property getValue() {
        return super.getControlNodes().get("value");
    }

    public void setValue(String value) {
        this.setPropertyNode("value", value);
    }

    @Override
    public String toString() {
        return super.toString() + "\nHSlider{" + "state=" + super.getControlNodes().get("state") + ", " + "value=" + super.getControlNodes().get("value") + "}";
    }
}