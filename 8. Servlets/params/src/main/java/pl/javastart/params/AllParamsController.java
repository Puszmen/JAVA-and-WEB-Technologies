package pl.javastart.params;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

@WebServlet("/allparams")
public class AllParamsController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendError(403, "Nie masz dostępu do tej strony");
//        setContentType(response);
//        sendHtmlResponse(request, response);
    }

    private void setContentType(HttpServletResponse response) {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
    }

    private void sendHtmlResponse(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Map<String, String[]> parameterMap = request.getParameterMap();
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<body>");
        writer.println("<ol>");
        for (String key : parameterMap.keySet()) {
            writer.printf("<li>%s</li>", key);
            writer.println("<ul>");
            for (String value : parameterMap.get(key)) {
                writer.printf("<li>%s</li>", value);
            }
            writer.println("</ul>");
        }
        writer.println("</ol>");
        writer.println("</body>");
        writer.println("</html>");
        for (String key : parameterMap.keySet()) {
            System.out.println(key);
            for (String value : parameterMap.get(key)) {
                System.out.println(" -" + value);
            }
        }
    }

}