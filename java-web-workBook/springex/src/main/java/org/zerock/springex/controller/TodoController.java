package org.zerock.springex.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.zerock.springex.dto.TodoDTO;

import java.time.LocalDate;

@Controller
@RequestMapping("/todo")
@Log4j2
public class TodoController {

    @RequestMapping("/list")
    public void list(){
        log.info("todo List--------");
    }

//    @RequestMapping(value = "register", method = RequestMethod.GET)
//    public void register(){
//        log.info("todo Register--------");
//    }

    @GetMapping("/register")
    public void registerGet(){
        log.info("todo Register Get--------");
    }

    @PostMapping("/register")
    public void registerPost(TodoDTO todoDTO){
        log.info("todo Register Post---------");
        log.info(todoDTO);
    }

}
