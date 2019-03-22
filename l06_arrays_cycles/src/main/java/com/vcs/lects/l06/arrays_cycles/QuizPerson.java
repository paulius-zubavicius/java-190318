package com.vcs.lects.l06.arrays_cycles;

public class QuizPerson {

	public static void main(String[] args) {

		int[] prasmingas = { 9, 8736487, 4 };
		System.out.println(prasmingas);

		System.out.println(prasmingas[0]); // 9
		
		System.out.println(prasmingas[1]); // 8736487
		
		System.out.println(prasmingas[2]); // 4
		
		System.out.println(prasmingas[3]); // OutOfBound Sveikinimai :)
	}

	public Person findLast(Person[] persons) {

		int lastIndex = persons.length - 1;

		return persons[lastIndex];
	}

	public Person findLastSafe(Person[] persons) {

		if (persons != null && persons.length > 0) {
			return persons[persons.length - 1];
		}

		return null;
	}

}

class Person {
}