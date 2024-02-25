<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Title</title>
    </head>
    <body>
        <!-- Deklaracja HTML -->
        <%-- Deklaracja JSP --%>
        <%! String name; %>

        <!-- Inicjalizacja -->
        <% name = "Jan Kowalski"; %>

        <!-- Wyrażenie -->
        <h1>Witaj <%= name %></h1>

        <% for (int i = 0; i < 5; i++) { %>
            <p>Paragraf numer <%= i %></p>
        <% } %>

    </body>
</html>
