/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vcs.lects.l12.patterns.factory.autofactory;

import com.vcs.lects.l12.patterns.factory.Automobilis;
import com.vcs.lects.l12.patterns.factory.VINGenerator;

/**
 *
 * @author owr
 */
public class AutoFactory {

    private static int autoCounter = 0;

    public static Automobilis createInstance() {
        return createInstance(null);
    }
    
    public static Automobilis createInstance(String autoDescription) {

        autoCounter++;

        if ("labai brangus".equalsIgnoreCase(autoDescription)) {
            return new AstonMartin("AM:" + VINGenerator.generate());
        }

        return new Ford("FORD:" + VINGenerator.generate());

    }

    public static int getAutosCounter() {
        return autoCounter;
    }

}
