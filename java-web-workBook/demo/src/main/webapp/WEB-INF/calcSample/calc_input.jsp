<%--
  Created by IntelliJ IDEA.
  User: hjyun
  Date: 25. 7. 6.
  Time: 오후 1:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!-- GET -->
    <form action="/calc/input" method="get">
        <input type="number" name="num1">
        <input type="number" name="num2">
        <button type="submit">GET SEND</button>
    </form>
<!-- GET -->
<!-- POST -->
    <form action="/calc/input" method="post">
        <input type="number" name="num3">
        <input type="number" name="num4">
        <button type="submit">POST SEND</button>
    </form>
<!-- POST -->
</body>
</html>
