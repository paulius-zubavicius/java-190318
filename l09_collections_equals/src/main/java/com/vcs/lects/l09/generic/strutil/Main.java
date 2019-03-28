package com.vcs.lects.l09.generic.strutil;

import java.util.Comparator;

public class Main {

	public static void main(String[] args) {

		JavaPaskaitos[] paskaitos = { new JavaPaskaitos("Interfeisai", 7), new JavaPaskaitos("Collection'ai", 8) };

		ToStringConverter<JavaPaskaitos> conv = new ToStringConverter<JavaPaskaitos>() {

			public String convertToString(JavaPaskaitos obj) {
				return "" + obj.getTema();
			}
		};
		
		
		JavaPaskaitosComparator comp = new JavaPaskaitosComparator();
		System.out.println( StrUtil.toStr(",", conv, comp, paskaitos));
		
		
		
		String[] skaiciukai = {"100","10","1", "-2", "0000","099"};
		

		Comparator<String> skaicComparator = new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				
				int s1 = Integer.parseInt(o1);
				int s2 = Integer.parseInt(o2);
				
				return s1 - s2;
			}
		};
		
		System.out.println(StrUtil.toStr(" < ", new ToStringConverter<String>(), skaicComparator, skaiciukai));
		

	}

}
