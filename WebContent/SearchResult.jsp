<%@page import="org.sharem.search.*"%>

<%@page import="java.io.FileReader"%>
<%@page import="java.io.BufferedReader"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%
	String name = request.getParameter( "search" );
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

This is what was searched: <%= name %>

This is what was found:

<%

	theResult result = new theResult(name);

out.println("Total found: " + result.lines.size() + " </br>");

%>

</body>
</html>