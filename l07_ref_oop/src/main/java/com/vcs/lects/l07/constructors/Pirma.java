package com.vcs.lects.l07.constructors;

public class Pirma {

	private String str = "";

	public Pirma() {
		str = "reiksme";
	}

	public void suteiktiReiksme() {
		str = " aaaa";
	}

	public void papildytiReiksme() {
		str += " ???";
	}
	
	
	public String getStr() {
		return str;
	}

}
