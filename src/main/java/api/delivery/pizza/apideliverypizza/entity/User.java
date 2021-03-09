package api.delivery.pizza.apideliverypizza.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity 
public class User {
	
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id_user;
  
  @Column(nullable = false)
  private String name;
  
  @Column(nullable = false)
  private String email;
  
  @Column(nullable = false)
  private String password;
}