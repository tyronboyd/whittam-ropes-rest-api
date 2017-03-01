package com.whittam.ropes.model;

import org.springframework.data.annotation.Id;

public class Order {

	@Id
	private String id;
	private String inventoryId;
	private String title;
	private int quantity;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getInventoryId() {
		return inventoryId;
	}
	
	public void setInventoryId(String inventoryId) {
		this.inventoryId = inventoryId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
