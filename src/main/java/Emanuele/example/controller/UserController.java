package Emanuele.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.Page;

import Emanuele.example.entities.User;
import Emanuele.example.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserService us;
	
	@GetMapping("")
	public Page<User> getUser(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size, @RequestParam(defaultValue = "id") String Sorted){
		return us.find(page, size, Sorted);
	};
}
