<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    // it's an usual java code here
    System.out.println("l");

%>
<html>
<body>
    <h2>Hello, <%= session.getAttribute("name") %> </h2>
    <%= request.getAttribute("name2") %>
</body>
</html>