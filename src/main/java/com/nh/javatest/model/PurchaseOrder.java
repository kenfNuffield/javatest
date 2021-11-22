package com.nh.javatest.model;

import java.util.Set;

public class PurchaseOrder {
	private PurchaseOrderHeader poh;
	private Set<PurchaseOrderLine> polines;

	public PurchaseOrderHeader getPoh() {
		return poh;
	}

	public void setPoh(PurchaseOrderHeader poh) {
		this.poh = poh;
	}

	public Set<PurchaseOrderLine> getPolines() {
		return polines;
	}

	public void setPolines(Set<PurchaseOrderLine> polines) {
		this.polines = polines;
	}

}
