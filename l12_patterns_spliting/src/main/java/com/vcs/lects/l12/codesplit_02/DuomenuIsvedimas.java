/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vcs.lects.l12.codesplit_02;

import com.vcs.lects.l12.codesplit_01.Output;

/**
 *
 * @author owr
 */
public class DuomenuIsvedimas {

    public void isvesti(ILoggingListener log, IOutputHandler out, String... lines) {

        log.log("isvesti() begin");

        for (String line : lines) {
            if (line != null && !line.isEmpty()) {
                out.success(line);
            } else {
                out.fail("empty line detected");
            }
        }

        log.log("isvesti() end");
    }
    
    //TODO iskelti i viena
     public void isvestiNotNull(ILoggingListener log, IOutputHandler out, String... lines) {

        log.log("isvesti() begin");

        for (String line : lines) {
            if (line != null) {
                out.success(line);
            } else {
                out.fail("empty line detected");
            }
        }

        log.log("isvesti() end");
    }
}
