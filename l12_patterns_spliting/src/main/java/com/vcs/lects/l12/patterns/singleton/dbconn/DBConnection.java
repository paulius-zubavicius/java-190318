/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vcs.lects.l12.patterns.singleton.dbconn;

public class DBConnection {

    private static int counter = 0;
    private static DBConnection conn = null;

    private DBConnection() {
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public static DBConnection getInstance() {

        if (conn == null) {
            conn = new DBConnection();
        }

        return conn;

    }

}
