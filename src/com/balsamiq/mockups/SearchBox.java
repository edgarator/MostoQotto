package com.balsamiq.mockups;

/**
 * @author Edgar Anzaldúa Moreno
 * Follow me @edgarator
 * Created on Tue Apr 29 21:37:36 CST 2014
 */
public class SearchBox extends UIElement{


    public SearchBox() {
        super();
        super.getControlAttributes().get("controlTypeID").setPropertyValue("com.balsamiq.mockups::SearchBox");         
        super.getControlNodes().put("bold", null);
        super.getControlNodes().put("color", null);
        super.getControlNodes().put("italic", null);
        super.getControlNodes().put("map", null);
        super.getControlNodes().put("size", null);
        super.getControlNodes().put("state", null);
        super.getControlNodes().put("text", null);
        super.getControlNodes().put("underline", null);
        super.getControlNodes().put("href", null);
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

    public Property getMap() {
        return super.getControlNodes().get("map");
    }

    public void setMap(String map) {
        this.setPropertyNode("map", map);
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

    public Property getHref() {
        return super.getControlNodes().get("href");
    }

    public void setHref(String href) {
        this.setPropertyNode("href", href);
    }

    @Override
    public String toString() {
        return super.toString() + "\nSearchBox{" + "bold=" + super.getControlNodes().get("bold") + ", " + "color=" + super.getControlNodes().get("color") + ", " + "italic=" + super.getControlNodes().get("italic") + ", " + "map=" + super.getControlNodes().get("map") + ", " + "size=" + super.getControlNodes().get("size") + ", " + "state=" + super.getControlNodes().get("state") + ", " + "text=" + super.getControlNodes().get("text") + ", " + "underline=" + super.getControlNodes().get("underline") + ", " + "href=" + super.getControlNodes().get("href") + "}";
    }
}