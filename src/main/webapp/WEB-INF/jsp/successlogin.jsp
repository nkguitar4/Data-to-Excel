<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   

<html>
<head>
<meta charset="ISO-8859-1">

</head>
<body style="background-color:#7fc399">
<h1><p>${error}</p></h1>

<form:form modelAttribute="user" style="background-color:#e6e6e6" action="/display" method="post">
 <form:button type="submit" class="btn-success">Show Data</form:button>

</form:form>
<br>
<a href="http://localhost:6969/login">Enter New Record</a>

</body>
</html>