/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vcs.lects.l12.codesplit_01;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author owr
 */
public class OutputToFile implements Output{

    private File f = new File("duomenys.dat");

    @Override
    public void output(String txt) {

        try {
            FileUtils.writeLines(f, new ArrayList<>(Arrays.asList(txt)), true);
            //
        } catch (IOException ex) {
            Logger.getLogger(OutputToFile.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
