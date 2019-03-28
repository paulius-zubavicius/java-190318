package com.vcs.lects.l08.oop.anonymous;

public class MainImpl {

	public static void main(String[] args) {

		/**
		 * 
		 * Su interfeisu
		 * 
		 */
		Geometries g = new Geometries() {

			@Override
			public String write(int a) {
				return "staciakampis";
			}
		};

		/**
		 * Su abstrakcia
		 */
		Virsunes v = new Virsunes() {

			@Override
			public int getVirsunes() {
				return 3;
			}
		};

		System.out.println(v.figura());

		/**
		 * Su konkrecia klase
		 */

		Linija l0 = new Linija();

		Linija l1 = new Linija() {
		}; // nieko nekeicia

		Linija l2 = new Linija() {

			@Override
			public String tipas() {
				return "apskritimas";
			}

		};

		System.out.println(l0.tipas());
		System.out.println(l1.tipas());
		System.out.println(l2.tipas());

	}

}
