package com.order.manage.model;

import java.io.Serializable;

public class OrderItemModel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6608872314817618491L;

	
	private int orderItemId;
	
	
	private int bookId;
     
	private double price;
	
	private int quantity;
	
	private double subTotalAmount;
	
	public OrderItemModel() {
		
	}

	public OrderItemModel(int orderItemId, int bookId, double price, int quantity, double subTotalAmount) {
		super();
		this.orderItemId = orderItemId;
		this.bookId = bookId;
		this.price = price;
		this.quantity = quantity;
		this.subTotalAmount = subTotalAmount;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}

	