/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vcs.lects.l12.patterns.builder;

/**
 *
 * @author owr
 */
public class CalcUser {

    public static void main(String[] args) {

//        Calc calc = new Calc(1);
//
//        calc.dauginti(2);
//        calc.atimti(3);
//        calc.atimti(false);
//        calc.dalinti(2);
//        calc.prideti(3);
//
//        calc.spausdinkResult();

        new Calc(1).dauginti(2).atimti(null).prideti(Boolean.TRUE).spausdinkResult();

        // Calc panaudojimas kuris sukonstruotas su build design pattern
        // System.out.println("rez:" + );
    }

}
