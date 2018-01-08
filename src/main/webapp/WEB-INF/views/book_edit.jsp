<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
         isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Book edit form</title>
</head>
<body>
    <form action="../../book/edit">
        <input type="hidden" name="id" value="${book.id}">
        Title: <input type="text" name="title" value="${book.title}">
        Author: <input type="text" name="author" value="${book.author}">
        Rating: <input type="text" name="rating" value="${book.rating}">
        Publisher: <input type="text" name="publisher" value="${book.publisher}">
        Description: <input type="text" name="description" value="${book.description}">
        <<input type="submit" value="SAVE">
    </form>
</body>
</html>
