package com.whittam.ropes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.whittam.ropes.model.Order;
import com.whittam.ropes.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	private OrderService orderService;

	// Returns the whole list of inventory
	@RequestMapping(value="/order", method=RequestMethod.GET)
	public List<Order> getAll() {
		return orderService.findAll();
	}
	
	// POST method to save to mongoDB.	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public ResponseEntity<?> saveOrder(@RequestBody Order order) {
		orderService.saveOrder(order);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	// DELETE the entity
	@RequestMapping(value="delete/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<?> dleteOrder(@PathVariable String id) {
		orderService.deleteOrder(id);
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}
	
	
	
	
}
