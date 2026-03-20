package org.zerock.jdbcex.controller;

import lombok.extern.log4j.Log4j2;
import org.zerock.jdbcex.service.TodoService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "todoRemoveController", value = "/todo/remove")
@Log4j2
public class TodoRemoveController extends HttpServlet {

    private TodoService todoService = TodoService.INSTANCE;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.info("todo remove doPost---------------");
        Long tno = Long.valueOf(request.getParameter("tno"));

        try {
            todoService.delete(tno);
        } catch (Exception e){
            log.error(e.getMessage());
            throw new ServletException("Remove Error");
        }

        response.sendRedirect("/todo/list");
    }
}