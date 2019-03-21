package com.vcs.lects.l05.ifsswitches.tasks;

public class SavDienos {
	public static void main(String[] args) {

		SavDienos sd = new SavDienos();

		String myday = sd.weekDayToStr(0);

		System.out.println(myday);

	}
	
	
	
	public String weekDayToStr(int i) {
		i++ ;
		if (i == 1) return "pirm";
		if (i == 2) return "antr";
		if (i == 3) return "trec";
		if (i == 4) return "ketv";
		if (i == 5) return "penk";
		if (i == 6) return "sest";
		if (i == 7) return "sekm";
		
		return "???";
	}
	
	public String weekDayToStrType(int i) {
		
		if (i >= 1 && i <= 5) return "sunkoka...";
		if (i >= 6 && i <= 7) return "va cia geriau...";
		
		return "???";
	}
	
	// Bet neveiks su validziai skaiciais
	public String weekDayToStrTypeShort(int i) {
		
		return (i >= 1 && i <= 5 ? "sunkoka..." : "va cia geriau...");
	}
	
	public String weekDayToStrSwitch(int i) {
		
		
		
		return "???";
	}
	
	

}
