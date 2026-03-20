package org.zerock.api01.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.security.access.prepost.PreAuthorize;
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
    @PreAuthorize("hasRole('USER')")
    public List<String> doA(){
        return Arrays.asList("AAA","BBB","CCC");
    }

    //@ApiOperation("Sample Get doB")
    @GetMapping(value = "/doB")
    @PreAuthorize("hasRole('ADMIN')")
    public List<String> doB(){
        return Arrays.asList("AAA","BBB","CCC");
    }
}
