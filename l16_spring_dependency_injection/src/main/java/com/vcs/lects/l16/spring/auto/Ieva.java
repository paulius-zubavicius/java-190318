package com.vcs.lects.l16.spring.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Ieva {

	@Autowired
//	@Qualifier("skoda")
	private RentCarService rentService;

	public Car getCar() {
		return rentService.getInstance();
	}

}
