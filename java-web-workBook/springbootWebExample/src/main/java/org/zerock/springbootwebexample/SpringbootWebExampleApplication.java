package org.zerock.springbootwebexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringbootWebExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootWebExampleApplication.class, args);
    }

}
