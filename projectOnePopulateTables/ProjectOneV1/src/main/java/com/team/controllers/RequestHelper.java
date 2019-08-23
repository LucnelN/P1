package com.team.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestHelper
{
	public static String process(HttpServletRequest request, HttpServletResponse response)
	{
		switch(request.getRequestURI())
		{
		case "/ProjectOneV1/html/Manager.go":
			return ManagerController.Manage(request, response);
			
		default:
			return "/html/Ticket.html";
		}
	}
}