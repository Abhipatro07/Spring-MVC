package org.jsp.UiApp;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;

public class FirstServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		
		//Fetch UI/From Data
		String name = req.getParameter("nm");
		String place = req.getParameter("pl");
		
		//Presentation Logic
		
		PrintWriter out = resp.getWriter();
		out.println("<html><body bgcolor = 'orange>" + "<h1> Student name is " + name + " from " + place + "<h1>" + "</body></html>");
		
		out.close();
	}

}
