package com.vcs.lects.l15.res.res_04_resourceBundle;

import java.util.Locale;

public class AppResourceBundle {

	public static void main(String[] args) {

		// en_EN ru_LT
		Locale lt = new Locale("lt", "LT");
		Locale in = new Locale("en", "IN");

		Locale en = new Locale("EN");
		Locale enCA = new Locale("en", "CA");

		MonthConverter mc = new MonthConverter();

		int monthAsInt = 5;

		String translated = mc.monthToString(monthAsInt, enCA);

		System.out.println("" + monthAsInt + " : " + translated);

	}

}
