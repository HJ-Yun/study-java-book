package org.zerock.springwebexample.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.zerock.springwebexample.dto.TodoDTO;

@Controller
@RequestMapping("/todo")
@Log4j2
public class TodoController {

    @RequestMapping("/list")
    public void list(){
        log.info("todo List--------");
    }

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
