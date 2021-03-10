package api.delivery.pizza.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import api.delivery.pizza.repository.UserRepository;

@Controller
@RequestMapping(path="/v1/grupocardapio") 
public class MenuGroupController {
	
	 @Autowired
	 private UserRepository userRepository;
	 
	
}
