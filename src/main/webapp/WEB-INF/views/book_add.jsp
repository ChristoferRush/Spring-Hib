<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
         isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Book add form</title>
</head>
<body>
<h1>Books</h1>
</hr>
<form:form method="post" modelAttribute="book">
    <form:input path="title" value="title" />
    <form:input path="author" value="author" />
    <form:input path="publisher" />
    <form:input path="description" />
    <input type="submit" value="SAVE" />
</form:form>
</hr>
</body>
</html>