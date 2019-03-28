package com.vcs.lects.l08.oop.vehicle;

import com.vcs.lects.l08.oop.vehicle.engines.Ev;

public class Tesla extends Automobilis {

	public Tesla() {
		super(new Ev());
	}

}
