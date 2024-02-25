<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>JSP with Scriptlets</title>
</head>
<body>
    <h1>JSP with Java Code</h1>
    <%! int iterations = 10; %>

    <ul>
        <%
            for (int i = 0; i < iterations; i++)
                System.out.println("<li>Element number " + i + "</li>");
        %>
    </ul>
</body>
</html>
