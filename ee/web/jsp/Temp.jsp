<%@ page import="java.util.Date" %>
<%@ page import="jsp.JSPHelper" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%=request.getMethod()%>
    <%=session.getAttribute("")%>
    <%=response.setStatus(200)%>
</body>
</html>
