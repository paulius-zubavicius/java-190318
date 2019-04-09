package com.vcs.lects.l17.springboot;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class ManoController {

	@Autowired
	private HttpServletRequest request;

	@GetMapping("hello/{vardas}")
	public String sayHello(@PathVariable("vardas") String name) {
		return "<html><body><h1>Labas " + name + ", as REST servisas (" + request.getRemoteHost()
				+ ")</h1></body></html>";
	}

	@GetMapping("")
	public HelloMsg sayHrelloAsMsg() {
		return new HelloMsg("Labas as kebabas", Severity.INFO);
	}

	@PostMapping("person")
	public HelloMsg pridetiPersona(@RequestBody Person person) {

		if (person.getAge() < 40 && person.isStudent()) {
			return new HelloMsg("Studentas yra jaunas", Severity.INFO);
		}

		return new HelloMsg("Mokytis yra visada gerai :), Taigi," + person.getName() + " - mokykis", Severity.WARNING);
	}

}

class Person {

	private String name;
	private int age;
	private boolean student;

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

	public boolean isStudent() {
		return student;
	}

	public void setStudent(boolean student) {
		this.student = student;
	}

}
