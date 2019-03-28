package com.vcs.lects.l08.oop.anonymous;

public class MainLiamda {

	public static void main(String[] args) {

		/**
		 * 
		 * Su interfeisu
		 * 
		 */
		Geometries g = new Geometries() {

			@Override
			public String write(int v) {
				return "staciakampis" + v;
			}
		};

//		spausdink(new Geometries() {
//
//			@Override
//			public String write() {
//				return "staciakampis";
//			}
//		});

		Geometries gl = (dddd) -> "linija" + dddd;

		// Metodo implementacija kaip parametras
		spausdink((a) -> {a+= 6; return "linija" + a;}, 15);

	}

	private static void spausdink(Geometries gl, int n) {

		System.out.println(gl.write(n));

	}
}
