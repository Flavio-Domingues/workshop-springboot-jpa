package com.cursospringboot.curso.entities;

import java.io.Serializable;
import java.util.Objects;

import com.cursospringboot.curso.entities.pk.OrderItemPK;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_order_item")
public class OrderItem implements Serializable {

	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private OrderItemPK id;
	private Integer qauntity;
	private Double price;

	public OrderItem() {

	}

	public OrderItem(Order order, Product product, Integer qauntity, Double price) {
		id.setOrder(order);
		id.setProduct(product);
		this.qauntity = qauntity;
		this.price = price;
	}

	public Order getOrder() {
		return id.getOrder();
	}

	public void setOrder(Order order) {
		id.getOrder();
	}

	public Product getProduct() {
		return id.getProduct();
	}

	public void setProduct(Product product) {
		id.getProduct();
	}

	public Integer getQauntity() {
		return qauntity;
	}

	public void setQauntity(Integer qauntity) {
		this.qauntity = qauntity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItem other = (OrderItem) obj;
		return Objects.equals(id, other.id);
	}

}
