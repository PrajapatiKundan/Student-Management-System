package org.studentmanagementsystem.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/dashboard")
public class DashBoardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/* TODO Authenticate first */
		request.getRequestDispatcher("dashboard.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/* TODO Authenticate first */
		String actionParam = request.getParameter("action");
		String action = null;
		int rollNumber = 0;

		if (actionParam.contains("edit")) {
			action = "edit";
			rollNumber = Integer.parseInt(actionParam.replace(action, ""));
		} else if (actionParam.contains("delete")) {
			action = "delete";
			rollNumber = Integer.parseInt(actionParam.replace(action, ""));
		} else if (actionParam.contains("register")) {
			action = "register";
		} 
		
		System.out.println("Action = " + action);
		System.out.println("rollNumber = " + rollNumber);

		if (action.equals("edit")) {
			response.sendRedirect("edit");
		} else if (action.equals("register")) {
			response.sendRedirect("register");
		}
	}
}
