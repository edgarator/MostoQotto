package com.balsamiq.mockups;

/**
 * @author Edgar Anzaldúa Moreno
 * Follow me @edgarator
 * Created on Tue Apr 29 21:37:36 CST 2014
 */
public class DataGrid extends UIElement{


    public DataGrid() {
        super();
        super.getControlAttributes().get("controlTypeID").setPropertyValue("com.balsamiq.mockups::DataGrid");         
        super.getControlNodes().put("align", null);
        super.getControlNodes().put("alternateRowColor", null);
        super.getControlNodes().put("bold", null);
        super.getControlNodes().put("borderStyle", null);
        super.getControlNodes().put("color", null);
        super.getControlNodes().put("hasHeader", null);
        super.getControlNodes().put("hLines", null);
        super.getControlNodes().put("italic", null);
        super.getControlNodes().put("map", null);
        super.getControlNodes().put("selectedIndex", null);
        super.getControlNodes().put("size", null);
        super.getControlNodes().put("text", null);
        super.getControlNodes().put("underline", null);
        super.getControlNodes().put("value", null);
        super.getControlNodes().put("verticalScrollbar", null);
        super.getControlNodes().put("vLines", null);
    }

    public Property getAlign() {
        return super.getControlNodes().get("align");
    }

    public void setAlign(String align) {
        this.setPropertyNode("align", align);
    }

    public Property getAlternateRowColor() {
        return super.getControlNodes().get("alternateRowColor");
    }

    public void setAlternateRowColor(String alternateRowColor) {
        this.setPropertyNode("alternateRowColor", alternateRowColor);
    }

    public Property getBold() {
        return super.getControlNodes().get("bold");
    }

    public void setBold(String bold) {
        this.setPropertyNode("bold", bold);
    }

    public Property getBorderStyle() {
        return super.getControlNodes().get("borderStyle");
    }

    public void setBorderStyle(String borderStyle) {
        this.setPropertyNode("borderStyle", borderStyle);
    }

    public Property getColor() {
        return super.getControlNodes().get("color");
    }

    public void setColor(String color) {
        this.setPropertyNode("color", color);
    }

    public Property getHasHeader() {
        return super.getControlNodes().get("hasHeader");
    }

    public void setHasHeader(String hasHeader) {
        this.setPropertyNode("hasHeader", hasHeader);
    }

    public Property getHLines() {
        return super.getControlNodes().get("hLines");
    }

    public void setHLines(String hLines) {
        this.setPropertyNode("hLines", hLines);
    }

    public Property getItalic() {
        return super.getControlNodes().get("italic");
    }

    public void setItalic(String italic) {
        this.setPropertyNode("italic", italic);
    }

    public Property getMap() {
        return super.getControlNodes().get("map");
    }

    public void setMap(String map) {
        this.setPropertyNode("map", map);
    }

    public Property getSelectedIndex() {
        return super.getControlNodes().get("selectedIndex");
    }

    public void setSelectedIndex(String selectedIndex) {
        this.setPropertyNode("selectedIndex", selectedIndex);
    }

    public Property getSize() {
        return super.getControlNodes().get("size");
    }

    public void setSize(String size) {
        this.setPropertyNode("size", size);
    }

    public Property getText() {
        return super.getControlNodes().get("text");
    }

    public void setText(String text) {
        this.setPropertyNode("text", text);
    }

    public Property getUnderline() {
        return super.getControlNodes().get("underline");
    }

    public void setUnderline(String underline) {
        this.setPropertyNode("underline", underline);
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

    public Property getVLines() {
        return super.getControlNodes().get("vLines");
    }

    public void setVLines(String vLines) {
        this.setPropertyNode("vLines", vLines);
    }

    @Override
    public String toString() {
        return super.toString() + "\nDataGrid{" + "align=" + super.getControlNodes().get("align") + ", " + "alternateRowColor=" + super.getControlNodes().get("alternateRowColor") + ", " + "bold=" + super.getControlNodes().get("bold") + ", " + "borderStyle=" + super.getControlNodes().get("borderStyle") + ", " + "color=" + super.getControlNodes().get("color") + ", " + "hasHeader=" + super.getControlNodes().get("hasHeader") + ", " + "hLines=" + super.getControlNodes().get("hLines") + ", " + "italic=" + super.getControlNodes().get("italic") + ", " + "map=" + super.getControlNodes().get("map") + ", " + "selectedIndex=" + super.getControlNodes().get("selectedIndex") + ", " + "size=" + super.getControlNodes().get("size") + ", " + "text=" + super.getControlNodes().get("text") + ", " + "underline=" + super.getControlNodes().get("underline") + ", " + "value=" + super.getControlNodes().get("value") + ", " + "verticalScrollbar=" + super.getControlNodes().get("verticalScrollbar") + ", " + "vLines=" + super.getControlNodes().get("vLines") + "}";
    }
}