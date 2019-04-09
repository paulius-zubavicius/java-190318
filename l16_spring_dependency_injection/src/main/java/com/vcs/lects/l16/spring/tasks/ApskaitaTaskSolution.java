package com.vcs.lects.l16.spring.tasks;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Yra kodo dublikatu. Perdarykite, kad ju neliktu
 * 
 * 
 */

public class ApskaitaTaskSolution {

	List<Cekis> cekiai = new ArrayList<>();

	public void pridetiCeki(Cekis cekis) {
		cekiai.add(cekis);
	}

	// TODO iskelti su liamda
	public double vidLitraiSimtui() {

		double litraiViso = 0;
		for (int i = 0; i < cekiai.size() - 1; i++) {
			litraiViso = litraiViso + cekiai.get(i).getKiekis();
		}

		return (litraiViso / odometroParodymai()) * 100.0;

	}

	// TODO iskelti su liamda
	public double vidKainaSimtui() {

		double isleistaSuma = 0;
		for (int i = 0; i < cekiai.size() - 1; i++) {
			isleistaSuma = cekiai.get(i).getKainaVnt() * cekiai.get(i).getKiekis() + isleistaSuma;

		}
		return (isleistaSuma / odometroParodymai()) * 100.0;

	}

	private int odometroParodymai() {
		Cekis pirmasCekis = cekiai.get(0);// pirmas cekis
		Cekis paskutinisCekis = cekiai.get(cekiai.size() - 1);// paskutinis cekis
		return paskutinisCekis.getOdometroparodymai() - pirmasCekis.getOdometroparodymai();

	}

}
