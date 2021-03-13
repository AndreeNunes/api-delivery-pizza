package api.delivery.pizza.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "menu_group_item")
public class MenuGroupItem {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_menu_group_item")
	int idMenuGroupItem;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_menu_group")
	MenuGroup menuGroup;
	
	@Column(nullable = false)
	String name;
	
	@Column(nullable = false)
	BigDecimal value;
	
}


