package org.zerock.demo.calcSample;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "inputController", urlPatterns = "/calc/input")
public class InputController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("InputController doGet");

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/calcSample/calc_input.jsp");

        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("InputController doPost");

        String num3 = request.getParameter("num3");
        String num4 = request.getParameter("num4");

        System.out.println("num3 : " + num3);
        System.out.println("num4 : " + num4);

        response.sendRedirect("/index");

    }
}