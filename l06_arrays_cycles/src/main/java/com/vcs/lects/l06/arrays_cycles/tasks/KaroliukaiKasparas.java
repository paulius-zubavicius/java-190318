package com.vcs.lects.l06.arrays_cycles.tasks;

import java.util.Arrays;

public class KaroliukaiKasparas {

	public char[][] rotateClockwise(char[][] data, char emptyChar, int rotateCount) {

		for (int i = 0; i < rotateCount; i++) {
			data = rotateOnce(data);
			data = moveElementsInMatrix(data, emptyChar);
		}

		return data;
	}

	private char[][] rotateOnce(char[][] data) {
		char[][] result = new char[data[0].length][data.length]; // ???

		// [y][x]

		// [0][0] [0][1] [0][2]
		// [1][0] [1][1] [1][2] =>

		// [1][0] [0][0]
		// [1][1] [0][1]
		// [1][2] [0][2]

		int xNewIndex = 0;

		for (int yOldIndex = data.length - 1; yOldIndex >= 0; yOldIndex--) {
			for (int xOldIndex = 0; xOldIndex < data[0].length; xOldIndex++) {
				result[xOldIndex][xNewIndex] = data[yOldIndex][xOldIndex];
			}
			xNewIndex++;
		}

		return result;
	}

	private char[][] moveElementsInMatrix(char[][] data, char emptyChar) {
		int numbOfRows = data.length - 1;
		int numbOfCols = data[0].length - 1;
		char[][] resultMatrix = data.clone();

		for (int i = 0; i <= numbOfCols; i++) {
			if (data[numbOfRows][i] != emptyChar) {
				continue;
			}

			char[] columnToModify = getArrayAtXCol(data, i);
			columnToModify = moveElementsInVector(columnToModify, emptyChar);
			resultMatrix = replaceColumnX(resultMatrix, columnToModify, i);
		}

		return resultMatrix;
	}

	private char[][] replaceColumnX(char[][] data, char[] vector, int xColInd) {
		for (int i = 0; i < data.length; i++) {
			data[i][xColInd] = vector[i];
		}
		return data;
	}

	private char[] getArrayAtXCol(char[][] data, int xColInd) {
		char[] result = new char[data.length];

		for (int i = 0; i < data.length; i++) {
			result[i] = data[i][xColInd];
		}

		return result;
	}

	private char[] moveElementsInVector(char[] data, char emptyChar) {
		int emptyCharsAtEnd = getEmptyCharsAtEnd(data, emptyChar);

		int origLength = data.length;

		char[] trunctatedData = Arrays.copyOfRange(data, 0, data.length - emptyCharsAtEnd);

		char[] resultVector = new char[origLength];
		Arrays.fill(resultVector, emptyChar);

		for (int i = trunctatedData.length - 1; i >= 0; i--) {
			resultVector[origLength - 1] = trunctatedData[i];
			origLength--;
		}

		return resultVector;
	}

	private int getEmptyCharsAtEnd(char[] data, char emptyChar) {
		int emptyCharsAtEnd = 0;

		for (int i = data.length - 1; i >= 0; i--) {
			if (data[i] != emptyChar) {
				break;
			}
			emptyCharsAtEnd++;
		}
		return emptyCharsAtEnd;
	}

}
