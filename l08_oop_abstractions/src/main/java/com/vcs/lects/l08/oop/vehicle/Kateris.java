package com.vcs.lects.l08.oop.vehicle;

import com.vcs.lects.l08.oop.vehicle.engines.SuVarikliu;
import com.vcs.lects.l08.oop.vehicle.engines.Variklis;
import com.vcs.lects.l08.oop.vehicle.engines.VidausDegimo;
import com.vcs.lects.l08.oop.vehicle.komplektacija.Radio;

public class Kateris extends VandensTransportas implements SuVarikliu, Radio  {

	private Variklis variklis;

	public Kateris(Variklis variklis) {
		this.variklis = variklis;
	}

	@Override
	public double iveiktasKelias(int h) {
		return 60.0 * h;
	}

	@Override
	public Variklis getVariklis() {
		return variklis;
	}

}
