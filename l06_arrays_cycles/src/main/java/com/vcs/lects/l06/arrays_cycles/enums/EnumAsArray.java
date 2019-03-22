package com.vcs.lects.l06.arrays_cycles.enums;

public class EnumAsArray {

	// as array
	public static final String[] DID_MIESTAI = { "Vilnius", "Kaunas", "Klaipeda" };

	public static void main(String[] args) {
		EnumAsArray a = new EnumAsArray();
		a.name();
	}

	public void name() {

		// iterate all enum values
		for (String miestas : DID_MIESTAI) {
			System.out.println("Miestas    : " + miestas);
		}

		System.out.println();

		DidMiestai[] m = DidMiestai.values();

		// iterate all enum values
		for (DidMiestai miestas : m) {
			System.out.println("Miestas    : " + miestas);
		}

		DidMiestai[] miestai = DidMiestai.values();

	}

}

enum DidMiestai {
	Vilnius, Klaipeda, Kaunas
}

enum DidziausiKaimai {
	a, b, c
}
