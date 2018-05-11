package io.kbdhunters;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
@EnableEncryptableProperties
@MapperScan(basePackages = "io.kbdhunters.*.mapper")
public class KbdHuntersWebApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(KbdHuntersWebApplication.class);

    }

    public static void main(String[] args) {
        SpringApplication.run(KbdHuntersWebApplication.class, args);
    }
}