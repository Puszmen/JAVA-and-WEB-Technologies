<%@ page import="pl.javastart.notes.Note" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Twoja notatka</title>
</head>
    <body>
        <% Note note = (Note) request.getAttribute("note");
            if (note != null) {
        %>
            <h2>Twoja notatka <%=note.getId()%></h2>
            <p><%=note.getContent()%></p>
        <%
            } else {
        %>
            <h2>Brak notatki o takim ID</h2>
        <%
            }
        %>

    </body>
</html>
