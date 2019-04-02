/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vcs.lects.l12.patterns.factory;

public abstract class Automobilis {

    private String vIN;

    
    public Automobilis(String vin) {
        this.vIN = vin;
    }

    public String getVIN() {
        return vIN;
    }

}
