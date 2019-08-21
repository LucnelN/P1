package com.team.dao;

import com.team.core.Ticket;
import com.team.dao.TicketDAOImpl;

public class Test
{
	public static void main(String[] args)
	{
		TicketDAOImpl impl = new TicketDAOImpl();
		
		Ticket ticket = new Ticket(0, "username", 1.23, "description", "type", 1);
		
		impl.insertTicket(ticket);
	}
}