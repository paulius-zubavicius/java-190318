package com.vcs.lects.l03.java_types;

public class Converting {

	public static void main(String[] args) {

		long atstumas = 3423423476L;

		long milimetras = atstumas;
		long metras = milimetras * 1000;
		long kilometras = metras * 1000;
		long tukstKm = kilometras * 1000;

//		long tukstKm = atstumas * (1000L * 1000 * 1000);
//		long kilometras = atstumas * 1000 * 1000;
//		long metras = atstumas * 1000;
//		long milimetras = atstumas;

		System.out.println("" + tukstKm);
		System.out.println("" + kilometras);
		System.out.println("" + metras);
		System.out.println("" + milimetras);

		Converting c = new Converting();
		c.characters();
	}

	public void konversion() {

		int sk1 = 130;

		System.out.println("sk1: " + sk1);

		byte sk2 = (byte) sk1;

		System.out.println("sk2: " + sk2);

	}

	public void characters() {

		char sk;

		sk = 57; // kodas '9'

		sk = '8' + 1; // raidine reiksme

		System.out.println(" " + sk);

	}

	public double vidurkis(int suma, int kiekis) {
		return (1.0 * suma) / kiekis;
	}

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
