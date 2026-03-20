package org.zerock.springwebexample.service;

import org.zerock.springwebexample.dto.PageRequestDTO;
import org.zerock.springwebexample.dto.PageResponseDTO;
import org.zerock.springwebexample.dto.TodoDTO;

import java.util.List;

public interface TodoService {

    void register(TodoDTO todoDTO);

    //List<TodoDTO> getAll();
    PageResponseDTO<TodoDTO> getList(PageRequestDTO pageRequestDTO);

    TodoDTO getOne(Long tno);

    void removeOne(Long tno);

    void modifyOne(TodoDTO todoDTO);

}
