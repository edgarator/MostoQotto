package com.balsamiq.mockups;

/**
 * @author Edgar Anzaldúa Moreno
 * Follow me @edgarator
 * Created on Tue Apr 29 21:37:36 CST 2014
 */
public class TitleWindow extends UIElement{


    public TitleWindow() {
        super();
        super.getControlAttributes().get("controlTypeID").setPropertyValue("com.balsamiq.mockups::TitleWindow");         
        super.getControlNodes().put("bottomheight", null);
        super.getControlNodes().put("close", null);
        super.getControlNodes().put("dragger", null);
        super.getControlNodes().put("maximizeRestore", null);
        super.getControlNodes().put("minimize", null);
        super.getControlNodes().put("topheight", null);
        super.getControlNodes().put("value", null);
        super.getControlNodes().put("verticalScrollbar", null);
    }

    public Property getBottomheight() {
        return super.getControlNodes().get("bottomheight");
    }

    public void setBottomheight(String bottomheight) {
        this.setPropertyNode("bottomheight", bottomheight);
    }

    public Property getClose() {
        return super.getControlNodes().get("close");
    }

    public void setClose(String close) {
        this.setPropertyNode("close", close);
    }

    public Property getDragger() {
        return super.getControlNodes().get("dragger");
    }

    public void setDragger(String dragger) {
        this.setPropertyNode("dragger", dragger);
    }

    public Property getMaximizeRestore() {
        return super.getControlNodes().get("maximizeRestore");
    }

    public void setMaximizeRestore(String maximizeRestore) {
        this.setPropertyNode("maximizeRestore", maximizeRestore);
    }

    public Property getMinimize() {
        return super.getControlNodes().get("minimize");
    }

    public void setMinimize(String minimize) {
        this.setPropertyNode("minimize", minimize);
    }

    public Property getTopheight() {
        return super.getControlNodes().get("topheight");
    }

    public void setTopheight(String topheight) {
        this.setPropertyNode("topheight", topheight);
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

    @Override
    public String toString() {
        return super.toString() + "\nTitleWindow{" + "bottomheight=" + super.getControlNodes().get("bottomheight") + ", " + "close=" + super.getControlNodes().get("close") + ", " + "dragger=" + super.getControlNodes().get("dragger") + ", " + "maximizeRestore=" + super.getControlNodes().get("maximizeRestore") + ", " + "minimize=" + super.getControlNodes().get("minimize") + ", " + "topheight=" + super.getControlNodes().get("topheight") + ", " + "value=" + super.getControlNodes().get("value") + ", " + "verticalScrollbar=" + super.getControlNodes().get("verticalScrollbar") + "}";
    }
}