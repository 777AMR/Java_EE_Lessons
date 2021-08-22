<%@ page import="jsp.Student" %><%--
  Created by IntelliJ IDEA.
  User: Meiram
  Date: 22.08.2021
  Time: 13:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <jsp:useBean id="Student" class="jsp.Student" scope="request" />
    <%--    <jsp:useBean id="Student" class="jsp.Student" scope="session" />--%>
    <%--    <jsp:useBean id="Student" class="jsp.Student" scope="application" />--%>
    <jsp:getProperty name="Student" property="name"/>
</body>
</html>
