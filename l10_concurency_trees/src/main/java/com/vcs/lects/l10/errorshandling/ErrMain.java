package com.vcs.lects.l10.errorshandling;

import java.util.Arrays;

public class ErrMain {

	public static void main(String[] args)  {

		Formule f = new Formule();

		
		double result = 0;
		//try {
		//	result = f.formule(0, 0, 0);
		//} catch (ArithmeticException e) {
		//	System.out.println("Sugadinti duomenys. " + e.toString());
		//}
		

		System.out.println("ToFile: " + result);
		
		System.out.println("DONE");
		
		
		StringParser p = new StringParser();
		
		try {
			int[] res = p.parseStr("3 5 8 0 1 f 5");
		} catch (NevalidusDuomenys e) {
			System.out.println("truputuka blogai, bet ... nieko tokio :)");
			System.out.println(Arrays.toString( e.getData())); 
		}
		
		

	}

}
