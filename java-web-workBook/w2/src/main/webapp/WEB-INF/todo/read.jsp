<%--
  Created by IntelliJ IDEA.
  User: hjyun
  Date: 25. 8. 3.
  Time: 오후 1:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Read</title>
</head>
<body>
  <hi>Read</hi>
  <div>
    <input type="text" name="tno" value="${read.tno}" readonly>
  </div>
  <div>
    <input type="text" name="title" value="${read.title}" readonly>
  </div>
  <div>
    <input type="date" name="dueDate" value="${read.dueDate}" readonly>
  </div>
  <div>
    <input type="checkbox" name="finished" ${read.finished ? "checked" : ""} readonly>
  </div>
  <div>
    <a href="/todo/modify?tno=${read.tno}">Modify/Remove</a>
    <a href="/todo/list">List</a>
  </div>
</body>
</html>
