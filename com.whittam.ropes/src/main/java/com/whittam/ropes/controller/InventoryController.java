package com.whittam.ropes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.whittam.ropes.model.Inventory;
import com.whittam.ropes.repository.InventoryRepository;

@SpringBootApplication
@RestController
public class InventoryController {
	
	@Autowired 
	InventoryRepository inventoryRepo;

	// Returns the whole list of inventory
	@RequestMapping(value="/inventory", method=RequestMethod.GET)
	public List<Inventory> getAll() {
		return inventoryRepo.findAll();
	}
	
	// POST method to save to mongoDB.	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public ResponseEntity<?> saveInventory(@RequestBody Inventory inventory) {
		inventoryRepo.save(inventory);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	// DELETE the entity
	@RequestMapping(value="delete/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<?> dleteInventory(@PathVariable String id) {
		inventoryRepo.delete(id);
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}
	
	
	
	
}
