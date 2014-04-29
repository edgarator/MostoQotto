package com.balsamiq.mockups;

/**
 * @author Edgar Anzaldúa Moreno
 * Follow me @edgarator
 * Created on Tue Apr 29 21:37:36 CST 2014
 */
public class SiteMap extends UIElement{


    public SiteMap() {
        super();
        super.getControlAttributes().get("controlTypeID").setPropertyValue("com.balsamiq.mockups::SiteMap");         
        super.getControlNodes().put("map", null);
        super.getControlNodes().put("text", null);
        super.getControlNodes().put("hrefs", null);
    }

    public Property getMap() {
        return super.getControlNodes().get("map");
    }

    public void setMap(String map) {
        this.setPropertyNode("map", map);
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
        return super.toString() + "\nSiteMap{" + "map=" + super.getControlNodes().get("map") + ", " + "text=" + super.getControlNodes().get("text") + ", " + "hrefs=" + super.getControlNodes().get("hrefs") + "}";
    }
}