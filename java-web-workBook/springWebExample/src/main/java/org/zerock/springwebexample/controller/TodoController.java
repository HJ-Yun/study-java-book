package org.zerock.springwebexample.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.springwebexample.dto.TodoDTO;
import org.zerock.springwebexample.service.TodoService;

import javax.validation.Valid;

@Controller
@RequestMapping("/todo")
@Log4j2
@RequiredArgsConstructor
public class TodoController {

    private final TodoService todoService;

    @RequestMapping("/list")
    public void list(Model model){
        log.info("todo List--------");

        model.addAttribute("dtoList", todoService.getAll());

    }

    @GetMapping("/register")
    public void registerGet(){
        log.info("todo Register Get--------");
    }

    @PostMapping("/register")
    public String registerPost(@Valid TodoDTO todoDTO, BindingResult bindingResult, RedirectAttributes redirectAttributes){
        log.info("todo Register Post---------");

        if (bindingResult.hasErrors()){
            log.info("has error-----------------");
            redirectAttributes.addFlashAttribute("errors",bindingResult.getAllErrors());
            return "redirect:/todo/register";
        }

        log.info(todoDTO);
        todoService.register(todoDTO);

        return "redirect:/list";

    }

    @GetMapping({"/read", "/modify"})
    public void readGet(Long tno, Model model){
        TodoDTO todoDTO = todoService.getOne(tno);
        log.info(todoDTO);

        model.addAttribute("dto", todoDTO);

    }

    @PostMapping("/remove")
    public String removePost(Long tno, RedirectAttributes redirectAttributes){
        log.info("---------remove-------------------");
        log.info("tno : " + tno);

        todoService.removeOne(tno);

        return "redirect:/todo/list";
    }

    @PostMapping("/modify")
    public String modifyOne(@Valid TodoDTO todoDTO, BindingResult bindingResult, RedirectAttributes redirectAttributes){
        log.info("---------modify-------------------");

        if (bindingResult.hasErrors()){
            log.info("has error-----------------");
            redirectAttributes.addFlashAttribute("errors",bindingResult.getAllErrors());

            redirectAttributes.addAttribute("tno", todoDTO.getTno());
            return "redirect:/todo/modify";
        }

        log.info("todoDTO : " + todoDTO);
        todoService.modifyOne(todoDTO);

        return "redirect:/todo/list";
    }


}
