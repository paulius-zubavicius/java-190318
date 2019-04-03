/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vcs.lects.l12.codesplit_01;

/**
 *
 * @author owr
 */
public class OutputFactory {

    public static Output creteInstance(String outType) {

        if ("file".equalsIgnoreCase(outType)) {
            return new OutputToFile();
        } else if ("console".equalsIgnoreCase(outType)) {
            return new OutputToConsole();
        }

        throw new RuntimeException("No case for: " + outType);
    }

}
