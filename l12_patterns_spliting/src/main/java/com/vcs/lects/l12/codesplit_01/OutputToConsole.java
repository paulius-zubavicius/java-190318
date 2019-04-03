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
public class OutputToConsole implements Output {
    
    
    @Override
    public void output(String txt) {
        
        System.out.println(txt);
        
        
    }
    
    
}
