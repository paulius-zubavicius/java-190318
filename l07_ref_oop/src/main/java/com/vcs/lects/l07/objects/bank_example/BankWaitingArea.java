package com.vcs.lects.l07.objects.bank_example;

public class BankWaitingArea {

	public static void main(String[] args) {

		// SystemOfTheTickets sys = new SystemOfTheTickets();

		TicketMachine tm1 = new TicketMachine();
		
		TicketMachine tm4 = tm1;

		TicketMachine tm2 = new TicketMachine();

		TicketMachine tm3 = new TicketMachine();

		System.out.println(tm1.printTheTicket().getNumber());
		System.out.println(tm1.printTheTicket().getNumber());
		System.out.println(tm1.printTheTicket().getNumber());

		System.out.println(tm2.printTheTicket().getNumber());
		System.out.println(tm2.printTheTicket().getNumber());

		System.out.println(tm3.printTheTicket().getNumber());

		System.out.println(tm1.printTheTicket().getNumber());
		System.out.println(tm1.printTheTicket().getNumber());
		System.out.println(tm1.printTheTicket().getNumber());

		System.out.println(tm3.printTheTicket().getNumber());

	}

}
