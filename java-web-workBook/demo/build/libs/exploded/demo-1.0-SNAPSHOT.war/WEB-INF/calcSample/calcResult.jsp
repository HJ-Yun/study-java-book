<%--
  Created by IntelliJ IDEA.
  User: hjyun
  Date: 25. 7. 6.
  Time: 오후 1:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h1>Num3 : ${param.num3}</h1>
  <h1>Num4 : ${param.num4}</h1>
  <h1>Sum : ${Integer.parseInt(param.num3) + Integer.parseInt(param.num4)}</h1>
</body>
</html>
