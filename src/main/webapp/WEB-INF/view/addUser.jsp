<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add User</title>
</head>
<body>
	<form:form commandName="user">
		Name: <form:input path="name"  />
		<br>
		Email: <form:input path="email" />
		<br>
		<input type="submit" value="SUBMIT">
	</form:form>
</body>
</html>