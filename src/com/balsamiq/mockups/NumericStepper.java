package com.balsamiq.mockups;

/**
 * @author Edgar Anzaldúa Moreno
 * Follow me @edgarator
 * Created on Tue Apr 29 21:37:36 CST 2014
 */
public class NumericStepper extends UIElement{


    public NumericStepper() {
        super();
        super.getControlAttributes().get("controlTypeID").setPropertyValue("com.balsamiq.mockups::NumericStepper");         
        super.getControlNodes().put("bold", null);
        super.getControlNodes().put("color", null);
        super.getControlNodes().put("italic", null);
        super.getControlNodes().put("size", null);
        super.getControlNodes().put("state", null);
        super.getControlNodes().put("text", null);
        super.getControlNodes().put("underline", null);
    }

    public Property getBold() {
        return super.getControlNodes().get("bold");
    }

    public void setBold(String bold) {
        this.setPropertyNode("bold", bold);
    }

    public Property getColor() {
        return super.getControlNodes().get("color");
    }

    public void setColor(String color) {
        this.setPropertyNode("color", color);
    }

    public Property getItalic() {
        return super.getControlNodes().get("italic");
    }

    public void setItalic(String italic) {
        this.setPropertyNode("italic", italic);
    }

    public Property getSize() {
        return super.getControlNodes().get("size");
    }

    public void setSize(String size) {
        this.setPropertyNode("size", size);
    }

    public Property getState() {
        return super.getControlNodes().get("state");
    }

    public void setState(String state) {
        this.setPropertyNode("state", state);
    }

    public Property getText() {
        return super.getControlNodes().get("text");
    }

    public void setText(String text) {
        this.setPropertyNode("text", text);
    }

    public Property getUnderline() {
        return super.getControlNodes().get("underline");
    }

    public void setUnderline(String underline) {
        this.setPropertyNode("underline", underline);
    }

    @Override
    public String toString() {
        return super.toString() + "\nNumericStepper{" + "bold=" + super.getControlNodes().get("bold") + ", " + "color=" + super.getControlNodes().get("color") + ", " + "italic=" + super.getControlNodes().get("italic") + ", " + "size=" + super.getControlNodes().get("size") + ", " + "state=" + super.getControlNodes().get("state") + ", " + "text=" + super.getControlNodes().get("text") + ", " + "underline=" + super.getControlNodes().get("underline") + "}";
    }
}