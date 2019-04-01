package com.vcs.lects.l10.errorshandling;

public class NevalidusDuomenys extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private int[] data;

	public NevalidusDuomenys(int[] data) {
		this.data = data;
	}

	public int[] getData() {
		return data;
	}

}
