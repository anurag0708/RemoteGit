<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Employee Details</title>
</head>
<body>
<h1 align="center">Edit Employee Details</h1>
<form:form method="post" action="./update" modelAttribute="emp" >
<table>
<tr>

<td><form:hidden path="employeeId"/></td>
</tr>
<tr>
<td> Employee Name :</td>
<td><form:input path="employeeName"/></td>
</tr>
<tr>
<td> Mobile Number :</td>
<td><form:input path="mobileNumber"/></td>
</tr>
<tr><td>
<input type="submit" value="Update"></td>
</tr>
</table>
</form:form>

</body>
</html>