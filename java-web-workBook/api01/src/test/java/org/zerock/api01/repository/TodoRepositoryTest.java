package org.zerock.api01.repository;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.zerock.api01.domain.Todo;
import org.zerock.api01.dto.PageRequestDTO;
import org.zerock.api01.dto.TodoDTO;

import java.time.LocalDate;
import java.util.stream.IntStream;

@SpringBootTest
@Log4j2
public class TodoRepositoryTest {

    @Autowired
    private TodoRepository todoRepository;

    @Test
    public void testInsert(){
        IntStream.rangeClosed(1,100).forEach(i -> {
            Todo todo = Todo.builder()
                    .title("toto...."+i)
                    .dueDate(LocalDate.of(2026,(i%12)+1,(i%30)+1))
                    .writer("writer...."+i)
                    .complete(true)
                    .build();

            todoRepository.save(todo);
        });
    }

    @Test
    public void testSearch(){
        PageRequestDTO pageRequestDTO = PageRequestDTO.builder()
                .from(LocalDate.of(2026,1,1))
                .to(LocalDate.of(2026,12,31))
                .build();

        Page<TodoDTO> result = todoRepository.list(pageRequestDTO);

        result.forEach(todoDTO -> log.info(todoDTO));
    }
}
