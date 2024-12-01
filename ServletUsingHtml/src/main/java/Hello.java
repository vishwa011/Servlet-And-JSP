import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Servlet implementation class Hello
 */
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hello() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<html><body>");
		out.print("<h3>Hello Servlet</h3>");
		out.print("</body></html>");
		String tittle="HTTP HEADER REQUEST";
		String doctype="<!doctype html public \"-//w3c//dtd html 4,0"+"transitional//en\">";
				 out.println(doctype + 
				 	"<html>\n"+
						"<header><tittle>"+tittle+"</tittle></head>\n"+
				"<body bgcolor=\"f0f0f0\">\n"+
					"<h1 align=\"center\">"+tittle+"</h1>\n"+
				"<table width=\"100%\" border=\"1\"align=\"certer\">\n"+
					"<th>Header name</th><th>Header values</th>\n"+"</tr>\n");
				Enumeration<String> headerNames=request.getHeaderNames();
				while(headerNames.hasMoreElements()) {
					String paramName=(String)headerNames.nextElement();
					out.print("<tr><tr>"+paramName+"<td>n");
					String paramValue=request.getHeader(paramName);
					out.println("<td>"+paramValue+"</td></tr>\n");
				}
				out.println("</table>\n</body></html>");	
					
				
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
