package com.balsamiq.mockups;

/**
 * @author Edgar Anzaldúa Moreno
 * Follow me @edgarator
 * Created on Tue Apr 29 21:37:36 CST 2014
 */
public class ProgressBar extends UIElement{


    public ProgressBar() {
        super();
        super.getControlAttributes().get("controlTypeID").setPropertyValue("com.balsamiq.mockups::ProgressBar");         
        super.getControlNodes().put("indeterminate", null);
        super.getControlNodes().put("scrollBarValue", null);
    }

    public Property getIndeterminate() {
        return super.getControlNodes().get("indeterminate");
    }

    public void setIndeterminate(String indeterminate) {
        this.setPropertyNode("indeterminate", indeterminate);
    }

    public Property getScrollBarValue() {
        return super.getControlNodes().get("scrollBarValue");
    }

    public void setScrollBarValue(String scrollBarValue) {
        this.setPropertyNode("scrollBarValue", scrollBarValue);
    }

    @Override
    public String toString() {
        return super.toString() + "\nProgressBar{" + "indeterminate=" + super.getControlNodes().get("indeterminate") + ", " + "scrollBarValue=" + super.getControlNodes().get("scrollBarValue") + "}";
    }
}