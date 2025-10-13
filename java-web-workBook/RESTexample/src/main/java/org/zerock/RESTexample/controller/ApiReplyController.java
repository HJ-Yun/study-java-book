package org.zerock.RESTexample.controller;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.zerock.RESTexample.dto.ReplyDTO;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/replies")
@Log4j2
public class ApiReplyController {

    @Operation(summary = "Reply POST", description = "Post the reply in POST method")
    @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, Long> register(@Valid @RequestBody ReplyDTO replyDTO, BindingResult bindingResult) throws BindException {
        log.info(replyDTO);

        if (bindingResult.hasErrors()){
            throw new BindException(bindingResult);
        }

        Map<String, Long> resultMap = new HashMap<>();
        resultMap.put("rno",11L);

        return resultMap;
    }
}
