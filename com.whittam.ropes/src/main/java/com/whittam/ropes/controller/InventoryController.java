package com.whittam.ropes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.whittam.ropes.model.Inventory;
import com.whittam.ropes.service.InventoryService;

@CrossOrigin(origins = "http://evil.com/")
@RestController
public class InventoryController {

	@Autowired
	private InventoryService inventoryService;

	// Returns the whole list of inventory

	@RequestMapping(value = "/inventory", method = RequestMethod.GET)
	public List<Inventory> getAll() {
		return inventoryService.findAll();
	}

	// POST method to save to mongoDB.

	@RequestMapping(value = "/save/inventory", method = RequestMethod.POST)
	public ResponseEntity<?> saveOrder(@RequestBody Inventory order) {
		inventoryService.saveOrder(order);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	// DELETE the entity

	@RequestMapping(value = "delete/inventory/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> dleteOrder(@PathVariable String id) {
		inventoryService.deleteOrder(id);
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}

}
