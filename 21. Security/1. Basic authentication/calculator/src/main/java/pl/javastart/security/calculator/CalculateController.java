package pl.javastart.security.calculator;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet("/calculator")
public class CalculateController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double first = Double.parseDouble(request.getParameter("first"));
        double second = Double.parseDouble(request.getParameter("second"));
        String operator = request.getParameter("operator");
        Result result = Calculator.calculate(first, second, operator);
        request.setAttribute("result", result);
        request.getRequestDispatcher("/WEB-INF/result.jsp").forward(request, response);
    }
}