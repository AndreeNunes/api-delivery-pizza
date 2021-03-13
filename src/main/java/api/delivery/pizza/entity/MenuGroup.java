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
@Table(name = "menu_group")
public class MenuGroup {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_menu_group")
	int idMenuGroup;

	@Column(nullable = false)
	String nameGroup;
}
