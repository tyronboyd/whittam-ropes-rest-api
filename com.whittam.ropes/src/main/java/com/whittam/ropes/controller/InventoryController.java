package com.whittam.ropes.controller;

import java.util.ArrayList;
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

@RestController
public class InventoryController {

	@Autowired
	private InventoryService inventoryService;

	// Returns the whole list of inventory

	@RequestMapping(value = "/inventory", method = RequestMethod.GET)
	public ResponseEntity<List<Inventory>> getAll() {
		List<Inventory> inventory = inventoryService.findAll();

		if (inventory.isEmpty()) {
			return new ResponseEntity<List<Inventory>>(new ArrayList<>(), HttpStatus.OK);
		}
		return new ResponseEntity<List<Inventory>>(inventory, HttpStatus.OK);
	}

	// POST method to save to mongoDB.

	@RequestMapping(value = "/save/inventory", method = RequestMethod.POST)
	public ResponseEntity<?> saveInventory(@RequestBody Inventory order) {
		inventoryService.saveInventory(order);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/saveAll/inventory", method = RequestMethod.POST)
	public ResponseEntity<?> saveAllInventory(@RequestBody List<Inventory> inventory) {
		inventoryService.saveAll(inventory);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	// DELETE the entity

	@RequestMapping(value = "/delete/inventory/", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteInventory(@PathVariable String id) {
		inventoryService.deleteInventory(id);
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}
	
	@RequestMapping(value = "/delete-all/inventory", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteAllInventory() {
		inventoryService.deleteAll();
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}

}
