package com.balsamiq.mockups;

/**
 * @author Edgar Anzaldúa Moreno
 * Follow me @edgarator
 * Created on Tue Apr 29 21:37:36 CST 2014
 */
public class FormattingToolbar extends UIElement{


    public FormattingToolbar() {
        super();
        super.getControlAttributes().get("controlTypeID").setPropertyValue("com.balsamiq.mockups::FormattingToolbar");         
    }

    @Override
    public String toString() {
        return super.toString() + "\nFormattingToolbar{" + "}";
    }
}