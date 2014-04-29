package com.balsamiq.mockups;

/**
 * @author Edgar Anzaldúa Moreno
 * Follow me @edgarator
 * Created on Tue Apr 29 21:37:36 CST 2014
 */
public class iPad extends UIElement{


    public iPad() {
        super();
        super.getControlAttributes().get("controlTypeID").setPropertyValue("com.balsamiq.mockups::iPad");         
        super.getControlNodes().put("bgTransparent", null);
        super.getControlNodes().put("orientation", null);
        super.getControlNodes().put("topBar", null);
    }

    public Property getBgTransparent() {
        return super.getControlNodes().get("bgTransparent");
    }

    public void setBgTransparent(String bgTransparent) {
        this.setPropertyNode("bgTransparent", bgTransparent);
    }

    public Property getOrientation() {
        return super.getControlNodes().get("orientation");
    }

    public void setOrientation(String orientation) {
        this.setPropertyNode("orientation", orientation);
    }

    public Property getTopBar() {
        return super.getControlNodes().get("topBar");
    }

    public void setTopBar(String topBar) {
        this.setPropertyNode("topBar", topBar);
    }

    @Override
    public String toString() {
        return super.toString() + "\niPad{" + "bgTransparent=" + super.getControlNodes().get("bgTransparent") + ", " + "orientation=" + super.getControlNodes().get("orientation") + ", " + "topBar=" + super.getControlNodes().get("topBar") + "}";
    }
}