package org.zerock.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.zerock.w2.domain.TodoVO;
import org.zerock.w2.dao.TodoDAO;

import java.time.LocalDate;
import java.util.List;

public class TodoDAOTests {

    private TodoDAO todoDAO;

    @BeforeEach
    public void ready(){
        todoDAO=new TodoDAO();
    }

    @Test
    public void testTime() throws Exception{
        System.out.println(todoDAO.getTime());
    }

    @Test
    public void testInsert() throws Exception{
        TodoVO todoVO = TodoVO.builder()
                .title("Sample Tittle")
                .dueDate(LocalDate.of(2025,07,25))
                .build();
        todoDAO.insert(todoVO);
    }

    @Test
    public void testSelectAll() throws Exception{
        List<TodoVO> todoVOList = todoDAO.selectAll();
        todoVOList.forEach(System.out::println);
    }

    @Test
    public void testSelectOne() throws Exception{
        TodoVO todoVO = todoDAO.selectOne(1L);
        System.out.println(todoVO);
    }

    @Test
    public void testDelete() throws Exception{
        todoDAO.deleteOne(2L);
    }

    @Test
    public void testUpdate() throws Exception{
        TodoVO todoVO = TodoVO.builder()
                .tno(1L)
                .title("Update")
                .dueDate(LocalDate.of(2025,8,1))
                .finished(true)
                .build();
        todoDAO.updateOne(todoVO);
    }

}
