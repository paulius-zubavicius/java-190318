package com.vcs.lects.l16.spring.auto;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(Ford.FORD_NAME)
@Scope("prototype")
public class Ford implements Car {

	public static final String FORD_NAME = "fordukas";
	private static int counter = 0;
	
	//@Autowired
	//private Jonas jonas; // 

	public Ford() {
		System.out.println("ford construct: " + counter++);

	}

	@Override
	public void vaziuoti() {
		
		System.out.println("Wrooom wroom");
	}

}
