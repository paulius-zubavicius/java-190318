package com.vcs.lects.l10.concurency;

import java.util.List;

public class ProjektManageris extends Thread {

	private JiraTicket jira;
	private int kiekUztrunka = 0;
	private List<Developeris> devs;

	public ProjektManageris(JiraTicket jira, List<Developeris> devs, int kiekUztrunka) {
		this.jira = jira;
		this.kiekUztrunka = kiekUztrunka;
		this.devs = devs;
	}

	public void teiktiAtaskaita() {

		try {
			Thread.sleep(kiekUztrunka);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		int tasks = jira.getTasksAmount();
		int dirbantys = 0;
		int gyvi = 0;

		for (Developeris developeris : devs) {
			gyvi += (developeris.isAlive() ? 1 : 0);
			dirbantys += (developeris.isDirba() && developeris.isAlive() ? 1 : 0);
		}

		boolean futboliukas = dirbantys < gyvi;

		System.out.println("Tasks: " + tasks + " dirba: " + dirbantys + " / " + devs.size() + " "
				+ (futboliukas ? " futboliukas!" : ""));

	}

	@Override
	public void run() {

		while (true) {
			teiktiAtaskaita();
		}

	}

}
