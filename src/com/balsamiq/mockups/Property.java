/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.balsamiq.mockups;

/**
 *
 * @author eanzaldua
 */
public class Property {
    Object propertyValue;
    
    public Property() {
        
    }

    public Property(String string) {
        propertyValue = checkType(string);
    }

    public Property(Integer i) {
        this.propertyValue = i;
    }

    public Property(Boolean bool) {
        this.propertyValue = bool;
    }

    public Property(String propertyValue, String propertyDefaultValue) {
        this.propertyValue = checkType(propertyValue);
    }

    public Object getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(String propertyValue) {
        this.propertyValue = checkType(propertyValue);
    }
    
    public Integer toInt(){
        return (Integer) propertyValue;
    }
    
    public Boolean toBoolean(){
        return (Boolean) propertyValue;
    }

    @Override
    public String toString() {
        return  propertyValue.toString();
    }

    private Object checkType(String string) {
        Object o;
        if (string.matches("^-{0,1}\\d+")){
            o = Integer.parseInt(string);
        } else if (string.matches("^([F|f]alse)|([T|t]rue)|TRUE|FALSE")){
            o = Boolean.parseBoolean(string);
        } else {
            o = string;
        }
        return o;
    }
    
    
    
}
