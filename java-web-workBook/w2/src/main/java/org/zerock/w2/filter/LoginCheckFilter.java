package org.zerock.w2.filter;

import lombok.extern.log4j.Log4j2;
import org.zerock.w2.dto.MemberDTO;
import org.zerock.w2.service.MemberService;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Arrays;
import java.util.Optional;

@WebFilter(urlPatterns = {"/todo/*"})
@Log4j2
public class LoginCheckFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.info("Login check filter---------------");

        HttpServletRequest request1 = (HttpServletRequest) request;
        HttpServletResponse response1 = (HttpServletResponse) response;

        HttpSession session = request1.getSession();

        if (session.getAttribute("loginInfo") != null){
            chain.doFilter(request,response);
            return;
        }

        Cookie cookie = findCookie(request1.getCookies(), "remember-me");
        if (cookie == null){
            response1.sendRedirect("/login");
            return;
        }

        log.info("Cookie Exist-------------------");
        String uuid = cookie.getValue();

        try {
            MemberDTO memberDTO = MemberService.INSTANCE.getByUUID(uuid);

            log.info("User info : " + memberDTO);
            if (memberDTO == null){
                throw new Exception("There is no User Info");
            }
            session.setAttribute("userInfo", memberDTO);
            chain.doFilter(request,response);
        } catch (Exception e) {
            e.printStackTrace();
            response1.sendRedirect("/login");
        }

        chain.doFilter(request,response);
    }

    private Cookie findCookie (Cookie[] cookies, String name) {
        if (cookies == null || cookies.length == 0) {
            return null;
        }

        Optional<Cookie> result = Arrays.stream(cookies)
                .filter(ck -> ck.getName().equals(name))
                .findFirst();

        return result.isPresent() ? result.get() : null;


    }
}
