package com.vcs.lects.l08.oop.vehicle;

import com.vcs.lects.l08.oop.vehicle.engines.E95;
import com.vcs.lects.l08.oop.vehicle.engines.Ev;
import com.vcs.lects.l08.oop.vehicle.engines.SuVarikliu;
import com.vcs.lects.l08.oop.vehicle.engines.TDI;
import com.vcs.lects.l08.oop.vehicle.engines.VidausDegimo;

public class RealWorld {

	public static void main(String[] args) {

		
		TrPriemone[] judejimas = new TrPriemone[] {
				new MB(new TDI()),
				new Kateris(new TDI()),
				new Audi(AudiVariklis.B_3_2),
				new Audi(AudiVariklis.D_1_9),
				new Valtis(2.0, 0.4),
				new Valtis(-2.0, 0.01),
				new Kateris(new E95()),
				new Kateris(new Ev()),
				new Tesla()
		};

		System.out.println("dabar pilam...");
		
		for (TrPriemone trPriemone : judejimas) {
			if (trPriemone instanceof SuVarikliu && ((SuVarikliu) trPriemone).getVariklis() instanceof VidausDegimo) {
				System.out.print(trPriemone + " : ");
				
				((VidausDegimo)((SuVarikliu) trPriemone).getVariklis()).bakoUzpylimas();
			}
		}
		System.out.println();
		System.out.println("O dabar kraunam...");
		
		for (TrPriemone trPriemone : judejimas) {
			if (trPriemone instanceof SuVarikliu) {
				SuVarikliu auto = (SuVarikliu) trPriemone;
				if (auto.getVariklis() instanceof Ev) {
					System.out.print(trPriemone + " : ");
					((Ev)auto.getVariklis()).ikrautiBaterija();
				}
			}
		}
		
		
		
		//pavaziuotiValandu(4, judejimas);
		
		

	}

	private static void pavaziuotiValandu(int hTotal,TrPriemone[] judejimas ) {
		for (int h = 1; h < hTotal; h++) {

			System.out.println("Po " + h + " h");

			for (TrPriemone trPriemone : judejimas) {
				System.out.println(trPriemone + " : " + trPriemone.iveiktasKelias(h));
			}

			System.out.println();

		}
		
	}

}
