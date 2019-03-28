package com.vcs.lects.l08.oop.vehicle;

import com.vcs.lects.l08.oop.vehicle.engines.E95;
import com.vcs.lects.l08.oop.vehicle.komplektacija.Radio;

public class Audi extends Automobilis implements Radio {

	public Audi(AudiVariklis v) {
		super(new E95());
		variklis = v;
	}

	private AudiVariklis variklis;

	@Override
	public double iveiktasKelias(int h) {

		if (AudiVariklis.B_3_2.equals(variklis)) {
			return 1.7 * super.iveiktasKelias(h);
		}

		return super.iveiktasKelias(h);
	}

}

enum AudiVariklis {
	D_1_9, B_3_2
}
