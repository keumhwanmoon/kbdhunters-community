package io.kbdhunters;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "io.kbdhunters.*.mapper")
public class KbdHuntersWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(KbdHuntersWebApplication.class, args);
    }
}