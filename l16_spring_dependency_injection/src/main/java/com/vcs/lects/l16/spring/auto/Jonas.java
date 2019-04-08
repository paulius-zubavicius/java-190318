package com.vcs.lects.l16.spring.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Jonas {

	@Autowired
	private Radio r;

	@Autowired
	private Ford ford;

	public Car getCar() {
		r.radijas();
		return ford;
	}

}
