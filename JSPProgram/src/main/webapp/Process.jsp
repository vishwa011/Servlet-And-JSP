<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="u" class=com.index.User scope="session"></jsp:useBean>

<jsp:setProperty property="*" name="u"/>

Record:<br>
<%
String name="Alla";
%>
<jsp:setProperty property="name" name="u" value="<%=name %>"/>
<jsp:getProperty property="name" name="u"/>
<br>
<jsp:getProperty property="password" name="u"/>
<br>

<jsp:getProperty property="email"  name="u"/>
<a href="secound.jsp">visit the page</a>
<br>
</body>
</html>