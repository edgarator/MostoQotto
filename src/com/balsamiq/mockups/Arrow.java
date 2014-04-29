package com.balsamiq.mockups;

/**
 * @author Edgar Anzaldúa Moreno
 * Follow me @edgarator
 * Created on Tue Apr 29 21:37:36 CST 2014
 */
public class Arrow extends UIElement{


    public Arrow() {
        super();
        super.getControlAttributes().get("controlTypeID").setPropertyValue("com.balsamiq.mockups::Arrow");         
        super.getControlNodes().put("backgroundAlpha", null);
        super.getControlNodes().put("color", null);
        super.getControlNodes().put("curvature", null);
        super.getControlNodes().put("direction", null);
        super.getControlNodes().put("leftArrow", null);
        super.getControlNodes().put("map", null);
        super.getControlNodes().put("rightArrow", null);
        super.getControlNodes().put("stroke", null);
        super.getControlNodes().put("text", null);
    }

    public Property getBackgroundAlpha() {
        return super.getControlNodes().get("backgroundAlpha");
    }

    public void setBackgroundAlpha(String backgroundAlpha) {
        this.setPropertyNode("backgroundAlpha", backgroundAlpha);
    }

    public Property getColor() {
        return super.getControlNodes().get("color");
    }

    public void setColor(String color) {
        this.setPropertyNode("color", color);
    }

    public Property getCurvature() {
        return super.getControlNodes().get("curvature");
    }

    public void setCurvature(String curvature) {
        this.setPropertyNode("curvature", curvature);
    }

    public Property getDirection() {
        return super.getControlNodes().get("direction");
    }

    public void setDirection(String direction) {
        this.setPropertyNode("direction", direction);
    }

    public Property getLeftArrow() {
        return super.getControlNodes().get("leftArrow");
    }

    public void setLeftArrow(String leftArrow) {
        this.setPropertyNode("leftArrow", leftArrow);
    }

    public Property getMap() {
        return super.getControlNodes().get("map");
    }

    public void setMap(String map) {
        this.setPropertyNode("map", map);
    }

    public Property getRightArrow() {
        return super.getControlNodes().get("rightArrow");
    }

    public void setRightArrow(String rightArrow) {
        this.setPropertyNode("rightArrow", rightArrow);
    }

    public Property getStroke() {
        return super.getControlNodes().get("stroke");
    }

    public void setStroke(String stroke) {
        this.setPropertyNode("stroke", stroke);
    }

    public Property getText() {
        return super.getControlNodes().get("text");
    }

    public void setText(String text) {
        this.setPropertyNode("text", text);
    }

    @Override
    public String toString() {
        return super.toString() + "\nArrow{" + "backgroundAlpha=" + super.getControlNodes().get("backgroundAlpha") + ", " + "color=" + super.getControlNodes().get("color") + ", " + "curvature=" + super.getControlNodes().get("curvature") + ", " + "direction=" + super.getControlNodes().get("direction") + ", " + "leftArrow=" + super.getControlNodes().get("leftArrow") + ", " + "map=" + super.getControlNodes().get("map") + ", " + "rightArrow=" + super.getControlNodes().get("rightArrow") + ", " + "stroke=" + super.getControlNodes().get("stroke") + ", " + "text=" + super.getControlNodes().get("text") + "}";
    }
}