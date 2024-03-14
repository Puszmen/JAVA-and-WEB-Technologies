<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Expression language</title>
</head>
<body>
    <form action="" method="post">
        <fieldset>
            <div>
                <label for="firstName">Imię</label>
                <input name="firstName" id="firstName">
            </div>
            <div>
                <label for="lastName">Nazwisko</label>
                <input name="lastName" id="lastName">
            </div>
            <div>
                <label for="age">Wiek</label>
                <input name="age" id="age">
            </div>
        </fieldset>
        <input type="submit" value="Wyślij">
    </form>
<%
    if (request.getAttribute("person") != null) {
%>
    <h2>Cześć ${person.firstName}</h2>
    <p style="color: ${person.age ge 18 ? 'green' : 'red'}">
        ${person.age ge 18 ? 'Jesteś pełnoletni(a)' : 'Jesteś nieletni(a)'}
    </p>
    <p>Informacje o Twojej przeglądarce: ${header['user-agent']}</p>
<%
    }
%>
</body>
</html>
