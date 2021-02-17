package com.objpedidoweb.obj.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.objpedidoweb.obj.entities.pk.OrderItemPK;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Table(name = "tb_order_items")
public @Data class OrderItem implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OrderItemPK id = new OrderItemPK();
	
	private Integer quantity;
	
	private Double price;

	public OrderItem(Order order, Product product,Integer quantity, Double price) {
		super();
		id.setOrder(order);
		id.setProduct(product);
		this.quantity = quantity;
		this.price = price;
	}
	
	@JsonIgnore
	public Order getOrder() {
		return id.getOrder();
	}
	
	public void setOrder(Order order) {
		id.setOrder(order);
	}
	

	public Product getProduct() {
		return id.getProduct();
	}
	
	public void setProduct(Product product) {
		id.setProduct(product);
	}

}
