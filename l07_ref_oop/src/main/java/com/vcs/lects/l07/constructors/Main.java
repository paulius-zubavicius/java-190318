package com.vcs.lects.l07.constructors;

public class Main {

	public static void main(String[] args) {
		
		
		Pirma p = new Pirma();
		p.suteiktiReiksme();
		p.suteiktiReiksme();
		p.papildytiReiksme();

		System.out.println(p.getStr());

		//
		(new Pirma()).suteiktiReiksme();
		(new Pirma()).suteiktiReiksme();
		(new Pirma()).papildytiReiksme();

		System.out.println((new Pirma()).getStr());

	}

}
