package org.studentmanagementsystem.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.studentmanagementsystem.beans.Student;
import org.studentmanagementsystem.dao.ApplicationDao;

@WebServlet("/edit")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private int rollNumber = 0;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		rollNumber = Integer.parseInt(request.getParameter("roll_number"));
		Student student = ApplicationDao.findStudentByRollNumber(rollNumber);
		request.setAttribute("student", student);
		request.getRequestDispatcher("edit.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("studentName");
		String fatherName = request.getParameter("fatherName");
		String city = request.getParameter("city");
		String phone = request.getParameter("phone");
		String course = request.getParameter("course");
		
		Student student = new Student();
		
		student.setRollNumer(rollNumber);
		student.setName(name);
		student.setFatherName(fatherName);
		student.setCity(city);
		student.setPhone(phone);
		student.setCourse(course);
		
		if(name==null || fatherName == null || city == null || phone == null || course == null) {
			response.setContentType("text/html");
			PrintWriter writer = response.getWriter();
			RequestDispatcher dispatcher = request.getRequestDispatcher("/edit.jsp");
			dispatcher.include(request, response);
			writer.print("<h4 style=\"text-align: center; color: red\">\r\n"
					+ "		Please fill all the fields!\r\n" + "</h4>");
		} else {
			int rowsUpdated = ApplicationDao.updateStudent(student);
			if(rowsUpdated > 0) {
				response.sendRedirect("dashboard");
			} else {
				response.setContentType("text/html");
				PrintWriter writer = response.getWriter();
				RequestDispatcher dispatcher = request.getRequestDispatcher("/edit.jsp");
				dispatcher.include(request, response);
				writer.print("<h4 style=\"text-align: center; color: red\">\r\n"
						+ "		Something went wrong. Please try again!\r\n" + "</h4>");
			}
		}
	}
}
