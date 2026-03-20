package org.zerock.RESTexample.controller;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.zerock.RESTexample.dto.PageRequestDTO;
import org.zerock.RESTexample.dto.PageResponseDTO;
import org.zerock.RESTexample.dto.ReplyDTO;
import org.zerock.RESTexample.service.ReplyService;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/replies")
@Log4j2
@RequiredArgsConstructor
public class ReplyController {

    private final ReplyService replyService;

    @Operation(summary = "Reply register", description = "Add reply in Board")
    @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, Long> register(@Valid @RequestBody ReplyDTO replyDTO, BindingResult bindingResult) throws BindException {
        log.info(replyDTO);

        if (bindingResult.hasErrors()){
            throw new BindException(bindingResult);
        }

        Map<String,Long> resultMap = new HashMap<>();

        Long rno = replyService.register(replyDTO);

        resultMap.put("rno",rno);

        return resultMap;
    }

    @Operation(summary = "Reply getList", description = "Get list of reply")
    @GetMapping(value = "/list/{bno}")
    public PageResponseDTO<ReplyDTO> getList(@PathVariable("bno") Long bno, PageRequestDTO pageRequestDTO){

        PageResponseDTO<ReplyDTO> responseDTO = replyService.getListOfBoard(bno, pageRequestDTO);

        return responseDTO;
    }

    @Operation(summary = "Reply getReply", description = "Get one reply")
    @GetMapping(value = "/{rno}")
    public ReplyDTO getReplyDTO(@PathVariable("rno") Long rno){

        ReplyDTO replyDTO = replyService.read(rno);

        return replyDTO;
    }

    @Operation(summary = "Reply delete", description = "Delete one reply")
    @DeleteMapping(value = "/{rno}")
    public Map<String,Long> remove(@PathVariable("rno") Long rno){

        replyService.remove(rno);

        Map<String,Long> resultMap = new HashMap<>();

        resultMap.put("rno",rno);

        return resultMap;
    }

    @Operation(summary = "Reply modify", description = "Modify one reply")
    @PutMapping(value = "/{rno}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Map<String,Long> modify(@PathVariable("rno") Long rno, @RequestBody ReplyDTO replyDTO){

        replyDTO.setRno(rno);

        replyService.modify(replyDTO);

        Map<String,Long> resultMap = new HashMap<>();

        resultMap.put("rno",replyDTO.getRno());

        return resultMap;
    }
}
