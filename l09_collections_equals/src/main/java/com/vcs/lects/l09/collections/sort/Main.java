package com.vcs.lects.l09.collections.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Person> persons = new ArrayList<>();

		persons.add(new Person(22, "Siaudvytis"));
		persons.add(new Person(30, "Petrauskas"));
		persons.add(new Person(99, "Jonautis"));
		persons.add(new Person(40, "Žvinys"));
		persons.add(new Person(40, "žilinskiene"));
		persons.add(new Person(41, "Žukauskas"));
		persons.add(new Person(30, "Petravicius"));
		persons.add(new Person(30, "Pavardauskas"));

		System.out.println(Arrays.toString(persons.toArray()));

		Collections.sort(persons);

		System.out.println(Arrays.toString(persons.toArray()));

		Collections.sort(persons, new PersonComparator(true));
		
		System.out.println(Arrays.toString(persons.toArray()));
		
		
	}

}

class Person implements Comparable<Person> {
	private int age;
	private String surname;

	Person(int age, String surname) {
		this.age = age;
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public String toString() {
		return "" + age + " " + surname;
	}

	@Override
	public int compareTo(Person o) {
		// -1 : esamas objektas yra pirmesnis
		// 0 : abu vienodi
		// 1 : esamas objektas yra paskesnis

		if (o.age - age != 0) {
			return o.age - age;
		}
		// amzius yra vienodas, tada rupi pavarde

		return surname.toLowerCase().compareTo(o.surname.toLowerCase());
	}

}
