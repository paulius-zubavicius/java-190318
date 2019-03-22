package com.vcs.lects.l06.arrays_cycles;

import java.util.Arrays;

public class Eqaling {
	
	
	public static void main(String[] args) {
		Eqaling e = new Eqaling();
		e.lyginimas();
	}

	public void lyginimas() {
		
		
		int[] aaa = {1,2,3};
		int[] bbb = {1,2,3};
		
		System.out.println(aaa == bbb); // false
		System.out.println(aaa.equals(bbb)); // false
		
		System.out.println(Arrays.equals(aaa, bbb));// TRUE
		
		
	}
	
	
}
