package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repository.UserRepository;
import com.example.demo.entity.User;

@RestController
public class UserController {
	
	@Autowired(required =true)
	private UserRepository u1;
	@GetMapping("/")
	public String login(Model model)
	{
		User user = new User();
		model.addAttribute("user",user);
		return "login";
	}
	
	 
	 
	@PostMapping("/userLogin")
	public String loginUser(@ModelAttribute("user")User user)
	{
		
		String userId = user.getUserId();
		Optional<User> userdata = u1.findById(userId);
		if(user.getPassword().equals(userdata.get().getPassword()))
		{
			return "home";
		}else
		{
			return "error";
		}
	}
}
