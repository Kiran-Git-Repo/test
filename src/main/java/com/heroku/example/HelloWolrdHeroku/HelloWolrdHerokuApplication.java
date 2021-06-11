package com.heroku.example.HelloWolrdHeroku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWolrdHerokuApplication {
	
	@GetMapping("/")
	public String returnMessage(){
		return "This can return ur name";
	}

	@GetMapping("message/{name}")
	public String returnName(@PathVariable String name){
		return "ur name is "+name;
	}
	public static void main(String[] args) {
		SpringApplication.run(HelloWolrdHerokuApplication.class, args);
	}

	
}
