package com.balsamiq.mockups;

/**
 * @author Edgar Anzaldúa Moreno
 * Follow me @edgarator
 * Created on Tue Apr 29 21:37:36 CST 2014
 */
public class LinkBar extends UIElement{


    public LinkBar() {
        super();
        super.getControlAttributes().get("controlTypeID").setPropertyValue("com.balsamiq.mockups::LinkBar");         
        super.getControlNodes().put("bold", null);
        super.getControlNodes().put("borderColor", null);
        super.getControlNodes().put("color", null);
        super.getControlNodes().put("italic", null);
        super.getControlNodes().put("map", null);
        super.getControlNodes().put("selectedIndex", null);
        super.getControlNodes().put("size", null);
        super.getControlNodes().put("text", null);
        super.getControlNodes().put("hrefs", null);
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

    public Property getText() {
        return super.getControlNodes().get("text");
    }

    public void setText(String text) {
        this.setPropertyNode("text", text);
    }

    public Property getHrefs() {
        return super.getControlNodes().get("hrefs");
    }

    public void setHrefs(String hrefs) {
        this.setPropertyNode("hrefs", hrefs);
    }

    @Override
    public String toString() {
        return super.toString() + "\nLinkBar{" + "bold=" + super.getControlNodes().get("bold") + ", " + "borderColor=" + super.getControlNodes().get("borderColor") + ", " + "color=" + super.getControlNodes().get("color") + ", " + "italic=" + super.getControlNodes().get("italic") + ", " + "map=" + super.getControlNodes().get("map") + ", " + "selectedIndex=" + super.getControlNodes().get("selectedIndex") + ", " + "size=" + super.getControlNodes().get("size") + ", " + "text=" + super.getControlNodes().get("text") + ", " + "hrefs=" + super.getControlNodes().get("hrefs") + "}";
    }
}