<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello from JSP</title>
</head>
<body>
    <h1>Hello, <%= request.getAttribute("name") %>!</h1>
    <p>Current time is: <%= request.getAttribute("time") %></p>
</body>
</html>