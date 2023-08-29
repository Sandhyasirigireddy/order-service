package com.order.manage.model;

import java.io.Serializable;


public class ShipmentStatusModel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8214710488883073378L;

	
	private int shipmentStatusId;
	
	private int trackingId;
	
	private String shippingAddress;
	
	public ShipmentStatusModel() {}

	public ShipmentStatusModel(int shipmentStatusId, int trackingId, String shippingAddress) {
		super();
		this.shipmentStatusId = shipmentStatusId;
		this.trackingId = trackingId;
		this.shippingAddress = shippingAddress;
	}

	public int getShipmentStatusId() {
		return shipmentStatusId;
	}

	public void setShipmentStatusId(int shipmentStatusId) {
		this.shipmentStatusId = shipmentStatusId;
	}

	public int getTrackingId() {
		return trackingId;
	}

	public void setTrackingId(int trackingId) {
		this.trackingId = trackingId;
	}

	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "ShipmentStatusModel [shipmentStatusId=" + shipmentStatusId + ", trackingId=" + trackingId
				+ ", shippingAddress=" + shippingAddress + "]";
	}

	
	
	

	}
