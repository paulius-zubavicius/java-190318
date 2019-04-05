package com.vcs.lects.l15.db.jpa;

import java.util.List;
import java.util.Random;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class PersonToDBWithJPA {

	public static void main(String[] args) {

		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("musu_kontekstas");
		PersonToDBWithJPA gen = new PersonToDBWithJPA();

		gen.generatePersonsDB(emFactory);

		List<Person> persons = gen.listPersons(emFactory);

		for (Person person : persons) {
			System.out.println(person.getName() + " " + person.getSurname() + " " + person.getId());
		}

		emFactory.close();

	}

	private void generatePersonsDB(EntityManagerFactory emFactory) {
		EntityManager em = emFactory.createEntityManager();

		em.getTransaction().begin();

		Random rnd = new Random();

		int rndBound = rnd.nextInt(10);

		Person p = null;
		for (int i = 0; i < rndBound; i++) {
			p = new Person();
			p.setName("Vardauskas " + rnd.nextInt());
			p.setSurname("Pavardauskas");
			em.persist(p);
		}

		em.getTransaction().commit();

		em.close();
	}

	private List<Person> listPersons(EntityManagerFactory emFactory) {
		EntityManager em = emFactory.createEntityManager();

		em.getTransaction().begin();

		TypedQuery<Person> result = em.createQuery("SELECT obj FROM Person obj", Person.class);

		List<Person> persons = result.getResultList();

		em.getTransaction().commit();

		em.close();

		return persons;
	}

}
