package com.vcs.lects.l16.spring.tasks;

public class Cekis {

	private String data;
	private DegaluRusis degalurusis;
	private double kainaVnt;
	private double kiekis;
	private int odometroparodymai;

	public Cekis(DegaluRusis degalurusis, double kainaVnt, double kiekis, int odometroparodymai) {
		this.degalurusis = degalurusis;
		this.kainaVnt = kainaVnt;
		this.kiekis = kiekis;
		this.odometroparodymai = odometroparodymai;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public DegaluRusis getDegalurusis() {
		return degalurusis;
	}

	public void setDegalurusis(DegaluRusis degalurusis) {
		this.degalurusis = degalurusis;
	}

	public double getKainaVnt() {
		return kainaVnt;
	}

	public void setKainaVnt(double kainaVnt) {
		this.kainaVnt = kainaVnt;
	}

	public double getKiekis() {
		return kiekis;
	}

	public void setKiekis(double kiekis) {
		this.kiekis = kiekis;
	}

	public int getOdometroparodymai() {
		return odometroparodymai;
	}

	public void setOdometroparodymai(int odometroparodymai) {
		this.odometroparodymai = odometroparodymai;
	}
}

enum DegaluRusis {

	D, E95, E98, LPG;

}
