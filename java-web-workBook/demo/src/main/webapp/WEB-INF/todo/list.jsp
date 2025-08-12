<%--
  Created by IntelliJ IDEA.
  User: hjyun
  Date: 25. 7. 12.
  Time: 오후 1:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>List Page</h1>
    <h2>forEach</h2>
    <ul>
        <c:forEach var="dto" items="${list}">
            <li>${dto}</li>
        </c:forEach>
    </ul>
    <h2>if</h2>
    <c:if test="${list.size() % 2 == 0}">
        짝수
    </c:if>
    <c:if test="${list.size() % 2 != 0}">
        홀수
    </c:if>
    <h2>choose</h2>
    <c:choose>
        <c:when test="${list.size() % 2 == 0}">
            짝수
        </c:when>
        <c:otherwise>
            홀수
        </c:otherwise>
    </c:choose>
    <h2>set</h2>
    <c:set var="target" value="5"></c:set>
    <ul>
        <c:forEach var="num" begin="1" end="10">
            <c:if test="${num == target}">
                ${num} is target
            </c:if>
        </c:forEach>
    </ul>
</body>
</html>
