package org.zerock.jdbcex.controller;

import lombok.extern.log4j.Log4j2;
import org.zerock.jdbcex.dto.TodoDTO;
import org.zerock.jdbcex.service.TodoService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "todoReadController", value = "/todo/read")
@Log4j2
public class TodoReadController extends HttpServlet {

    private TodoService todoService = TodoService.INSTANCE;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.info("todo read-----------------------------------");
        try {
            Long tno = Long.valueOf(request.getParameter("tno"));
            TodoDTO dto = todoService.get(tno);

            request.setAttribute("read", dto);
            request.getRequestDispatcher("/WEB-INF/todo/read.jsp").forward(request,response);

        } catch (Exception e){
            log.error(e.getMessage());
            throw new ServletException("Read Error");
        }
    }
}