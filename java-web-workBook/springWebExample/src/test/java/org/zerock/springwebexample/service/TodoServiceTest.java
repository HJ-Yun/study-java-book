package org.zerock.springwebexample.service;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.zerock.springwebexample.domain.TodoVO;
import org.zerock.springwebexample.dto.PageRequestDTO;
import org.zerock.springwebexample.dto.PageResponseDTO;
import org.zerock.springwebexample.dto.TodoDTO;
import org.zerock.springwebexample.mapper.TodoMapper;

import java.time.LocalDate;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/root-context.xml")
public class TodoServiceTest {

    @Autowired
    private TodoService todoService;

    @Test
    public void testInsert(){

        TodoDTO todoDTO = TodoDTO.builder().
                title("spring test2").
                dueDate(LocalDate.now()).
                writer("user1").build();

        todoService.register(todoDTO);

    }

    @Test
    public void testPaging(){

        PageRequestDTO pageRequestDTO = PageRequestDTO.builder().page(1).size(10).build();
        PageResponseDTO<TodoDTO> pageResponseDTO = todoService.getList(pageRequestDTO);

        log.info(pageResponseDTO);

        pageResponseDTO.getDtoList().stream().forEach(todoDTO -> log.info(todoDTO));

    }

        
}
