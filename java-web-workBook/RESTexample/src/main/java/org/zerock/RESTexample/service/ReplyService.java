package org.zerock.RESTexample.service;

import org.zerock.RESTexample.dto.PageRequestDTO;
import org.zerock.RESTexample.dto.PageResponseDTO;
import org.zerock.RESTexample.dto.ReplyDTO;

public interface ReplyService {

    Long register(ReplyDTO replyDTO);

    ReplyDTO read(Long rno);

    void modify(ReplyDTO replyDTO);

    void remove(Long rno);

    PageResponseDTO<ReplyDTO> getListOfBoard(Long bno, PageRequestDTO pageRequestDTO);

}
