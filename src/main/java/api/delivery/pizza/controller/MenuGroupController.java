package api.delivery.pizza.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import api.delivery.pizza.entity.MenuGroup;
import api.delivery.pizza.entity.User;
import api.delivery.pizza.repository.MenuGroupRepository;


@Controller
@RequestMapping(path="/v1/grupocardapio") 
public class MenuGroupController {
	
	 @Autowired
	 private MenuGroupRepository menuGroupRepository;
	 
	 @PostMapping(path="/adicionar")
	 public @ResponseBody String addNewUser (@RequestBody MenuGroup menu) {  
		 menuGroupRepository.save(menu);
		    
		 return "Sucesso em salvar o usuario: " + menu.getNameGroup();
	 }
	 
	 @GetMapping(path="/listar")
	 public @ResponseBody Iterable<MenuGroup> listMenuGroup () {
		 return menuGroupRepository.findAll();
	 }
}
