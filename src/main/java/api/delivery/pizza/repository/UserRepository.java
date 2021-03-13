package api.delivery.pizza.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import api.delivery.pizza.entity.User;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Integer> {
	
	@Query("select u from User u where u.email = ?1")
	User findByEmailAddress(String email);
}