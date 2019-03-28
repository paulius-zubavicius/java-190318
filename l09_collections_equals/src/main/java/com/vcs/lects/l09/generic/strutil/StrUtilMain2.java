package com.vcs.lects.l09.generic.strutil;

public class StrUtilMain2 {

	public static void main(String[] args) {

		System.out.println(StrUtil.toStr("abc", "aa"));

		System.out.println(StrUtil.toStr(" < ", ((o1, o2) -> Integer.parseInt(o1) - Integer.parseInt(o2)), ((o) -> o + "!"),
				"100", "10", "1", "-2", "0000", "099"));

		System.out.println(StrUtil.toStr(15, 9, 0));
		
		System.out.println(StrUtil.toStr(" , ", ((o1, o2) -> o1.getTema().compareTo(o2.getTema())),
				(o) -> "[" + o.getTema() + "]", new JavaPaskaitos("Interfeisai", 7), new JavaPaskaitos("Collection'ai", 8)));

	}

}
