package org.zerock.demo.todo.service;

import org.zerock.demo.todo.dto.TodoDTO;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public enum TodoService {
    INSTANCE;

    public void register(TodoDTO todoDTO) {
        System.out.println("Debug............." +  todoDTO);
    }

    public List<TodoDTO> getList() {
        List<TodoDTO> todoDTOS = IntStream.range(0, 10).mapToObj(i ->
        {
            TodoDTO dto = new TodoDTO();
            dto.setTno((long) i);
            dto.setTittle("Todo..." + i);
            dto.setDueDate(LocalDate.now());
            return dto;
        }).collect(Collectors.toList());

        return todoDTOS;
    }

    public TodoDTO get(Long tno){
        TodoDTO todoDTO = new TodoDTO();

        todoDTO.setTno(tno);
        todoDTO.setTittle("Sample dto");
        todoDTO.setDueDate(LocalDate.now());
        todoDTO.setFinished(true);

        return todoDTO;
    }
}
