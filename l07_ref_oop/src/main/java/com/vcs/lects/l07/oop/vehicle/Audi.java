package com.vcs.lects.l07.oop.vehicle;

public class Audi extends Automobilis {

	public Audi(String pVIN) {
		super(CarColor.SILVER, pVIN);
	}
	
	
	public String getKodasVIN() {
		return "GGGGGGGGGGG";
	}

	@Override
	public void vaziuoti() {
		System.out.println("audi chiaudi, bet vaziuoja :D");
	}
}
