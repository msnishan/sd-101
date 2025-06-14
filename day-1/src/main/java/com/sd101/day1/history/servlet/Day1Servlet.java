package com.sd101.day1.history.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/day-one")
public class Day1Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html lang=\"en\">");
        out.println("<head>");
        out.println("    <meta charset=\"UTF-8\">");
        out.println("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
        out.println("    <title>Welcome</title>");
        out.println("    <style>");
        out.println("        body { font-family: Arial, sans-serif; background: #f4f4f4; padding: 2rem; }");
        out.println("        h1 { color: #333; }");
        out.println("        .container { background: white; padding: 1.5rem; border-radius: 8px; box-shadow: 0 0 10px rgba(0,0,0,0.1); }");
        out.println("    </style>");
        out.println("</head>");
        out.println("<body>");
        out.println("    <div class=\"container\">");
        out.println("        <h1>HTML from Java Servlet!</h1>");
        out.println("        <p>This page was generated by a servlet.</p>");
        out.println("        <p><strong>Current Time:</strong> " + java.time.LocalDateTime.now() + "</p>");
        out.println("    </div>");
        out.println("</body>");
        out.println("</html>");

    }
}
