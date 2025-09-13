package org.zerock.springwebexample.mapper;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.zerock.springwebexample.domain.TodoVO;
import org.zerock.springwebexample.dto.PageRequestDTO;

import java.time.LocalDate;
import java.util.List;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/root-context.xml")
public class TodoMapperTest {

    @Autowired(required = false)
    private TodoMapper todoMapper;

    @Test
    public void testGetTime(){
        log.info(todoMapper.getTime());
    }

    @Test
    public void testInsert(){

        TodoVO todoVO = TodoVO.builder().
                title("spring test1").
                dueDate(LocalDate.of(2025,9,06)).
                writer("user1").build();

        todoMapper.insert(todoVO);
    }

    @Test
    public void selectAll(){
        List<TodoVO> list = todoMapper.selectAll();

        list.forEach(vo -> log.info(vo));

    }

    @Test
    public void selectOne(){
        TodoVO todoVO = todoMapper.selectOne(3L);

        log.info(todoVO);

    }

    @Test
    public void selectList(){
        PageRequestDTO pageRequestDTO = PageRequestDTO
                .builder()
                .page(1)
                .size(10)
                .build();

        List<TodoVO> list = todoMapper.selectList(pageRequestDTO);

        log.info(list);

    }


}
