package com.balsamiq.mockups;

/**
 * @author Edgar Anzaldúa Moreno
 * Follow me @edgarator
 * Created on Tue Apr 29 21:37:36 CST 2014
 */
public class CallOut extends UIElement{


    public CallOut() {
        super();
        super.getControlAttributes().get("controlTypeID").setPropertyValue("com.balsamiq.mockups::CallOut");         
        super.getControlNodes().put("backgroundAlpha", null);
        super.getControlNodes().put("map", null);
        super.getControlNodes().put("text", null);
    }

    public Property getBackgroundAlpha() {
        return super.getControlNodes().get("backgroundAlpha");
    }

    public void setBackgroundAlpha(String backgroundAlpha) {
        this.setPropertyNode("backgroundAlpha", backgroundAlpha);
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

    @Override
    public String toString() {
        return super.toString() + "\nCallOut{" + "backgroundAlpha=" + super.getControlNodes().get("backgroundAlpha") + ", " + "map=" + super.getControlNodes().get("map") + ", " + "text=" + super.getControlNodes().get("text") + "}";
    }
}