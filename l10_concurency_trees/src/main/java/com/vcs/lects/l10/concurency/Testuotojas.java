package com.vcs.lects.l10.concurency;

public class Testuotojas extends Thread {

	private JiraTicket jira;
	private int kiekUztrunka = 0;

	public Testuotojas(JiraTicket jira, int kiekUztrunka) {
		this.jira = jira;
		this.kiekUztrunka = kiekUztrunka;
	}

	public void randaDefektus() {

		try {
			Thread.sleep(kiekUztrunka);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		jira.addTicket();

	}
	
	@Override
	public void run() {

		while (true) {
			randaDefektus();
		}

	}

}
