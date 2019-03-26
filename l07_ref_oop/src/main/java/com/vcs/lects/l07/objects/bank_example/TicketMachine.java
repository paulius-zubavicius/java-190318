package com.vcs.lects.l07.objects.bank_example;

public class TicketMachine {

//	private SystemOfTheTickets system;
//	
//	public TicketMachine(SystemOfTheTickets system) {
//		this.system = system;
//	}
	
	private static int queue = 1;

//	public int getNextNumber() {
//		return queue++;
//	}

	public Ticket printTheTicket() {

		return new Ticket(queue++);

	}

}
