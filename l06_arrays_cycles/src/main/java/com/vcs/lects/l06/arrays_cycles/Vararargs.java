package com.vcs.lects.l06.arrays_cycles;

public class Vararargs {

	public static void main(String[] args) {

		Vararargs v = new Vararargs();

		int[] a = { 1, 2, 3 };

		v.aaa(a); // Ok
		v.bbb(a); // Ok

		v.aaa(new int[] { 1, 2, 3 }); // Ok
		v.bbb(new int[] { 1, 2, 3 }); // Ok

		//v.aaa(1, 2, 3); // Compilation error
		v.bbb(1); // Ok

	}

	public void aaa(int[] arr) {
		
	}

	public void bbb( int... arr) {
		
	}

}
