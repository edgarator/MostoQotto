package com.balsamiq.mockups;

/**
 * @author Edgar Anzaldúa Moreno
 * Follow me @edgarator
 * Created on Tue Apr 29 21:37:36 CST 2014
 */
public class PointyButton extends UIElement{


    public PointyButton() {
        super();
        super.getControlAttributes().get("controlTypeID").setPropertyValue("com.balsamiq.mockups::PointyButton");         
        super.getControlNodes().put("bold", null);
        super.getControlNodes().put("borderStyle", null);
        super.getControlNodes().put("color", null);
        super.getControlNodes().put("direction", null);
        super.getControlNodes().put("icon", null);
        super.getControlNodes().put("italic", null);
        super.getControlNodes().put("map", null);
        super.getControlNodes().put("menuIcon", null);
        super.getControlNodes().put("newLayout", null);
        super.getControlNodes().put("rotation", null);
        super.getControlNodes().put("size", null);
        super.getControlNodes().put("state", null);
        super.getControlNodes().put("underline", null);
        super.getControlNodes().put("href", null);
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

    public Property getDirection() {
        return super.getControlNodes().get("direction");
    }

    public void setDirection(String direction) {
        this.setPropertyNode("direction", direction);
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

    public Property getMenuIcon() {
        return super.getControlNodes().get("menuIcon");
    }

    public void setMenuIcon(String menuIcon) {
        this.setPropertyNode("menuIcon", menuIcon);
    }

    public Property getNewLayout() {
        return super.getControlNodes().get("newLayout");
    }

    public void setNewLayout(String newLayout) {
        this.setPropertyNode("newLayout", newLayout);
    }

    public Property getRotation() {
        return super.getControlNodes().get("rotation");
    }

    public void setRotation(String rotation) {
        this.setPropertyNode("rotation", rotation);
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
        return super.toString() + "\nPointyButton{" + "bold=" + super.getControlNodes().get("bold") + ", " + "borderStyle=" + super.getControlNodes().get("borderStyle") + ", " + "color=" + super.getControlNodes().get("color") + ", " + "direction=" + super.getControlNodes().get("direction") + ", " + "icon=" + super.getControlNodes().get("icon") + ", " + "italic=" + super.getControlNodes().get("italic") + ", " + "map=" + super.getControlNodes().get("map") + ", " + "menuIcon=" + super.getControlNodes().get("menuIcon") + ", " + "newLayout=" + super.getControlNodes().get("newLayout") + ", " + "rotation=" + super.getControlNodes().get("rotation") + ", " + "size=" + super.getControlNodes().get("size") + ", " + "state=" + super.getControlNodes().get("state") + ", " + "underline=" + super.getControlNodes().get("underline") + ", " + "href=" + super.getControlNodes().get("href") + "}";
    }
}