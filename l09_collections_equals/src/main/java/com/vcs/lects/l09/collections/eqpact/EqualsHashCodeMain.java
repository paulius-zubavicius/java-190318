package com.vcs.lects.l09.collections.eqpact;

import java.util.HashMap;
import java.util.Map;

public class EqualsHashCodeMain {

	public static void main(String[] args) {

		Map<Person, Integer> persons = new HashMap<>();

		persons.put(new Person("Petras", 56), 2);
		Person p = new Person("Petras", 56);
		persons.put(p, 5);
		persons.put(new Person("PETRAS", 56), 8);
		persons.put(new Person("Alius", 56), 1);
		persons.put(new Person("Petras", 0), 13);

		System.out.println("Kiekis: " + persons.size());

		if (persons.containsKey(new Person("pETRAS", 56))) {
			System.out.println("radau " + persons.get(p));
		} else {
			System.out.println("neradau");
		}

		if (persons.containsKey(p)) {
			System.out.println("Pagal referenc'a radau");
		}

	}

}

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

// setters & getters below
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		return ((name == null ? "" : name.toLowerCase()) + age).hashCode();
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == null) {
			return false;
		}

		if (obj instanceof Person) {
			Person person = (Person) obj;

			String persNameNotCaseSensitive = "";
			if (person.name == null) {
				persNameNotCaseSensitive = "";
			} else {
				persNameNotCaseSensitive = person.name.toLowerCase();
			}

			boolean nameEq = persNameNotCaseSensitive.equals(name == null ? "" : name.toLowerCase());
			boolean ageEq = person.age == age;
			return nameEq && ageEq;
		}

		return false;
	}

}
