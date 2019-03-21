package com.vcs.lects.l03.java_types;

public class Modifiers {
	
	
	public static final double PI_CONST = 3.14;

	//private final Integer abc = 6;
	
	public static int skaicius = 100;
	public int skaiciusObj = 100;
	
	public void pakeiskReiksme (int aaa) {
		

		skaicius =  skaicius  + aaa;
		skaiciusObj = skaiciusObj + aaa;
		
//		abc = 4; // compilation error
		
		
	}

}
