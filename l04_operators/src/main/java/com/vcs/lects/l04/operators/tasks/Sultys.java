package com.vcs.lects.l04.operators.tasks;

public class Sultys {

	// Easy one

	public boolean arNeraLikucio(int sulciuKiekisViso, int talposTuris) {
		return sulciuKiekisViso % talposTuris == 0;
	}

	// Tricky one (no IFs !!!)

	public boolean arNeraLikucio(int sulciuKiekisViso, int talposTuris, boolean reikalingasTikLyginis) {

		boolean arNeraLikucio = sulciuKiekisViso % talposTuris == 0;
		boolean arLyginis = ((double) sulciuKiekisViso / talposTuris) % 2 == 0;

		return arNeraLikucio && (!reikalingasTikLyginis || arLyginis);
	}

	public boolean arNeraLikucioIeva(int sulciuKiekisViso, int talposTuris, boolean reikalingasTikLyginis) {

		boolean likucioNera = sulciuKiekisViso % talposTuris == 0;
		boolean stikliniuSkaiciusLyginis = ((double) sulciuKiekisViso / talposTuris) % 2 == 0;

		return (likucioNera && reikalingasTikLyginis && stikliniuSkaiciusLyginis)
				|| (likucioNera && !reikalingasTikLyginis);

	}

}
