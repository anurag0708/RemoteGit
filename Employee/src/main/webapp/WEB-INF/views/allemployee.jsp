<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Employee</title>
</head>
<body>
<h1 align="center">Details Of All Employees</h1>
<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>Name</th><th>Mobile Number</th></tr>  
<c:forEach var="emp" items="${empList}"> 
<tr>
<td>${emp.employeeId }</td>
<td>${emp.employeeName }</td>
<td>${emp.mobileNumber }</td>
<td><a href="./edit/${emp.employeeId}"> Edit</a></td>
<td><a href="./delete/${emp.employeeId}"> Delete</a></td>
</tr>
</c:forEach>
<jsp:include page="dashboard.jsp"></jsp:include>
</table>
</body>
</html>