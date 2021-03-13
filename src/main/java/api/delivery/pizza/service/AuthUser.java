package api.delivery.pizza.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import api.delivery.pizza.repository.UserRepository;

@Service
public class AuthUser implements UserDetailsService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		
		System.out.println("Chegou aq aq aq");
		
		try {
			
			api.delivery.pizza.entity.User user = userRepository.findByEmailAddress(email);
			
			return User		
					.builder()
					.username(user.getEmail())
					.password(user.getPassword())
					.roles("USER")
					.build();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
	}
}