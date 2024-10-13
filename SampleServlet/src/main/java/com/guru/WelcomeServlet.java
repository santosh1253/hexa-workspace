package com.guru;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class WelcomeServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    public WelcomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("uname");
		String pwd=request.getParameter("pwd");
		if(pwd.equals("admin"))
		{
		 RequestDispatcher rd=request.getRequestDispatcher("Succ");
		 rd.forward(request, response);
		}
		else
		{
		 PrintWriter pw=response.getWriter();
		 pw.write("Wrong password....!");
		 RequestDispatcher rd=request.getRequestDispatcher("/index.html");
		 rd.include(request, response);
		}
		
		
	}

}
