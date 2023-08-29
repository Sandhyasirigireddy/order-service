package com.order.manage.model;

import java.io.Serializable;


public class PaymentStatusModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8197915206511255154L;

	
	private int paymentStatusId;
	
	private String paymentType;
	
	private  int paymentId;
	
	public PaymentStatusModel() {}

	public PaymentStatusModel(int paymentStatusId, String paymentType, int paymentId) {
		super();
		this.paymentStatusId = paymentStatusId;
		this.paymentType = paymentType;
		this.paymentId = paymentId;
	}

	public int getPaymentStatusId() {
		return paymentStatusId;
	}

	public void setPaymentStatusId(int paymentStatusId) {
		this.paymentStatusId = paymentStatusId;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "PaymentStatusModel [paymentStatusId=" + paymentStatusId + ", paymentType=" + paymentType
				+ ", paymentId=" + paymentId + "]";
	}

}
