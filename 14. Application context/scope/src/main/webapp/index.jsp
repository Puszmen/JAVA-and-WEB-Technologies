<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Notatnik</title>
</head>
    <body>
        <h1>Notatnik</h1>
            <form action="save" method="post">
                <fieldset>
                    <label for="noteId">Identyfikator notatki</label>
                    <input name="noteId" id="noteId">
                </fieldset>
                <fieldset>
                    <label for="noteContent">Treść notatki</label>
                    <textarea name="noteContent" id="noteContent"></textarea>
                </fieldset>
                <fieldset>
                    <label for="privateNote">Notatka prywatna</label>
                    <input type="radio" name="noteType" value="private" id="privateNote" checked>
                    <label for="publicNote">Notatka publiczna</label>
                    <input type="radio" name="noteType" value="public" id="publicNote">
                </fieldset>
                <input type="submit" value="Zapisz"></input>
            </form>
    </body>
</html>
