package com.whittam.ropes.model;

import org.springframework.data.annotation.Id;

public class Order {

	@Id
	private String id;
	private String barcode;
	private String itemId;
	private String title;
	private int quantity;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getBarcode() {
		return barcode;
	}
	
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	
	public String getItemId() {
		return itemId;
	}
	
	public void setItemId(String item_id) {
		this.itemId = item_id;
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
