package com.balsamiq.mockups;

/**
 * @author Edgar Anzaldúa Moreno
 * Follow me @edgarator
 * Created on Tue Apr 29 21:37:36 CST 2014
 */
public class CoverFlow extends UIElement{


    public CoverFlow() {
        super();
        super.getControlAttributes().get("controlTypeID").setPropertyValue("com.balsamiq.mockups::CoverFlow");         
        super.getControlNodes().put("filter", null);
        super.getControlNodes().put("src", null);
        super.getControlNodes().put("value", null);
        super.getControlNodes().put("verticalScrollbar", null);
    }

    public Property getFilter() {
        return super.getControlNodes().get("filter");
    }

    public void setFilter(String filter) {
        this.setPropertyNode("filter", filter);
    }

    public Property getSrc() {
        return super.getControlNodes().get("src");
    }

    public void setSrc(String src) {
        this.setPropertyNode("src", src);
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
        return super.toString() + "\nCoverFlow{" + "filter=" + super.getControlNodes().get("filter") + ", " + "src=" + super.getControlNodes().get("src") + ", " + "value=" + super.getControlNodes().get("value") + ", " + "verticalScrollbar=" + super.getControlNodes().get("verticalScrollbar") + "}";
    }
}