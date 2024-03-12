<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Błąd</title>
</head>
<body>
    <h1>Wystąpił błąd</h1>
    <p>Prawdopodobnie podano błędne dane logowania.</p>
    <a href="<%=request.getContextPath() + "/"%>">Powrót do strony głównej</a>
</body>
</html>
