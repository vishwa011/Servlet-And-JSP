<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String user=request.getParameter("user");
%>
Hello <%out.println(user); 

%>

<%! int data=50;%>
<%= "value of the variable is"+data+"," %>

<%! int cube(int n){
	return n*n*n;
}
%>
<%= "cube of is"+cube(3) %>
<%out.println("hai"); %>
<br/>
<%
out.println("welcom"+request.getParameter("user"));
String driver=config.getInitParameter("name");
out.print("Driver name is"+driver);
%>
</body>
</html>