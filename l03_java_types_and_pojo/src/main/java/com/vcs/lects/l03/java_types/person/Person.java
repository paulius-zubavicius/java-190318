package com.vcs.lects.l03.java_types.person;

public class Person {

	// Asmens ID bet kokioje sistemoje
	private String id;

	// Vardas
	private String vardas;

	// Pavardė
	private String pavarde;

	// Asmens kodas
	private String ak;

	// Gimimo metai
	private Integer metai;

	// Lytis
	private Lytis lytis;
	
	private Pilietybe pilietybe;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getVardas() {
		return vardas;
	}

	public void setVardas(String vardas) {
		this.vardas = vardas;
	}

	public String getPavarde() {
		return pavarde;
	}

	public void setPavarde(String pavarde) {
		this.pavarde = pavarde;
	}

	public String getAk() {
		return ak;
	}

	public void setAk(String ak) {
		this.ak = ak;
	}

	public Integer getMetai() {
		return metai;
	}

	public void setMetai(Integer metai) {
		this.metai = metai;
	}

	public Lytis getLytis() {
		return lytis;
	}

	public void setLytis(Lytis lytis) {
		this.lytis = lytis;
	}

}
