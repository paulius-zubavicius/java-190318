package com.vcs.lects.l05.ifs;

public class Main {
	
	
	
	void abc(boolean a ) {
		
		boolean b = false;
		boolean c = true;
		
		boolean rez = (b ^ c ? true : a) && a;
		
		String aaaa = ""+false;
		
		
		String rezStr = "" + (b ^ arSarunasUzduosKlausima(a,b) ? true : arSarunasUzduosKlausima(b,c));
		
		if (b ^ arSarunasUzduosKlausima(a,b)) {
			rezStr = "true";
		} else { 
			rezStr = "" + arSarunasUzduosKlausima(b,c);
		}
		
		
	}
	
	
	boolean arSarunasUzduosKlausima(boolean kylaKlausimas, boolean zinoAtsakyma) {
		
		
		return kylaKlausimas && !zinoAtsakyma;
	}
	
	
	

}
