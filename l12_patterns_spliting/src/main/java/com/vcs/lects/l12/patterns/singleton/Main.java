/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vcs.lects.l12.patterns.singleton;

import com.vcs.lects.l12.patterns.singleton.dbconn.DBConnFactory;
import com.vcs.lects.l12.patterns.singleton.dbconn.DBConnection;

/**
 *
 * @author owr
 */
public class Main {

    public static void main(String[] args) {

        DBConnFactory.getInstance();
        
        

        DBConnFactory.getInstance();
        DBConnFactory.getInstance();
        DBConnFactory.getInstance();
        DBConnFactory.getInstance();
        DBConnFactory.getInstance();
        DBConnFactory.getInstance();

        bileKoksMetodas();

        //connections:9
        System.out.println("connections:" + DBConnection.getCounter());

    }

    private static void bileKoksMetodas() {
        DBConnFactory.getInstance();
        DBConnFactory.getInstance();
    }

}
