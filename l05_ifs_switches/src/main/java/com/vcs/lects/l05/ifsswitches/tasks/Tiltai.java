package com.vcs.lects.l05.ifsswitches.tasks;

public class Tiltai {


	public String getShortestWay(boolean p1, boolean p2, boolean p3, boolean p4, boolean p5, boolean p6) {
		if (p1 && p2) return "p1 p2";
		if (p4 && p5) return "p4 p5";
		if (p1 && p3 && p5) return "p1 p3 p5";
		if (p4 && p3 && p2) return "p4 p3 p2";
		if (p4 && p6 && p2) return "p4 p6 p2";

		return "???";
	}

}
