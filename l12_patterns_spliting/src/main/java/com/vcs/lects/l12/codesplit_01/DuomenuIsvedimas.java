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
public class DuomenuIsvedimas {

    public void isvesti(Output out, String... lines) {

        for (String line : lines) {
            if (line != null && !line.isEmpty()) {
                out.output(line);
            }
        }

    }

}
