package org.studentmanagementsystem.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/*
 * Register urls here if you want to authenticate user first 
 */

@WebFilter(urlPatterns = { 
		"/dashboard", 
		"/edit",
		"/register", 
		"/delete" 
})
public class AuthenticateFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		// Type casted ServletRequest to HttpServletRequest
		
		HttpSession session = httpServletRequest.getSession();

		if (session.getAttribute("userName") == null) {
			HttpServletResponse httpServletResponse = (HttpServletResponse) response;
			httpServletResponse.sendRedirect("login");
		} else {
			chain.doFilter(httpServletRequest, response);
		}
	}
}
