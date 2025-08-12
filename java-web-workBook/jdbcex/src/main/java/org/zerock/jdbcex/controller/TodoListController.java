package org.zerock.jdbcex.controller;
import lombok.extern.log4j.Log4j2;
import org.zerock.jdbcex.dto.TodoDTO;
import org.zerock.jdbcex.service.TodoService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "todoListController", value = "/todo/list")
@Log4j2
public class TodoListController extends HttpServlet {

    private TodoService todoService = TodoService.INSTANCE;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.info("todo list-----------------------------");

        try {
            List<TodoDTO> dtoList = todoService.selectAll();
            request.setAttribute("todoList", dtoList);
            request.getRequestDispatcher("/WEB-INF/todo/list.jsp").forward(request,response);
        } catch (Exception e){
            log.error(e.getMessage());
            throw new ServletException("List error");
        }
    }
}