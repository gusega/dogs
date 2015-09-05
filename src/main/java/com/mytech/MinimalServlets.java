package com.mytech;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHandler;

public class MinimalServlets {
    public static class DogServlet extends HttpServlet {
        @Override
        public void doPost(HttpServletRequest req, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html; charset=utf-8");
            response.getWriter().println("<!DOCTYPE html>");
            String breed = req.getParameter("breed");
            int age = Integer.parseInt(req.getParameter("age"));
            Dog dog = new Dog(breed, age);
            response.getWriter().
                println(String.format("<h1>Hello World. Dog created: %s</h1>", dog));
            response.setStatus(HttpServletResponse.SC_CREATED);
        }

        @Override
        public void doGet(HttpServletRequest req, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html; charset=utf-8");
            response.getWriter().println("<!DOCTYPE html>");
            response.getWriter().println("<h1>Hello World. Create a dog.</h1>");
            response.getWriter().println("<form method='post'>");
            response.getWriter().println("<label for='breed'>breed</label>");
            response.getWriter().println("<input type='text' name='breed' id='breed'/>");
            response.getWriter().println("<label for='age'>age</label>");
            response.getWriter().println("<input type='text' name='age' id='age'/>");
            response.getWriter().println("<input type='submit'/>");
            response.getWriter().println("</form>");
            response.setStatus(HttpServletResponse.SC_OK);
        }
    }

    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);
        ServletHandler handler = new ServletHandler();
        server.setHandler(handler);
        handler.addServletWithMapping(DogServlet.class, "/*");
        server.start();
        server.join();
    }
}
