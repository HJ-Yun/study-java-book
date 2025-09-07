package org.zerock.springwebexample.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.zerock.springwebexample.domain.TodoVO;
import org.zerock.springwebexample.dto.TodoDTO;
import org.zerock.springwebexample.mapper.TodoMapper;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Log4j2
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService{

    private final TodoMapper todoMapper;

    private final ModelMapper modelMapper;

    @Override
    public void register(TodoDTO todoDTO){
        log.info(modelMapper);

        TodoVO todoVO = modelMapper.map(todoDTO, TodoVO.class);
        log.info(todoVO);

        todoMapper.insert(todoVO);
    }

    @Override
    public List<TodoDTO> getAll(){
        List<TodoDTO> dtoList = todoMapper.selectAll().stream()
                .map(vo -> modelMapper.map(vo, TodoDTO.class))
                .collect(Collectors.toList());

        return dtoList;
    }

    @Override
    public TodoDTO getOne(Long tno){
        TodoDTO dto = modelMapper.map(todoMapper.selectOne(tno), TodoDTO.class);

        return dto;
    }

    @Override
    public void removeOne(Long tno){
        todoMapper.deleteOne(tno);
    }

    @Override
    public void modifyOne(TodoDTO todoDTO){
        TodoVO todoVO = modelMapper.map(todoDTO, TodoVO.class);
        todoMapper.updateOne(todoVO);
    }


}
