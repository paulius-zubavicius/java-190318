package com.vcs.lects.l08.oop.vehicle;

public class Audi extends Automobilis {

	private AudiVariklis variklis;

	public Audi(AudiVariklis v) {
		variklis = v;
	}

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
