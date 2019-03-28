package com.vcs.lects.l08.oop.vehicle;

import com.vcs.lects.l08.oop.vehicle.engines.SuVarikliu;
import com.vcs.lects.l08.oop.vehicle.engines.Variklis;

public abstract class Automobilis extends ToStringImpl implements SuVarikliu {

	private Variklis variklis;

	public Automobilis(Variklis variklis) {
		this.variklis = variklis;
	}

	@Override
	public Variklis getVariklis() {
		return variklis;
	}

	@Override
	public double iveiktasKelias(int h) {
		return 90.0 * h;
	}

}
