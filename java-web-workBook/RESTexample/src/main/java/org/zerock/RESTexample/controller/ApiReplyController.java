package org.zerock.RESTexample.controller;

import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.zerock.RESTexample.dto.ReplyDTO;

import java.util.Map;

@RestController
@RequestMapping("/api/replies")
@Log4j2
public class ApiReplyController {

    @Operation(summary = "Reply POST", description = "Post the reply in POST method")
    @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, Long>> register(@RequestBody ReplyDTO replyDTO) {
        log.info(replyDTO);

        Map<String, Long> resultMap = Map.of("rno", 11L);

        return ResponseEntity.ok(resultMap);
    }
}
