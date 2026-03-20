package org.zerock.demo.todo;

import org.zerock.demo.todo.service.TodoService;
import org.zerock.demo.todo.dto.TodoDTO;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "todoReadController", urlPatterns = "/todo/read")
public class TodoReadController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("todoReadController doGet");

        // /todo/read?tno=123
        Long tno = Long.parseLong(request.getParameter("tno"));
        TodoDTO dto = TodoService.INSTANCE.get(tno);

        request.setAttribute("dto", dto);

        request.getRequestDispatcher("/WEB-INF/todo/read.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}