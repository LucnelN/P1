package com.team.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestHelper
{
	public static String process(HttpServletRequest request, HttpServletResponse response)
	{
		switch(request.getRequestURI())
		{
		case "/ProjectOneV1/html/Ticket.go":
			return "/html/Ticket.html";
		default:
			return "/html/FinanceManager.html";
		}
	}
}