package com.balsamiq.mockups;

/**
 * @author Edgar Anzaldúa Moreno
 * Follow me @edgarator
 * Created on Tue Apr 29 21:37:36 CST 2014
 */
public class Image extends UIElement{


    public Image() {
        super();
        super.getControlAttributes().get("controlTypeID").setPropertyValue("com.balsamiq.mockups::Image");         
        super.getControlNodes().put("bold", null);
        super.getControlNodes().put("borderStyle", null);
        super.getControlNodes().put("crop", null);
        super.getControlNodes().put("filter", null);
        super.getControlNodes().put("italic", null);
        super.getControlNodes().put("map", null);
        super.getControlNodes().put("rotation", null);
        super.getControlNodes().put("size", null);
        super.getControlNodes().put("src", null);
        super.getControlNodes().put("text", null);
        super.getControlNodes().put("underline", null);
        super.getControlNodes().put("href", null);
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

    public Property getCrop() {
        return super.getControlNodes().get("crop");
    }

    public void setCrop(String crop) {
        this.setPropertyNode("crop", crop);
    }

    public Property getFilter() {
        return super.getControlNodes().get("filter");
    }

    public void setFilter(String filter) {
        this.setPropertyNode("filter", filter);
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

    public Property getRotation() {
        return super.getControlNodes().get("rotation");
    }

    public void setRotation(String rotation) {
        this.setPropertyNode("rotation", rotation);
    }

    public Property getSize() {
        return super.getControlNodes().get("size");
    }

    public void setSize(String size) {
        this.setPropertyNode("size", size);
    }

    public Property getSrc() {
        return super.getControlNodes().get("src");
    }

    public void setSrc(String src) {
        this.setPropertyNode("src", src);
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

    public Property getHref() {
        return super.getControlNodes().get("href");
    }

    public void setHref(String href) {
        this.setPropertyNode("href", href);
    }

    @Override
    public String toString() {
        return super.toString() + "\nImage{" + "bold=" + super.getControlNodes().get("bold") + ", " + "borderStyle=" + super.getControlNodes().get("borderStyle") + ", " + "crop=" + super.getControlNodes().get("crop") + ", " + "filter=" + super.getControlNodes().get("filter") + ", " + "italic=" + super.getControlNodes().get("italic") + ", " + "map=" + super.getControlNodes().get("map") + ", " + "rotation=" + super.getControlNodes().get("rotation") + ", " + "size=" + super.getControlNodes().get("size") + ", " + "src=" + super.getControlNodes().get("src") + ", " + "text=" + super.getControlNodes().get("text") + ", " + "underline=" + super.getControlNodes().get("underline") + ", " + "href=" + super.getControlNodes().get("href") + "}";
    }
}