package com.amit.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amit.model.User;
import com.amit.service.UserService;

@RestController
public class HomeController {

	@Autowired
	private UserService user;

    @GetMapping("/register")
    public String test() {
        return "register successful";
    }

    @GetMapping("/users")
    public List<User> GetUsers() {
    	return user.getAllUser();
    }
}
