package com.order.manage.controller;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

	import com.order.manage.entity.OrdersEntity;
	import com.order.manage.service.OrderService;

	@RestController
	@RequestMapping("/api/v1/orders")
	public class OrderController {
		@Autowired
		private OrderService orderService;
		
		@PostMapping("/create")
		public void createOrder( @RequestBody OrdersEntity ordersEntity) {
			orderService.createOrder(ordersEntity);
		}
		@PutMapping("/update")
		public void updateOrder(@RequestBody OrdersEntity ordersEntity) {
			orderService.createOrder(ordersEntity);
		}
		@DeleteMapping("/delete{orderId}")
		public void deleteOrder(@PathVariable  int orderId) {
			orderService.deleteOrder(orderId);
			}
		@GetMapping("/findByOrderId/{orderId}")
		public OrdersEntity findByOrderId( @PathVariable int orderId) {
			
			return orderService.findByOrderId(orderId);
			
		}
		

}
