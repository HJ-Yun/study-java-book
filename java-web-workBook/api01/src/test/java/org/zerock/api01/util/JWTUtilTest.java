package org.zerock.api01.util;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

@SpringBootTest
@Log4j2
public class JWTUtilTest {

    @Autowired
    private JWTUtil jwtUtil;

    @Test
    public void testGenerate(){
        Map<String,Object> claimMap = Map.of("mid","ABCDE");

        String jwtStr = jwtUtil.generateToken(claimMap,1);

        log.info(jwtStr);
    }

    @Test
    public void testValidate(){
        String jwt = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzM4NCJ9.eyJtaWQiOiJBQkNERSIsImlhdCI6MTc3MDQ0MzM1NywiZXhwIjoxNzcwNDQzNDE3fQ.tEywsOWndU1jAG63HfvmYF80uLMfKScrc670X5M9otTvfsZZ4ogktavHVnmGL52K";

        Map<String,Object> claim = jwtUtil.validateToken(jwt);

        log.info(claim);
    }

    @Test
    public void testAll(){
        String jwtStr = jwtUtil.generateToken(Map.of("mid","AAAA","email","aaaa@bbb.com"),1);
        log.info(jwtStr);

        Map<String,Object> claim = jwtUtil.validateToken(jwtStr);
        log.info("mid : " + claim.get("mid"));
        log.info("email : " + claim.get("email"));
    }
}
