package com.vcs.lects.l10.concurency;

import java.util.ArrayList;
import java.util.List;

public class UABFail {
	
	private  static final int SPEED = 1;
	
	public static void main(String[] args) {
		
		
		JiraTicket jira = new JiraTicket();
		
		List<Testuotojas> qaTeam = new ArrayList<>();
		
		qaTeam.add(new Testuotojas(jira, 10* SPEED));
		qaTeam.add(new Testuotojas(jira, 5* SPEED));
		qaTeam.add(new Testuotojas(jira, 15* SPEED));
		qaTeam.add(new Testuotojas(jira, 15* SPEED));
		qaTeam.add(new Testuotojas(jira, 9 * SPEED));
		qaTeam.add(new Testuotojas(jira, 10* SPEED));
		qaTeam.add(new Testuotojas(jira, 5* SPEED));
		qaTeam.add(new Testuotojas(jira, 15* SPEED));
		qaTeam.add(new Testuotojas(jira, 9 * SPEED));
		
		for (Testuotojas testuotojas : qaTeam) {
			testuotojas.start();
		}
		
		List<Developeris> devTeam = new ArrayList<>();
		
		devTeam.add(new Developeris(jira, 4* SPEED));
		devTeam.add(new Developeris(jira, 25* SPEED));
		devTeam.add(new Developeris(jira, 15* SPEED));
		devTeam.add(new Developeris(jira, 10* SPEED));
		devTeam.add(new Developeris(jira, 10* SPEED));
		devTeam.add(new Developeris(jira, 4* SPEED));
		devTeam.add(new Developeris(jira, 15* SPEED));
		devTeam.add(new Developeris(jira, 10* SPEED));
		devTeam.add(new Developeris(jira, 10* SPEED));
		
		
		for (Developeris developeris : devTeam) {
			developeris.start();
		}
		
		
		ProjektManageris pm = new ProjektManageris(jira, devTeam, 1000);
		pm.start();
	}
	

}
