<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="tag" uri="/tld/MyTagDescriptor.tld" %>
<%@ taglib prefix="myTag" tagdir="/WEB-INF/tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <tag:MyTag name="Max">hohoho</tag:MyTag>
    <myTag:MyJspTag name="Max">yohoho</myTag:MyJspTag>
</body>
</html>