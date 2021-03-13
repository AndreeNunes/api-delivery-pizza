package api.delivery.pizza.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import api.delivery.pizza.entity.MenuGroupItem;
import api.delivery.pizza.repository.MenuGroupItemRespository;

@Controller
@RequestMapping(path="/v1/grupocardapioitem") 
public class MenuGroupItemController {
	
	@Autowired
	 private MenuGroupItemRespository menuGroupItemRepository;
	 
	 @PostMapping(path="/adicionar")
	 public @ResponseBody String addNewUser (@RequestBody MenuGroupItem menu) {  
		 menuGroupItemRepository.save(menu);
		    
		 return "Sucesso em salvar o usuario: " + menu.getName();
	 }
	 
	 @GetMapping(path="/listar")
	 public @ResponseBody Iterable<MenuGroupItem> listMenuGroup () {
		 return menuGroupItemRepository.findAll();
	 }

}
