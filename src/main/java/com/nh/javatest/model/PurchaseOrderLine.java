package com.nh.javatest.model;

public class PurchaseOrderLine {

	private String itemCode;
	public String itemVendorCode;
	public String itemName;
	public int quantity;
	public String unitsOfMeasure;
	public String unitPrice;
	public String lineItemRequestLocation;
	public String lineItemRequestLocationCode;

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
}
