package com.balsamiq.mockups;

/**
 * @author Edgar Anzaldúa Moreno
 * Follow me @edgarator
 * Created on Tue Apr 29 21:37:36 CST 2014
 */
public class MenuBar extends UIElement{


    public MenuBar() {
        super();
        super.getControlAttributes().get("controlTypeID").setPropertyValue("com.balsamiq.mockups::MenuBar");         
        super.getControlNodes().put("borderStyle", null);
        super.getControlNodes().put("icon", null);
        super.getControlNodes().put("map", null);
        super.getControlNodes().put("rotation", null);
        super.getControlNodes().put("selectedIndex", null);
        super.getControlNodes().put("hrefs", null);
    }

    public Property getBorderStyle() {
        return super.getControlNodes().get("borderStyle");
    }

    public void setBorderStyle(String borderStyle) {
        this.setPropertyNode("borderStyle", borderStyle);
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

    public Property getSelectedIndex() {
        return super.getControlNodes().get("selectedIndex");
    }

    public void setSelectedIndex(String selectedIndex) {
        this.setPropertyNode("selectedIndex", selectedIndex);
    }

    public Property getHrefs() {
        return super.getControlNodes().get("hrefs");
    }

    public void setHrefs(String hrefs) {
        this.setPropertyNode("hrefs", hrefs);
    }

    @Override
    public String toString() {
        return super.toString() + "\nMenuBar{" + "borderStyle=" + super.getControlNodes().get("borderStyle") + ", " + "icon=" + super.getControlNodes().get("icon") + ", " + "map=" + super.getControlNodes().get("map") + ", " + "rotation=" + super.getControlNodes().get("rotation") + ", " + "selectedIndex=" + super.getControlNodes().get("selectedIndex") + ", " + "hrefs=" + super.getControlNodes().get("hrefs") + "}";
    }
}