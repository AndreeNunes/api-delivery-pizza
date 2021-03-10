package api.delivery.pizza.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import api.delivery.pizza.entity.User;
import api.delivery.pizza.repository.UserRepository;

@Controller
@RequestMapping(path="/v1/usuario") 
public class UserController {
	
  @Autowired
  private UserRepository userRepository;

  @PostMapping(path="/adicionar") // Map ONLY POST Requests
  public @ResponseBody String addNewUser (@RequestBody User user) {
	  
    userRepository.save(user);
    
    return "Sucesso em salvar o usuario: " + user.getName();
  }

  @GetMapping(path="/all")
  public @ResponseBody Iterable<User> getAllUsers() {
	return userRepository.findAll();
  }
}