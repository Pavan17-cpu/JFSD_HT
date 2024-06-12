<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<f:form action="/JFSDW-6/add" method="post">
   id:<f:input path="id"/>
   name:<f:input path="name"/>
   Contact:<f:input path="contact"/>
   Amount:<f:input path="amount"/>
   Status:<f:input path="status"/>
   
   <input  type="submit" value="add"/>
</f:form>
</body>
</html>