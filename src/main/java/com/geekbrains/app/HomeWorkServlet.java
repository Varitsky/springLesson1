package com.geekbrains.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

@WebServlet(name = "HomeWorkServlet", urlPatterns = "/home_work")
public class HomeWorkServlet extends HttpServlet {
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html; charset=UTF-8");

        String title = "title";
        Product[] array = new Product[10];
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            int cost = random.nextInt(100);
                array[i] = new Product((i+1), title, cost);
            }


        out.printf("<html><body><h1>Product list: <br></h1></body></html>");
        for (Product p : array) {
            out.println(p.productInfo());
            out.println("<br>");
        }

        out.close();
    }
}