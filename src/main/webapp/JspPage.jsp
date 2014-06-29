<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP with the current date</title>
</head>
<body>
<!-- Read each parameter set by JspServlet -->
<% String title = (String) request.getAttribute("jsp-param-title"); %>
<h1><%= title%></h1>
<% String message = (String) request.getAttribute("jsp-param-message"); %>
<p><%= message%></p>

<!-- Print current date using java code -->
<%java.text.DateFormat df = new java.text.SimpleDateFormat("dd/MM/yyyy"); %>
<p>Current date: <%= df.format(new java.util.Date()) %> </p>

</body>
</html>