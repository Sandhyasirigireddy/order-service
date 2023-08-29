package com.order.manage.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;


public class OrdersModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1333373684478962252L;

	private int orderId;
	
	private String description;

	private LocalDate orderDate;
	
	private double orderTotalAmount;
	
	private int totalItems;
	
	private int customerId;

	
	private List<OrderItemModel> orderItemModel;
	 
	private OrderStatusModel orderStatusModel;
	
	
	private PaymentStatusModel paymentStatusModel;
	
	
	private ShipmentStatusModel shipmentStatusModel;
	
	public OrdersModel() {}

	public OrdersModel(int orderId, String description, LocalDate orderDate, double orderTotalAmount, int totalItems,
			int customerId, List<OrderItemModel> orderItemModel, OrderStatusModel orderStatusModel,
			PaymentStatusModel paymentStatusModel, ShipmentStatusModel shipmentStatusModel) {
		super();
		this.orderId = orderId;
		this.description = description;
		this.orderDate = orderDate;
		this.orderTotalAmount = orderTotalAmount;
		this.totalItems = totalItems;
		this.customerId = customerId;
		this.orderItemModel = orderItemModel;
		this.orderStatusModel = orderStatusModel;
		this.paymentStatusModel = paymentStatusModel;
		this.shipmentStatusModel = shipmentStatusModel;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public double getOrderTotalAmount() {
		return orderTotalAmount;
	}

	public void setOrderTotalAmount(double orderTotalAmount) {
		this.orderTotalAmount = orderTotalAmount;
	}

	public int getTotalItems() {
		return totalItems;
	}

	public void setTotalItems(int totalItems) {
		this.totalItems = totalItems;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public List<OrderItemModel> getOrderItemModel() {
		return orderItemModel;
	}

	public void setOrderItemModel(List<OrderItemModel> orderItemModel) {
		this.orderItemModel = orderItemModel;
	}

	public OrderStatusModel getOrderStatusModel() {
		return orderStatusModel;
	}

	public void setOrderStatusModel(OrderStatusModel orderStatusModel) {
		this.orderStatusModel = orderStatusModel;
	}

	public PaymentStatusModel getPaymentStatusModel() {
		return paymentStatusModel;
	}

	public void setPaymentStatusModel(PaymentStatusModel paymentStatusModel) {
		this.paymentStatusModel = paymentStatusModel;
	}

	public ShipmentStatusModel getShipmentStatusModel() {
		return shipmentStatusModel;
	}

	public void setShipmentStatusModel(ShipmentStatusModel shipmentStatusModel) {
		this.shipmentStatusModel = shipmentStatusModel;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "OrdersModel [orderId=" + orderId + ", description=" + description + ", orderDate=" + orderDate
				+ ", orderTotalAmount=" + orderTotalAmount + ", totalItems=" + totalItems + ", customerId=" + customerId
				+ ", orderItemModel=" + orderItemModel + ", orderStatusModel=" + orderStatusModel
				+ ", paymentStatusModel=" + paymentStatusModel + ", shipmentStatusModel=" + shipmentStatusModel + "]";
	}
	

	
	
}
