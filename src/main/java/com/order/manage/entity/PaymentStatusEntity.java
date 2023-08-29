package com.order.manage.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="paymentstatus",schema="order_schema")
public class PaymentStatusEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8197915206511255154L;

	@Id
	@Column(name="payment_status_id")
	private int paymentStatusId;
	
	@Column(name="payment_status")
	private String paymentStatus;
	
	
	public PaymentStatusEntity() {
		
	}


	public PaymentStatusEntity(int paymentStatusId, String paymentStatus) {
		super();
		this.paymentStatusId = paymentStatusId;
		this.paymentStatus = paymentStatus;
	}


	public int getPaymentStatusId() {
		return paymentStatusId;
	}


	public void setPaymentStatusId(int paymentStatusId) {
		this.paymentStatusId = paymentStatusId;
	}


	public String getPaymentStatus() {
		return paymentStatus;
	}


	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
