package com.vcs.lects.l05.ifsswitches.tasks;

public class SizeConverter {

	/**
	 * 0 bytes ...; 1kb ... ; 1Mb... 1Gb ... ; 1Tb and more;
	 *
	 * Example: 1,3Gb // <- Acceptable 893Kb // <- Acceptable 1Gb and 312Mb and
	 * ...// <- Not acceptable
	 *
	 *
	 *
	 * http://byteconvert.org/
	 *
	 */

	private static final long _1024 = 1024;

	private static final long B = 1;
	private static final long KB = B * _1024;
	private static final long MB = KB * _1024;
	private static final long GB = MB * _1024;
	private static final long TB = GB * _1024;

	public String convertToHumanReadable(long sizeInBytes) {

		if (sizeInBytes < KB) { // bytes
			return sizeInBytes + " b";
		}

		if (sizeInBytes < MB) { // kb
			return sizeInBytes / KB + " Kb";
		}

		if (sizeInBytes < GB) { // Mb
			return cutDigits(1.0 * sizeInBytes / MB) + " Mb";
		}

		if (sizeInBytes < TB) { // Gb
			return cutDigits(1.0 * sizeInBytes / GB) + " Gb";
		}

		return cutDigits(1.0 * sizeInBytes / TB) + " Tb";
	}

	private String cutDigits(double d) {

		d *= 10;

		long dLng = (long) d;

		if (dLng % 10 == 0) {
			return "" + dLng / 10;
		}

		return "" + dLng / 10.0;
	}

}
