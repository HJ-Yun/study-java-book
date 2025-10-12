package org.zerock.RESTexample.service;

import org.zerock.RESTexample.dto.BoardDTO;
import org.zerock.RESTexample.dto.PageRequestDTO;
import org.zerock.RESTexample.dto.PageResponseDTO;

public interface BoardService {

    Long register(BoardDTO boardDTO);

    BoardDTO readOne(Long bno);

    void modify(BoardDTO boardDTO);

    void remove(Long bno);

    PageResponseDTO<BoardDTO> list(PageRequestDTO pageRequestDTO);
}
