/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.balsamiq.mockups;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author eanzaldua
 */
public class Mockup {

    private HashMap<Integer, UIElement> UIElements;
    private HashMap<String, Property> documentAttributes;
    private DOMSource bmml;
    private int controlIDCounter;

    public Mockup() {
        this.controlIDCounter = 0;
        UIElements = new HashMap<>();
        documentAttributes = new HashMap<>();
        documentAttributes.put("version", new Property("1.0"));
        documentAttributes.put("skin", new Property("sketch"));
        documentAttributes.put("fontFace", new Property("Balsamiq Sans"));
        documentAttributes.put("measuredW", null);
        documentAttributes.put("measuredH", null);
        documentAttributes.put("mockupW", null);
        documentAttributes.put("mockupH", null);
    }

    public Property getVersion() {
        return documentAttributes.get("version");
    }

    public void setVersion(String version) {
        Property documentAttribute;
        if (documentAttributes.containsKey("version")) {
            documentAttribute = documentAttributes.get("version");
            documentAttribute.setPropertyValue(version);
        } else {
            documentAttribute = new Property(version);
        }
        documentAttributes.put("version", documentAttribute);
    }

    public Property getSkin() {
        return documentAttributes.get("skin");
    }

    public void setSkin(String skin) {
        Property documentAttribute;
        if (documentAttributes.containsKey("skin")) {
            documentAttribute = documentAttributes.get("skin");
            documentAttribute.setPropertyValue(skin);
        } else {
            documentAttribute = new Property(skin);
        }
        documentAttributes.put("skin", documentAttribute);
    }

    public Property getFontFace() {
        return documentAttributes.get("fontFace");
    }

    public void setFontFace(String fontFace) {
        Property documentAttribute;
        if (documentAttributes.containsKey("fontFace")) {
            documentAttribute = documentAttributes.get("fontFace");
            documentAttribute.setPropertyValue(fontFace);
        } else {
            documentAttribute = new Property(fontFace);
        }
        documentAttributes.put("fontFace", documentAttribute);
    }

    public void addUIElementToCanvas(UIElement el) {
        el.setZOrder("" + UIElements.size());
        el.setControlID("" + controlIDCounter);
        UIElements.put(controlIDCounter++, el);
    }

    public void toBMML(String file) throws ParserConfigurationException, TransformerConfigurationException, TransformerException {
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

        Document doc = docBuilder.newDocument();
        Element mockup = doc.createElement("mockup");
        doc.appendChild(mockup);

        for (Map.Entry<String, Property> entry : documentAttributes.entrySet()) {
            if (entry.getValue() != null) {
                Attr a = doc.createAttribute(entry.getKey());
                a.setValue(entry.getValue().toString());
                mockup.setAttributeNode(a);
            }
        }

        Element controls = doc.createElement("controls");
        mockup.appendChild(controls);

        for (Map.Entry<Integer, UIElement> entry : UIElements.entrySet()) {
            Element control = doc.createElement("control");
            
            for (Map.Entry<String, Property> attribute : entry.getValue().getControlAttributes().entrySet()) {
                if (attribute.getValue() != null) {
                    Attr a = doc.createAttribute(attribute.getKey());
                    a.setValue(attribute.getValue().toString());
                    control.setAttributeNode(a);
                }
            }
            
            if (!entry.getValue().getControlTypeID().getPropertyValue().equals("__group__")) {
                Element controlProperties = doc.createElement("controlProperties");
                for (Map.Entry<String, Property> node : entry.getValue().getControlNodes().entrySet()) {
                    if (node.getValue() != null) {
                        Element el = doc.createElement(node.getKey());
                        el.appendChild(doc.createTextNode(node.getValue().toString()));
                        controlProperties.appendChild(el);
                    }
                }
                
                control.appendChild(controlProperties);
                controls.appendChild(control);
                
            } else if (entry.getValue().getControlTypeID().getPropertyValue().equals("__group__")) {
                for (Map.Entry<Integer, UIElement> groupedElement : ((__group__) entry.getValue()).getUIElements().entrySet()) {
                    System.out.println(groupedElement.getValue().toString());
                    //TODO: Add logic here to get recursive children.
                }
                
            }

        }

        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File(file));

        transformer.transform(source, result);
    }

    public int getControlIDCounter() {
        return controlIDCounter;
    }

    public void setControlIDCounter(int controlIDCounter) {
        this.controlIDCounter = controlIDCounter;
    }

    public HashMap<Integer, UIElement> getUIElements() {
        return UIElements;
    }

}
