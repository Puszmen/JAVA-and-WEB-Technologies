package pl.javastart.servlets;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloController", value = "/hello")
public class HelloController extends HttpServlet {

    public HelloController() {
        System.out.println("Konstruktor");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("Metoda init");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("Metoda doGet");
    }

    @Override
    public void destroy() {
        System.out.println("Metoda destroy");
    }
}