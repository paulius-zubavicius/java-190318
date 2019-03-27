package com.vcs.lects.l08.oop.vehicle;

public class Valtis extends VandensTransportas{

	
	private double vejoGreitisKmPerH = 0;
	private  double buresEfektas;
	
	/**
	 * @param vejoGreitisKmPerH - Minus - prideda; plius - letina
	 * @param buresEfektas - (0..1]
	 */
	public Valtis(double vejoGreitisKmPerH, double buresEfektas) {
		this.vejoGreitisKmPerH = vejoGreitisKmPerH;
		this.buresEfektas = buresEfektas;
		
	}
	
	public Valtis(double vejoGreitisKmPerH) {
		this(vejoGreitisKmPerH, 0.3);
	}
	
	
	@Override
	public double iveiktasKelias(int h) {
		return 5.0 * (1 - vejoGreitisKmPerH * buresEfektas) * h;
	}
	
}
