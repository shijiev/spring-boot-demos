package io.shijiev.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("io.shijiev.demo.mapper")
public class SpringBootH2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootH2Application.class, args);
    }

}
