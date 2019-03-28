package com.vcs.lects.l09.collections.sort;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
	
	
	private int asc = 1;
	
	public PersonComparator(boolean asc) {
		this.asc = (asc ? 1 : -1);
	}
	

	@Override
	public int compare(Person o1, Person o2) {
		// -1 : esamas objektas yra pirmesnis
		// 0 : abu vienodi
		// 1 : esamas objektas yra paskesnis

		if (o1.getAge() - o2.getAge() != 0) {
			return (o1.getAge() - o2.getAge()) * asc;
		}
		// amzius yra vienodas, tada rupi pavarde

		return o1.getSurname().toLowerCase().compareTo(o2.getSurname().toLowerCase());
	}

}
