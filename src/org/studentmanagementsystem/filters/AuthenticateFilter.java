package org.studentmanagementsystem.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@WebFilter(urlPatterns = "/*")
public class AuthenticateFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		boolean isAuthenticationRequired = false;
		String[] urlRequiresAuthentication = { 
			"/StudentManagementSystem/dashboard", 
			"/StudentManagementSystem/edit",
			"/StudentManagementSystem/register", 
			"/StudentManagementSystem/delete", 
		};
		String temp = httpServletRequest.getRequestURI();
		for(String url: urlRequiresAuthentication) {
			if(httpServletRequest.getRequestURI().startsWith(url)) {
				isAuthenticationRequired = true;
				break;
			}
		}
		
		if(isAuthenticationRequired) {
			HttpSession session = httpServletRequest.getSession();
			if(session.getAttribute("userName")==null) {
				httpServletRequest.getRequestDispatcher("").forward(httpServletRequest, response);
			}
		} 
		chain.doFilter(httpServletRequest, response);
	}
}
