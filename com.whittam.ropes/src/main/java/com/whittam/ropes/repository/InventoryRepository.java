package com.whittam.ropes.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.whittam.ropes.model.Inventory;

public interface InventoryRepository extends MongoRepository<Inventory, String> {

	// Delete an inventory item
	void delete(Inventory id);

	// List all inventory items in the database
	List<Inventory> findAll();

	// Find an inventory item by barcode ID
	Inventory findById(String id);

	// Save an inventory item in the database
	@SuppressWarnings("unchecked")
	Inventory save(Inventory id);

}
