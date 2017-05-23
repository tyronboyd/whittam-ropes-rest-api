package com.whittam.ropes.model;

import org.springframework.data.annotation.Id;

public class Inventory {

	@Id
	private String id;
	private String BARCODE;
	private String ACCOUNTNO;
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
	
	public String getACCOUNTNO() {
		return ACCOUNTNO;
	}

	public void setACCOUNTNO(String ACCOUNTNO) {
		this.ACCOUNTNO = ACCOUNTNO;
	}

	public String getTITLE() {
		return TITLE;
	}

	public void setTITLE(String TITLE) {
		this.TITLE = TITLE;
	}
}
