package com.balsamiq.mockups;

/**
 * @author Edgar Anzaldúa Moreno
 * Follow me @edgarator
 * Created on Tue Apr 29 21:37:36 CST 2014
 */
public class FieldSet extends UIElement{


    public FieldSet() {
        super();
        super.getControlAttributes().get("controlTypeID").setPropertyValue("com.balsamiq.mockups::FieldSet");         
        super.getControlNodes().put("backgroundAlpha", null);
        super.getControlNodes().put("color", null);
        super.getControlNodes().put("text", null);
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

    public Property getText() {
        return super.getControlNodes().get("text");
    }

    public void setText(String text) {
        this.setPropertyNode("text", text);
    }

    @Override
    public String toString() {
        return super.toString() + "\nFieldSet{" + "backgroundAlpha=" + super.getControlNodes().get("backgroundAlpha") + ", " + "color=" + super.getControlNodes().get("color") + ", " + "text=" + super.getControlNodes().get("text") + "}";
    }
}