/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.wctc.gclark7.restaurantwebjsf.beans;

import java.io.Serializable;
import javax.inject.Named;

import javax.enterprise.context.SessionScoped;

/**
 *
 * @author greg clark <gclark7@my.wctc.edu>
 */
@Named(value = "indexBean")
@SessionScoped
public class IndexBean implements Serializable{
    String welcome="Welcome to the Restaurant Web JSF Style";
    /**
     * Creates a new instance of IndexBean
     */
    public IndexBean() {
    }

    public String getWelcome() {
        return welcome;
    }

    public void setWelcome(String welcome) {
        this.welcome = welcome;
    }
    
    
    
    
    
    
    
    
    
}
