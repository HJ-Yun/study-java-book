package org.zerock.RESTexample.service;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.RESTexample.dto.ReplyDTO;

@SpringBootTest
@Log4j2
public class ReplyServiceTest {

    @Autowired
    private ReplyService replyService;

    @Test
    public void testResist(){
        ReplyDTO replyDTO = ReplyDTO.builder()
                .replyText("replyText")
                .replyer("testUser")
                .bno(1100L)
                .build();

        log.info(replyService.register(replyDTO));

    }

}
