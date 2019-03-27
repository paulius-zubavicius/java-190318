package com.vcs.lects.l08.oop.vehicle;

public abstract class ToStringImpl implements TrPriemone {

	

	@Override
	public String toString() {
		return getClass().getSimpleName();
	}

}
