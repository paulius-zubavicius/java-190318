package com.vcs.lects.l09.generic.strutil;

import java.util.Comparator;

public class JavaPaskaitosComparator implements Comparator<JavaPaskaitos>{

	@Override
	public int compare(JavaPaskaitos o1, JavaPaskaitos o2) {
		
		return o1.getTema().compareTo(o2.getTema());
	}

}
