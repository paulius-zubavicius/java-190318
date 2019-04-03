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
public class Main {

    public static void main(String[] args) {

        DuomenuIsvedimas di = new DuomenuIsvedimas();

        Output outType = OutputFactory.creteInstance((args.length == 0 ? null : args[0]));

        di.isvesti(outType, "abc", "43543", null, "null", "", "tuscias");

    }

}
