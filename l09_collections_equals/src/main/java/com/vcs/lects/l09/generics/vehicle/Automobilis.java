package com.vcs.lects.l09.generics.vehicle;

import com.vcs.lects.l09.generics.vehicle.engines.Variklis;

public abstract class Automobilis<V extends Variklis> extends ToStringImpl  {

	private V variklis;

	public Automobilis(V variklis) {
		this.variklis = variklis;
	}

	public V getVariklis() {
		return variklis;
	}

	@Override
	public double iveiktasKelias(int h) {
		return 90.0 * h;
	}

}
