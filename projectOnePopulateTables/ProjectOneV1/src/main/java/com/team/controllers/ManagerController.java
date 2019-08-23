package com.team.controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.team.core.Ticket;
import com.team.dao.TicketDAOImpl;

public class ManagerController
{
	public static String Manage(HttpServletRequest request, HttpServletResponse response)
	{
		sendTickets(getTickets(), response);
		
		return null;
	}
	
	private static ArrayList<Ticket> getTickets(){
		ArrayList<Ticket> tickets = null;
		
		TicketDAOImpl ticketDAOImpl = new TicketDAOImpl();
		
		tickets = ticketDAOImpl.getAllTickets();
		
		return tickets;
	}
	
	private static void sendTickets(ArrayList<Ticket> tickets, HttpServletResponse response)
	{
		/*for (Ticket t : tickets)
		{
			try {
				response.getWriter().write(new ObjectMapper().writeValueAsString(t));
			} catch (JsonProcessingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}*/
		
			try {
				response.getWriter().write(new ObjectMapper().writeValueAsString(tickets));
			} catch (JsonProcessingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
}