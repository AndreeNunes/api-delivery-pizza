package api.delivery.pizza.apideliverypizza.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import api.delivery.pizza.apideliverypizza.entity.User;
import api.delivery.pizza.apideliverypizza.repository.UserRepository;

@Controller
@RequestMapping(path="/demo") 
public class UserController {
	
  @Autowired
  private UserRepository userRepository;

  @PostMapping(path="/add") // Map ONLY POST Requests
  public @ResponseBody String addNewUser (@RequestBody User user) {
	  
    userRepository.save(user);
    
    return "Sucesso em salvar o usuario: " + user.getName();
  }

  @GetMapping(path="/all")
  public @ResponseBody Iterable<User> getAllUsers() {
	return userRepository.findAll();
  }
}