package org.zerock.api01.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/sample")
public class SampleController {

    //@ApiOperation("Sample Get doA")
    @Operation(summary = "Reply register", description = "Add reply in Board")
    @GetMapping(value = "/doA")
    public List<String> doA(){
        return Arrays.asList("AAA","BBB","CCC");
    }
}
