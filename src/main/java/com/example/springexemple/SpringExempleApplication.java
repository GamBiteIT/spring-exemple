package com.example.springexemple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringExempleApplication {

    @GetMapping("/welcome")
    public String message(){
        return "Welcome";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringExempleApplication.class, args);
    }

}
