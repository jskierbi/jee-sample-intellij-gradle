package com.example;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class JspServlet extends HttpServlet {

	@Override protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/plain");
		PrintWriter out = resp.getWriter();

		// Set parameters passed to JSP page
		req.setAttribute("jsp-param-title", "Title, passed from servlet");
		req.setAttribute("jsp-param-message", "Oh, jsp, hello!");

		// Forward request to JSP page
		req.getRequestDispatcher("JspPage.jsp").forward(req, resp);
	}
}
