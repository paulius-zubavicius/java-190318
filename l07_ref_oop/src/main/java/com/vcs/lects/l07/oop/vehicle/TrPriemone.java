package com.vcs.lects.l07.oop.vehicle;

public class TrPriemone {

	private CarColor color;

	public TrPriemone(CarColor color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Klase: " + getClass().getSimpleName() + "; color: " + color + "; (" + super.toString() + ")";
	}

}

enum CarColor {
	SILVER, RED, BLACK, MASKUOJANTI, WHITE
}
