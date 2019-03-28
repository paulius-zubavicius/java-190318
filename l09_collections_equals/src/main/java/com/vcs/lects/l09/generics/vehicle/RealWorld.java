package com.vcs.lects.l09.generics.vehicle;

import com.vcs.lects.l09.generics.vehicle.engines.E95;
import com.vcs.lects.l09.generics.vehicle.engines.Ev;

public class RealWorld {

	public static void main(String[] args) {

		Automobilis<Ev> audi = new Audi<>(new Ev());
		Automobilis<Ev> tesla = new Tesla();

//		((E95) audi.getVariklis()).bakoUzpylimas();
//		((Ev)tesla.getVariklis()).ikrautiBaterija();

		//audi.getVariklis().bakoUzpylimas();
		//tesla.getVariklis().ikrautiBaterija();

		parkingasTtikEv(audi);
		parkingasTtikEv(tesla);

	}

	private static void parkingasTtikEv(Automobilis<? extends Ev> auto) {

		auto.getVariklis().ikrautiBaterija();
		
		System.out.println("Priparkuota: " + auto);
	}

}
