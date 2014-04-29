package com.balsamiq.mockups;

/**
 * @author Edgar Anzaldúa Moreno
 * Follow me @edgarator
 * Created on Tue Apr 29 21:37:36 CST 2014
 */
public class HorizontalScrollBar extends UIElement{


    public HorizontalScrollBar() {
        super();
        super.getControlAttributes().get("controlTypeID").setPropertyValue("com.balsamiq.mockups::HorizontalScrollBar");         
        super.getControlNodes().put("value", null);
    }

    public Property getValue() {
        return super.getControlNodes().get("value");
    }

    public void setValue(String value) {
        this.setPropertyNode("value", value);
    }

    @Override
    public String toString() {
        return super.toString() + "\nHorizontalScrollBar{" + "value=" + super.getControlNodes().get("value") + "}";
    }
}