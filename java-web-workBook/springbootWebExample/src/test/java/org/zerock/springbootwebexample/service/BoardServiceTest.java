package org.zerock.springbootwebexample.service;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.springbootwebexample.dto.BoardDTO;
import org.zerock.springbootwebexample.dto.PageRequestDTO;
import org.zerock.springbootwebexample.dto.PageResponseDTO;

@SpringBootTest
@Log4j2
public class BoardServiceTest {

    @Autowired
    private BoardService boardService;

    @Test
    public void testRegister(){
        log.info(boardService.getClass().getName());

        BoardDTO boardDTO = BoardDTO.builder()
                .title("register test")
                .content("content test")
                .writer("writer test")
                .build();

        Long bno = boardService.register(boardDTO);

        log.info("bno : " + bno);
    }

    @Test
    public void testUpdate(){

        BoardDTO boardDTO = BoardDTO.builder()
                .bno(2L)
                .title("update")
                .content("update")
                .writer("update")
                .build();

        boardService.modify(boardDTO);

        log.info(boardDTO);
    }

    @Test
    public void testList(){
        PageRequestDTO pageRequestDTO = PageRequestDTO.builder()
//                .type("tcw")
//                .keyword("1")
                .page(1)
                .size(10)
                .build();

        PageResponseDTO<BoardDTO> list = boardService.list(pageRequestDTO);

        log.info(list);

    }
}
