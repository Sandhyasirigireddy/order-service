package com.order.manage.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.manage.entity.OrdersEntity;
import com.order.manage.repository.OrdersRepository;
import com.order.manage.service.OrderService;
@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrdersRepository ordersRepository;

	@Override
	public void createOrder(OrdersEntity ordersEntity) {
		ordersRepository.save(ordersEntity);
		
	}

	@Override
	public void updateOrder(OrdersEntity ordersEntity) {
		ordersRepository.save(ordersEntity);
		
	}

	@Override
	public void deleteOrder(int orderId) {
		ordersRepository.deleteById(orderId);
	}

	@Override
	public OrdersEntity findByOrderId(int orderId) {
		OrdersEntity ordersEntity;
		Optional<OrdersEntity> ordersEntityOptional=ordersRepository.findById(orderId);
		if(ordersEntityOptional.isPresent()) {
			ordersEntity=ordersEntityOptional.get();
		}
		else {
			throw new RuntimeException( orderId+ "--->manufacture is not found");
		}
		return ordersEntity ;
		
	}

	


}