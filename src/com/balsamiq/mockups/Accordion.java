package com.balsamiq.mockups;

/**
 * @author Edgar Anzaldúa Moreno
 * Follow me @edgarator
 * Created on Tue Apr 29 21:37:36 CST 2014
 */
public class Accordion extends UIElement{


    public Accordion() {
        super();
        super.getControlAttributes().get("controlTypeID").setPropertyValue("com.balsamiq.mockups::Accordion");         
        super.getControlNodes().put("map", null);
        super.getControlNodes().put("selectedIndex", null);
        super.getControlNodes().put("text", null);
        super.getControlNodes().put("value", null);
        super.getControlNodes().put("verticalScrollbar", null);
        super.getControlNodes().put("hrefs", null);
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

    public Property getHrefs() {
        return super.getControlNodes().get("hrefs");
    }

    public void setHrefs(String hrefs) {
        this.setPropertyNode("hrefs", hrefs);
    }

    @Override
    public String toString() {
        return super.toString() + "\nAccordion{" + "map=" + super.getControlNodes().get("map") + ", " + "selectedIndex=" + super.getControlNodes().get("selectedIndex") + ", " + "text=" + super.getControlNodes().get("text") + ", " + "value=" + super.getControlNodes().get("value") + ", " + "verticalScrollbar=" + super.getControlNodes().get("verticalScrollbar") + ", " + "hrefs=" + super.getControlNodes().get("hrefs") + "}";
    }
}