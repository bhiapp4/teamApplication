<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
	<head>
		<meta charset="utf-8">
		<title>Welcome</title>
	</head> 
	<body>
		${message}
		<h1>Home Page</h1>
		<p>
			The context path is <c:out value="${pageContext.request.contextPath}"/><br/>
			<a href="${pageContext.request.contextPath}/team/add.html">Add New Team</a><br/>
			<a href="${pageContext.request.contextPath}/team/list.html">Team List</a>
		</p>
		
	</body>
</html>
