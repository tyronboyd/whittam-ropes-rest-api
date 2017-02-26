package com.whittam.ropes.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.whittam.ropes.model.Inventory;

public interface InventoryRepository extends MongoRepository<Inventory, String> {

	// Delete an inventory item
	void delete(Inventory id);

	// List all inventory items in the database
	List<Inventory> findAll();

	// Find an inventory item by barcode ID
	Optional<Inventory> findById(String id);

	// Save an inventory item in the database
	Inventory save(Inventory id);

}
