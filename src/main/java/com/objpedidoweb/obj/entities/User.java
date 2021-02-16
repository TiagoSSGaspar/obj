package com.objpedidoweb.obj.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "tb_user")
public @Data class User implements Serializable {

	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Setter(value = AccessLevel.NONE) private long id;

	private String name;

	private String email;

	private String phone;

	private String password;

	@JsonIgnore
	@OneToMany(mappedBy = "client")
	private List<Order> orders = new ArrayList<>();
	
	


}
