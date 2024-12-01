package com.index;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ReedCookieUsingServlet
 */
public class ReedCookieUsingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReedCookieUsingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("unused")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		Cookie cookie=null;
		Cookie[] cookies=null;
		
		cookies=request.getCookies();
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String tittle="Reeding cookie";
		String docType=
				"<!doctype html public \"-//w3c//dtd html 4,0"+"transitional//en\">";
		 out.println(docType + 
		 	"<html>\n"+
			"<header><tittle>"+tittle+"</tittle></head>\n"+
			"<body bgcolor=\"f0f0f0\">\n");
		 
		 	if(cookie!=null) 
		 	{
		 		out.println("<h2> found Cookie Name & Value </h2>");
		 		
		 	for(int i=0;i<cookies.length;i++)
		 	{
		 		cookie=cookies[i];
		 		out.println("Name"+cookie.getName()+", ");
		 		out.println("Value"+cookie.getValue()+", ");
		 		
		 	}}
		 	else {
		 		out.println("<h2> No cookies Found </h2>");
		 	}
		 	out.println("</body>");
		 	out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
