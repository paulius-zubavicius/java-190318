package com.vcs.lects.l06.arrays_cycles.cycles;

public class Ciklai {

	public static void main(String[] args) {

		int a = 0;

		for (int b = 0; b < 3; b++) {

			int c = 0;

			System.out.println("a" + a++);
			System.out.println("b" + b++);
			System.out.println("c" + c++);
		}

		Ciklai c = new Ciklai();
		c.name();

//		while (true) {
//
//		}
		
		
		for (;;) {
			System.out.println("DONE");
		}

		//System.out.println("DONE");

	}

	public void name() {

		String[] vardai = { "Justina", "Andrius", "Mindaugas", "Arminas", "Martynas", "Tomas" };

		// Spausdins visus vardus is eiles

		for (int i = 0; i < vardai.length; i++) {
			System.out.println("Vardas    : " + vardai[i]);
		}

		System.out.println();

		for (int i = vardai.length - 1; i >= 0; i--) {
			System.out.println("Vardas    : " + vardai[i]);
		}

		System.out.println();

		for (int i = 0; i < vardai.length; i++) {
			System.out.println("Vardas    : " + vardai[vardai.length - i - 1]);
		}

	}

}
