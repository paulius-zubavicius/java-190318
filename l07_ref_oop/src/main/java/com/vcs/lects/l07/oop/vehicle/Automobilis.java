package com.vcs.lects.l07.oop.vehicle;

public class Automobilis extends TrPriemone {

	private String engine = "TDI";
	
	public void vaziuoti() {
		System.out.println("moving wrooom...");
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

}
