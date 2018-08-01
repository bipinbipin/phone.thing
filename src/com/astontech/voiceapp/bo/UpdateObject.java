/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.astontech.voiceapp.bo;

/**
 *
 * @author seannils1
 */
public class UpdateObject {
    private String sepID;
    private String newMask;

    public UpdateObject(){};
    
    /**
     * @return the sepID
     */
    public String getSepID() {
        return sepID;
    }

    /**
     * @param sepID the sepID to set
     */
    public void setSepID(String sepID) {
        this.sepID = sepID;
    }

    /**
     * @return the newMask
     */
    public String getNewMask() {
        return newMask;
    }

    /**
     * @param newMask the newMask to set
     */
    public void setNewMask(String newMask) {
        this.newMask = newMask;
    }
    
    
    
}
