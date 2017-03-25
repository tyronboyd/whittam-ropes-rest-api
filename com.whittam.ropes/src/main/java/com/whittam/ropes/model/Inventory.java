package com.whittam.ropes.model;

import org.springframework.data.annotation.Id;

public class Inventory {

	@Id
	private String id;
	private String BARCODE;
	private String UNIQUEID;
	private String TITLE;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getBARCODE() {
		return BARCODE;
	}
	
	public void setBARCODE(String BARCODE) {
		this.BARCODE = BARCODE;
	}
	
	public String getUNIQUEID() {
		return UNIQUEID;
	}

	public void setUNIQUEID(String UNIQUEID) {
		this.UNIQUEID = UNIQUEID;
	}

	public String getTITLE() {
		return TITLE;
	}

	public void setTITLE(String TITLE) {
		this.TITLE = TITLE;
	}
}
