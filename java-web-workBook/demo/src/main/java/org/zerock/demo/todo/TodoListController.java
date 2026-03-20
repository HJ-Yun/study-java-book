package org.zerock.demo.todo;

import org.zerock.demo.todo.service.TodoService;
import org.zerock.demo.todo.dto.TodoDTO;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "todoListController", urlPatterns = "/todo/list")
public class TodoListController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("todoListController doGet");

        List<TodoDTO> todoDTOS = TodoService.INSTANCE.getList();

        request.setAttribute("list", todoDTOS);

        request.getRequestDispatcher("/WEB-INF/todo/list.jsp").forward(request, response);

    }
}