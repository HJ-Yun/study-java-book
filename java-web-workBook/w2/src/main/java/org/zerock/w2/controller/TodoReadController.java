package org.zerock.w2.controller;

import lombok.extern.log4j.Log4j2;
import org.zerock.w2.dto.TodoDTO;
import org.zerock.w2.service.TodoService;

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

            Cookie viewTodoCookie = findCookie(request.getCookies(), "viewTodos");
            String todoListStr = viewTodoCookie.getValue();
            boolean exist = false;

            if (todoListStr != null && todoListStr.indexOf(tno + "-") >= 0){
                exist = true;
            }

            log.info("exist : " + exist);

            if (!exist){
                todoListStr += tno + "-";
                viewTodoCookie.setValue(todoListStr);
                viewTodoCookie.setMaxAge(60*60*24);
                viewTodoCookie.setPath("/");
                response.addCookie(viewTodoCookie);
            }

            request.getRequestDispatcher("/WEB-INF/todo/read.jsp").forward(request,response);

        } catch (Exception e){
            log.error(e.getMessage());
            throw new ServletException("Read Error");
        }
    }

    private Cookie findCookie(Cookie[] cookies, String cookieName){
        Cookie targetCookie = null;

        if (cookies != null && cookies.length > 0){
            for (Cookie ck : cookies){
                if (ck.getName().equals(cookieName)){
                    targetCookie = ck;
                    break;
                }
            }
        }

        if (targetCookie == null){
            targetCookie = new Cookie(cookieName, "");
            targetCookie.setPath("/");
            targetCookie.setMaxAge(60*60*24);
        }
        return targetCookie;
    }
}

