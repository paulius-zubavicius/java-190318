package com.vcs.lects.l10.errorshandling;

public class StringParser {

	public int[] parseStr(String text) {

		String[] strs = text.split(" ");

		int[] result = new int[strs.length];
		boolean isFailed = false;
		for (int i = 0; i < strs.length; i++) {

			try {
				result[i] = Integer.parseInt(strs[i]);
			} catch (Exception e) {
				isFailed = true;
				result[i] = -1;
			}

		}

		if (isFailed) {
			throw new NevalidusDuomenys(result);
		}

		return result;
	}

}
