package pl.javastart.password_form;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/verify")
public class PasswordCheckController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String password = request.getParameter("password");
        List<String> unsatisfiedConstraints = PasswordValidator.checkPasswordStrength(password);
        sendResponse(response, unsatisfiedConstraints, password);
    }

    private void sendResponse(HttpServletResponse response, List<String> unsatisfiedConstraints, String password) throws IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter writer = response.getWriter();
        writer.println("<!DOCTYPE html>");
        writer.println("<html>");
        writer.print("<body>");
        writer.println("<h1>Twoje hasło to: " + password + "</h1>");
        if (unsatisfiedConstraints.isEmpty()) {
            writer.println("<p>Hasło spełnia wszystkie kryteria bezpieczeństwa</p>");
        } else {
            writer.println("<ul>");
            unsatisfiedConstraints.forEach(constraint -> writer.println("<li>" + constraint + "</li>"));
            writer.println("</ul>");
        }
        writer.print("</body>");
        writer.println("</html>");
    }
}