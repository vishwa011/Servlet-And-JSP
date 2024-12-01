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
request.setAttribute("empid", "1234");
%>
<jsp::include page="/com.index/Myservlet?user=Smith" flush="true"/>
</body>
</html>