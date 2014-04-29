package com.balsamiq.mockups;

/**
 * @author Edgar Anzaldúa Moreno
 * Follow me @edgarator
 * Created on Tue Apr 29 21:37:36 CST 2014
 */
public class iPhone extends UIElement{


    public iPhone() {
        super();
        super.getControlAttributes().get("controlTypeID").setPropertyValue("com.balsamiq.mockups::iPhone");         
        super.getControlNodes().put("bgPattern", null);
        super.getControlNodes().put("bgTransparent", null);
        super.getControlNodes().put("model", null);
        super.getControlNodes().put("orientation", null);
        super.getControlNodes().put("topBar", null);
    }

    public Property getBgPattern() {
        return super.getControlNodes().get("bgPattern");
    }

    public void setBgPattern(String bgPattern) {
        this.setPropertyNode("bgPattern", bgPattern);
    }

    public Property getBgTransparent() {
        return super.getControlNodes().get("bgTransparent");
    }

    public void setBgTransparent(String bgTransparent) {
        this.setPropertyNode("bgTransparent", bgTransparent);
    }

    public Property getModel() {
        return super.getControlNodes().get("model");
    }

    public void setModel(String model) {
        this.setPropertyNode("model", model);
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
        return super.toString() + "\niPhone{" + "bgPattern=" + super.getControlNodes().get("bgPattern") + ", " + "bgTransparent=" + super.getControlNodes().get("bgTransparent") + ", " + "model=" + super.getControlNodes().get("model") + ", " + "orientation=" + super.getControlNodes().get("orientation") + ", " + "topBar=" + super.getControlNodes().get("topBar") + "}";
    }
}