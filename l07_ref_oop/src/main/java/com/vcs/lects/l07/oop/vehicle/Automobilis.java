package com.vcs.lects.l07.oop.vehicle;

public class Automobilis extends TrPriemone {

	private String engine = "TDI";
	private String vin;

	public Automobilis(CarColor color, String vin) {
		super(color);
		this.vin = vin;
	}
	
	public final String kodasVIN() {
		return vin;
	}

	public void vaziuoti() {
		vaziuoti("moving wrooom...");
	}
	
	public void vaziuoti(int speed) {
		vaziuoti(speed + " km/h");
	}
	
	public void vaziuoti(String speed) {
		System.out.println( speed);
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

}
