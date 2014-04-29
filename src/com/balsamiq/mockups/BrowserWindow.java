package com.balsamiq.mockups;

/**
 * @author Edgar Anzaldúa Moreno
 * Follow me @edgarator
 * Created on Tue Apr 29 21:37:36 CST 2014
 */
public class BrowserWindow extends UIElement{


    public BrowserWindow() {
        super();
        super.getControlAttributes().get("controlTypeID").setPropertyValue("com.balsamiq.mockups::BrowserWindow");         
        super.getControlNodes().put("borderStyle", null);
        super.getControlNodes().put("color", null);
        super.getControlNodes().put("text", null);
        super.getControlNodes().put("value", null);
        super.getControlNodes().put("verticalScrollbar", null);
    }

    public Property getBorderStyle() {
        return super.getControlNodes().get("borderStyle");
    }

    public void setBorderStyle(String borderStyle) {
        this.setPropertyNode("borderStyle", borderStyle);
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

    public Property getValue() {
        return super.getControlNodes().get("value");
    }

    public void setValue(String value) {
        this.setPropertyNode("value", value);
    }

    public Property getVerticalScrollbar() {
        return super.getControlNodes().get("verticalScrollbar");
    }

    public void setVerticalScrollbar(String verticalScrollbar) {
        this.setPropertyNode("verticalScrollbar", verticalScrollbar);
    }

    @Override
    public String toString() {
        return super.toString() + "\nBrowserWindow{" + "borderStyle=" + super.getControlNodes().get("borderStyle") + ", " + "color=" + super.getControlNodes().get("color") + ", " + "text=" + super.getControlNodes().get("text") + ", " + "value=" + super.getControlNodes().get("value") + ", " + "verticalScrollbar=" + super.getControlNodes().get("verticalScrollbar") + "}";
    }
}