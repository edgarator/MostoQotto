package com.balsamiq.mockups;

/**
 * @author Edgar Anzaldúa Moreno
 * Follow me @edgarator
 * Created on Tue Apr 29 21:37:36 CST 2014
 */
public class Switch extends UIElement{


    public Switch() {
        super();
        super.getControlAttributes().get("controlTypeID").setPropertyValue("com.balsamiq.mockups::Switch");         
        super.getControlNodes().put("color", null);
        super.getControlNodes().put("map", null);
        super.getControlNodes().put("onOffState", null);
        super.getControlNodes().put("href", null);
    }

    public Property getColor() {
        return super.getControlNodes().get("color");
    }

    public void setColor(String color) {
        this.setPropertyNode("color", color);
    }

    public Property getMap() {
        return super.getControlNodes().get("map");
    }

    public void setMap(String map) {
        this.setPropertyNode("map", map);
    }

    public Property getOnOffState() {
        return super.getControlNodes().get("onOffState");
    }

    public void setOnOffState(String onOffState) {
        this.setPropertyNode("onOffState", onOffState);
    }

    public Property getHref() {
        return super.getControlNodes().get("href");
    }

    public void setHref(String href) {
        this.setPropertyNode("href", href);
    }

    @Override
    public String toString() {
        return super.toString() + "\nSwitch{" + "color=" + super.getControlNodes().get("color") + ", " + "map=" + super.getControlNodes().get("map") + ", " + "onOffState=" + super.getControlNodes().get("onOffState") + ", " + "href=" + super.getControlNodes().get("href") + "}";
    }
}