package com.index;

import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
//import java.util.Enumeration;

/**
 * Servlet implementation class CookieNew
 */
public class CookieNew extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookieNew() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Cookie FirstName= new Cookie("First_Name",request.getParameter("First_Name"));
		Cookie LastName= new Cookie("Last_Name",request.getParameter("Last_Name"));
		
		//Set expiry date after 24 hours
		FirstName.setMaxAge(60*60*24);
		LastName.setMaxAge(60*60*24);
		
		//add the cookie
		response.addCookie(FirstName);
		response.addCookie(LastName);
		
		//Set response content type
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String  tittle ="Setting cookie";
		String doctype=
				"<!doctype html public \"-//w3c//dtd html 4,0"+"transitional//en\">";
		 out.println(doctype + 
		 	"<html>\n"+
			"<header><tittle>"+tittle+"</tittle></head>\n"+
			"<body bgcolor=\"f0f0f0\">\n"+
			"<h1 align=\"center\">"+tittle+"</h1>\n"+
			"<ul>\n"+"<li><b>First Name<b>:"+ request.getParameter("First_Name") + "\n"+
			"<li><b>Last Name<b>:"+ request.getParameter("Last_Name") + "\n"+
			"</ul>\n" + "</body></html>");
			
	}

	
}
