package com.mitrais.jpq1;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/generic")
public class GenericServletImpl extends GenericServlet {

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.setContentType("text/html");
        PrintWriter pw = servletResponse.getWriter();
        pw.println("<html>");
        pw.println("<body>");
        pw.println("<h2>Generic Servlet Test "+servletRequest.getParameter("name")+"</h2>");
        pw.println("</body>");
        pw.println("</html>");
    }
}
