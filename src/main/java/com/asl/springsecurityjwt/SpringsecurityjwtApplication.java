package com.asl.springsecurityjwt;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.asl.springsecurityjwt.entity.User;
import com.asl.springsecurityjwt.repository.UserRepository;

@SpringBootApplication
public class SpringsecurityjwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringsecurityjwtApplication.class, args);
	}

	@Autowired
	private UserRepository repository;

	@PostConstruct
	public void initUsers() {

		List<User> users = Stream.of(new User(101, "aslAdmin", "aslAdminPassword", "aslAdmin@gmail.com"),
				new User(102, "Rahul", "rahulPassword", "rahul@gmail.com"),
				new User(103, "Sourav", "souravPassword", "sourav@gmail.com"),
				new User(104, "Atanu", "atanuPassword", "atanu@gmail.com")).collect(Collectors.toList());
		repository.saveAll(users);
	}

}
