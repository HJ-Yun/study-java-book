package org.zerock.springbootwebexample.service;

import org.zerock.springbootwebexample.dto.BoardDTO;
import org.zerock.springbootwebexample.dto.PageRequestDTO;
import org.zerock.springbootwebexample.dto.PageResponseDTO;

public interface BoardService {

    Long register(BoardDTO boardDTO);

    BoardDTO readOne(Long bno);

    void modify(BoardDTO boardDTO);

    void remove(Long bno);

    PageResponseDTO<BoardDTO> list(PageRequestDTO pageRequestDTO);
}
