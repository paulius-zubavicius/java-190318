package com.vcs.lects.l10.concurency;

public class Developeris extends Thread {

	private JiraTicket jira;
	private int kiekUztrunka = 0;
	private boolean dirba = false;

	public Developeris(JiraTicket jira, int kiekUztrunka) {
		this.jira = jira;
		this.kiekUztrunka = kiekUztrunka;
	}

	public void taisoDefektus() {

		try {
			Thread.sleep(kiekUztrunka);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		dirba = jira.takeOneAndResolve();

	}

	public boolean isDirba() {
		return dirba;
	}

	@Override
	public void run() {

		while (true) {
			taisoDefektus();
		}

	}

}
