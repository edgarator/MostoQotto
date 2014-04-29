/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.balsamiq.mockups;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 *
 * @author eanzaldua
 */
public class UIElement {

    private HashMap<String, Property> controlNodes;
    private HashMap<String, Property> controlAttributes;

    public UIElement() {

        controlNodes = new HashMap<>();
        controlAttributes = new HashMap<>();
        controlAttributes.put("controlTypeID", new Property("com.balsamiq.mockups::"));
        controlAttributes.put("controlID", new Property("0"));
        controlAttributes.put("x", new Property("0"));
        controlAttributes.put("x", new Property("0"));
        controlAttributes.put("y", new Property("0"));
        controlAttributes.put("w", new Property("-1"));
        controlAttributes.put("h", new Property("-1"));
        controlAttributes.put("measuredW", null);
        controlAttributes.put("measuredH", null);
        controlAttributes.put("zOrder", new Property("0"));
        controlAttributes.put("locked", new Property("false"));
        controlAttributes.put("isInGroup", new Property("-1"));
    }

    public Property getControlTypeID() {
        return controlAttributes.get("controlTypeID");
    }

    public void setControlTypeID(String controlTypeID) {
        this.setControlAttribute("controlTypeID", controlTypeID);
    }

    public Property getControlID() {
        return controlAttributes.get("controlID");
    }

    public void setControlID(String controlID) {
        this.setControlAttribute("controlID", controlID);
    }

    public Property getX() {
        return controlAttributes.get("x");
    }

    public void setX(String x) {
        this.setControlAttribute("x", x);
    }

    public Property getY() {
        return controlAttributes.get("y");
    }

    public void setY(String y) {
        this.setControlAttribute("y", y);
    }

    public Property getW() {
        return controlAttributes.get("w");
    }

    public void setW(String w) {
        this.setControlAttribute("w", w);
    }

    public Property getH() {
        return controlAttributes.get("h");
    }

    public void setH(String h) {
        this.setControlAttribute("h", h);
    }

    public Property getMeasuredW() {
        return controlAttributes.get("measuredW");
    }

    public void setMeasuredW(String measuredW) {
        this.setControlAttribute("measuredW", measuredW);
    }

    public Property getMeasuredH() {
        return controlAttributes.get("measuredH");
    }

    public void setMeasuredH(String measuredH) {
        this.setControlAttribute("measuredH", measuredH);
    }

    public Property getZOrder() {
        return controlAttributes.get("zOrder");
    }

    public void setZOrder(String zOrder) {
        this.setControlAttribute("zOrder", zOrder);
    }

    public Property isLocked() {
        return controlAttributes.get("locked");
    }

    public void setLocked(String locked) {
        this.setControlAttribute("locked", locked);
    }

    public Property getIsInGroup() {
        return controlAttributes.get("isInGroup");
    }

    public void setIsInGroup(String isInGroup) {
        this.setControlAttribute("isInGroup", isInGroup);
    }

    public HashMap<String, Property> getControlNodes() {
        return this.controlNodes;
    }

    public void setControlProperties(HashMap<String, Property> controlProperties) {
        this.controlNodes = controlProperties;
    }

    public HashMap<String, Property> getControlAttributes() {
        return controlAttributes;
    }

    public void setControlAttributes(HashMap<String, Property> controlAttributes) {
        this.controlAttributes = controlAttributes;
    }

    public void encodeFields() throws URISyntaxException {
        String[] fields = {"text", "map", "href"};
        for (String field : fields) {
            if (getControlNodes().containsKey(field)) {
                if (getControlNodes().get(field) != null) {
                    String fieldContents = getControlNodes().get(field).getPropertyValue().toString();
                    URI uri = new URI("http", "localhost", fieldContents);
                    this.getControlNodes().get(field).setPropertyValue(uri.getRawFragment());
                }
            }
        }
    }

    protected void setPropertyNode(String nodeName, String nodeValue) {
        Property controlProperty;
        if (this.getControlNodes().containsKey(nodeName)) {
            controlProperty = this.getControlNodes().get(nodeName);
            if (controlProperty == null) {
                controlProperty = new Property();
            }
            controlProperty.setPropertyValue(nodeValue);
        } else {
            controlProperty = new Property(nodeValue);
        }
        this.getControlNodes().put(nodeName, controlProperty);
    }

    protected void setControlAttribute(String nodeName, String nodeValue) {
        Property controlAttribute;
        if (this.getControlAttributes().containsKey(nodeName)) {
            controlAttribute = this.getControlAttributes().get(nodeName);
            if (controlAttribute == null) {
                controlAttribute = new Property();
            }
            controlAttribute.setPropertyValue(nodeValue);
        } else {
            controlAttribute = new Property(nodeValue);
        }
        this.getControlAttributes().put(nodeName, controlAttribute);
    }

    public void addToMockup(Mockup mockup) {
        this.setZOrder("" + mockup.getUIElements().size());
        mockup.setControlIDCounter(mockup.getControlIDCounter() + 1);
        this.setControlID("" + mockup.getControlIDCounter());
        mockup.getUIElements().put(mockup.getControlIDCounter() + 1, this);
    }

    public void addToGroup(__group__ group) {
        this.setZOrder("" + group.getUIElements().size());
        group.setControlIDCounter(group.getControlIDCounter() + 1);
        this.setControlID("" + group.getControlIDCounter());
        if (this.getX().toInt() < group.getX().toInt()){
            group.setX(this.getX().toString());
        }
        
        if (this.getY().toInt() < group.getY().toInt()){
            group.setY(this.getY().toString());
        }
        group.getUIElements().put(group.getControlIDCounter() + 1, this);
    }

    @Override
    public String toString() {
        return "UIElement{" + "controlTypeID=" + controlAttributes.get("controlTypeID") + ", controlID=" + controlAttributes.get("controlID") + ", x=" + controlAttributes.get("x") + ", y=" + controlAttributes.get("y") + ", w=" + controlAttributes.get("w") + ", h=" + controlAttributes.get("h") + ", zOrder=" + controlAttributes.get("zOrder") + ", locked=" + controlAttributes.get("locked") + ", isInGroup=" + controlAttributes.get("isInGroup") + '}';
    }

}
