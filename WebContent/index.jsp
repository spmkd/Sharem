<%@page import="org.sharem.mainpage.*"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sharem</title>
</head>
<body>

<div align="center">
	<FORM METHOD=POST ACTION="SearchResult.jsp">
		Enter your Search!
	  	<INPUT TYPE=TEXT NAME=search SIZE=20>
	  	<input type=SUBMIT value="Search">
	</FORM>
</div>

<%

	MainPage mResult = new MainPage();

	int totalNum = mResult.Serials.size();

%>

<%

	out.println("</br> Currently we have: " + totalNum );

	for (int i=0; i < totalNum; i++) {

		out.println("</br> " + i + ". " + mResult.Serials.get(i));

	}

%>

</body>
</html>