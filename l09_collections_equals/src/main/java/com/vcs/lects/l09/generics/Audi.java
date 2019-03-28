package com.vcs.lects.l09.generics;

import com.vcs.lects.l09.generics.engines.E95;
import com.vcs.lects.l09.generics.engines.Variklis;

public class Audi<AV extends Variklis> extends Automobilis<AV> {

	public Audi(AV variklis) {
		super(variklis);
	}





}
