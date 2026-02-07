package org.zerock.api01.util;

import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
@Log4j2
public class JWTUtil {

    @Value("${org.zerock.jwt.secret}")
    private String key;

    public String generateToken(Map<String, Object> valueMap,int days){
        log.info("generateKey...." + key);

        // Header
        Map<String,Object> headers = new HashMap<>();
        headers.put("typ","JWT");
        headers.put("alg","HS256");

        // Payload
        Map<String,Object> payload = new HashMap<>();
        payload.putAll(valueMap);

        int time = (60 * 24) * days;

        SecretKey secretKey = Keys.hmacShaKeyFor(
                key.getBytes(StandardCharsets.UTF_8)
        );

        String jwtStr = Jwts.builder()
                .setHeader(headers)
                .setClaims(payload)
                .setIssuedAt(Date.from(ZonedDateTime.now().toInstant()))
                .setExpiration(Date.from(ZonedDateTime.now().plusDays(time).toInstant()))
                .signWith(secretKey)
                .compact();

        return jwtStr;
    }

    public Map<String,Object> validateToken(String token) throws JwtException{
        Map<String,Object> claim = null;

        SecretKey secretKey = Keys.hmacShaKeyFor(
                key.getBytes(StandardCharsets.UTF_8)
        );

        claim = Jwts.parser()
                .setSigningKey(secretKey)
                .parseClaimsJws(token)
                .getBody();

        return claim;
    }
}
