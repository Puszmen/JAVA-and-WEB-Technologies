package pl.javastart.cookies;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet("/remove")
public class RemoveController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie removeVisitsCookie = new Cookie("visits", "");
        removeVisitsCookie.setMaxAge(0);
        response.addCookie(removeVisitsCookie);
        request.getRequestDispatcher("/removeConfirm.jsp").forward(request, response);
    }

}