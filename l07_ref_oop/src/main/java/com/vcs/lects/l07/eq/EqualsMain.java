package com.vcs.lects.l07.eq;

public class EqualsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Wrapinimas wr1 = new Wrapinimas();

		Wrapinimas wr2 = new Wrapinimas();

		System.out.println(wr1 == wr2); // FALSE !!!!
		System.out.println(wr1.equals(wr2)); // false, bet galim pakeisti

		Integer a = 10;
		Integer b = 10;

		System.out.println(a.equals(b));

	}

	public boolean isAbc(String txt) {
		return "abc".equals(txt);
	}

	public boolean is5_1(Integer sk) {

		return sk.intValue() == 5;
	}

	public boolean is5_2(Integer sk) {

		return (new Integer(5)).equals(sk);
	}

}

















