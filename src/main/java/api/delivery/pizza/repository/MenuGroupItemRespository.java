package api.delivery.pizza.repository;

import org.springframework.data.repository.CrudRepository;

import api.delivery.pizza.entity.MenuGroupItem;

public interface MenuGroupItemRespository extends CrudRepository<MenuGroupItem, Integer>{}