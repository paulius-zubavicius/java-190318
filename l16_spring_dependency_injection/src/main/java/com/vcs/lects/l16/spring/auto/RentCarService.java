package com.vcs.lects.l16.spring.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RentCarService {

	@Autowired
	private Skoda sk;

	@Autowired
	private Ford fr;

//	@Autowired
//	private boolean continent;
	
	@Value("${continent:eu}")
	private String continent;

	public Car getInstance() {

		if ("eu".equalsIgnoreCase(continent)) {
			return sk;
		}

		return fr;
	}

}
