package org.zerock.RESTexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class RESTexampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(RESTexampleApplication.class, args);
    }

}
