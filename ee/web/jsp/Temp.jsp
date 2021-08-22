<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--<%@ include file="MyJsp.jsp"%>-prepocessor--%>
    <jsp:include page="MyJsp.jsp"/>-request
    <jsp:include page="/hello"/>
    <jsp:include page="/WEB-INF/text.txt"/>

</body>
</html>
