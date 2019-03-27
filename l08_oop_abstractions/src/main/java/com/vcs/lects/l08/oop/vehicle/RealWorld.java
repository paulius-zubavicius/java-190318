package com.vcs.lects.l08.oop.vehicle;

public class RealWorld {

	public static void main(String[] args) {

		
		TrPriemone[] judejimas = new TrPriemone[] {
				new MB(),
				new Audi(AudiVariklis.B_3_2),
				new Audi(AudiVariklis.D_1_9),
				new Valtis(2.0, 0.4),
				new Valtis(-2.0, 0.01),
				new Kateris()
		};

		for (int h = 1; h < 4; h++) {

			System.out.println("Po " + h + " h");

			for (TrPriemone trPriemone : judejimas) {
				System.out.println(trPriemone + " : " + trPriemone.iveiktasKelias(h));
			}

			System.out.println();

		}

	}

}
