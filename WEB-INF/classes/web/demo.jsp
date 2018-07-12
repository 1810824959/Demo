<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: 18108
  Date: 2018/7/10
  Time: 12:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        Date date = new Date();
        out.write(date.toLocaleString());
        pageContext.getException();
    %>
</body>
</html>
