package com.balsamiq.mockups;

/**
 * @author Edgar Anzaldúa Moreno
 * Follow me @edgarator
 * Created on Tue Apr 29 21:37:36 CST 2014
 */
public class Icon extends UIElement{


    public Icon() {
        super();
        super.getControlAttributes().get("controlTypeID").setPropertyValue("com.balsamiq.mockups::Icon");         
        super.getControlNodes().put("borderStyle", null);
        super.getControlNodes().put("color", null);
        super.getControlNodes().put("icon", null);
        super.getControlNodes().put("map", null);
        super.getControlNodes().put("rotation", null);
        super.getControlNodes().put("href", null);
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

    public Property getIcon() {
        return super.getControlNodes().get("icon");
    }

    public void setIcon(String icon) {
        this.setPropertyNode("icon", icon);
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

    public Property getHref() {
        return super.getControlNodes().get("href");
    }

    public void setHref(String href) {
        this.setPropertyNode("href", href);
    }

    @Override
    public String toString() {
        return super.toString() + "\nIcon{" + "borderStyle=" + super.getControlNodes().get("borderStyle") + ", " + "color=" + super.getControlNodes().get("color") + ", " + "icon=" + super.getControlNodes().get("icon") + ", " + "map=" + super.getControlNodes().get("map") + ", " + "rotation=" + super.getControlNodes().get("rotation") + ", " + "href=" + super.getControlNodes().get("href") + "}";
    }
}