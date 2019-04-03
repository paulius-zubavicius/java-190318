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
public class Main {

    public static void main(String[] args) {

        DuomenuIsvedimas di = new DuomenuIsvedimas();

        ILoggingListener log = new ILoggingListener() {
            @Override
            public void log(String txt) {
                System.out.println(txt);
            }
        };

        IOutputHandler out = new IOutputHandler() {
            @Override
            public void success(String data) {
                System.out.println(data);
            }

            @Override
            public void fail(String msg) {
                System.out.println("ERROR: " + msg);
            }

        };


        
        di.isvesti( (str) ->  System.out.println(str), out, null, "null", "", "empty line detected");
    }

}
