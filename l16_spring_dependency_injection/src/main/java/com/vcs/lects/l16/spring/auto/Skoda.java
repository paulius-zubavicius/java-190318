package com.vcs.lects.l16.spring.auto;

import org.springframework.stereotype.Component;

@Component
public class Skoda implements Car {

	@Override
	public void vaziuoti() {
		System.out.println("drivel like shoda do... :)");
	}

}
