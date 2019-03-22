package com.vcs.lects.l06.arrays_cycles;

public class QuizMatrix {

	public static void main(String[] args) {

		QuizMatrix m = new QuizMatrix();

		int[][] prasmingas = { { 9 }, { 8736487 }, { 4, 77, 10 } };

		System.out.println(prasmingas[0][0]);
		System.out.println(prasmingas[2][2]);

		m.firstToLast(prasmingas);

		System.out.println(prasmingas[0][0]);
		System.out.println(prasmingas[2][2]);

	}

	public int getLast(int[][] data) {

		int firsLevelIndex = data.length - 1;
		int scndLevelIndex = data[firsLevelIndex].length - 1;

		return data[firsLevelIndex][scndLevelIndex];
	}

	public void firstToLast(int[][] data) {

		data[data.length - 1][data[data.length - 1].length - 1] = data[0][0];

	}

}
