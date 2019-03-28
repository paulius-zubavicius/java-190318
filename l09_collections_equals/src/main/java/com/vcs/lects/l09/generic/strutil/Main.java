package com.vcs.lects.l09.generic.strutil;

public class Main {

	public static void main(String[] args) {

		JavaPaskaitos[] paskaitos = { new JavaPaskaitos("Interfeisai", 7), new JavaPaskaitos("Collection'ai", 8) };

		ToStringConverter conv = new ToStringConverter() {
			public String convertToString(Object obj) {
				
				JavaPaskaitos jp = (JavaPaskaitos) obj;
				
				return ""+jp.getStudentuKiekis();
			}
		};
		
		
		String result = StrUtil.toStr(",", conv , paskaitos);

		System.out.println(result);

	}

}
