package com.vcs.lects.l15.res.res_04_resourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class MonthConverter {

	private static final String BASE_NAME = "month";
	private static final String KEY_PREFIX = "m_";

	public String monthToString(int month) {
		return monthToString(month, Locale.getDefault());
	}

	public String monthToString(int month, Locale loc) {

		ResourceBundle rBundle = ResourceBundle.getBundle(BASE_NAME, loc);

		return rBundle.getString(KEY_PREFIX + month);
	}
}
