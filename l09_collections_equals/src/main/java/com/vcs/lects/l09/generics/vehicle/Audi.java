package com.vcs.lects.l09.generics.vehicle;

import com.vcs.lects.l09.generics.vehicle.engines.E95;
import com.vcs.lects.l09.generics.vehicle.engines.Variklis;

public class Audi<AV extends Variklis> extends Automobilis<AV> {

	public Audi(AV variklis) {
		super(variklis);
	}





}
