package com.order.manage.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="orderitem",schema="order_schema")
public class OrderItemEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6608872314817618491L;

	@Id 
	@Column(name="order_item_id")
	private int orderItemId;
	
	@Column(name="book_id")
	private int bookId;
     
	@Column(name="price")
	private double price;
	
	@Column(name="quantity")
	private int quantity;
	
	@Column(name="sub_total_amount")
	private double subTotalAmount;
	
	@JsonBackReference("orders-orderitem")
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="order_id")
	private OrdersEntity ordersEntity;
	
	public OrderItemEntity() {}

	public OrderItemEntity(int orderItemId, int bookId, double price, int quantity, double subTotalAmount,
			OrdersEntity ordersEntity) {
		super();
		this.orderItemId = orderItemId;
		this.bookId = bookId;
		this.price = price;
		this.quantity = quantity;
		this.subTotalAmount = subTotalAmount;
		this.ordersEntity = ordersEntity;
	}

	public int getOrderItemId() {
		return orderItemId;
	}

	public void setOrderItemId(int orderItemId) {
		this.orderItemId = orderItemId;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getSubTotalAmount() {
		return subTotalAmount;
	}

	public void setSubTotalAmount(double subTotalAmount) {
		this.subTotalAmount = subTotalAmount;
	}

	public OrdersEntity getOrdersEntity() {
		return ordersEntity;
	}

	public void setOrdersEntity(OrdersEntity ordersEntity) {
		this.ordersEntity = ordersEntity;
	}

	@Override
	public String toString() {
		return "OrderItemEntity [orderItemId=" + orderItemId + ", bookId=" + bookId + ", price=" + price + ", quantity="
				+ quantity + ", subTotalAmount=" + subTotalAmount + ", ordersEntity=" + ordersEntity + "]";
	}
}
