package com.vcs.lects.l08.oop.anonymous;

public abstract class Virsunes {

	public String figura() {

		switch (getVirsunes()) {
		case 1:
			return "taskas";
		case 2:
			return "linija";
		case 3:
			return "trikampis";
		case 4:
			return "kvadratas";

		default:
			return "daugiakampis";
		}

	}

	public abstract int getVirsunes();

}
