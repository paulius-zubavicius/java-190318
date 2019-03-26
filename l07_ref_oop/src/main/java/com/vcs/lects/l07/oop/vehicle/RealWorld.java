package com.vcs.lects.l07.oop.vehicle;

public class RealWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TrPriemone masina = new TrPriemone();

		MB mb = new MB();
		Skoda skoda = new Skoda();
		Audi audi = new Audi();

		audi.setEngine("EV");
		audi.setColor("red");

		mb.setHidraulics(false);

//		Street street = new Street();

	}

}
