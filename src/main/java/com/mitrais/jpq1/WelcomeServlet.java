package com.mitrais.jpq1;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = (String) req.getSession().getAttribute("name");
        req.setAttribute("name", name);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("welcome.jsp");
        requestDispatcher.forward(req, resp);
    }
}
