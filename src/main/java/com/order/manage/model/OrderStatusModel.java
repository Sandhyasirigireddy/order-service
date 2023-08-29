package com.order.manage.model;

import java.io.Serializable;



public class OrderStatusModel implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3787495181505308037L;
	
	private int orderStatusId;
	private String statusName;
	
	public OrderStatusModel() {}

	public OrderStatusModel(int orderStatusId, String statusName) {
		super();
		this.orderStatusId = orderStatusId;
		this.statusName = statusName;
	}

	public int getOrderStatusId() {
		return orderStatusId;
	}

	public void setOrderStatusId(int orderStatusId) {
		this.orderStatusId = orderStatusId;
	}

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "OrderStatusModel [orderStatusId=" + orderStatusId + ", statusName=" + statusName + "]";
	}

	
	

}
