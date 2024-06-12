package com.Helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootWarExample2 extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootWarExample2.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWarExample2.class, args);
    }

    @RequestMapping("/")
    public String helloWorld() {
        return "Hello, World! Please visit my github profile and view my projects";
    }
}
