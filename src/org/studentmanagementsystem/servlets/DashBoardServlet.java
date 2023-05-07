package org.studentmanagementsystem.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.studentmanagementsystem.beans.Student;
import org.studentmanagementsystem.dao.ApplicationDao;

@WebServlet("/dashboard")
public class DashBoardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Student> students = ApplicationDao.getAllStudents();
		ServletContext context = getServletContext();
		context.setAttribute("totalStudents", students.size());
		request.setAttribute("students", students);
		request.getRequestDispatcher("dashboard.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String[] actionParam = request.getParameter("action").split(":");
		String action = actionParam[0];
		int rollNumber = 0;
		
		if(Integer.parseInt(actionParam[1])>0)
			rollNumber = Integer.parseInt(actionParam[1]);
		
		if (action.equals("edit")) {
			response.sendRedirect("edit");
		} else if (action.equals("delete")) {
			int rowsUpdated = ApplicationDao.deleteStudentRecord(rollNumber);
			if (rowsUpdated>0) {
				response.sendRedirect("dashboard");
			}
		} else if (action.equals("register")) {
			response.sendRedirect("register");
		}
	}
}
