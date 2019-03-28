package com.vcs.lects.l09.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();

		list.add("1");
		list.add("11");
		list.add("3");
		//list.add(null);
		list.add("05");
		list.add("6");
		
		printValuesToconsole(list);
		
		Collections.sort(list);
		
		System.out.println();
		
		printValuesToconsole(list);
		
		//System.out.println( Collections.frequency(list, "1"));
	}
	
	private static void printValuesToconsole(List<String> list) {

		for (String string : list) {
			System.out.println(string);
		}
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}

		System.out.println();
	}

}
