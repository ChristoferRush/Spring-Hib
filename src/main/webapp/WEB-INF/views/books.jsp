<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
         isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Books</title>
</head>
<body>
    <h1>Books</h1><hr>
    <table>
        <c:forEach items="${books}" var="book">
            <table>
                <tr>
                    <td>${book.title}</td>
                    <td>${book.author}</td>
                    <td><a href="<c:url value='/book/del/${book.id}'/>">delete</a></td>
                    <td><a href="<c:url value='/book/edit/${book.id}'/>">edit</a></td>
                </tr>
            </table>
        </c:forEach>
    </table>
    <a href="<c:url value='/book/add'/>">ADD</a>
</body>
</html>
