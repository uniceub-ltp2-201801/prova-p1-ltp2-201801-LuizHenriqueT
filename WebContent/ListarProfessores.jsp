<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="model.Professor"%>
	<%@ page import="java.util.ArrayList"%>
	
	<% ArrayList<Professor> professores =( ArrayList<Professor>)request.getAttribute("professores"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Professores</title>
</head>
<body>
<h1>Lista de Professores<%=for(Professor p:professores){ %></h1>
<h2><%= p.getNome() }%></h2>
</body>
</html>