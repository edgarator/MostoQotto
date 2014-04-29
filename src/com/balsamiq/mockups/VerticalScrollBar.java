package com.balsamiq.mockups;

/**
 * @author Edgar Anzaldúa Moreno
 * Follow me @edgarator
 * Created on Tue Apr 29 21:37:36 CST 2014
 */
public class VerticalScrollBar extends UIElement{


    public VerticalScrollBar() {
        super();
        super.getControlAttributes().get("controlTypeID").setPropertyValue("com.balsamiq.mockups::VerticalScrollBar");         
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
        return super.toString() + "\nVerticalScrollBar{" + "value=" + super.getControlNodes().get("value") + "}";
    }
}