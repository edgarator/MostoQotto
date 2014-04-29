/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.balsamiq.mockups;

import java.util.HashMap;

/**
 *
 * @author eanzaldua
 */
public class __group__ extends UIElement{

    private HashMap<Integer, UIElement> UIElements;
    private HashMap<String, Property> documentAttributes;
    private int controlIDCounter;

    public __group__() {
        super();
        this.controlIDCounter = 0;
        UIElements = new HashMap<>();
        documentAttributes = new HashMap<>();
        super.getControlAttributes().get("controlTypeID").setPropertyValue("__group__");
    }

    public HashMap<Integer, UIElement> getUIElements() {
        return UIElements;
    }

    public void setUIElements(HashMap<Integer, UIElement> UIElements) {
        this.UIElements = UIElements;
    }

    public HashMap<String, Property> getDocumentAttributes() {
        return documentAttributes;
    }

    public void setDocumentAttributes(HashMap<String, Property> documentAttributes) {
        this.documentAttributes = documentAttributes;
    }

    public int getControlIDCounter() {
        return controlIDCounter;
    }

    public void setControlIDCounter(int controlIDCounter) {
        this.controlIDCounter = controlIDCounter;
    }
}
