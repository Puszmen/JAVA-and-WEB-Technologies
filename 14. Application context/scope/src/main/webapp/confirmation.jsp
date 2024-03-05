<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Notatka zapisana</title>
</head>
    <body>
        <h2>Notatka została zapisana</h2>
        <a href="<%=request.getAttribute("noteUrl")%>">Przejdź do notatki</a>
    </body>
</html>
