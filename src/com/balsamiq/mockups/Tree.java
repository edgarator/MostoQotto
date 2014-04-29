package com.balsamiq.mockups;

/**
 * @author Edgar Anzaldúa Moreno
 * Follow me @edgarator
 * Created on Tue Apr 29 21:37:36 CST 2014
 */
public class Tree extends UIElement{


    public Tree() {
        super();
        super.getControlAttributes().get("controlTypeID").setPropertyValue("com.balsamiq.mockups::Tree");         
        super.getControlNodes().put("backgroundAlpha", null);
        super.getControlNodes().put("bold", null);
        super.getControlNodes().put("borderStyle", null);
        super.getControlNodes().put("color", null);
        super.getControlNodes().put("italic", null);
        super.getControlNodes().put("map", null);
        super.getControlNodes().put("selectedIndex", null);
        super.getControlNodes().put("size", null);
        super.getControlNodes().put("state", null);
        super.getControlNodes().put("text", null);
        super.getControlNodes().put("underline", null);
        super.getControlNodes().put("value", null);
        super.getControlNodes().put("verticalScrollbar", null);
        super.getControlNodes().put("hrefs", null);
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

    public Property getSelectedIndex() {
        return super.getControlNodes().get("selectedIndex");
    }

    public void setSelectedIndex(String selectedIndex) {
        this.setPropertyNode("selectedIndex", selectedIndex);
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

    public Property getHrefs() {
        return super.getControlNodes().get("hrefs");
    }

    public void setHrefs(String hrefs) {
        this.setPropertyNode("hrefs", hrefs);
    }

    @Override
    public String toString() {
        return super.toString() + "\nTree{" + "backgroundAlpha=" + super.getControlNodes().get("backgroundAlpha") + ", " + "bold=" + super.getControlNodes().get("bold") + ", " + "borderStyle=" + super.getControlNodes().get("borderStyle") + ", " + "color=" + super.getControlNodes().get("color") + ", " + "italic=" + super.getControlNodes().get("italic") + ", " + "map=" + super.getControlNodes().get("map") + ", " + "selectedIndex=" + super.getControlNodes().get("selectedIndex") + ", " + "size=" + super.getControlNodes().get("size") + ", " + "state=" + super.getControlNodes().get("state") + ", " + "text=" + super.getControlNodes().get("text") + ", " + "underline=" + super.getControlNodes().get("underline") + ", " + "value=" + super.getControlNodes().get("value") + ", " + "verticalScrollbar=" + super.getControlNodes().get("verticalScrollbar") + ", " + "hrefs=" + super.getControlNodes().get("hrefs") + "}";
    }
}