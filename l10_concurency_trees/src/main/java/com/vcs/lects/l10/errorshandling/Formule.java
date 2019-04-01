package com.vcs.lects.l10.errorshandling;

public class Formule {

	public double formule(int a, int d, int n) {

		try {
			return skaitiklis(a, d, n) / daliklis(d, n);
		} catch (NullPointerException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();

			return 0;
		} finally {
			System.out.println("uzdarom kazkoki resursa");
		}
		System.out.println("baigiam darba");
		return 100;
	}

	private double skaitiklis(int a, int d, int n) {

//		String abc = null;
//		// if (d > 2) {
//		abc.length();
//		// }

		return a + d + n;
	}

	private double daliklis(int d, int n) throws Exception {

		if (n == 0) {
			throw new Exception("Linkejimai is dalybos");
		}

		return d / n;
	}

}
