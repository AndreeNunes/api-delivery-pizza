package api.delivery.pizza.apideliverypizza.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import api.delivery.pizza.apideliverypizza.entity.User;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Integer> {
	
	@Query("SELECT count(*) FROM User")
	long countPlaylist();
}