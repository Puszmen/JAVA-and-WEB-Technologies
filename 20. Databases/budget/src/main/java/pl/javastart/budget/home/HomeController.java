package pl.javastart.budget.home;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import pl.javastart.budget.BudgetItemDto;
import pl.javastart.budget.BudgetService;
import pl.javastart.budget.BudgetSummaryDto;

import java.io.IOException;
import java.util.List;

@WebServlet("")
public class HomeController extends HttpServlet {
    private BudgetService budgetService = new BudgetService();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<BudgetItemDto> incomes = budgetService.findAllIncomes();
        List<BudgetItemDto> expenses = budgetService.findAllExpenses();
        BudgetSummaryDto summary = budgetService.getSummary();
        request.setAttribute("incomes", incomes);
        request.setAttribute("expenses", expenses);
        request.setAttribute("summary", summary);
        request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
    }
}