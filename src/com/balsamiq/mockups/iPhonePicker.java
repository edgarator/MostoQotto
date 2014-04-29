package com.balsamiq.mockups;

/**
 * @author Edgar Anzaldúa Moreno
 * Follow me @edgarator
 * Created on Tue Apr 29 21:37:36 CST 2014
 */
public class iPhonePicker extends UIElement{


    public iPhonePicker() {
        super();
        super.getControlAttributes().get("controlTypeID").setPropertyValue("com.balsamiq.mockups::iPhonePicker");         
        super.getControlNodes().put("text", null);
    }

    public Property getText() {
        return super.getControlNodes().get("text");
    }

    public void setText(String text) {
        this.setPropertyNode("text", text);
    }

    @Override
    public String toString() {
        return super.toString() + "\niPhonePicker{" + "text=" + super.getControlNodes().get("text") + "}";
    }
}