package com.vcs.lects.l16.spring.auto;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Street {

	@Autowired
	private Jonas drv0;

	@Autowired
	private Ieva drv1;

	@Autowired
	@Qualifier(Ford.FORD_NAME)
	private Car fordukas;

	@Autowired
	public Street(String version) {
		System.out.println("Versija: " + version);
	}

	@PostConstruct
	public void kelioneIDarba() {

		drv0.getCar().vaziuoti();
		drv1.getCar().vaziuoti();

		fordukas.vaziuoti();

	}

}
