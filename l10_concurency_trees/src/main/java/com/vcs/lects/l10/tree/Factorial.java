package com.vcs.lects.l10.tree;

public class Factorial {

	public static void main(String[] args) {
		Factorial f = new Factorial();

		System.out.println(f.calcFactorialCycle(5));
		System.out.println(f.calcFactorialRecursion(5));

	}

	public int calcFactorialCycle(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}

	public int calcFactorialRecursion(int n) {
		if (n > 1) {
			return n * calcFactorialRecursion(n - 1);
		}
		return 1;
	}

}
