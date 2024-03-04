<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Wizyty na stronie</title>
</head>
<body>
    <h1>Cześć!</h1>
    <h2>Twoja liczba odwiedzin  na naszej stronie: <%= request.getAttribute("numberOfVisits") %></h2>
    <a href="remove">Wyzeruj licznik</a>
</body>
</html>
