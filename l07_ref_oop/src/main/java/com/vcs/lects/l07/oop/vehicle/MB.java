package com.vcs.lects.l07.oop.vehicle;

public class MB extends Automobilis {

	public MB(CarColor color) {
		super(color, "????");
	}

	private boolean hidraulics = false;

	public boolean isHidraulics() {
		return hidraulics;
	}

	public void setHidraulics(boolean hidraulics) {
		this.hidraulics = hidraulics;
	}

}
