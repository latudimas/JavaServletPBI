package com.mitrais.jpq1;

import java.io.Console;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/LifeCycle")
public class LifeCycle extends GenericServlet {

    @Override
    public void init() {
        // initialize the servlet, and print something in the console.
        System.out.println("Servlet Initialized!");
    }

    @Override
    public void service(ServletRequest request, ServletResponse response)
            throws ServletException, IOException {

        // the service method will
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("Servlet called from jsp page!");
    }

    @Override
    public void destroy() {
        System.out.println("Servlet destroyed");
        // close connections etc.
    }
}