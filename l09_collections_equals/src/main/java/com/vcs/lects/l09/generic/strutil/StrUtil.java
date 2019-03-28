package com.vcs.lects.l09.generic.strutil;

import java.util.Arrays;

public class StrUtil {

	public static String toStr(String sep, ToStringConverter conv, Object... objs) {

		//Arrays.sort(objs);

		String result = "";
		for (Object obj : objs) {
			result += conv.convertToString(obj) + sep;
		}

		return result;
	}

}
