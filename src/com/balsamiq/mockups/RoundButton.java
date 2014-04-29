package com.balsamiq.mockups;

/**
 * @author Edgar Anzaldúa Moreno
 * Follow me @edgarator
 * Created on Tue Apr 29 21:37:36 CST 2014
 */
public class RoundButton extends UIElement{


    public RoundButton() {
        super();
        super.getControlAttributes().get("controlTypeID").setPropertyValue("com.balsamiq.mockups::RoundButton");         
        super.getControlNodes().put("align", null);
        super.getControlNodes().put("backgroundAlpha", null);
        super.getControlNodes().put("bold", null);
        super.getControlNodes().put("borderColor", null);
        super.getControlNodes().put("color", null);
        super.getControlNodes().put("icon", null);
        super.getControlNodes().put("italic", null);
        super.getControlNodes().put("map", null);
        super.getControlNodes().put("rotation", null);
        super.getControlNodes().put("shape", null);
        super.getControlNodes().put("size", null);
        super.getControlNodes().put("text", null);
        super.getControlNodes().put("underline", null);
        super.getControlNodes().put("href", null);
    }

    public Property getAlign() {
        return super.getControlNodes().get("align");
    }

    public void setAlign(String align) {
        this.setPropertyNode("align", align);
    }

    public Property getBackgroundAlpha() {
        return super.getControlNodes().get("backgroundAlpha");
    }

    public void setBackgroundAlpha(String backgroundAlpha) {
        this.setPropertyNode("backgroundAlpha", backgroundAlpha);
    }

    public Property getBold() {
        return super.getControlNodes().get("bold");
    }

    public void setBold(String bold) {
        this.setPropertyNode("bold", bold);
    }

    public Property getBorderColor() {
        return super.getControlNodes().get("borderColor");
    }

    public void setBorderColor(String borderColor) {
        this.setPropertyNode("borderColor", borderColor);
    }

    public Property getColor() {
        return super.getControlNodes().get("color");
    }

    public void setColor(String color) {
        this.setPropertyNode("color", color);
    }

    public Property getIcon() {
        return super.getControlNodes().get("icon");
    }

    public void setIcon(String icon) {
        this.setPropertyNode("icon", icon);
    }

    public Property getItalic() {
        return super.getControlNodes().get("italic");
    }

    public void setItalic(String italic) {
        this.setPropertyNode("italic", italic);
    }

    public Property getMap() {
        return super.getControlNodes().get("map");
    }

    public void setMap(String map) {
        this.setPropertyNode("map", map);
    }

    public Property getRotation() {
        return super.getControlNodes().get("rotation");
    }

    public void setRotation(String rotation) {
        this.setPropertyNode("rotation", rotation);
    }

    public Property getShape() {
        return super.getControlNodes().get("shape");
    }

    public void setShape(String shape) {
        this.setPropertyNode("shape", shape);
    }

    public Property getSize() {
        return super.getControlNodes().get("size");
    }

    public void setSize(String size) {
        this.setPropertyNode("size", size);
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

    public Property getHref() {
        return super.getControlNodes().get("href");
    }

    public void setHref(String href) {
        this.setPropertyNode("href", href);
    }

    @Override
    public String toString() {
        return super.toString() + "\nRoundButton{" + "align=" + super.getControlNodes().get("align") + ", " + "backgroundAlpha=" + super.getControlNodes().get("backgroundAlpha") + ", " + "bold=" + super.getControlNodes().get("bold") + ", " + "borderColor=" + super.getControlNodes().get("borderColor") + ", " + "color=" + super.getControlNodes().get("color") + ", " + "icon=" + super.getControlNodes().get("icon") + ", " + "italic=" + super.getControlNodes().get("italic") + ", " + "map=" + super.getControlNodes().get("map") + ", " + "rotation=" + super.getControlNodes().get("rotation") + ", " + "shape=" + super.getControlNodes().get("shape") + ", " + "size=" + super.getControlNodes().get("size") + ", " + "text=" + super.getControlNodes().get("text") + ", " + "underline=" + super.getControlNodes().get("underline") + ", " + "href=" + super.getControlNodes().get("href") + "}";
    }
}