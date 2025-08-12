package org.zerock.w2.controller;

import lombok.extern.log4j.Log4j2;
import org.zerock.w2.dto.TodoDTO;
import org.zerock.w2.service.TodoService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@WebServlet(name="todoRegisterController", value = "/todo/register")
@Log4j2
public class TodoRegisterController extends HttpServlet {

    private TodoService todoService = TodoService.INSTANCE;
    final private DateTimeFormatter DATEFORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.info("todo register doGet---------------");

        HttpSession session = request.getSession();

        if (session.isNew()){
            log.info("NO JSESSIONID");
            response.sendRedirect("/login");
            return;
        }

        if (session.getAttribute("loginInfo") == null){
            log.info("No Login Info");
            response.sendRedirect("/login");
            return;
        }

        request.getRequestDispatcher("/WEB-INF/todo/register.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.info("todo register doPost---------------");
        TodoDTO todoDTO = TodoDTO.builder()
                .title(request.getParameter("title"))
                .dueDate(LocalDate.parse(request.getParameter("dueDate"),DATEFORMATTER))
                .build();
        log.info("/todo/register/ POST--------------");
        log.info(todoDTO);

        try {
            todoService.register(todoDTO);
        } catch (Exception e){
            log.error(e.getMessage());

        }

        response.sendRedirect("/todo/list");
    }
}