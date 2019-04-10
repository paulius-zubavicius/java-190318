package com.vcs.lects.l06.arrays_cycles.tasks;

//FIXME
public class KaroliukaiImpl {

	public static final char EMPTY = ' ';

	public char[][] rotateClockwise(char[][] data, char emptyChar, int rotateCount) {

		for (int c = 0; c < rotateCount; c++) {
			doGravity(data);
			data = rotateOneTime(data);
		}

		return data;
	}

	private char[][] rotateOneTime(char[][] data) {

		char[][] rotated = new char[data[0].length][data.length];

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[0].length; j++) {

				rotated[j][data.length - i - 1] = data[i][j];

			}
		}

		return rotated;
	}

	private void doGravity(char[][] data) {

		int gapToFall = 0;

		for (int row = 0; row < data.length; row++) {

			gapToFall = howFarItShouldFall(data, row);

			if (gapToFall > 0) {
				letItFall(data, row, gapToFall);
			}

		}

	}

	private int howFarItShouldFall(char[][] data, int row) {

		char[] rowArr = data[row];
		int gapToFall = 0;
		for (int i = rowArr.length - 1; i > 0; i--) {

			if (rowArr[i] == EMPTY) {
				gapToFall++;
			} else {
				return gapToFall;
			}

		}

		return 0;
	}

	private void letItFall(char[][] data, int row, int gapToFall) {

		char[] rowArr = data[row];

		// Lets moving

		for (int i = rowArr.length - 1; i >= gapToFall; i--) {
			rowArr[i] = rowArr[i - gapToFall];
		}

		// Clean the beginning
		for (int i = 0; i < gapToFall; i++) {
			rowArr[i] = EMPTY;
		}

	}

}
