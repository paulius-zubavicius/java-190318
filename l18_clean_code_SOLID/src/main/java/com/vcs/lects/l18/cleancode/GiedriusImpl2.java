package com.vcs.lects.l18.cleancode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GiedriusImpl2 {

	public List<List<Mokinys>> getReordered(Map<String, List<Mokinys>> mokiniai) {

		Map<String, List<Mokinys>> listasPo = sukurtMap();

		sumetykIKrepselius(listasPo, mokiniai);
		
		return ismestiTuscius(listasPo);
		
	}

	private List<List<Mokinys>> ismestiTuscius(Map<String, List<Mokinys>> listasPo) {
		List<List<Mokinys>> result = new ArrayList<>();

		for (int j = 0; j <= 9; j++) {
			ismeskJeiTuscias(j, result, listasPo);
		}

		return result;
	}

	private void ismeskJeiTuscias(int krepselis, List<List<Mokinys>> result, Map<String, List<Mokinys>> listasPo) {
		if (!listasPo.get("" + krepselis).isEmpty())
			result.add(listasPo.get(("" + krepselis)));
	}

	private void sumetykIKrepselius(Map<String, List<Mokinys>> listasPo, Map<String, List<Mokinys>> mokiniai) {
		for (List<Mokinys> listOfMokiniai : mokiniai.values()) {
			for (Mokinys mokinys : listOfMokiniai) {

				double average = mokinys.getVidurkis();

				if (average >= 0 && average < 1) {
					listasPo.get("0").add(mokinys);
				} else if (average >= 1 && average < 2) {
					listasPo.get("1").add(mokinys);
				} else if (average >= 2 && average < 3) {
					listasPo.get("2").add(mokinys);
				} else if (average >= 3 && average < 4) {
					listasPo.get("3").add(mokinys);
				} else if (average >= 4 && average < 5) {
					listasPo.get("4").add(mokinys);
				} else if (average >= 5 && average < 6) {
					listasPo.get("5").add(mokinys);
				} else if (average >= 6 && average < 7) {
					listasPo.get("6").add(mokinys);
				} else if (average >= 7 && average < 8) {
					listasPo.get("7").add(mokinys);
				} else if (average >= 8 && average < 9) {
					listasPo.get("8").add(mokinys);
				} else if (average >= 9 && average <= 10) {
					listasPo.get("9").add(mokinys);
				}
			}
		}
		
	}

	private Map<String, List<Mokinys>> sukurtMap() {
		Map<String, List<Mokinys>> listasPo = new HashMap<>();
		listasPo.put("0", new ArrayList<>());
		listasPo.put("1", new ArrayList<>());
		listasPo.put("2", new ArrayList<>());
		listasPo.put("3", new ArrayList<>());
		listasPo.put("4", new ArrayList<>());
		listasPo.put("5", new ArrayList<>());
		listasPo.put("6", new ArrayList<>());
		listasPo.put("7", new ArrayList<>());
		listasPo.put("8", new ArrayList<>());
		listasPo.put("9", new ArrayList<>());
		return listasPo;
	}

}

class Mokinys {

	private String vardas;
	private double vidurkis;

	public Mokinys() {

	}

	public Mokinys(String vardas, double vidurkis) {
		this.vardas = vardas;
		this.vidurkis = vidurkis;
	}

	public String getVardas() {
		return vardas;
	}

	public void setVardas(String vardas) {
		this.vardas = vardas;
	}

	public double getVidurkis() {
		return vidurkis;
	}

	public void setVidurkis(double vidurkis) {
		this.vidurkis = vidurkis;
	}

}
