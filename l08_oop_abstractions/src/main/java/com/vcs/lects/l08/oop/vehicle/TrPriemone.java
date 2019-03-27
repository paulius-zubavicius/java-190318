package com.vcs.lects.l08.oop.vehicle;

public abstract class TrPriemone {

	/**
	 * @param h
	 * @return kilometrus iveiktus per h laika
	 */
	public abstract double iveiktasKelias(int h);

	@Override
	public String toString() {
		return getClass().getSimpleName();
	}

}
