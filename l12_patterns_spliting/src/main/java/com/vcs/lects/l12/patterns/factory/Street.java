/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vcs.lects.l12.patterns.factory;

import com.vcs.lects.l12.patterns.factory.autofactory.AstonMartin;
import com.vcs.lects.l12.patterns.factory.autofactory.AutoFactory;
import com.vcs.lects.l12.patterns.factory.autofactory.Ford;

/**
 *
 * @author owr
 */
public class Street {

    public static void main(String[] args) {

        Automobilis auto = AutoFactory.createInstance();
        Automobilis auto1 = AutoFactory.createInstance();

        Automobilis auto2 = AutoFactory.createInstance("LABAI brangus");

        System.out.println("0: " + auto.getVIN());
        System.out.println("1: " + auto1.getVIN());
        System.out.println("2: " + auto2.getVIN());

        AutoFactory.createInstance();
        AutoFactory.createInstance();
        AutoFactory.createInstance();

        System.out.println("viso buvo sukurta: " + AutoFactory.getAutosCounter());

        /*
        0: FORD:ab29df97-ace5-4393-a36c-31fa2d23405f
        1: FORD:62b7a94c-895f-4a78-ae2c-bbd1c0fe0ade
        2: AM:7eccc1e8-1797-4523-aaa5-c5e6a2cc1489
        viso buvo sukurta: 6
        
         */
    }
}
