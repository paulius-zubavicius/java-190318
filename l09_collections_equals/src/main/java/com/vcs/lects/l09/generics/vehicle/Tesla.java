package com.vcs.lects.l09.generics.vehicle;

import com.vcs.lects.l09.generics.vehicle.engines.Ev;

public class Tesla extends Automobilis<Ev> {

	public Tesla() {
		super(new Ev());
	}

}
