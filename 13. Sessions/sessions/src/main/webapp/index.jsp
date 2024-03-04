<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Poziom nawodnienia</title>
</head>
<body>
    <h1>Śledzenie poziomu nawodnienia organizmu</h1>
    <form action="control">
        <button name="option" value="water">Dodaj szklankę wody</button>
        <button name="option" value="clear">Wyzeruj licznik</button>
    </form>

    <%
        Object water = request.getSession().getAttribute("water");
        if (water == null) {
    %>
        <h2>Dzisiaj jeszcze nic nie piłeś</h2>
    <%
        } else {
    %>
        <h2>Dzisiaj wypiłeś <%= water %>ml wody</h2>
    <%
        }
    %>
</body>
</html>
