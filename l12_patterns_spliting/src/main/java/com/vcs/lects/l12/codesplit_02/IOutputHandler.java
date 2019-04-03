/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vcs.lects.l12.codesplit_02;

/**
 *
 * @author owr
 */
public interface IOutputHandler {
   
//    void out(String txt, boolean valid);
    
    void success(String data);
    
    void fail(String msg);
    
}
