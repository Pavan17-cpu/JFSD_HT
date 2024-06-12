<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false" %>
    
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br/>
list value is ${list}

<table>
<tr><th>stu_id</th>
<th>stu_name</th>
<th>stu_contact</th>
<th>Amount</th>
<th>Status</th>
<th>Edit</th>
<th>Delete</th>
</tr>
<c:forEach var="stu" items="${list}">
<tr>
<td>${stu.getId()}</td>
<td>${stu.getName()}</td>
<td>${stu.getContact()}</td>
<td>${stu.getAmount()}</td>
<td>${stu.getStatus()}</td>
<td><a href="/JFSDW-6/update/${stu.getId()}">Edit</a></td>
<td><a href="/JFSDW-6/delete/${stu.getId()}">Delete</a></td>
</tr>
</c:forEach>
</table>

<br/>
<a href="/JFSDW-6/add">Add Student</a>

</body>
</html>