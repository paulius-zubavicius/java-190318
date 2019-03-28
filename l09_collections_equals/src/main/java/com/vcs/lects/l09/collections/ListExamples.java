package com.vcs.lects.l09.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExamples {

	public static void main(String[] args) {

		List<String> listAditional = new ArrayList<>();
		listAditional.add("gggg");
		listAditional.add("hhhh");

		List<String> list = new ArrayList<>();

		list.add("Pirmas");
		list.add("Antras");
		list.add("3");
		list.add("4");

		// Local klase :)
		class Person {

			String name;
			int age;

			public Person(String name, int age) {
				this.name = name;
				this.age = age;
			}

		};

		list.add("" + new Person("Algis", 3));

		printValuesToconsole(list);

		list.addAll(listAditional);

		list.set(2, "labas");
		list.add(2, "cccc");

		list.remove("Pirmas");
		list.remove(0);

		// list.clear();

		// Elementu kiekis
		list.size();

		int index = list.indexOf("gggg");

		printValuesToconsole(list);

		System.out.println("LAST: " + list.get(list.size() - 1));

		/**
		 * ==============================================
		 */

		list.clear();
		list.add("Pirmas");
		list.add("Antras");
		list.add("3");
		list.add("4");
		list.addAll(listAditional);
		list.remove(list.get(list.size() - 1)); // remove the last
		list.add("ABC");

		list.removeAll(listAditional);

		printValuesToconsole(list);

		if (list.contains("Pirmas")) {
			System.out.println("TRUE ");
		}
		
		/**
		 * ==============================================
		 */
		
		List<Person> persons = new ArrayList<>();
		
		persons.add(new Person("Petras", 13));
		persons.add(new Person("Ona", 31));

//		Person v = persons.get(0);
		System.out.println(persons.get(0).name + " " + persons.get(0).age);

	}

	private static void printValuesToconsole(List<String> list) {

//		for (String string : list) {
//			System.out.println(string);
//		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println();
	}

}
