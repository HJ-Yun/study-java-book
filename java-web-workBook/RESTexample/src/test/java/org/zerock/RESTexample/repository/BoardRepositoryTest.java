package org.zerock.RESTexample.repository;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;
import org.zerock.RESTexample.domain.Board;
import org.zerock.RESTexample.domain.BoardImage;
import org.zerock.RESTexample.domain.Reply;
import org.zerock.RESTexample.dto.BoardListAllDTO;
import org.zerock.RESTexample.dto.BoardListReplyCountDTO;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.IntStream;

@SpringBootTest
@Log4j2
public class BoardRepositoryTest {

    @Autowired
    private BoardRepository boardRepository;
    @Autowired
    private ReplyRepository replyRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private MemberRepository memberRepository;

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

    @Test
    public void testSearchReplyCount() {

        String[] types = {"t", "c", "w"};

        String keyword = "100";

        Pageable pageable = PageRequest.of(0, 20, Sort.by("bno").descending());

        Page<BoardListReplyCountDTO> result = boardRepository.searchWithReplyCount(types, keyword, pageable);

        log.info("Total Element : " + result.getTotalElements());
        log.info("Total Page : " + result.getTotalPages());
        log.info("Number : " + result.getNumber());
        log.info("Size : " + result.getSize());
        log.info("Previous : " + result.hasPrevious());
        log.info("Next : " + result.hasNext());

        result.getContent().forEach(board -> log.info(board));
    }

    @Test
    public void testInsertImage(){
        Board board = Board.builder()
                .title("image test")
                .content("test content")
                .writer("tester")
                .build();

        for (int i  = 0; i < 3; i++){
            board.addImage(UUID.randomUUID().toString(), "file"+i+".jpg");
        }

        boardRepository.save(board);
    }

    @Test
    public void testSelectImage(){
//        Optional<Board> result = boardRepository.findById(1L);
        Optional<Board> result = boardRepository.findByIdWithImages(1L);
        Board board = result.orElseThrow();

        log.info(board);
        log.info("-------------------------");
        for (BoardImage boardImage : board.getImageSet()){
            log.info(boardImage);
        }
    }

    @Transactional
    @Commit
    @Test
    public void testModifyImage(){
        Optional<Board> result = boardRepository.findByIdWithImages(1L);
        Board board = result.orElseThrow();

        board.clearImages();

        for (int i = 0; i < 2; i++){
            board.addImage(UUID.randomUUID().toString(), "updateFile2"+i+".jpg");
        }

        boardRepository.save(board);
    }

    @Test
    public void testRemoveAll(){
        Long bno = 1L;

        replyRepository.deleteByBoard_Bno(bno);

        boardRepository.deleteById(bno);

    }

    @Test
    public void testInsertAll(){
        for (int i = 1; i < 101; i++){
            Board board = Board.builder()
                    .title("Tittle..."+i)
                    .content("Content..."+i)
                    .writer("Writer..."+i)
                    .build();

            for (int j = 0; j < 3; j++){
                if (i % 5== 0){
                    continue;
                }
                board.addImage(UUID.randomUUID().toString(), i+"file"+j+".jpg");
            }
            boardRepository.save(board);
        }
    }

    @Transactional
    @Test
    public void testSearchImageReplyCount(){
        Pageable pageable = PageRequest.of(0,10,Sort.by("bno").descending());

//        boardRepository.searchWithAll(null,null,pageable);

        Page<BoardListAllDTO> result = boardRepository.searchWithAll(null,null,pageable);

        log.info("------------------");
        log.info(result.getTotalElements());

        result.getContent().forEach(boardListAllDTO -> {
            log.info(boardListAllDTO);
        });
    }

    @Commit
    @Test
    public void updatePassword(){
        String mid = "ユン(윤혁진)";
        String mpw = passwordEncoder.encode("54321");

        memberRepository.updatePassword(mpw, mid);

    }
}
