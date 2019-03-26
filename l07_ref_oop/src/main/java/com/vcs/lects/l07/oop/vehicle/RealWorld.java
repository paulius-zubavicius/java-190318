package com.vcs.lects.l07.oop.vehicle;

public class RealWorld {

	private TrPriemone[] parking = new TrPriemone[5];
	private int parkingInc = 0;

//	private VandensTransportas[] dokas = new VandensTransportas[5];
//	private int dokasInc = 0;

	
	public static void main(String[] args) {

		TrPriemone masina = new TrPriemone(CarColor.MASKUOJANTI);
		
		
		
		System.out.println(masina);
		masina.toString();

		Automobilis mb = new MB(CarColor.BLACK);
		Automobilis skoda = new Skoda(CarColor.RED);
		Automobilis audi = new Audi("DSF4567645");
		
		System.out.println( audi.kodasVIN());
		
//		audi.setEngine("EV");
//		audi.setColor("red");
		
		System.out.println(mb);
		System.out.println(skoda);
		System.out.println(audi);
		
		System.out.println();



//		mb.setHidraulics(false);

		VandensTransportas zvejybai = new Valtis();
		Kateris pramogai = new Kateris();

		RealWorld rw = new RealWorld();

//		rw.parkuotiAuto(skoda);
//		rw.parkuotiAuto(audi);
//
//		rw.svartuoti(pramogai);

		rw.parkuoti(pramogai);
		rw.parkuoti(mb);
		rw.parkuoti(audi);
		rw.parkuoti(new MB(CarColor.RED));
		rw.parkuoti(zvejybai);

		System.out.println("Auto priparkuota: " + rw.kiekAuto());

		rw.isvaziuotiIsParkino();

		System.out.println("Auto priparkuota: " + rw.kiekAuto());

	}

	public void parkuoti(TrPriemone trpr) {
		parking[parkingInc++] = trpr;
	}

	public void isvaziuotiIsParkino() {

		for (int i = 0; i < parking.length; i++) {
			TrPriemone trPriemone = parking[i];
			if (trPriemone instanceof Automobilis) {
				((Automobilis) trPriemone).vaziuoti(100);
				parking[i] = null;

			}
		}

	}

	public int kiekAuto() {

		int c = 0;

		for (TrPriemone trPriemone : parking) {
			if (trPriemone instanceof Automobilis) {
				c++;
			}
		}

		return c;

	}

//	public void parkuoti(TrPriemone trpr) {
//	if (trpr instanceof Automobilis) {
//		parking[parkingInc++] = (Automobilis) trpr;
//		return;
//	}
//
//	if (trpr instanceof VandensTransportas) {
//		dokas[dokasInc++] = (VandensTransportas) trpr;
//		return;
//	}
//
//	System.out.println("Tokiu neparkuojam :( ..." + trpr);
//
//}
}
