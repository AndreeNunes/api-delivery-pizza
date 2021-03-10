package api.delivery.pizza.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity 
@Table(name="user")
public class User {
	
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  @Column(name="id_user")
  private Integer idUser;
  
  @Column(nullable = false)
  private String name;
  
  @Column(nullable = false, unique=true)
  private String email;
  
  @Column(nullable = false)
  private String password;
}