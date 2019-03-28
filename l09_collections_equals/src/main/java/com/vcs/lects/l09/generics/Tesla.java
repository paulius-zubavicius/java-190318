package com.vcs.lects.l09.generics;

import com.vcs.lects.l09.generics.engines.Ev;

public class Tesla extends Automobilis<Ev> {

	public Tesla() {
		super(new Ev());
	}

}
