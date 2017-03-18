package com.whittam.ropes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whittam.ropes.model.Inventory;
import com.whittam.ropes.repository.InventoryRepository;

@Service
public class InventoryService {

	@Autowired
	InventoryRepository inventoryRepo;

	public List<Inventory> findAll() {
		return inventoryRepo.findAll();
	}

	public Inventory saveInventory(Inventory inventory) {
		return inventoryRepo.save(inventory);
	}

	public void deleteInventory(String id) {
		inventoryRepo.delete(id);
	}
	
	public void deleteAll() {
		inventoryRepo.deleteAll();
	}

	public void saveAll(List<Inventory> inventory) {
		inventoryRepo.save(inventory);
	}

}
