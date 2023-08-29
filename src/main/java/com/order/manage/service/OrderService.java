package com.order.manage.service;


import com.order.manage.entity.OrdersEntity;

public interface OrderService {
	
	public void createOrder(OrdersEntity orderEntity);

	public void updateOrder(OrdersEntity ordersEntity);

	public void deleteOrder(int orderId);

	public OrdersEntity findByOrderId(int orderId);
	


}
