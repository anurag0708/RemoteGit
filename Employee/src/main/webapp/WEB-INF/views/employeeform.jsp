<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
   <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee</title>
    </head>
    <body>
        <h1 align="center">Employee Details</h1>
       <form:form method="post" action="./saveemployee" modelAttribute="empform">
       <table>
       <tr>
       <td>Name<td>
       <td><form:input path="employeeName"/>
       </tr>
       <tr>
       <td>Mobile No.<td>
       <td><form:input path="mobileNumber"/>
       </tr>
       <tr><td><input type="submit" value="Save"/></td></tr>
       </table>
       </form:form>
    </body>
</html>
