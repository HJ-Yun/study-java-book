package org.zerock.springbootwebexample.repository;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.zerock.springbootwebexample.domain.Board;

import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

@SpringBootTest
@Log4j2
public class BoardRepositoryTest {

    @Autowired
    private BoardRepository boardRepository;

    @Test
    public void testInsert(){
        IntStream.rangeClosed(1,100).forEach(i -> {
            Board board = Board.builder()
                    .title("test---" + i)
                    .content("content---" + i)
                    .writer("user---" + (i % 10))
                    .build();

            Board result = boardRepository.save(board);
            log.info("bno : " + result.getBno());
        });
    }

    @Test
    public void testSelect(){
        Long bno = 10L;

        Optional<Board> result = boardRepository.findById(bno);

        Board board = result.orElseThrow();

        log.info(board);
    }

    @Test
    public void testUpdate(){
        Long bno = 2L;

        Optional<Board> result = boardRepository.findById(bno);

        Board board = result.orElseThrow();

        board.change("update---","update---");

        boardRepository.save(board);

    }

    @Test
    public void testDelete(){
        Long bno = 1L;

        boardRepository.deleteById(bno);

    }

    @Test
    public void testPaging(){
        Pageable pageable = PageRequest.of(0,10, Sort.by("bno").descending());

        Page<Board> result = boardRepository.findAll(pageable);

        log.info("total count : " + result.getTotalElements());
        log.info("total pages : " + result.getTotalPages());
        log.info("page number : " + result.getNumber());
        log.info("page size : " + result.getSize());

        List<Board> list = result.getContent();

        list.forEach(board -> log.info(board));

    }

    @Test
    public void testSearch1(){
        Pageable pageable = PageRequest.of(0,10, Sort.by("bno").descending());

        Page<Board> result = boardRepository.search1(pageable);

    }

    @Test
    public void testSearchAll(){

        String[] types = {"t", "c", "w"};

        String keyword = "1";

        Pageable pageable = PageRequest.of(0,10, Sort.by("bno").descending());

        Page<Board> result = boardRepository.searchAll(types,keyword,pageable);

        log.info("Total Element : " + result.getTotalElements());
        log.info("Total Page : " + result.getTotalPages());
        log.info("Number : " + result.getNumber());
        log.info("Size : " + result.getSize());
        log.info("Previous : " + result.hasPrevious());
        log.info("Next : " + result.hasNext());

        result.getContent().forEach(board -> log.info(board));
    }


}
