package sylu.spring.beans.annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sylu.spring.beans.annotation.service.UserService;

@Component
public class UserController {
	@Autowired
	private UserService userService;

	public void execute() {
		System.out.println("UserController execute...");
		userService.add();

	}
}
