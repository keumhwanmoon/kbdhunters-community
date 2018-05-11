package io.kbdhunters;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEncryptableProperties
@MapperScan(basePackages = "io.kbdhunters.*.mapper")
public class KbdHuntersWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(KbdHuntersWebApplication.class, args);
    }
}