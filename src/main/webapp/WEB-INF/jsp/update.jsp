<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<f:form action="/JFSDW-6/update" method="post">
id:<f:input path="id"/>      
name:<f:input path="name"/>
Contact:<f:input path="contact"/>
Amount:<f:input path="amount"/>
Status:<f:input path="status"/>
<input type="submit" value="update"/> 
</f:form>
</body>
</html>