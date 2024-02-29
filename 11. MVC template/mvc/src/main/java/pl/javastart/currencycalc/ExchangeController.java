package pl.javastart.currencycalc;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;

@WebServlet("/convert")
public class ExchangeController extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (validateParameters(request)) {
            successDispatch(request, response);
        } else {
            errorDispatch(request, response);
        }
    }

    private boolean validateParameters(HttpServletRequest request) {
        String exchangeParameter = request.getParameter("exchange");
        if (exchangeParameter == null || "".equals(exchangeParameter)) {
            request.setAttribute("message", "Typ wymiany nie został określony");
            return false;
        } else {
            ExchangeType[] values = ExchangeType.values();
            boolean invalidExchangeType = Arrays.stream(values)
                    .map(Enum::toString)
                    .noneMatch(exchangeType -> exchangeType.equals(exchangeParameter));
            if (invalidExchangeType) {
                request.setAttribute("message", "Nieznany typ wymiany " + exchangeParameter);
                return false;
            }
        }
        String value = request.getParameter("value");
        if (value == null || "".equals(value)) {
            request.setAttribute("message", "Kwota nie została określona");
            return false;
        } else if (!value.matches("-?\\d+(\\.\\d+)?")) {
            request.setAttribute("message", "Nieprawidłowy numerek");
            return false;
        }
        return true;
    }

    private static void successDispatch(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String valueString = request.getParameter("value");
        BigDecimal value = new BigDecimal(valueString);
        String exchangeString = request.getParameter("exchange");
        ExchangeType exchangeType = ExchangeType.valueOf(exchangeString);
        ExchangeResult exchangeResult = ExchangeCalculator.exchange(value, exchangeType);
        request.setAttribute("result", exchangeResult);
        request.getRequestDispatcher("/result.jsp").forward(request, response);
    }

    private void errorDispatch(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("error.jsp").forward(request, response);
    }
}