package com.vcs.lects.l09.generics;

public abstract class ToStringImpl implements TrPriemone {

	

	@Override
	public String toString() {
		return getClass().getSimpleName();
	}

}
