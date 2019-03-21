package com.vcs.lects.l03.java_types;

public class Main {

	public static void main(String[] args) {
		
//		Str str = new Str();
//		str.tekstuciukas();
		
		
		Modifiers mod1 = new Modifiers();
		mod1.pakeiskReiksme(3);
		
		System.out.println(mod1.skaiciusObj);
		System.out.println(mod1.skaicius);
		
		
		Modifiers mod2 = new Modifiers();
		mod2.pakeiskReiksme(4);
		
		System.out.println(mod2.skaiciusObj);
		System.out.println(mod2.skaicius);
		
		
		
	}
	

}
