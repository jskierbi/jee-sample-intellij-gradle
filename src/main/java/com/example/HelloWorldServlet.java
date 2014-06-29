package com.example;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorldServlet extends HttpServlet {

	int count = 0;

	@Override protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession(true);
		session.setMaxInactiveInterval(5);
		resp.setContentType("text/plain");
		PrintWriter out = resp.getWriter();
		if (session.isNew()) {
			++count;
		}

		out.println("Oh, there, hello!");
	}
}
