package com.example.todolist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@ComponentScan("com.example")
@SpringBootApplication
@EnableSwagger2
public class ToDoListApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ToDoListApplication.class, args);
	}

}
