package com.highradius.servlets;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
/**
 * Servlet implementation class ReadServlet
 */
@WebServlet("/ReadServlet")
public class ReadServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Logic to read data from the database or any other data source
        // Example:
        String data = "This is the data to be read.";

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Read Servlet</h1>");
        out.println("<p>Data: " + data + "</p>");
    }
}
