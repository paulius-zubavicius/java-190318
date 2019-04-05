package com.vcs.lects.l06.arrays_cycles.tasks;

public class SortTask {

	// Pradiniu duomenu pvz
	// "3242 43 22222 34 1111111 234 234"

	public static void main(String[] args) {
		SortTask st = new SortTask();

		int[] sortedInts = st.sort("3242 43 22222 34 1111111 234 234", false);

		for (int i : sortedInts) {
			System.out.print(i + ", ");
		}

	}

	public int[] sort(String strData, boolean asc) {

		int[] data = convertToIntArr(strData);

		sort(data, asc);
		// Arrays.sort(data); //<- Sita reiktu naudoti sortinimui :)
		// Collections.reverse(Arrays.asList(data)); <- apsukimas
		return data;
	}

	private void sort(int[] data, boolean asc) {

		for (int i = 0; i < data.length; i++) {
			int extIndex = findExtIndex(i, data, asc);
			swapElements(i, extIndex, data);
		}
	}

	private void swapElements(int i1, int i2, int[] data) {

		int tmp = data[i1];
		data[i1] = data[i2];
		data[i2] = tmp;
	}

	private int findExtIndex(int indexFrom, int[] data, boolean asc) {

		int extValue = data[indexFrom];
		int extIndex = indexFrom;

		for (int j = indexFrom; j < data.length; j++) {
			if (asc) {
				if (extValue > data[j]) {
					extValue = data[j];
					extIndex = j;
				}
			} else {
				if (extValue < data[j]) {
					extValue = data[j];
					extIndex = j;
				}
			}
		}

		return extIndex;
	}

	private int[] convertToIntArr(String strData) {

		String[] strs = strData.split(" ");

		int[] result = new int[strs.length];

		for (int i = 0; i < strs.length; i++) {
			result[i] = Integer.parseInt(strs[i]);
		}

		return result;
	}

}
