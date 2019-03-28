package com.vcs.lects.l09.generic.strutil;

public class JavaPaskaitos {

	private String tema;
	private int studentuKiekis;

	public JavaPaskaitos(String tema, int studentuKiekis) {
		this.tema = tema;
		this.studentuKiekis = studentuKiekis;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public int getStudentuKiekis() {
		return studentuKiekis;
	}

	public void setStudentuKiekis(int studentuKiekis) {
		this.studentuKiekis = studentuKiekis;
	}

}
