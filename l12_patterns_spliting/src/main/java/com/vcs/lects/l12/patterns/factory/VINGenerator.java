/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vcs.lects.l12.patterns.factory;

import java.util.UUID;

/**
 *
 * @author owr
 */
public class VINGenerator {
    
    public static String generate() {
        return UUID.randomUUID().toString();
    }
    
}
