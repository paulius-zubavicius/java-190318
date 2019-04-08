package com.vcs.lects.l16.spring.tasks;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Yra kodo dublikatu. Perdarykite, kad ju neliktu
 * 
 * 
 */

public class ApskaitaTask {

	List<Cekis> cekiai = new ArrayList<>();

	public void pridetiCeki(Cekis cekis) {
		cekiai.add(cekis);
	}

	public double vidLitraiSimtui() {

		Cekis pirmasCekis = cekiai.get(0);// pirmas cekis

		Cekis paskutinisCekis = cekiai.get(cekiai.size() - 1);// paskutinis cekis

		int nuvaziuotasAtstumas = paskutinisCekis.getOdometroparodymai() - pirmasCekis.getOdometroparodymai();

		double litraiViso = 0;
		for (int i = 0; i < cekiai.size() - 1; i++) {

			litraiViso = litraiViso + cekiai.get(i).getKiekis();

		}

		double litraiSimtuiKm = litraiViso / nuvaziuotasAtstumas;

		return litraiSimtuiKm * 100.0;

	}

	public double vidKainaSimtui() {

		Cekis pirmasCekis = cekiai.get(0);

		Cekis paskutinisCekis = cekiai.get(cekiai.size() - 1);

		double nuvaziuotasAtstumas = paskutinisCekis.getOdometroparodymai() - pirmasCekis.getOdometroparodymai();

		double litraiViso = 0;
		for (int i = 0; i < cekiai.size() - 1; i++) {

			litraiViso = litraiViso + cekiai.get(i).getKiekis();
		}

		double vidLitroKaina = 0;
		for (int i = 0; i < cekiai.size() - 1; i++) {

			vidLitroKaina = cekiai.get(i).getKainaVnt() + vidLitroKaina;
		}

		double litraiSimtuiKm = litraiViso / nuvaziuotasAtstumas;

		double bendraLitroKaina = vidLitroKaina / (cekiai.size() - 1);
		double tikraKaina = bendraLitroKaina * vidLitraiSimtui();

		return tikraKaina;
	}

}
