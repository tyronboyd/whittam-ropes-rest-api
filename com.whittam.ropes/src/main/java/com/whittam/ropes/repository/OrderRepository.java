package com.whittam.ropes.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.whittam.ropes.model.Order;

public interface OrderRepository extends MongoRepository<Order, String> {

	// Delete an inventory item
	void delete(Order order);

	// List all inventory items in the database
	List<Order> findAll();

	// Find an inventory item by barcode ID
	Order findById(String id);

	// Save an inventory item in the database
	Order save(Order order);

}
