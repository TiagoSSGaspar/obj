package com.objpedidoweb.obj.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_product")
public @Data class Product implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Setter(value = AccessLevel.NONE)
	private Long id;

	private String name;

	private String description;

	private Double price;

	private String imgUrl;

	@OneToMany(mappedBy = "id.product")
	private Set<OrderItem> items = new HashSet<>();

	
	@ManyToMany
	@JoinTable(name = "tb_product_category", joinColumns = @JoinColumn(name = "product_id"), inverseJoinColumns = @JoinColumn(name = "category_id"))
	@Setter(value = AccessLevel.NONE)
	private Set<Category> categories = new HashSet<>();

	public Product(Long id, String name, String description, Double price, String imgUrl) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.imgUrl = imgUrl;
	}
	
	
	@JsonIgnore
	public Set<Order> getOrder() {
		Set<Order> set = new HashSet<>();
		for(OrderItem x : items) {
			set.add(x.getOrder());
		}
		
		return set;
	}

}
