package com.demo.render.renderdemo;

import java.util.List;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.render.renderdemo.model.User;
import com.demo.render.renderdemo.service.UserService;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class RenderDemoApplication {

	private final UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(RenderDemoApplication.class, args);
	}

	@PostConstruct
	public void initDb() {
		userService.saveAll(
			List.of(
				new User("USA", 5),
				new User("France", 4),
				new User("Brazil", 3),
				new User("Italy", 2),
				new User("Canada", 1)
				)
			);
	}

}
