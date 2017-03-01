package com.whittam.ropes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whittam.ropes.model.Order;
import com.whittam.ropes.repository.OrderRepository;

@Service
public class OrderService {

	
	@Autowired
	OrderRepository orderRepo;
	
	
	public List<Order> findAll() {
		return orderRepo.findAll();
	}
	
	public Order saveOrder(Order order) {
		return orderRepo.save(order);
	}
	
	public void deleteOrder(String id) {
		orderRepo.delete(id);
	}
	
}
