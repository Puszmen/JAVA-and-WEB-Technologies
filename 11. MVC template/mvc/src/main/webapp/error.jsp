<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Błąd</title>
</head>
<body>
    <h2>Wystąpił błąd</h2>
    <p><%= request.getAttribute("message") %></p>
</body>
</html>
