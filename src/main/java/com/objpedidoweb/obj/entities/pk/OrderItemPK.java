package com.objpedidoweb.obj.entities.pk;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.objpedidoweb.obj.entities.Order;
import com.objpedidoweb.obj.entities.Product;

import lombok.Data;

@Embeddable
public @Data class OrderItemPK implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order order;
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;

}
