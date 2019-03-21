package com.vcs.lects.l04.operators;

public class Oper {

	void operPalyginimo() {

		int sk5 = 5;
		int sk7 = 7;
		int sk2 = 2;
		int sk3 = 3;

		boolean result = 5 == 7; // ??? false

		result = sk5 == sk2; // ??? false

		result = sk2 >= sk7; // false

		result = (sk2 + sk5) >= sk7; // true

		result = (sk2 + sk5) != sk7; // false

		// ar lyginis
		result = (sk7 + sk5) % 2 == 0; // true :) - lyginis

	}

	private boolean arLyginis(int sk) {

		return sk % 2 == 0;
	}

	private boolean arNelyginis_1(int sk) {

		// ?
		return sk % 2 != 0;
	}
	
	private boolean arNelyginis_2(int sk) {

		// ?
		return sk % 2 == 1;
	}
	
	private boolean arNelyginis_3(int sk) {

		// ?
		return !arLyginis(sk);
	}

	void oper() {

		int sk = 1;

		sk = sk + 1; // +1

		sk += 1; // +1

		sk++; // +1
		++sk; // +1

		sk += 10; // +10

		sk -= 3;
		sk--;
		--sk;

		sk = sk / 3;
		sk /= 3;

		sk = sk * 2;
		sk *= 2;

		sk = sk % 3;
		sk %= 3;

	}

}
