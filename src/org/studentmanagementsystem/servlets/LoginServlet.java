package org.studentmanagementsystem.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.studentmanagementsystem.services.AuthenticateService;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");

		if (AuthenticateService.authenticate(userName, password)) {
			HttpSession session = request.getSession();
			session.setAttribute("userName", userName);
			session.setAttribute("password", password);
			response.sendRedirect("dashboard");
		} else {
			response.setContentType("text/html");
			PrintWriter writer = response.getWriter();
			RequestDispatcher dispatcher = request.getRequestDispatcher("/login.jsp");
			dispatcher.include(request, response);
			writer.print("<h4 style=\"text-align: center; color: red\">\r\n"
					+ "		Invalid credentials please try again!\r\n" + "</h4>");
		}
	}
}
